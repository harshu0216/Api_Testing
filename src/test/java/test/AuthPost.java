package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.Authors;

public class AuthPost extends Authors{
	@Test
	public void TestPostMethod() throws FileNotFoundException {
		Authors au2=new Authors();
		au2.postMethod();
	}
}
