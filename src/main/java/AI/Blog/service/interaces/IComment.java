package AI.Blog.service.interaces;

import org.springframework.http.ResponseEntity;

public interface IComment {
    ResponseEntity<Object> createComment();
}
