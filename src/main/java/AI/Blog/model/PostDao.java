package AI.Blog.model;
import javax.persistence.*;

@Entity
public class PostDao {

    public PostDao() {
    }

    public PostDao(final String content,final int views) {
        this.content = content;
        this.views = views;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int views;


    public String getContent() {
        return content;
    }
}
