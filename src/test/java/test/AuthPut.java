package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.Authors;

public class AuthPut extends Authors {
	@Test
public void TestPutMethod() throws FileNotFoundException {
	Authors au3=new Authors();
	au3.putMethod();
}
}
