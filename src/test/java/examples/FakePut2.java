package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class FakePut2 {


		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub
			RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").body
			(getFileContent("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\Fake3"))
			.header("Accept","application/json").header("Content-Type","application/json")
			.when().log().all().post("/api/v1/Authors/2").then().log().all();
		}
		public static String getFileContent(String filePath) throws FileNotFoundException 
	    {
	        File file = new File(filePath);
	        Scanner sc = new Scanner(file);
	        sc.useDelimiter("\\Z");
	        return sc.next();
	}
		
}
