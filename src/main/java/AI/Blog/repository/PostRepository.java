package AI.Blog.repository;

import AI.Blog.model.PostDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<PostDao,Integer> {
}
