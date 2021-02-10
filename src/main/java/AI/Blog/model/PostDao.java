package AI.Blog.model;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class PostDao {

    public PostDao() {
    }

    public PostDao(final int post_id,final String content,final String title,
                   final Date post_creation_date, final Date post_updated_date,
                   final String sub_content) {
        this.post_id = post_id;
        this.content = content;
        this.title = title;
        this.post_creation_date = post_creation_date;
        this.post_updated_date = post_updated_date;
        this.sub_content = sub_content;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int post_id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String sub_content;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Date post_creation_date;

    @Column(nullable = false)
    private Date post_updated_date;

    @OneToMany(mappedBy = "postDao")
    private Set<LikesDao> likes;

    public void setPost_creation_date(Date post_creation_date) {
        this.post_creation_date = post_creation_date;
    }

    public void setPost_updated_date(Date post_updated_date) {
        this.post_updated_date = post_updated_date;
    }

    public String getContent() {
        return content;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPost_creation_date() {
        return post_creation_date;
    }

    public Date getPost_updated_date() {
        return post_updated_date;
    }

    public String getSub_content() {
        return sub_content;
    }

    public void setSub_content(String sub_content) {
        this.sub_content = sub_content;
    }
}
