package stepdef;

import ApiUtilities.CreateAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Verifygetsteps {
	@Given("Calling Get Method")
	public void calling_get_method() {
	    CreateAPI ap=new CreateAPI();
	    ap.getMethod();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("executed Successfully")
	public void executed_successfully() {
		 System.out.println("Get Method executed successfully");
	    throw new io.cucumber.java.PendingException();
	}


}
