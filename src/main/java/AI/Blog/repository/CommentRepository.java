package AI.Blog.repository;

import AI.Blog.model.CommentDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<CommentDao,Integer> {

    @Query(value = "select * from post_dao where postId=:postID",nativeQuery = true)
    int getPostIdForComment(final int postID);
}
