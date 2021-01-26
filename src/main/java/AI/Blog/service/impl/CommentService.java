package AI.Blog.service.impl;

import AI.Blog.model.CommentDao;
import AI.Blog.model.PostDao;
import AI.Blog.repository.CommentRepository;
import AI.Blog.response.LikesResponseMessage;
import AI.Blog.service.interaces.IComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CommentService  implements IComment {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public ResponseEntity<Object> createComment(final CommentDao commentDao,int postID) {

        Date comment_Date = new Date();
        commentDao.setCommentDate(comment_Date);
        commentRepository.save(new CommentDao(commentDao.getContent(),
                                              commentDao.getAuthor(),
                                              createPostInstance(postID)));

        return ResponseEntity.ok().body(LikesResponseMessage.createMessage("Comment Created"));
    }

    private PostDao createPostInstance(final int postID){
        PostDao postDao = new PostDao();
        postDao.setPost_id(postID);
        return postDao;
    }
}
