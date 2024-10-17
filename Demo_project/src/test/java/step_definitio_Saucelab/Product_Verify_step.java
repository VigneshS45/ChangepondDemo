package step_definitio_Saucelab;

import org.picocontainer.annotations.Inject;

import Page_actions_SauceLab.Product_verify_page_action;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Product_Verify_step  {




	@Inject 
	Product_verify_page_action Verify;
	



	//  ****************************************** Verify product homepage is displayed ****************************************************


	@When("user navigate to product homepage")
	public void user_navigate_to_product_homepage() {
		Verify.homepage();

	}

	//  ****************************************** Verify product based on selected options in dropdown ****************************************************
	
	@When("User verify the product order list based on selected option {string}  in dropdown")
	public void user_verify_the_product_order_list_based_on_selected_option_in_dropdown(String dropdown_option, io.cucumber.datatable.DataTable dataTable)  {
		
		Verify.product_verification(dropdown_option, dataTable);
	    
	}




	//  ****************************************** select Product & navigate to add to cart**************************************************

	@When("user select the multiple products")
	public void user_select_the_multiple_products() {

		Verify.product_select_();

	}


	// ************************ verify page is displayed & Compare the product price in add to cart page *************************************


	@When("User click on the add to cart button")
	public void user_click_on_the_add_to_cart_button() {

		Verify.click_add_to_cart();


   //  *******************************************************  Click checkout button**********************************************************


	}

	@Then("User click on Check out button and navigate to the checkout page")
	public void user_click_on_check_out_button_and_navigate_to_the_checkout_page() {

		Verify.click_checkout();

	}

}
