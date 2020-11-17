package AI.Blog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Post")
public class PostDao {

    public PostDao(int id, String content, int views, Date creationDate, Date updatedDate) {
        this.id = id;
        this.content = content;
        this.views = views;
        this.creationDate = creationDate;
        this.updatedDate = updatedDate;
    }

    public PostDao() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(columnDefinition = "content")
    private String content;

    @Column(columnDefinition = "views")
    private int views;

    @Column(columnDefinition = "creationDate")
    private Date creationDate;

    @Column(columnDefinition = "updatedDate")
    private Date updatedDate;

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getViews() {
        return views;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }
}
