package AI.Blog.exception;

public class ValidationException extends Exception{
    
    static final long serialVersionUID = 1L; //assign a long value

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
