import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import helpers.JacksonObjectMapper;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTestJacson {

    String URL = "https://www.healthcare.gov/api/articles.json";

    @Test
    public void testWithJacksonObjectMapping() throws UnirestException {
        JacksonObjectMapper mapper = new JacksonObjectMapper();
        mapper.setObjectMapper();
        Articles articles = Unirest.get(URL).asObject(Articles.class).getBody();
        assertThat(articles.getArticles().get(0).getTitle())
                .isNotNull()
                .startsWith("Nuevos")
                .contains("bajos")
                .endsWith("Mercado");
    }
}
