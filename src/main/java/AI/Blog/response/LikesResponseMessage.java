package AI.Blog.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LikesResponseMessage {

    @JsonProperty("Total")
    private final String likes;

    private LikesResponseMessage(final String likes) {
        this.likes = likes;
    }

    public static  LikesResponseMessage createMessage (final String likes){
        return new LikesResponseMessage(likes);
    }
}
