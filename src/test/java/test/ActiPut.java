package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.Activities;

public class ActiPut extends Activities {
	@Test
	public void TestPutMethod() throws FileNotFoundException {
		Activities ac3=new Activities();
		ac3.putMethod();
	}
}
