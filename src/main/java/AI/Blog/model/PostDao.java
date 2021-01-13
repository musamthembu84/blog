package AI.Blog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Post")
public class PostDao {



    public PostDao() {
    }

    public PostDao(final int id,final String content,final int views,
                   final Date creationDate,final Date updatedDate) {
        this.id = id;
        this.content = content;
        this.views = views;
        this.creationDate = creationDate;
        this.updatedDate = updatedDate;
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

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
