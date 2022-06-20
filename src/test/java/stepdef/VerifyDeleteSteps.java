package stepdef;

import ApiUtilities.CreateAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyDeleteSteps {
	@Given("delete existing id")
	public void delete_existing_id() {
	    CreateAPI ap2=new CreateAPI();
	    ap2.deleteMethod();
	}

	@Then("delete method  is executed successfully")
	public void delete_method_is_executed_successfully() {
	   System.out.println("deleted successfully");
	}

}
