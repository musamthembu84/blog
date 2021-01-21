package AI.Blog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CommentDao {

    public CommentDao() {
    }

    public CommentDao(String content, String author, Date commentDate, PostDao postDao) {
        this.content = content;
        this.author = author;
        this.commentDate = commentDate;
        this.postDao = postDao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comment_id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private Date commentDate;

    @ManyToOne
    @JoinColumn(name = "post_id",nullable = false)
    private PostDao postDao;

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public PostDao getPostDao() {
        return postDao;
    }

    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }
}
