package AI.Blog.repository;

import AI.Blog.model.LikesDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends CrudRepository<LikesDao,Integer> {

//    @Query("select u from LikesDao u where u.postDao =:postId")
//    int getLikesForPost(@Param("postDao") final int postId);
}
