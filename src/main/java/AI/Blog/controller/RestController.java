package AI.Blog.controller;
import AI.Blog.model.Country;
import AI.Blog.model.PostDao;
import AI.Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


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

    @PostMapping(path = "/add")
    public @ResponseBody
    String createPost(@RequestBody Country countries) {
        //country.saveData(countries);
//        PostDao p = new PostDao();
//        p.setContent("musa_got_this");
//        p.setViews(0);
//        p.setPostCreationDate(new java.util.Date());
//        p.setPostUpdatedDate(new java.util.Date());
//        postRepository.save(p);
        return "Saved";
    }
}
