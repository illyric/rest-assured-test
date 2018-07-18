import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class GarageTest extends BaseTest {
    @Test
    public void getGarageShouldReturnStatusCode200() {
        given().when().get("/garage").then().statusCode(200);
    }

    @Test
    public void getInvalidParkingSlotShouldReturnStatusCode404() {
        given().when().get("/garage/slots/151").then().statusCode(404);
    }

    @Test
    public void verifyNameOfGarageUsingHamcrestMatcher() throws Exception {
        given().when().get("/garage").then().body(containsString("Bavaria Park Garage GmbH"));
    }
}
