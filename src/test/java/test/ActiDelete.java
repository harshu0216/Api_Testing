package test;

import org.testng.annotations.Test;

import ApiUtilities.Activities;

public class ActiDelete  extends Activities {
	@Test
	public void TestDeleteMethod() {
		Activities ac4=new Activities();
		ac4.deleteMethod();
	}
}
