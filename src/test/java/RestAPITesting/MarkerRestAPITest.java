package RestAPITesting;

import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import util.RestServerTest;
public class MarkerRestAPITest extends RestServerTest {

    @Before
    public void before() {
        RestAssured.baseURI=baseURLWthPort();

    }


    @Test
    public void checkstatus() {
        // RestAssured.baseURI="http://localhost:5050/";
                System.out.println(when().
                        get("/v1/marker").asString());


    }


}