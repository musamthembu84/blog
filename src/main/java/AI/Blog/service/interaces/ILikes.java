package AI.Blog.service.interaces;

import org.springframework.http.ResponseEntity;

public interface ILikes {
    ResponseEntity<Object> incrementLike(final int postId);
    ResponseEntity<Object> viewTotalLikes(final int postId);
}
