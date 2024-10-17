package page_actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_pack.Base;

public class Search_create_order_pa {

	@FindBy(id = "search")
	WebElement searchbox;
	
	@FindBy(xpath = "//button[@class='action search']")
	WebElement searchIcon;
	
	@FindBy(css = ".over-aged")
	WebElement popup;
	
	
Base base;
	
	public Search_create_order_pa(Base base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);
	}
	
//*********************************************************** search product ******************************************************************
	
	public void serachProduct(String product) {
		searchbox.sendKeys(product);

	}
	
//*********************************************************** clicck search icon ******************************************************************
	
	public void clickSearchIcon() {
		searchIcon.click();

		popup.click();

	}
	
}
