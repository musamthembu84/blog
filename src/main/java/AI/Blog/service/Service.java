package AI.Blog.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {


      @GetMapping(value = "/data")
      public String values(){
          return "hello world";
      }
}
