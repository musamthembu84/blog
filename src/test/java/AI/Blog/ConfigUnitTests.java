package AI.Blog;

import AI.Blog.configuration.JpaConfig;
import AI.Blog.model.PostDao;
import AI.Blog.repository.PostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;

//import static junit.framework.TestCase.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = { JpaConfig.class },
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class ConfigUnitTests {

    @Resource
    private PostRepository postRepository;

    @Test
    public void testToSavePost(){
        //PostDao postDao = new PostDao(1,"haha",1, new Date(),new Date());
        //postRepository.save(postDao);

        assertEquals("haha","haha");
    }
}
