import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class GoogleTest extends BaseTest {
    @Test
    public void makeSureGoogleIsUp() {
        given().when().get("https://www.google.com").then().statusCode(200);
    }
}
