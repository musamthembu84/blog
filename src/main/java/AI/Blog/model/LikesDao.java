package AI.Blog.model;
import javax.persistence.*;

@Entity
@Table(name = "Likes")
public class LikesDao {

    public LikesDao(int count, PostDao postDao) {
        this.id = id;
        this.count = count;
        this.postDao = postDao;
    }

    public LikesDao() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(columnDefinition = "count")
    private int count;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postID",referencedColumnName = "id")
    private PostDao postDao;
}
