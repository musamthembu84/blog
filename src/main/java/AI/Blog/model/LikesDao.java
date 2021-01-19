package AI.Blog.model;

import javax.persistence.*;

@Entity
public class LikesDao {

    public LikesDao() {
    }

    public LikesDao(final int counter,final PostDao postDao) {
        this.counter = counter;
        this.postDao = postDao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private int counter;

    @ManyToOne
    @JoinColumn(name = "post_id",nullable = false)
    private PostDao postDao;

}
