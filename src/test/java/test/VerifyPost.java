package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.RegresApi;

public class VerifyPost extends RegresApi
{
 @Test
 public void TestPostMethod() throws FileNotFoundException {
	 RegresApi mon2=new RegresApi();
	 mon2.postMethod();
 }
}
