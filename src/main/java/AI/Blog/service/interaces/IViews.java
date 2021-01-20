package AI.Blog.service.interaces;

import org.springframework.http.ResponseEntity;

public interface IViews {

    ResponseEntity<Object> getViewForPost(final int postId);
}
