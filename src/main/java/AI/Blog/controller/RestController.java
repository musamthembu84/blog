package AI.Blog.controller;
import AI.Blog.exception.ApplicationException;
import AI.Blog.model.PostDao;
import AI.Blog.service.LikeService;
import AI.Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private PostService postService;
    private LikeService likeService;
    @Autowired
    public RestController(final PostService postService, final LikeService likeService) {
        this.postService = postService;
        this.likeService = likeService;
    }

    @PostMapping(path = "/posting")
    public ResponseEntity<Object> createPost(final @RequestBody PostDao postDao) throws ApplicationException {
        return postService.createPost(postDao);
    }

    @PostMapping(path= "/addLike")
    public ResponseEntity<Object> addLike(){

        return likeService.incrementLike(1);
    }

}
