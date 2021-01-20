package AI.Blog.repository;

import AI.Blog.model.ViewsDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewRepository extends CrudRepository<ViewsDao,Integer> {

    @Query(value = "select count(*) from views_dao where post_id =:postID", nativeQuery = true)
    int getTotalViewsForPost(final int postID);
}
