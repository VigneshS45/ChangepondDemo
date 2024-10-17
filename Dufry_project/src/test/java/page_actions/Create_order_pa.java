package page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_pack.Base;

public class Create_order_pa {

	@FindBy(css = ".navigation ul li .level-top span")
	List<WebElement> product_list;

	@FindBy(css = ".over-aged")
	WebElement popup;

	Base base;

	public Create_order_pa(Base base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);
	}

	//*********************************************************** select liquor tab ******************************************************************

	public void selectliquorTab(String product) {


		for (WebElement webElement : product_list) {
			String productlist = webElement.getText();
			if (productlist.equals(product)) {
				webElement.click(); 
				break;
			}
			
		}

		popup.click();

	}
}







