package stepdef;

import java.io.FileNotFoundException;

import ApiUtilities.CreatePut;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPutsteps {
	@Given("Put to bookin id")
	public void put_to_bookin_id() throws FileNotFoundException {
	 CreatePut pu=new CreatePut();
	 pu.PutMethod();
	}

	@Then("put executed successfully")
	public void put_executed_successfully() {
	System.out.println("put executed successfully");
	}

}
