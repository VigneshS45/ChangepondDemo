package Page_actions_SauceLab;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base_pack.Base_classs;

public class Checkout_action_page  {

	@FindBy(id = "first-name")
	WebElement firstname;

	@FindBy(id = "last-name")
	WebElement lastname;

	@FindBy(id = "postal-code")
	WebElement postcode;

	@FindBy(xpath = "//input[@id=\"continue\"]")
	WebElement continuebtn;
	
	@FindBy(xpath = "//div[@class=\"cart_item_label\"]//following::div[@class=\"inventory_item_price\"]")
	List<WebElement> product_price;

	@FindBy(css = ".summary_subtotal_label")
	WebElement total_summary_price;

	@FindBy(xpath = "//button[.='Finish']")
	WebElement finishbtn;



	Base_classs base;


	//  ************************************Initializing the web elements******************************************


	public Checkout_action_page(Base_classs base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);
	}


	//  ******************************************set_firstname****************************************************


	public void set_firstname(String fname) {
		firstname.sendKeys(fname);
	}


	//  ******************************************set_lastname****************************************************


	public void set_lastname(String lname) {
		lastname.sendKeys(lname);
	}


	//  ******************************************Set_postcode****************************************************


	public void set_postcode(String postalcode) {
		postcode.sendKeys(postalcode);
	}


	//  *************************************click continue button***********************************************


	public void clickcontinue() {
		continuebtn.click();

	}
	
	
//  ******************************************Product_price verify**********************************************

	public void product_price_verify() {

		ArrayList<Double> Prod_price=new ArrayList<Double>() ;

		for (WebElement price : product_price) {
			String price_value=price.getText().replace("$", "");
			Double price_convert = Double.valueOf(price_value);
			Prod_price.add(price_convert);
		}

		Double price1 = Prod_price.get(0);
		Double price2 = Prod_price.get(1);
		double total_price = price1+price2;

		String summary_price = total_summary_price.getText();
		String[] split_summary_price = summary_price.split(":");
		String total = split_summary_price[1].replace("$", "");
		Double checkout_total= Double.valueOf(total);


		Assert.assertEquals(total_price, checkout_total);
		System.out.println(total_price+"="+checkout_total);

	}



	//  ******************************************Clickfinish****************************************************

	public void clickfinish() {
		finishbtn.click();
	}



}
