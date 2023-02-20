import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class API_Test {
    @Test
    void getFindByStatus(){
        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
        System.out.println(response.asString());
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200,"Response code doesn't match");
    }

    @Test
    void test2(){
        given().
                get("https://petstore.swagger.io/v2/pet/findByStatus?status=available").
                then().
                statusCode(200);
    }
}
