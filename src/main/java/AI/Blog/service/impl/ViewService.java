package AI.Blog.service.impl;

import AI.Blog.model.PostDao;
import AI.Blog.model.ViewsDao;
import AI.Blog.repository.ViewRepository;
import AI.Blog.response.LikesResponseMessage;
import AI.Blog.service.interfaces.IViews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
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

    @Override
    public ResponseEntity<Object> addViewForPost(final int postID) {
        viewRepository.save(new ViewsDao(createNewPostForView(postID)));
        return ResponseEntity.ok().body(LikesResponseMessage.createMessage("View Added For Post" + postID));
    }

    private PostDao createNewPostForView(final int postId){
        PostDao postDao = new PostDao();
        postDao.setPost_id(postId);
        return postDao;
    }


}
