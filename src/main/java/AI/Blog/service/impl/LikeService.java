package AI.Blog.service.impl;

import AI.Blog.model.LikesDao;
import AI.Blog.model.PostDao;
import AI.Blog.repository.LikesRepository;
import AI.Blog.response.LikesResponseMessage;
import AI.Blog.response.SuccessMessageResponse;
import AI.Blog.service.interaces.ILikes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LikeService implements ILikes {

    private final LikesRepository repository;

    @Autowired
    public LikeService(final LikesRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<Object> incrementLike(final int postId) {
        repository.save(new LikesDao(postingNewInstance(postId)));
        return ResponseEntity.ok(SuccessMessageResponse.create("Like added"));
    }

    @Override
    public ResponseEntity<Object> viewTotalLikes(int postId) {
        return ResponseEntity.ok(LikesResponseMessage.createMessage(String.valueOf(repository.getLikesForPost(postId))));
    }

    private PostDao postingNewInstance(final int postId){
        PostDao postDao = new PostDao();
        postDao.setPost_id(postId);
        return postDao;
    }
}
