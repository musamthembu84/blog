package AI.Blog.service.impl;

import AI.Blog.model.PostDao;
import AI.Blog.service.interfaces.IEdit;
import org.springframework.http.ResponseEntity;

public class EditService implements IEdit {
    @Override
    public ResponseEntity<Object> editPost(PostDao postDao) {
        return null;
    }
}
