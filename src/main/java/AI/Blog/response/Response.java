package AI.Blog.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty("Status")
    private String status;

    public Response(String status) {
        this.status = status;
    }

}
