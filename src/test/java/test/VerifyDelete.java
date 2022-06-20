package test;

import org.testng.annotations.Test;

import ApiUtilities.RegresApi;

public class VerifyDelete extends RegresApi{
	@Test
	public void TestDeleteMethod() {
		
		RegresApi mon5=new RegresApi();
		mon5.deleteMethod();
	}
}
