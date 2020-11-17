package AI.Blog.repository;

import AI.Blog.model.CommentDao;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<CommentDao, Integer> {
}
