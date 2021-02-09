package AI.Blog.service.interfaces;

import AI.Blog.model.PostDao;
import org.springframework.http.ResponseEntity;

public interface IEdit {
    ResponseEntity<Object> editPost(final PostDao postDao);
}
