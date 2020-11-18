package AI.Blog.service;

import AI.Blog.model.PostDao;
import AI.Blog.response.SuccessResponse;
import org.springframework.http.ResponseEntity;

public interface IPost {
    ResponseEntity<String> postMessage(PostDao postDao);
}
