package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.Users;

public class VerifyUsers extends Users {
	@Test(priority = 3)
	public void TestGet() {
		Users u1=new Users();
		u1.getMet();
	}@Test(priority = 2)
	public void TestPost() throws FileNotFoundException {
		Users u2=new Users();
		u2.postMeth();
	}
	@Test(priority = 1)
	public void TestPut() throws FileNotFoundException {
		Users u3=new Users();
		u3.putMeth();
	}
	@Test(enabled = false)
	public void TestDelete() {
		Users u4=new Users();
		u4.deleteMeth();
	}
}
