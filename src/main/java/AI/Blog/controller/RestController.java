package AI.Blog.controller;
import AI.Blog.exception.ApplicationException;
import AI.Blog.model.PostDao;
import AI.Blog.service.impl.LikeService;
import AI.Blog.service.impl.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping(path= "/addLike")
    public ResponseEntity<Object> addLike(@RequestParam int id){
        return likeService.incrementLike(id);
    }

    @GetMapping(path = "/likePost")
    public String getPostId(@RequestParam int id){
        return "ID" + id;
    }

   @GetMapping(path = "/viewPostLike")
   public ResponseEntity<Object> viewPostLikes(final @RequestParam int id){
        return likeService.viewTotalLikes(id);
   }
}
