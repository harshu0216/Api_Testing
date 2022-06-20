package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.Activities;

public class ActiPost extends Activities {
	@Test
	public void TestPostMethod() throws FileNotFoundException {
		Activities ac2=new Activities();
		ac2.postMethod();
	}
}
