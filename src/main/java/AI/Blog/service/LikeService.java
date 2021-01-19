package AI.Blog.service;

import AI.Blog.model.LikesDao;
import AI.Blog.model.PostDao;
import AI.Blog.repository.LikesRepository;
import AI.Blog.response.SuccessMessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LikeService implements ILikes{

    private LikesRepository repository;

    @Autowired
    public LikeService(final LikesRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<Object> incrementLike(int likeID) {
        PostDao p = new PostDao();

        repository.save(new LikesDao(1,new PostDao()));
        return ResponseEntity.ok(SuccessMessageResponse.create("Like added"));
    }

    @Override
    public ResponseEntity<Object> viewTotalLikes(int likeID) {
        return null;
    }
}
