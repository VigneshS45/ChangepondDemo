package steps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.picocontainer.annotations.Inject;

import apiActions.CreateIssueActions;
import dataContext.DataCon_Get_Set;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Jira_sd {
	
	@Inject CreateIssueActions createIssue;
	
	
	@Given("User retrive the testdata from {string} and {string} and {string}")
	public void user_retrive_the_testdata_from_and_and(String key, String sheet, String path) {
		createIssue.getTestData(key, sheet, path);
	    
	}

	@When("User hits the required end point with payloads")
	public void user_hits_the_required_end_point_with_payloads() throws IOException, ParseException {
		createIssue.hitEndpoint();
	          
	          
	}

	@Then("User should validate the status code")
	public void user_should_validate_the_status_code() {
		String actual = createIssue.validateStatusCode();
		String expected = DataCon_Get_Set.getCredentials().get("statusCode");
		assertEquals(actual, expected);
	
		
	  	}

}
