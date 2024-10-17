package base_pack;

import org.openqa.selenium.WebDriver;

import Page_actions_SuuceLab.Checkout_action_page;
import Page_actions_SuuceLab.Login_App_Saucelab;
import Page_actions_SuuceLab.Product_verify_page_action;

public class Base_classs {


	private WebDriver driver;
	private Login_App_Saucelab login;
	private Product_verify_page_action pro_verify;
	private Checkout_action_page checkout;

	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public Login_App_Saucelab getLogin() {
		return login;
	}
	public void setLogin(Login_App_Saucelab login) {
		this.login = login;
	}
	
	public Product_verify_page_action getPro_verify() {
		return pro_verify;
	}
	public void setPro_verify(Product_verify_page_action pro_verify) {
		this.pro_verify = pro_verify;
	}
	
	public Checkout_action_page getCheckout() {
		return checkout;
	}
	public void setCheckout(Checkout_action_page checkout) {
		this.checkout = checkout;
	}





}
