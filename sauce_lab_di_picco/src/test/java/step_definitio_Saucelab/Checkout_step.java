package step_definitio_Saucelab;

import org.openqa.selenium.support.PageFactory;

import Page_actions_SuuceLab.Checkout_action_page;
import base_pack.Base_classs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Checkout_step   {
	

	
	
	Base_classs base;



	public Checkout_step(Base_classs base) {
		this.base=base;
		
	}
    
	

	@Given("User should enter the Firstname {string}")
	public void user_should_enter_the_Firstname(String Firstname) {

		base.getCheckout().set_firstname(Firstname);

	}

	@Given("User should enter the Lastname {string}")
	public void user_should_enter_the_Lastname(String lastname) {

		base.getCheckout().set_lastname(lastname);

	}

	@Given("User should enter the Postalcode {string}")
	public void user_should_enter_the_Postalcode(String post) {

		base.getCheckout().Set_postcode(post);

	}

	@Given("user should click on the Continue button")
	public void user_should_click_on_the_Continue_button() {

		base.getCheckout().clickcontinue();

	}

	@Then("User should navigate to overview page and click on Finish button")
	public void user_should_navigate_to_overview_page_and_click_on_Finish_button() {

		base.getCheckout().clickfinish();

	}


}
