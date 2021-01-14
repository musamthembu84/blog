package AI.Blog.controller;
import AI.Blog.model.Country;
import AI.Blog.repository.CountryRepo;
import AI.Blog.service.countryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    private countryService country ;
    @Autowired
    public RestController(countryService country) {
        this.country = country;
    }

    @GetMapping(value = "/test")
    public String testValues() {


        return "haha";
    }

    @PostMapping(path = "/add")
    public @ResponseBody
    String createPost(@RequestBody Country countries) {
        country.saveData(countries);
//        PostDao p = new PostDao();
//        p.setContent("musa_got_this");
//        p.setViews(0);
//        p.setPostCreationDate(new java.util.Date());
//        p.setPostUpdatedDate(new java.util.Date());
//        postRepository.save(p);
        return "Saved";
    }
}
