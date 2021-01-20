package AI.Blog.service;

import AI.Blog.model.LikesDao;
import AI.Blog.model.PostDao;
import AI.Blog.repository.LikesRepository;
import AI.Blog.repository.PostRepository;
import AI.Blog.response.SuccessMessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LikeService implements ILikes{

    private LikesRepository repository;
    private PostRepository postRepository;

    @Autowired
    public LikeService(final LikesRepository repository, final PostRepository postRepository) {
        this.repository = repository;
        this.postRepository = postRepository;
    }

    @Override
    public ResponseEntity<Object> incrementLike(final int postId) {

        PostDao postDao = new PostDao(postId,"haha",1,new Date(),new Date());

        repository.save(new LikesDao(1,postDao));
        return ResponseEntity.ok(SuccessMessageResponse.create("Like added"));
    }

    @Override
    public ResponseEntity<Object> viewTotalLikes(int likeID) {
        return null;
    }
}
