package Page_actions_SuuceLab;

import org.openqa.selenium.WebDriver;
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

	@FindBy(xpath = "//button[.='Finish']")
	WebElement finishbtn;

	Base_classs base;



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


	public void Set_postcode(String postalcode) {
		postcode.sendKeys(postalcode);
	}

	//  ******************************************Navigate to details and verify the page is displayed****************************************************


	public void clickcontinue() {
		continuebtn.click();
		String actual= base.getDriver().getCurrentUrl();
		Assert.assertEquals(actual, "https://www.saucedemo.com/checkout-step-two.html");
	}

	//  ******************************************Clickfinish****************************************************


	public void clickfinish() {
		finishbtn.click();
	}
}
