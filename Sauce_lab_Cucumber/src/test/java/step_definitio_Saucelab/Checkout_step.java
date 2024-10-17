package step_definitio_Saucelab;

import org.openqa.selenium.WebDriver;

import Page_actions_SuuceLab.Checkout_action_page;
import base_pack.Base_classs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import hookspack.Hooksc;

public class Checkout_step extends Base_classs  {
	
	
    Checkout_action_page cp=new Checkout_action_page(driver);
    

	@Given("User should enter the Firstname {string}")
	public void user_should_enter_the_Firstname(String Firstname) {

		cp.set_firstname(Firstname);

	}

	@Given("User should enter the Lastname {string}")
	public void user_should_enter_the_Lastname(String lastname) {

		cp.set_lastname(lastname);

	}

	@Given("User should enter the Postalcode {string}")
	public void user_should_enter_the_Postalcode(String post) {

		cp.Set_postcode(post);

	}

	@Given("user should click on the Continue button")
	public void user_should_click_on_the_Continue_button() {

		cp.Clickcontinue();

	}

	@Then("User should navigate to overview page and click on Finish button")
	public void user_should_navigate_to_overview_page_and_click_on_Finish_button() {

		cp.Clickfinish();

	}


}
