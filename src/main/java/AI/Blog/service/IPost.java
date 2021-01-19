package AI.Blog.service;

import AI.Blog.exception.ApplicationException;
import AI.Blog.model.PostDao;
import org.springframework.http.ResponseEntity;

public interface IPost {
    ResponseEntity<Object> createPost(final PostDao postDao) throws ApplicationException;
    ResponseEntity<Object> deletePost(final int postID);
}
