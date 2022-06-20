package examples;

import io.restassured.RestAssured;

public class GetDemo {
	public static void main(String[] args) {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().
		get("/booking/1179").then().log().all().assertThat().statusCode(200);
	}
}
