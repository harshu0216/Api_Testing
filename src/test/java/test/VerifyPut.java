package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.RegresApi;

public class VerifyPut extends RegresApi
{
	@Test
 public void TestPutMethod() throws FileNotFoundException {
	 RegresApi mon3=new RegresApi();
	 mon3.putMethod();
}
}
