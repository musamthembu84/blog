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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping(path = "/posting")
    public ResponseEntity<Object> createPost(final @RequestBody PostDao postDao) throws ApplicationException {
        return postService.createPost(postDao);
    }

    @GetMapping(path = "/getPosts")
    public ResponseEntity<Object> retrievalPosts(){
        return postService.retrievePosts();
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
}
