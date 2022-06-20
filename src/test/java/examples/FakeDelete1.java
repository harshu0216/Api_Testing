package examples;

import io.restassured.RestAssured;

 class FakeDelete1{
	public static void main(String[] args) {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Authors").when().log().all()
		.delete("/10").then().log().all().assertThat().statusCode(200);
	}
	
}
