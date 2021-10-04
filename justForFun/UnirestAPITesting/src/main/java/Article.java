import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

    private String date;
    private String layout;
    private List<Object> categories;
    private String title;
    private String lang;
    private String url;
    private String content;
    private List<Object> tags;
}
