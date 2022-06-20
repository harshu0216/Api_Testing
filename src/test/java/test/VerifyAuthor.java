package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.Authors;

public class VerifyAuthor extends Authors {
@Test(priority = 3)
	public void GetMethod() {
		Authors au1=new Authors();
		au1.getMethod();
	}
@Test(enabled = false)
public void CreateMEthod() throws FileNotFoundException {
	Authors Au2=new Authors();
	Au2.postMethod();
}
@Test(priority = 2)
public void Put() throws FileNotFoundException {
	Authors Au3=new Authors();
	Au3.putMethod();
}
@Test(priority = 1)
public void Delete() {
	Authors Au4=new Authors();
	Au4.deleteMethod();
}
}