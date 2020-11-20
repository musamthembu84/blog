package AI.Blog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Post")
public class PostDao {

    public PostDao(final int id,final String content,final  int views,
                   final Date creationDate,final Date updatedDate, final int like) {
        this.id = id;
        this.content = content;
        this.views = views;
        this.creationDate = creationDate;
        this.updatedDate = updatedDate;
        this.like = like;
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

    @Column(columnDefinition = "likes")
    private int like;

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

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
