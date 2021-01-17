package AI.Blog.model;
import javax.persistence.*;
import java.util.Date;

@Entity
public class PostDao {

    public PostDao() {
    }

    public PostDao(int id, String content, int views, Date postCreationDate, Date postUpdatedDate) {
        this.id = id;
        this.content = content;
        this.views = views;
        this.postCreationDate = postCreationDate;
        this.postUpdatedDate = postUpdatedDate;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int views;

    @Column(nullable = false)
    private Date postCreationDate;

    @Column(nullable = false)
    private Date postUpdatedDate;


    public String getContent() {
        return content;
    }
}
