import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class GarageTest extends BaseTest {
    @Test
    public void getGarageShouldReturnStatusCode200() {
        given().when().get("/garage").then().statusCode(200);
    }
}
