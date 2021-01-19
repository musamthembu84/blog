package AI.Blog.repository;

import AI.Blog.model.CommentDao;
import jdk.jfr.Registered;
import org.springframework.data.repository.CrudRepository;

@Registered
public interface CommentRepository extends CrudRepository<CommentDao,Integer> {
}
