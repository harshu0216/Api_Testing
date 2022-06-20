package examples;

import io.restassured.RestAssured;

public class ReqresGet {


	public static void main(String[] args) {
		RestAssured.given().baseUri("https://reqres.in/api/users").when().log().all().
		get("/2").then().log().all().assertThat().statusCode(200);

	}

}
