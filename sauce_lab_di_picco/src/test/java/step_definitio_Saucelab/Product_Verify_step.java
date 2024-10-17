package step_definitio_Saucelab;

import base_pack.Base_classs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Product_Verify_step  {
	



	Base_classs base;

	public Product_Verify_step(Base_classs base) {
		this.base=base;
		
	}

	@Then("user should navigate to product homepage")
	public void user_should_navigate_to_product_homepage() {
		base.getPro_verify().Homepage();

	}



	@Given("user should verify the Product order list based on the Name\\(A-Z) on dropdown")
	public void user_should_verify_the_Product_order_list_based_on_the_Name_A_Z_on_dropdown(io.cucumber.datatable.DataTable dataTable) {

		base.getPro_verify().Product_AtoZ(dataTable);

	}

	

	@Given("user should select Name\\(Z-A) in dropdown and verify the Product order")
	public void user_should_select_Name_Z_A_in_dropdown_and_verify_the_Product_order(io.cucumber.datatable.DataTable dataTable) {

		base.getPro_verify().Product_ZtoA(dataTable);


	}


	@Given("User should select Price\\(low to high) in dropdown and verify the Product order")
	public void user_should_select_Price_low_to_high_in_dropdown_and_verify_the_Product_order(io.cucumber.datatable.DataTable dataTable) {

		base.getPro_verify().Product_lowtohigh(dataTable);

	}



	@Given("User should select Price\\(high to low) in dropdown and verify the Product order")
	public void user_should_select_Price_high_to_low_in_dropdown_and_verify_the_Product_order(io.cucumber.datatable.DataTable dataTable) {
		base.getPro_verify().Product_highTolow(dataTable);

	}



	@Given("user should select the product")
	public void user_should_select_the_product() {

		base.getPro_verify().Product_select_();

	}

	@Then("navigate to the add to cart and verify the Product")
	public void navigate_to_the_add_to_cart_and_verify_the_Product() {

		base.getPro_verify().Prodyuct_verify();

	}

	@Then("User should click on Check out button and navigate to the checkout page")
	public void user_should_click_on_Check_out_button_and_navigate_to_the_checkout_page() {

		base.getPro_verify().Click_checkout();

	}

}
