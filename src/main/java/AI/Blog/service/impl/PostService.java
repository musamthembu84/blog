package AI.Blog.service.impl;

import AI.Blog.exception.ApplicationException;
import AI.Blog.model.PostDao;
import AI.Blog.repository.PostRepository;
import AI.Blog.response.SuccessMessageResponse;
import AI.Blog.service.interaces.IPost;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class PostService implements IPost {

    private static final String SUCCESS_MESSAGE = "Post Created Successfully";
    private static final String DELETE_MESSAGE = "Post Deleted Successfully";

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public ResponseEntity<Object> createPost(final PostDao postDao) throws ApplicationException{

        Preconditions.checkArgument(postDao.getContent()!=null,"Posting content cannot be empty");
        settingDefaultValues(postDao);

        postRepository.save(postDao);
        return ResponseEntity
                .ok(SuccessMessageResponse.create(SUCCESS_MESSAGE));

    }

    @Override
    public ResponseEntity<Object> deletePost(final int postID) {
        postRepository.deleteById(postID);
        return ResponseEntity
                .ok(SuccessMessageResponse.create(DELETE_MESSAGE));
    }

    private void settingDefaultValues(final PostDao postDao) throws ApplicationException{
        Preconditions.checkArgument(postDao!=null);

        try {
            postDao.setPost_creation_date(new Date());
            postDao.setPost_updated_date(new Date());
        }
        catch (Exception e){
            throw new ApplicationException("Error while getting content to be posted",e);
        }
    }

}