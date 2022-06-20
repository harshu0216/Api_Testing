package examples;

import io.restassured.RestAssured;

public class GetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Authors/").when().log().all().get("/16").then().log().all().assertThat().statusCode(200);
	}

}
