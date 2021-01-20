package AI.Blog.service.interaces;

import AI.Blog.model.PostDao;
import org.springframework.http.ResponseEntity;

public interface IViews {

    ResponseEntity<Object> getViewForPost(final int postId);
    ResponseEntity<Object> addViewForPost(final int postID);
}
