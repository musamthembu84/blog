package AI.Blog.controller;
import AI.Blog.exception.ApplicationException;
import AI.Blog.model.PostDao;
import AI.Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private PostService postService;
    @Autowired
    public RestController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping(path = "/posting")
    public ResponseEntity<Object> createPost(final @RequestBody PostDao postDao) throws ApplicationException {
        return postService.createPost(postDao);
    }

}
