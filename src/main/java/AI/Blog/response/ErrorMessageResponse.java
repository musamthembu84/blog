package AI.Blog.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMessageResponse {
   @JsonProperty("error")
    private final String error;

    private ErrorMessageResponse(String error) {
        this.error = error;
    }

    public static ErrorMessageResponse create(final String error){
        return new ErrorMessageResponse(error);
    }
}
