package test;

import org.testng.annotations.Test;

import ApiUtilities.Authors;

public class AuthGet extends Authors {
	@Test
public void TestGetMethod() {
	Authors au1=new Authors();
	au1.getMethod();
}
}
