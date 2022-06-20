package ApiUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Books {
	public void getMethod() {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Books").when().log().all().get("/10").then()
		.log().all().assertThat().statusCode(200);		
	}
public void postMethod() throws FileNotFoundException {
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Books")
	.body(getFileContent("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\BookFile")).header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	.header("Accept","application/json").header("Content-Type","application/json").when().log().all().post()
	.then().log().all().assertThat().statusCode(200);
}
public static String getFileContent(String filePath) throws FileNotFoundException 
{
    File file = new File(filePath);
    Scanner sc = new Scanner(file);
    sc.useDelimiter("\\Z");
    return sc.next();
}
public void putMethod() throws FileNotFoundException {
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").body
	(getFileContent("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\BookFile2"))
	.when().log().all().post("/api/v1/Books/10").then().log().all();

}
public void deleteMethod() {
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Books").when()
	.log().all().delete("/15").then().log().all().assertThat().statusCode(200);
}

}
