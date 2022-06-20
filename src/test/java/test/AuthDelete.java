package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.Authors;

public class AuthDelete extends Authors {
	@Test
public void TestPutMethod() throws FileNotFoundException {
	Authors au4=new Authors();
	au4.deleteMethod();
}
}
