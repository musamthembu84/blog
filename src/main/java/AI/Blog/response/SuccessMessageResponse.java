package AI.Blog.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SuccessMessageResponse {

    @JsonProperty("Message")
    private final String message;

    private SuccessMessageResponse(String message) {
        this.message = message;
    }

    public static SuccessMessageResponse create(final String message){
        return new SuccessMessageResponse(message);
    }
}
