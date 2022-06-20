package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.Books;

public class VerifyBooks extends Books  {
	@Test(priority = 4)
 public void TestGet() {
	Books B1= new Books();
	B1.getMethod();
}
	@Test(priority = 2)
	public void TestPost() throws FileNotFoundException {
		Books B2=new Books();
		B2.postMethod();
	}
	@Test (priority = 1)
	public void TestPut() throws FileNotFoundException {
		Books B3=new Books();
		B3.putMethod();
	}
	@Test(priority = 3)
	public void TestDelete() {
		Books B4=new Books();
		B4.deleteMethod();
	}
}
