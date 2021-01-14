package AI.Blog.model;
import javax.persistence.*;
import java.util.Date;

@Entity
public class PostDao {

    public PostDao() {
    }

    public PostDao(final String content,final int views,
                   final Date creationDate,final Date postUpdatedDate) {
        this.content = content;
        this.views = views;
        this.postCreationDate = creationDate;
        this.postUpdatedDate = postUpdatedDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(columnDefinition = "content")
    private String content;

    @Column(columnDefinition = "views")
    private int views;

    @Column(columnDefinition = "postCreationDate")
    private Date postCreationDate;

    @Column(columnDefinition = "postUpdatedDate")
    private Date postUpdatedDate;


}
