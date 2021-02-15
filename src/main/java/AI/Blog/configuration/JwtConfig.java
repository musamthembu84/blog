package AI.Blog.configuration;

@Configuration
public class JwtConfig {

    private String issue;
    private String secret;

    public String getIssue(){
        return issue;
    }

    public String setIssue(final String issue){
        this.issue= issue;
    }
}