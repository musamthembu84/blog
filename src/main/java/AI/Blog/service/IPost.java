package AI.Blog.service;

import AI.Blog.model.PostDao;
import org.springframework.http.ResponseEntity;

public interface IPost {
    ResponseEntity<Object> postMessage(final PostDao postDao);
    ResponseEntity<Object> deletePost(final int postID);
}
