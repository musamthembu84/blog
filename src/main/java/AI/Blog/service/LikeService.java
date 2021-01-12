package AI.Blog.service;

import AI.Blog.model.LikesDao;
import AI.Blog.repository.LikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LikeService{

//    private final LikesRepository likes;
//
//    @Autowired
//    public LikeService(LikesRepository likes) {
//        this.likes = likes;
//    }
//
//    @Override
//    public ResponseEntity<Object> incrementLike(final int likeID) {
//
//        int currentLikeCounter = likes.getLikesForPost(likeID);
//
//        LikesDao likesDao = new LikesDao();
//
//        //increment counter where id = postid
//        return null;
//    }
}
