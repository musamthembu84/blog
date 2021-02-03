package AI.Blog.repository;

import AI.Blog.model.PostDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<PostDao,Integer>{

    @Query(value = "select * from post_dao order by post_creation_date desc", nativeQuery = true)
    List<PostDao> getPosts(final int numberOfPosts);
}
