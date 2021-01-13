package AI.Blog.repository;

import AI.Blog.model.LikesDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//extends CrudRepository<LikesDao,Integer>
@Repository
public interface LikesRepository {

//    @Query("select u from LikesDao u where u.postDao =:postId")
//    int getLikesForPost(@Param("postDao") final int postId);
}
