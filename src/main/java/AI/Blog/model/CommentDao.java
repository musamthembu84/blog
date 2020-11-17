package AI.Blog.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Comment")
public class CommentDao {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(columnDefinition = "title")
  private String title;

  @Column(columnDefinition = "author")
  private String author;

  @Column(columnDefinition = "comment")
  private String comment;

  @Column(columnDefinition = "date")
  private Date date;

}
