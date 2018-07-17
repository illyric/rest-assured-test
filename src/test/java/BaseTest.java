import org.junit.BeforeClass;

import com.jayway.restassured.RestAssured;

public class BaseTest {
    // sets up RestAssured with a default target of "http://localhost:8080/rest-garage-sample"
    // at the same time, allows to set a different web context using env. vars. ex.
    // gradle test -Dserver.port=8081 -Dserver.host=http://example.com
    // it will run the same suite of tests against an app deployed at "http://example.com:9000/rest-garage-sample"
    // and thus enabling our tests to run against different environments
    @BeforeClass
    public static void setUp() {
        String port = System.getProperty("server.port");
        if (port == null) {
            RestAssured.port = RestAssured.DEFAULT_PORT;
        } else {
            RestAssured.port = Integer.valueOf(port);
        }

        String basePath = System.getProperty("server.base");
        if (basePath == null) {
            basePath = "/rest-garage-sample";
        }
        RestAssured.basePath = basePath;

        String baseURI = System.getProperty("server.host");
        if (baseURI == null) {
            baseURI = "http://localhost";
        }

        System.out.println(String.format("server.port: %s, server.base: %s, server.host: %s", port, basePath, baseURI));
    }
}
