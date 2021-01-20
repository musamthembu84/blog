package AI.Blog.repository;

import AI.Blog.model.ViewDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewRepository extends CrudRepository<ViewDao,Integer> {

    @Query(value = "select count (*) from view_dao where post_id=:postID", nativeQuery = true)
    int getTotalViewsForPost(final int postID);
}
