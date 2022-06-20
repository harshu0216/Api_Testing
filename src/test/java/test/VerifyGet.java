package test;

import org.testng.annotations.Test;

import ApiUtilities.RegresApi;

public class VerifyGet extends RegresApi{
	@Test
	public void TestgetMethod() {
		RegresApi mon=new RegresApi();
		mon.getMethod();
	}
}
