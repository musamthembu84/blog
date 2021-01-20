package AI.Blog.model;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class PostDao {


    public PostDao() {
    }

    public PostDao(final int post_id,final String content, int views, final Date post_creation_date, final Date post_updated_date) {
        this.post_id = post_id;
        this.content = content;
        this.views = views;
        this.post_creation_date = post_creation_date;
        this.post_updated_date = post_updated_date;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int post_id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int views;

    @Column(nullable = false)
    private Date post_creation_date;

    @Column(nullable = false)
    private Date post_updated_date;

    @OneToMany(mappedBy = "postDao")
    private Set<LikesDao> likes;


    public void setViews(int views) {
        this.views = views;
    }

    public void setPost_creation_date(Date post_creation_date) {
        this.post_creation_date = post_creation_date;
    }

    public void setPost_updated_date(Date post_updated_date) {
        this.post_updated_date = post_updated_date;
    }

    public String getContent() {
        return content;
    }

    public int getPost_id() {
        return post_id;
    }
}
