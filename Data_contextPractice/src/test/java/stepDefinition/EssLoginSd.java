package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.picocontainer.annotations.Inject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageAction.EssLoginPa;

public class EssLoginSd {
	
	@Inject EssLoginPa login;
	
	@Given("User should launch the ESS application")
	public void user_should_launch_the_ess_application() {
		login.launchUrl();
	  
	}

	@Given("User retrives the required data from {string} and {string} and {string}")
	public void user_retrives_the_required_data_from_and_and(String datakey, String sheet, String path) {
		login.Credentilas(datakey,sheet,path);
	    
	}

	@When("User enters the credentials and clicks on submit button")
	public void user_enters_the_credentials_and_clicks_on_submit_button() {
	   login.clickSubmit();
	   
	}

	@Then("User should navigates to the dashboard")
	public void user_should_navigates_to_the_dashboard() {
		String actual = login.validateDashboard();
		assertEquals(actual,"Chagepond");
	   
	}

}
