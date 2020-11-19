package AI.Blog.service;

import AI.Blog.exception.ApplicationException;
import AI.Blog.model.PostDao;
import AI.Blog.repository.PostRepository;
import AI.Blog.response.ErrorMessageResponse;
import AI.Blog.response.SuccessMessageResponse;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PostService implements IPost{

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public ResponseEntity<Object> postMessage(PostDao postDao) {
        Preconditions.checkArgument(postDao.getContent()!=null);

        postRepository.save(postDao);
        return ResponseEntity
                .ok(SuccessMessageResponse.create("Post Created Successfully"));
    }
}
