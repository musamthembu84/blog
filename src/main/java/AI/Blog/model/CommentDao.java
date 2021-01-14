package AI.Blog.model;

import javax.persistence.*;

@Entity
public class CommentDao {

    public CommentDao() {
    }

    public CommentDao(Integer id, String commentContent) {
        this.id = id;
        this.commentContent = commentContent;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String commentContent;
}
