import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class GarageTest extends BaseTest {
    @Test
    public void getGarageShouldReturnStatusCode200() {
        given().when().get("/garage").then().statusCode(200);
    }

    @Test
    public void getInvalidParkingSlotShouldReturnStatusCode404() {
        given().when().get("/garage/slots/151").then().statusCode(404);
    }
}
