package lesson29.registration;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson29.Specification.*;

public class TestUnSuccessRegWithPojo {
    private final String BASE_URL = "https://reqres.in/";
    private final String EXPECTED_ERROR = "Missing password";

    @Test
    public void testSuccessRegWithPojo() {
        installSpec(requestSpecification(BASE_URL),
                responseSpecification(400));

        Register register = new Register("sydney@fife");
        UnSuccessReg unSuccessReg  = given()
                .body(register)
                .when()
                .post("/api/register")
                .then().log().all()
                .extract().as(UnSuccessReg.class);
        Assert.assertEquals(unSuccessReg.getError(), EXPECTED_ERROR);

    }
}
