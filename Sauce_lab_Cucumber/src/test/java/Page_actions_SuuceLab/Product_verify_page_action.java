package Page_actions_SuuceLab;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;

public class Product_verify_page_action {

	@FindBy(css = ".inventory_item_name")
	List<WebElement> prodlist_atoz;

	@FindBy(css = ".inventory_item_name")
	List<WebElement> prodlist_ztoa;

	@FindBy(css =".inventory_item_price")
	List<WebElement> Prodlist_lowtohigh;

	@FindBy(css =".inventory_item_price")
	List<WebElement> Prodlist_hightolow;

	@FindBy(xpath = "(//div[.='Sauce Labs Fleece Jacket']//following::button)[1]")
	WebElement select_product;

	@FindBy(xpath = "(//div[@class=\"inventory_item_price\"])[1]")
	WebElement Product_price;

	@FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
	WebElement Addtocart;

	@FindBy(xpath = "//div[@class=\"inventory_item_price\"]")
	WebElement Price_addtocart;

	@FindBy(xpath = "//button[.='Checkout']")
	WebElement checkout;



	static WebDriver driver;

	String Expected;

	public Product_verify_page_action(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//  ****************************************** Verify product page is displayed ****************************************************

	public void Homepage() {

		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Swag Labs");

	}

	//  ******************************************Verify the product Ato z****************************************************

	public void Product_AtoZ(DataTable dataTable){

		//List<WebElement> Prod = driver.findElements(By.cssSelector(".inventory_item_name"));
		ArrayList<String> Prod_atoz=new ArrayList<String>() ;

		for (WebElement element: prodlist_atoz) {
			String Prod_l_items=element.getText();
			Prod_atoz.add(Prod_l_items);	
		}

		List<String>aslist1=dataTable.asList();

		for (int i = 0; i < Prod_atoz.size(); i++) {
			for (int j = 0; j < aslist1.size(); j++) {
				String Actual = Prod_atoz.get(i);
				String Expected = aslist1.get(j);
				if (Actual.equals(Expected)) {
					System.out.println("AtoZ sort order equals :"+Actual +"="+Expected);
				}

			}
		}
	} 	


	//    ******************************************Verify the product ZtoA****************************************************

	public void Product_ZtoA(DataTable dataTable){

		WebElement product_dd1 = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select productlist1=new Select(product_dd1);
		productlist1.selectByVisibleText("Name (A to Z)");

		//List<WebElement> Prod = driver.findElements(By.cssSelector(".inventory_item_name"));
		ArrayList<String> Prod_ztoa=new ArrayList<String>() ;

		for (WebElement element: prodlist_ztoa) {
			String Prod_l_items=element.getText();
			Prod_ztoa.add(Prod_l_items);	
		} 	

		List<String>aslist1=dataTable.asList();

		for (int i = 0; i < Prod_ztoa.size(); i++) {
			for (int j = 0; j < aslist1.size(); j++) {
				String Actual = Prod_ztoa.get(i);
				String Expected = aslist1.get(j);
				if (Actual.equals(Expected)) {
					System.out.println("ZtoA sort order equals :"+Actual +"="+Expected);

				}
			}
		}
	}


	//  ******************************************Verify the product low to high****************************************************

	public void Product_lowtohigh(DataTable dataTable){

		WebElement product_dd1 = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select productlist1=new Select(product_dd1);
		productlist1.selectByVisibleText("Price (low to high)");

		//List<WebElement> Prod = driver.findElements(By.cssSelector(".inventory_item_price"));
		ArrayList<String> Prod_ltoh=new ArrayList<String>() ;

		for (WebElement element: Prodlist_lowtohigh) {
			String Prod_l_items=element.getText();
			Prod_ltoh.add(Prod_l_items);	
		}

		List<String>aslist1=dataTable.asList();

		for (int i = 0; i < Prod_ltoh.size(); i++) {
			for (int j = 0; j < aslist1.size(); j++) {
				String Actual = Prod_ltoh.get(i);
				String Expected = aslist1.get(j);
				if (Actual.equals(Expected)) {
					System.out.println("ltoh sort order equals :"+Actual +"="+Expected);
				}
			}
		}
	} 


	//  ****************************************** Verify the product High to low****************************************************



	public void Product_highTolow(DataTable dataTable){

		WebElement product_dd1 = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select productlist1=new Select(product_dd1);
		productlist1.selectByVisibleText("Price (high to low)");

		//		List<WebElement> Prod = driver.findElements(By.cssSelector(".inventory_item_price"));
		ArrayList<String> Prod_htol=new ArrayList<String>() ;

		for (WebElement element: Prodlist_hightolow) {
			String Prod_l_items=element.getText();
			Prod_htol.add(Prod_l_items);	
		}

		List<String>aslist1=dataTable.asList();

		for (int i = 0; i < Prod_htol.size(); i++) {
			for (int j = 0; j < aslist1.size(); j++) {
				String Actual = Prod_htol.get(i);
				String Expected = aslist1.get(j);
				if (Actual.equals(Expected)) {
					System.out.println("ltoh sort order equals :"+Actual +"="+Expected);

				}
			}
		}


	}    


	//  ****************************************** select Product & navigate to add to cart****************************************************

	public void Product_select_() {

		Expected = Product_price.getText().replace("$", "");	 
		select_product.click();

		Addtocart.click();
		System.out.println("Product selected and navigated to the add to cart page");

	}


	//  ****************************************** verify pagte is displayed & Compare the product price in add to cart page ****************************************************


	public void Prodyuct_verify() {

		String s1 = driver.getCurrentUrl();
		Assert.assertEquals(s1, "https://www.saucedemo.com/cart.html");

		String Actual = Price_addtocart.getText().replace("$", "");
		System.out.println("Price in product page :"+Expected+"\n"+"Price in checkout page :"+Actual);
		Assert.assertEquals(Expected, Actual);

	}

	//  ****************************************** Navigate to check out form page and verify pagte is displayed****************************************************


	public void Click_checkout(){

		checkout.click();
		String s2 = driver.getCurrentUrl();
		Assert.assertEquals(s2, "https://www.saucedemo.com/checkout-step-one.html");
		System.out.println("User should proceed with checkout");


	}


}
