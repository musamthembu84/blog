package AI.Blog.controller;
import AI.Blog.model.PostDao;
import AI.Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    private PostService postService;
    @Autowired
    public RestController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "/test")
    public String testValues() {

         postService.createPost(new PostDao("musatest",1));

        return "haha";
    }

    @PostMapping(path = "/posting")
    public ResponseEntity<Object> createPost(@RequestBody PostDao postDao) {
        return postService.createPost(postDao);
    }
}
