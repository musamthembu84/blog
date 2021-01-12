package AI.Blog.service;

import org.springframework.http.ResponseEntity;

public interface IComment {
    ResponseEntity<Object> createComment();
}
