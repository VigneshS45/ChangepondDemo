package step_definitio_Saucelab;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import Page_actions_SuuceLab.Product_verify_page_action;
import base_pack.Base_classs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Product_Verify_step extends Base_classs {


	Product_verify_page_action AtoZ= new Product_verify_page_action( driver );  

	@Then("user should navigate to product homepage")
	public void user_should_navigate_to_product_homepage() {
		AtoZ.Homepage();

	}



	@Given("user should verify the Product order list based on the Name\\(A-Z) on dropdown")
	public void user_should_verify_the_Product_order_list_based_on_the_Name_A_Z_on_dropdown(io.cucumber.datatable.DataTable dataTable) {

		AtoZ.Product_AtoZ(dataTable);

	}

	

	@Given("user should select Name\\(Z-A) in dropdown and verify the Product order")
	public void user_should_select_Name_Z_A_in_dropdown_and_verify_the_Product_order(io.cucumber.datatable.DataTable dataTable) {

		AtoZ.Product_ZtoA(dataTable);


	}


	@Given("User should select Price\\(low to high) in dropdown and verify the Product order")
	public void user_should_select_Price_low_to_high_in_dropdown_and_verify_the_Product_order(io.cucumber.datatable.DataTable dataTable) {

		AtoZ.Product_lowtohigh(dataTable);

	}



	@Given("User should select Price\\(high to low) in dropdown and verify the Product order")
	public void user_should_select_Price_high_to_low_in_dropdown_and_verify_the_Product_order(io.cucumber.datatable.DataTable dataTable) {
		AtoZ.Product_highTolow(dataTable);

	}



	@Given("user should select the product")
	public void user_should_select_the_product() {

		AtoZ.Product_select_();

	}

	@Then("navigate to the add to cart and verify the Product")
	public void navigate_to_the_add_to_cart_and_verify_the_Product() {

		AtoZ.Prodyuct_verify();

	}

	@Then("User should click on Check out button and navigate to the checkout page")
	public void user_should_click_on_Check_out_button_and_navigate_to_the_checkout_page() {

		AtoZ.Click_checkout();

	}

}
