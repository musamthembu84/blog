package AI.Blog.service.interfaces;

import AI.Blog.exception.ApplicationException;
import AI.Blog.model.PostDao;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IPost {
    ResponseEntity<Object> createPost(final PostDao postDao) throws ApplicationException;
    ResponseEntity<Object> deletePost(final int postID);
    List<PostDao> retrievePosts(final int numberOfPosts);
}
