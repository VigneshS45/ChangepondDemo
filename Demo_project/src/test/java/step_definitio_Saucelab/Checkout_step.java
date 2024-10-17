package step_definitio_Saucelab;

import org.picocontainer.annotations.Inject;

import Page_actions_SauceLab.Checkout_action_page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout_step   {




	@Inject
	Checkout_action_page cp;


	//  ******************************************set_firstname****************************************************


	@When("User enter the Firstname {string}")
	public void user_enter_the_firstname(String Firstname) {
		cp.set_firstname(Firstname);


	}


	//  ******************************************set_lastname****************************************************


	@When("User enter the Lastname {string}")
	public void user_enter_the_lastname(String lastname) {

		cp.set_lastname(lastname);

	}


	//  ******************************************Set_postcode****************************************************


	@When("User enter the Postalcode {string}")
	public void user_enter_the_postalcode(String post) {

		cp.set_postcode(post);

	}


	//  *************************************click continue button***********************************************


	@When("User click on the Continue button")
	public void user_click_on_the_continue_button() {

		cp.clickcontinue();

	}

	//  ******************************************Product_price verify**********************************************

	@When("User navigate to overview page and verify the product price")
	public void user_navigate_to_overview_page_and_verify_the_product_price() {
		cp.product_price_verify();

	}


	//  ******************************************Clickfinish****************************************************


	@Then("click on Finish button")
	public void click_on_finish_button() {

		cp.clickfinish();

	}


}
