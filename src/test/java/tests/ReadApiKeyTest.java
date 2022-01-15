package tests;

import core.apiKeys.ReadApiKey;
import core.search.Link;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class ReadApiKeyTest {
    String apiKey = ReadApiKey.read();
    String linkSearch = Link.getLinkSearch();

    @Test
    void sendGetWithApiKey() {
        when()
                .get(linkSearch + "q=election&api-key=" + apiKey)
                .then()
                .statusCode(200)
                .body("status", equalTo("OK"));
    }

    @Test
    void sendGetWithInvalidApiKey() {
        when()
                .get();
    }
}
