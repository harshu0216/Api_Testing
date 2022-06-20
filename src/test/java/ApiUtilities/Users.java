package ApiUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Users {
	public void getMet() {
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Users").
	when().log().all().get("/10").then().log().all().assertThat().statusCode(200);
}
public void postMeth() throws FileNotFoundException {
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Users")
	.body(getFile("D:\\users\\workspace\\ApiRA\\src\\test\\java\\test\\usersfile")).header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	.header("Accept","application/json").header("Content-Type","application/json")
	.when().log().all().post().then().log().all().assertThat().statusCode(200);
}
public static  String getFile(String path) throws FileNotFoundException {
	File fi=new File(path);
	Scanner sc=new Scanner(fi);
	sc.useDelimiter("\\z");
	return sc.next();
}
public void putMeth() throws FileNotFoundException {
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Users")
	.body(getFile("D:\\users\\workspace\\ApiRA\\src\\test\\java\\test\\CoverPho1")).header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	.header("Accept","application/json").header("Content-Type","application/json")
	.when().log().all().put("/25").then().log().all().assertThat().statusCode(200);
}
public void deleteMeth() {
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Users").when()
	.log().all().delete("/5").then().log().all().assertThat().statusCode(200);

}

}