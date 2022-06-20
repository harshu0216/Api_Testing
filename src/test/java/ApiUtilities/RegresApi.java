package ApiUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class RegresApi {

	public void getMethod()
	{
		RestAssured.given().baseUri("https://reqres.in/api/users").when().log().all().get("/5").then()
		.log().all().assertThat().statusCode(200);
	}
	public void postMethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://reqres.in/api")
		.body(GetFile("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\RegresBooking2"))
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Content-type","application/json").
		header("Accept","application/json").when().log().all().post("/users").then().log().all().assertThat().statusCode(201);
	}
	public String GetFile(String path) throws FileNotFoundException {
		File fi=new File(path);
		Scanner sc=new Scanner(fi);
		sc.useDelimiter("\\z");
		return sc.next();
	}
	public void putMethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://reqres.in/api/users").
		body(GetFile("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\RegresBooking2"))
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().post("/2").then().log().all();

	}
	public void patchMethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://reqres.in/api/users").body(GetFile("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\RegresBooking1"))
		.header("Accept","application/json").header("Content-Type","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().log().all().patch("/2").then().log().all();
	}
	public void deleteMethod() 
	{
		RestAssured.given().baseUri("https://reqres.in/api/users").headers("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().log().all().delete("/3").then().log().all().assertThat().statusCode(204);	
	}
}
