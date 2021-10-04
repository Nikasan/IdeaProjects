package helpers;

import com.google.gson.Gson;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;

public class SetupObjectMapper {

    public void setObjectMapper() {
        final Gson gson = new Gson();
        Unirest.setObjectMapper(new ObjectMapper() {
            public <T> T readValue(String value, Class<T> valueType) {
                return gson.fromJson(value, valueType);
            }

            public String writeValue(Object value) {
                return gson.toJson(value);
            }
        });
    }
}
