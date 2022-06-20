package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.RegresApi;

public class VerifyPatch extends RegresApi 
{
	@Test
 public void TestPatchMethod() throws FileNotFoundException 
 {
 RegresApi mon4= new RegresApi();
 mon4.patchMethod();
}
}
