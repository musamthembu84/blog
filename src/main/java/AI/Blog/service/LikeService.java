package AI.Blog.service;

import AI.Blog.model.LikesDao;
import AI.Blog.repository.LikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LikeService implements ILikes{

    private LikesRepository repository;

    @Autowired
    public LikeService(LikesRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<Object> incrementLike(int likeID) {

        return null;
    }

    @Override
    public ResponseEntity<Object> viewTotalLikes(int likeID) {
        return null;
    }
}
