package AI.Blog.service;

import AI.Blog.model.PostDao;
import org.springframework.http.ResponseEntity;

public interface ILikes {
    ResponseEntity<Object> incrementLike(final int postId);
    ResponseEntity<Object> viewTotalLikes(final int likeID);
}
