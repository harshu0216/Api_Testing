package stepdef;

import java.io.FileNotFoundException;

import ApiUtilities.CreateAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPostSteps {
	@Given("Post new bookin id")
	public void post_new_bookin_id() throws FileNotFoundException {
	   CreateAPI ap1=new CreateAPI();
	   ap1.PostMethod();
	}

	@Then("post executed successfully")
	public void post_executed_successfully() {
	 System.out.println("post is executed successfully");
	}
	

}
