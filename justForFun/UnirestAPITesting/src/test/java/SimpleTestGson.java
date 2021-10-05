import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import helpers.SetupObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Type;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTestGson {

    String URL = "https://www.healthcare.gov/api/articles.json";

    @Test
    public void setUp() throws UnirestException {
        // code that will be invoked when this test is instantiated
        HttpResponse<JsonNode> responce = Unirest.get(URL).asJson();
        String s = responce.getBody().toString();
        int status = responce.getStatus();
        Assert.assertEquals(status, 200);
    }

    @Test
    public void checkNonNull() throws UnirestException {
        String body = Unirest.get(URL).asJson().getBody().toString();
        Gson gson = new Gson();
        Type articleListType = new TypeToken<Articles>() {
        }.getType();
        Articles articles = gson.fromJson(body, articleListType);
        Assert.assertNotNull(articles);
    }

    @Test
    public void aFastTest() throws UnirestException {
        SetupObjectMapper mapper = new SetupObjectMapper();
        mapper.setObjectMapper();
        Articles articles = Unirest.get(URL).asObject(Articles.class).getBody();
        assertThat(articles.getArticles().get(0).getTitle())
                .isNotNull()
                .startsWith("Nuevos")
                .contains("bajos")
                .endsWith("Mercado");
    }

    @Test
    public void assertWithoutMappers() throws UnirestException {
        JsonNode body = Unirest.get(URL).asJson().getBody();
        JSONObject object = body.getObject();
        JSONArray articlesArr = object.getJSONArray("articles");
        Type listType = new TypeToken<List<Article>>() {
        }.getType();
        List<Article> articles = new Gson().fromJson(articlesArr.toString() , listType);
        assertThat(articles)
                .hasSize(82);
    }
}
