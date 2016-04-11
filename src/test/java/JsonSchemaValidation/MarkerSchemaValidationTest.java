package JsonSchemaValidation;

import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import util.RestServerTest;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * Created by vpemawat on 4/10/16.
 */



public class MarkerSchemaValidationTest extends RestServerTest {


    @Before
    public void before() {
        RestAssured.baseURI=baseURLWthPort();

    }

    @Test
    public void marker_json_resource_conforms_to_the_marker_schema() {

             /*   given().
                param("name", "NEW_TESTS").
                when().
                get("/v1/marker").
                then().
                body(matchesJsonSchemaInClasspath("/Users/vpemawat/Downloads/restAssured/markerSchema.json"));
*/

        get("/v1/marker").then().assertThat().body(matchesJsonSchemaInClasspath("/Users/vpemawat/Downloads/restAssured/markerSchema.json"));

        // (1)
               //body("markers.name", ("NEW_TESTS")); // (2)

    }
}
