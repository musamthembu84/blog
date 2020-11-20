package AI.Blog.service;

import org.springframework.http.ResponseEntity;

public interface ILikes {
    ResponseEntity<Object> incrementLike(final int likeID);
}
