package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class PostDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		body(getFileContent("D:\\users\\workspace\\ApiRA\\src\\test\\java\\CreateBooking")).
		header("Accept","application/json").header("Content-Type","application/json").
		when().log().all().post("/booking").then().log().all(); 
		
		

	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
    {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();

}


}
