package AI.Blog.model;

import javax.persistence.*;

@Entity
public class LikesDao {

    public LikesDao() {
    }

    public LikesDao(final PostDao postDao) {
        this.postDao = postDao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "post_id",nullable = false)
    private PostDao postDao;

}
