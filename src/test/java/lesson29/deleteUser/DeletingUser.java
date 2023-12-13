package lesson29.deleteUser;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson29.Specification.*;

public class DeletingUser {

    private final String BASE_URL = "https://reqres.in/";
    @Test
    public void testDeleting() {
        installSpec(requestSpecification(BASE_URL),
                responseSpecification(204));

        given()
                .when()
                .delete("/api/users/2")
                .then().log().all();
    }
}
