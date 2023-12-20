package homeWorkTests.hm27;

import com.codeborne.selenide.conditions.datetime.DateTimeConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

import static io.restassured.RestAssured.given;
import static lesson29.Specification.*;
import static org.hamcrest.Matchers.notNullValue;

public class testUserCreate {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testPostRequest(){
        installSpec(requestSpecification(BASE_URL),
                responseSpecification(201));
        UserCreate userCreate = new UserCreate("morpheus", "leader");
        SuccessUserCreate successUserCreate =
        given()
                .when()
                .body(userCreate)
                .post("api/users")
                .then()
                .body("id", notNullValue())
                .body("createdAt", notNullValue())
                .log().all()
                .extract().as(SuccessUserCreate.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String createAtCurrent = simpleDateFormat.format(new Date());
        Assert.assertEquals(userCreate.getName(), successUserCreate.getName());
        Assert.assertEquals(userCreate.getJob(), successUserCreate.getJob());
        Assert.assertEquals(successUserCreate.getCreatedAt().substring(0, 10), createAtCurrent);

    }
}
