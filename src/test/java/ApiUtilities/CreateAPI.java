package ApiUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreateAPI {
	
	public void getMethod()
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().get("/booking/243").then()
		.log().all().assertThat().statusCode(200);
	}

	public void deleteMethod()
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().
		delete("/booking/330").then().log().all().assertThat().statusCode(201);
	}
	public void PostMethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.body(getFileContent("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\postFile"))
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Content-type","application/json").
header("Accept","application/json").when().log().all().post("/booking").then().log().all().assertThat().statusCode(200);
		
	}
	private String getFileContent(String filePath) throws FileNotFoundException {
		File file =new File(filePath);
		Scanner sc=new Scanner(file);
		sc.useDelimiter("\\z");
		return sc.next();
		
	}
}