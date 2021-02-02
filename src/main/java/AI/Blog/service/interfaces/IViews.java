package AI.Blog.service.interfaces;

import org.springframework.http.ResponseEntity;

public interface IViews {

    ResponseEntity<Object> getViewForPost(final int postId);
    ResponseEntity<Object> addViewForPost(final int postID);
}
