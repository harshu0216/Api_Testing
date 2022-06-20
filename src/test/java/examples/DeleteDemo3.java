package examples;

import io.restassured.RestAssured;

public class DeleteDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Authors").when().log().all().delete("/28").then().log().all().assertThat().statusCode(200);
	}

}
