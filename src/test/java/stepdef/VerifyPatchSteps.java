package stepdef;

import java.io.FileNotFoundException;

import ApiUtilities.CreatePut;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPatchSteps {
	@Given("update to booking id")
	public void update_to_booking_id() throws FileNotFoundException {
	CreatePut pu1=new CreatePut();
	pu1.PatchMethod();
	}

	@Then("patch executed successfully")
	public void patch_executed_successfully() {
	System.out.println("updated patch successfully");
	}

}
