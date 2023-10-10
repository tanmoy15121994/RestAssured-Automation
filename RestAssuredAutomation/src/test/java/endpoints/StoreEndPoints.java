package endpoints;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class StoreEndPoints {

	public static Response createStore() {
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body("{\r\n"
						+ "  \"id\": 0,\r\n"
						+ "  \"petId\": 0,\r\n"
						+ "  \"quantity\": 0,\r\n"
						+ "  \"shipDate\": \"2023-10-05T17:48:12.821Z\",\r\n"
						+ "  \"status\": \"placed\",\r\n"
						+ "  \"complete\": true\r\n"
						+ "}"
						)
			.when()
				.post("https://petstore.swagger.io/v2/store/order");

		return response;
	}


	public static Response getStoreInventory() {
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get("https://petstore.swagger.io/v2/store/inventory");

		return response;
	}

}
