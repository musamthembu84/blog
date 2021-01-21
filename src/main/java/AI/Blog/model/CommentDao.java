package AI.Blog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CommentDao {

    public CommentDao() {
    }

    public CommentDao(String content, String author, Date commentDate) {
        this.content = content;
        this.author = author;
        this.commentDate = commentDate;
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
}
