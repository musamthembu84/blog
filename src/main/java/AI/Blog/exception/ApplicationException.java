package AI.Blog.exception;

public class ApplicationException extends Exception {

    static final long serialVersionUID = 1L; //assign a long value
    
    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
