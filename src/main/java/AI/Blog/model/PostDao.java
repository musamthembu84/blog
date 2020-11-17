package AI.Blog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Post")
public class PostDao {

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

}
