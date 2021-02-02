package AI.Blog.service.interfaces;

import AI.Blog.model.CommentDao;
import org.springframework.http.ResponseEntity;

public interface IComment {
    ResponseEntity<Object> createComment(final CommentDao commentDao, final int postID);
}
