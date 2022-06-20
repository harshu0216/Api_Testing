package examples;

import io.restassured.RestAssured;

public class GetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Activities").when().log().all().get("/6").
		then().log().all().assertThat().statusCode(200);
	}

}
