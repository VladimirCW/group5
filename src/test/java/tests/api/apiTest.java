package test.java.tests.api;

import org.testng.annotations.Test;
import test.java.utils.PropertyLoader;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class apiTest {
    Object createdID;

    @Test
    public void createProjectTest() {
        /*String bodyAsString = "{" +
                "\"name\": \"Movies to watchSS\"," +
                "\"color\": 48," +
                "\"shared\": false" +
                "}";*/

        /*HashMap<String, Object> bodyAsMap = new HashMap<>();
        bodyAsMap.put("name", "Movies to watchSS");
        bodyAsMap.put("color", 48);
        bodyAsMap.put("shared", false);*/

        createdID = given()
                    .header("Authorization", "Bearer 74620c6fd4c6f8357de86c61a915ba72f1465645")
                    .contentType("application/json")
                    //.header("Content-Type", "application/json")
                    //.body(bodyAsString)
                    //.body(bodyAsMap)
                    .body(new File("C:\\Users\\Volodymyr_Dmytriukhi\\ITEA\\group5\\group5\\src\\test\\java\\tests\\api\\createProjectBody.json"))
                    /*.formParam("key1", "value")
                    .formParam("key2", "value")
                    .formParam("key3", "value")*/
                .when()
                    .post(PropertyLoader.loadProperty("api.url") + "/projects")
                .then()
                    .statusCode(200)
                    .extract().path("id");
    }

    @Test(dependsOnMethods = "createProjectTest")
    public void deleteProjectTest() {
        given()
                .header("Authorization", "Bearer 74620c6fd4c6f8357de86c61a915ba72f1465645")
                .contentType("application/json").log().all()
            .when()
                .delete(PropertyLoader.loadProperty("api.url") + "/projects/" + createdID)
            .then().log().all()
                .statusCode(204);
    }
}
