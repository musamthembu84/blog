package AI.Blog.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SuccessResponse  {

    @JsonProperty("success")
    private String success;

    public SuccessResponse(String success) {
        this.success = success;
    }

}
