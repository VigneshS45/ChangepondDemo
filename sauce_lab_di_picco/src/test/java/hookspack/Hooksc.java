package hookspack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_actions_SuuceLab.Checkout_action_page;
import Page_actions_SuuceLab.Login_App_Saucelab;
import Page_actions_SuuceLab.Product_verify_page_action;
import base_pack.Base_classs;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksc  {

	  Base_classs base;
	   
	   public Hooksc(Base_classs base) {
		   this.base=base;
		
	}
	  

	@Before
	public void before_scenario() {

	  WebDriver driver=new ChromeDriver();
	  base.setDriver(driver);
	  base.getDriver().manage().window().maximize();
	  base.getDriver().get("https://www.saucedemo.com/");
	  
	  Login_App_Saucelab log= new Login_App_Saucelab(base);
	  base.setLogin(log);
	  
	  Product_verify_page_action verify=new Product_verify_page_action(base);
	  base.setPro_verify(verify);
	  
	  Checkout_action_page checkout= new Checkout_action_page(base);
	  base.setCheckout(checkout);
	  
	  
		
	}


	
	@After
	public void after_scenario() {
		base.getDriver().quit();
	}
}
