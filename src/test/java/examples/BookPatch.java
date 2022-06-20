package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class BookPatch {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
body(getFile("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\BookFile2"))
.header("Accept","application/json").header("Content-type","application/json")
.when().log().all().patch("/Books/120").then().log().all();
	}
public static String getFile(String filePath) throws FileNotFoundException
{
	File file=new File(filePath);
	Scanner sc=new Scanner(file);
	sc.useDelimiter("\\Z");
	return sc.next();
}
}


///this website doesnot allow patch 