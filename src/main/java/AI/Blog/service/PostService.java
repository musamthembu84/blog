package AI.Blog.service;

import AI.Blog.model.PostDao;
import AI.Blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        postRepository.save(postDao);
        return null;
    }
}
