package step_definition;

import static org.testng.Assert.assertEquals;

import org.picocontainer.annotations.Inject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_actions.Add_product_pa;
import page_actions.Collection_point_pa;
import page_actions.Create_order_pa;
import page_actions.Select_brand_pa;
import page_actions.Select_product_pa;

public class Create_order_sd {

	@Inject	
	Create_order_pa cr;
	
	@Inject
	Select_brand_pa sb;
	
	@Inject
	Select_product_pa sp;
	
	@Inject
	Add_product_pa ap;
	
	@Inject
	Collection_point_pa cp;

	@Given("User clicks on the {string} tab from product menu list")
	public void user_clicks_on_the_tab_from_product_menu_list(String product) {
		cr.selectliquorTab(product);

	}

	@Given("User should navigates to the {string} module")
	public void user_should_navigates_to_the_liquor_module(String liquor) {
		String actual = sb.validateLiquorModule();
		assertEquals(actual, liquor);

	}

	@When("User selects the {string} brand from the top brands")
	public void user_selects_the_brand_from_the_top_brands(String brandName) {
		sb.selectBrand(brandName);
		
	}

	@When("User should navigates to the {string} brand product page")
	public void user_should_navigates_to_the_brand_product_page(String brand) {
		String actual = sp.validateProductpage();
		assertEquals(actual, brand);

	}

	@When("User selects the {string} liquor product from the brand product page")
	public void user_selects_the_liquor_product_from_the_brand_product_page(String productName) {
		sp.selectProduct(productName);
		
	}

	@When("User should navigates to the product {string} details page")
	public void user_should_navigates_to_the_product_details_page(String product) {
		String actual = ap.validateProductDetailsPage();
		assertEquals(actual, product);

	}

	@When("User clicks on the Add to bag button")
	public void user_clicks_on_the_add_to_bag_button()  {
		ap.clickAddbutton();
		
	}

	@Then("User should navigates to the {string} page")
	public void user_should_navigates_to_the_page(String collection_point)   {
		String actual = cp.validateCollectionPointPage();
		assertEquals(actual, collection_point);
		
	}

	@Then("User selects the terminal as {string} from the dropdown")
	public void user_selects_the_terminal_as_from_the_dropdown(String terminalname) {
		cp.terminalSelection(terminalname);
		
	}

	@Then("User selects the collection date {string} from the date picker field")
	public void user_selects_the_collection_date_from_the_date_picker_field(String date) {
		cp.selectDate(date);
	   
	}

	@When("User clicks on the confirm collection piont button")
	public void user_clicks_on_the_confirm_collection_piont_button() {
		cp.clickConfirm();
		
	}

	@When("User clicks on the show cart tab")
	public void user_clicks_on_the_show_cart_tab() {
		cp.clickShowcart();
		
	}


	//	@When("User clicks on the Order now button")
	//	public void user_clicks_on_the_order_now_button() {
	//	   cp.click_ordernow();
	//	}


}
