package test;

import org.testng.annotations.Test;

import ApiUtilities.Activities;

public class ActiGet extends Activities{
	@Test
	public void TestgetMethod() {
	Activities ac1=new Activities();
	ac1.getMethod();
	}
}
