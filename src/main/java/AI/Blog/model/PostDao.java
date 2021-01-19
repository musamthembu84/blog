package AI.Blog.model;
import javax.persistence.*;
import java.util.Date;

@Entity
public class PostDao {

    public PostDao() {
    }

    public PostDao(final String content, int views, final Date post_creation_date, final Date post_updated_date) {
        this.content = content;
        this.views = views;
        this.post_creation_date = post_creation_date;
        this.post_updated_date = post_updated_date;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int views;

    @Column(nullable = false)
    private Date post_creation_date;

    @Column(nullable = false)
    private Date post_updated_date;


    public void setPost_creation_date(Date post_creation_date) {
        this.post_creation_date = post_creation_date;
    }

    public void setPost_updated_date(Date post_updated_date) {
        this.post_updated_date = post_updated_date;
    }

    public String getContent() {
        return content;
    }
}
