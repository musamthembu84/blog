package AI.Blog.controller;

import AI.Blog.model.PostDao;
import AI.Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private PostService postService;

    @Autowired
    public RestController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "/test")
    public String testValues(){

        postService.createPost(new PostDao("musa_got_this",0,new Date(14/01/2020), new Date(14/01/2020)));
        return "haha";
    }
}
