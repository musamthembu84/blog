package AI.Blog.service;

import AI.Blog.model.PostDao;
import org.springframework.http.ResponseEntity;

public interface IPost {
    ResponseEntity<Object> postMessage(PostDao postDao);
}
