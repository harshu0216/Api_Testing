package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.CreatePut;

public class VerifyPutMethod extends CreatePut {
	@Test
public void TestPutMethod() throws FileNotFoundException {
	CreatePut obj3=new CreatePut();
	obj3.PutMethod();
}
}