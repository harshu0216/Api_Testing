package ApiUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CoverPhotos {
	public void getMethod() {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos").
		when().log().all().get("/8").then().log().all().assertThat().statusCode(200);
	}
	public void postMethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos")
		.body(getFile("D:\\users\\workspace\\ApiRA\\src\\test\\java\\test\\CoverPho")).header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().post().then().log().all().assertThat().statusCode(200);
	}
	public static  String getFile(String path) throws FileNotFoundException {
		File fi=new File(path);
		Scanner sc=new Scanner(fi);
		sc.useDelimiter("\\z");
		return sc.next();
	}
	public void putMethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos")
		.body(getFile("D:\\users\\workspace\\ApiRA\\src\\test\\java\\test\\CoverPho1")).header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().put("/15").then().log().all().assertThat().statusCode(200);
	}
	public void deleteMethod() {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos").when()
		.log().all().delete("/16").then().log().all().assertThat().statusCode(200);

	}
}



