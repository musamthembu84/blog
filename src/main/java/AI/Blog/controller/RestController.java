package AI.Blog.controller;
import AI.Blog.model.PostDao;
import AI.Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    private PostService postService;
    @Autowired
    public RestController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping(path = "/posting")
    public ResponseEntity<Object> createPost(final @RequestBody PostDao postDao) {
        postDao.setPost_creation_date(new Date());
        postDao.setPost_updated_date(new Date());
        return postService.createPost(postDao);
    }

    @GetMapping(path = "/likes")
    public String likes(){
        PostDao postDao  = new PostDao("sd",0, new java.util.Date(),new java.util.Date());
        postService.createPost(postDao);
        return "haha";
    }
}
