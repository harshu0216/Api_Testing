package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.CreateAPI;

public class VerifyPostMethod extends CreateAPI{
	@Test
	public void TestCreateMethod() throws FileNotFoundException 
	{
	 CreateAPI obj2=new CreateAPI();
	 obj2.PostMethod();
	}
}
