package ApiUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreatePut {
public void PutMethod() throws FileNotFoundException 
{
	RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	.body(getFileContent("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\putFile"))
	.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Content-type","application/json").
header("Accept","application/json").when().log().all().put("/booking/995").then().log().all().assertThat().statusCode(200);
	
}
private String getFileContent(String filePath) throws FileNotFoundException {
	File file =new File(filePath);
	Scanner sc=new Scanner(file);
	sc.useDelimiter("\\z");
	return sc.next();
	
}
	public void PatchMethod() throws FileNotFoundException 
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.body(getFileContent("D:\\users\\workspace\\ApiRA\\src\\test\\java\\examples\\putFile"))
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Content-type","application/json").
	header("Accept","application/json").when().log().all().patch("/booking/995").then().log().all().assertThat().statusCode(200);
	}
}

