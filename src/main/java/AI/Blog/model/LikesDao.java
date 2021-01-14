package AI.Blog.model;

import javax.persistence.*;

@Entity
public class LikesDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private int counter;
}
