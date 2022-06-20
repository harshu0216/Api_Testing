package ApiUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Authors {
	public void getMethod() {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Authors").when().log().all().get("/5").then()
		.log().all().assertThat().statusCode(200);		
	}
	public void postMethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").body
		(getFileCon("D:\\users\\workspace\\ApiRA\\src\\test\\java\\test\\auth"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().post("api/v1/Authors").then().log().all();
	}
	public static String getFileCon(String filePath) throws FileNotFoundException 
    {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();
}
	public void putMethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").body
		(getFileCon("D:\\users\\workspace\\ApiRA\\src\\test\\java\\test\\auth"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().post("api/v1/Authors/5").then().log().all();
	
	}
	public void deleteMethod() {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Authors").when().log().all().get("/6").then()
		.log().all().assertThat().statusCode(200);
	}
}
