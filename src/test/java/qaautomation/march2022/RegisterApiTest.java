package qaautomation.march2022;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import qaautomation.march2022.utils.Datautility2;

public class RegisterApiTest extends BaseAPITest2 {

	@Test
	public void registerTest() {

		String requestBody = Datautility2.getData().toString();

		Response responseRegister = given().spec(commonJsonSpec).body(requestBody).when().post("/register");

		assertEquals(responseRegister.getStatusCode(), 201);

	}

}
