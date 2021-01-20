package AI.Blog.service.impl;

import AI.Blog.repository.LikesRepository;
import AI.Blog.repository.ViewRepository;
import AI.Blog.response.LikesResponseMessage;
import AI.Blog.service.interaces.IViews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class ViewService implements IViews {

    private final ViewRepository viewRepository;

    @Autowired
    public ViewService(ViewRepository viewRepository) {
        this.viewRepository = viewRepository;
    }

    @Override
    public ResponseEntity<Object> getViewForPost(final int postID) {
        return ResponseEntity.ok().body(LikesResponseMessage.createMessage(viewRepository.getTotalViewsForPost(postID) + "Likes"));
    }
}
