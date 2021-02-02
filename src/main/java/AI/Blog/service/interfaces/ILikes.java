package AI.Blog.service.interfaces;

import org.springframework.http.ResponseEntity;

public interface ILikes {
    ResponseEntity<Object> incrementLike(final int postId);
    ResponseEntity<Object> viewTotalLikes(final int postId);
}
