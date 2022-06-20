package examples;

import io.restassured.RestAssured;

public class FakeDelete {

	public static void main(String[] args) {
	
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Activities").
		headers("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().log().all().delete("/5").then().log().all().assertThat().statusCode(200);
	}

}
