package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.CreatePut;

public class VerifyPatchMethod extends CreatePut {
	@Test
	public void TestPatchMethod() throws FileNotFoundException {
		CreatePut obj4= new CreatePut();
		obj4.PatchMethod();
		
	}
}
