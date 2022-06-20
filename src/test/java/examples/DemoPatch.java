package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class DemoPatch {

	public static void main(String[] args) throws FileNotFoundException {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		body(getFileContent("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\CreateBooking2")).
		header("Accept","application/json").header("Content-Type","application/json").header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=").
		when().log().all().patch("/booking/1822").then().log().all(); 
		

	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
    {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();

}
}
