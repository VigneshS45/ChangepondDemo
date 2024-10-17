package page_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_pack.Base;

public class Driver_launch_pa {
	
	@FindBy(id = "usercentrics-root")
	WebElement root_element;
	
	
	
	Base base;
	
	public Driver_launch_pa(Base base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);
	}
	
	//*********************************************************** Launching the URL ******************************************************************
   
	public void launchDriver() {
		String url = base.getProperty().getProperty("Url");
		base.getDriver().get(url);
		SearchContext shadow_Root = root_element.getShadowRoot();
		shadow_Root.findElement(By.cssSelector("button[data-testid='uc-accept-all-button']")).click();
		
	}
	

}
