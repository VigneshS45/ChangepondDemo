package hookspack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base_pack.Base_classs;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksc  {

	   public static WebDriver driver1;
	  

	@Before
	public void before_scenario() {

		driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.saucedemo.com/");
		Base_classs.driver=driver1;
	}


	
	@After
	public void after_scenario() {
		driver1.quit();
	}
}
