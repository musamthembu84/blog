package AI.Blog.controller;
import AI.Blog.exception.ApplicationException;
import AI.Blog.model.CommentDao;
import AI.Blog.model.PostDao;
import AI.Blog.service.impl.CommentService;
import AI.Blog.service.impl.LikeService;
import AI.Blog.service.impl.PostService;
import AI.Blog.service.impl.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final PostService postService;
    private final LikeService likeService;
    private final ViewService viewService;
    private final CommentService commentService;

    @Autowired
    public RestController(final PostService postService,
                          final LikeService likeService,
                          final ViewService viewService,
                          final CommentService commentService) {
        this.postService = postService;
        this.likeService = likeService;
        this.viewService = viewService;
        this.commentService = commentService;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path = "/posting")
    public ResponseEntity<Object> createPost(final @RequestBody PostDao postDao) throws ApplicationException {
        return postService.createPost(postDao);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/getPosts")
    public List<PostDao> retrievalPosts(@RequestParam int numberOfPosts){
        return postService.retrievePosts(numberOfPosts);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/singlePost")
    public PostDao getSinglePost(@RequestParam final int postId){
        return postService.getPost(postId);
    }
    @GetMapping(path= "/addLike")
    public ResponseEntity<Object> addLike(@RequestParam int id){
        return likeService.incrementLike(id);
    }

   @GetMapping(path = "/viewPostLike")
   public ResponseEntity<Object> viewPostLikes(final @RequestParam int id){
        return likeService.viewTotalLikes(id);
   }

   @GetMapping(path = "/addPostView")
   public ResponseEntity<Object> createView(final @RequestParam int id){
        return viewService.addViewForPost(id);
   }

   @GetMapping(path = "/totalViewsForPost")
    public ResponseEntity<Object> viewsForPost(final @RequestParam int id){
        return viewService.getViewForPost(id);
   }

    @PostMapping(path="/createComment")
    public ResponseEntity<Object> createComments(final @RequestBody CommentDao commentDao){
        return commentService.createComment(commentDao,1);
    }

    @GetMapping(path = "/editComment")
    public ResponseEntity<Object> editComment(){
        return null;
    }
}
