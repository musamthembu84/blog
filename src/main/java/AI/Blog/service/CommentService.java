package AI.Blog.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CommentService implements IComment{
    @Override
    public ResponseEntity<Object> createComment() {
        return null;
    }
}
