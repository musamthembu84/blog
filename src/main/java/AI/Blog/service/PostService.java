package AI.Blog.service;

import AI.Blog.model.PostDao;
import AI.Blog.repository.PostRepository;
import AI.Blog.response.SuccessMessageResponse;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PostService implements IPost{

    private static final String SUCCESS_MESSAGE = "Post Created Successfully";
    private static final String DELETE_MESSAGE = "Post Deleted Successfully";

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public ResponseEntity<Object> createPost(final PostDao postDao) {
        Preconditions.checkArgument(postDao.getContent()!=null);

        postRepository.save(postDao);
        return ResponseEntity
                .ok(SuccessMessageResponse.create(SUCCESS_MESSAGE));
    }

    @Override
    public ResponseEntity<Object> deletePost(final int postID) {
        postRepository.deleteById(postID);
        return ResponseEntity
                .ok(SuccessMessageResponse.create(DELETE_MESSAGE));
    }
}
