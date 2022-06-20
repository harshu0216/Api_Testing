package examples;

import io.restassured.RestAssured;

public class ReqresDelete {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			RestAssured.given().baseUri("https://reqres.in/api/users").headers("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.when().log().all().delete("/2").then().log().all().assertThat().statusCode(204);
		}

}
