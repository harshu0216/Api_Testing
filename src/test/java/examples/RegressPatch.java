package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class RegressPatch {

	public static void main(String[] args) throws FileNotFoundException {
		RestAssured.given().baseUri("https://reqres.in/api/users").body(getFileContent("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\RegresBooking1"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().patch("/2").then().log().all();
		
	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
    {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();



}

}
