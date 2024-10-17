package step_definition;

import org.picocontainer.annotations.Inject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_actions.Search_create_order_pa;

public class Search_create_order_sd {
	
	
	@Inject Search_create_order_pa search;

	@Given("User enters the product {string} in the searchbox")
	public void user_enters_the_product_in_the_searchbox(String product) {
		
		search.serachProduct(product);
		
	}

	@When("User clicks on the search icon")
	public void user_clicks_on_the_search_icon() {
		
		search.clickSearchIcon();

	}
	
	
	
}
