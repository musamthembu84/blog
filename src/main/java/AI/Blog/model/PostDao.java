package AI.Blog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "myblog")
public class PostDao {



    public PostDao() {
    }

    public PostDao(final String content,final int views,
                   final Date creationDate,final Date postUpdatedDate) {
        this.id = id;
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

    public Date getPostCreationDate() {
        return postCreationDate;
    }

    public void setPostCreationDate(Date postCreationDate) {
        this.postCreationDate = postCreationDate;
    }

    public Date getPostUpdatedDate() {
        return postUpdatedDate;
    }

    public void setPostUpdatedDate(Date updatedDate) {
        this.postUpdatedDate = updatedDate;
    }
}
