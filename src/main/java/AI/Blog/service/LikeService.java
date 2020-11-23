package AI.Blog.service;

import org.springframework.http.ResponseEntity;

public class LikeService implements ILikes{

    @Override
    public ResponseEntity<Object> incrementLike(final int likeID) {
        //increment counter where id = postid
        return null;
    }
}
