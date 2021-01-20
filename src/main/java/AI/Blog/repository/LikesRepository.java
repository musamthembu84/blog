package AI.Blog.repository;

import AI.Blog.model.LikesDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends CrudRepository<LikesDao,Integer> {

    @Query(value = "select count(*) from likes_dao  where post_id =:postId", nativeQuery = true)
     int getLikesForPost(final int postId);
}
