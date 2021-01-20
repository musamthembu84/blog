package AI.Blog.model;

import javax.persistence.*;

@Entity
public class ViewsDao {

    public ViewsDao() {
    }

    public ViewsDao(PostDao postDao) {
        this.postDao = postDao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int views_id;

    @ManyToOne
    @JoinColumn(name= "post_id",nullable = false)
    private PostDao postDao;

}
