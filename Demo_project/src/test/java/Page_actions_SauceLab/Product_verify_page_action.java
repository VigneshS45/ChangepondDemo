package Page_actions_SauceLab;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base_pack.Base_classs;
import io.cucumber.datatable.DataTable;

public class Product_verify_page_action {

	@FindBy(css = ".inventory_item_name")
	List<WebElement> product_name_list;

	@FindBy(css = ".inventory_item_price")
	List<WebElement> product_price_list;

	@FindBy(xpath = "(//div[.='Sauce Labs Fleece Jacket']//following::button)[1]")
	WebElement select_product1;

	@FindBy(xpath = "(//div[@class=\"inventory_item\"]//following::button)[3]")
	WebElement select_product2;

	@FindBy(xpath ="//select[@class='product_sort_container']")
	WebElement dropdown;

	@FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
	WebElement Addtocart;
	
	@FindBy(xpath = "//button[.='Checkout']")
	WebElement checkout;


	
	Base_classs base;


	//  ****************************************** Initializing the Webelements ***********************************************

	public Product_verify_page_action(Base_classs base) {

		this.base=base;
		PageFactory.initElements(base.getDriver(), this);

	}


	//  ****************************************** Verify product homepage is displayed ****************************************

	public void homepage() {

		String actual = base.getDriver().getTitle();
		Assert.assertEquals(actual, "Swag Labs");

	}



	//  ******************************************Verify the product ZtoA****************************************************

	public void product_verification(String dropdown_option,DataTable dataTable) {

        
		Select productlist=new Select(dropdown);
		productlist.selectByVisibleText(dropdown_option);


		ArrayList<String> store_prodlist=new ArrayList<String>() ;

		for (WebElement prod_namelist: product_name_list) {
			String Prod_list_items=prod_namelist.getText();
			store_prodlist.add(Prod_list_items);	
		} 	
		for (WebElement prod_pricelist : product_price_list) {
			String Prod_list_items=prod_pricelist.getText();
			store_prodlist.add(Prod_list_items);
		}

		List<String>Expected_prod_list_data=dataTable.asList();

		for (int actual_prod_list = 0 ; actual_prod_list < store_prodlist.size() ; actual_prod_list++) {
			for (int Expected_prod_list = 0 ; Expected_prod_list < Expected_prod_list_data.size() ; Expected_prod_list++) {
				String Actual = store_prodlist.get(actual_prod_list);
				String Expected = Expected_prod_list_data.get(Expected_prod_list);
				if (Actual.equals(Expected)) {
					System.out.println("product list :"+Actual +"="+Expected);

				}
			}
		}
	}


	//  ****************************************** select Product & navigate to add to cart**************************************

	public void product_select_() {


		select_product1.click();
		select_product2.click();

	}


	//  ****************************************** Click Add_to_cart_button ****************************************************

	public void click_add_to_cart() {
		Addtocart.click();
		System.out.println("Products added to cart");

	}
	
//  ***************************************************Click_checkout_button**************************************************** 

	public void click_checkout(){

		checkout.click();
		System.out.println("User should proceed with checkout form");


	}


}
