package integration;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void aCarEntersTheGarage() throws Exception {
        Map<String, String> car = new HashMap<>();
        car.put("plateNumber", "mab1234");
        car.put("brand", "bmw");
        car.put("color", "black");

        given().contentType("application/json").body(car)
                .when().post("/garage/slots")
                .then().statusCode(200);
    }
}
