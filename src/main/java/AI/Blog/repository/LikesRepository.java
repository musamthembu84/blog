package AI.Blog.repository;

import AI.Blog.model.LikesDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends CrudRepository<LikesDao,Integer> {

    @Query("update LikesDao set count = ''")
    boolean updateLikes(final int likeID);

    int getLikesForPost();
}
