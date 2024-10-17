package page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_pack.Base;

public class Select_product_pa {
	
	@FindBy(xpath = "//div//h1[@class=\"brand-title\"]")
	WebElement brandpageactual;

//     @FindBy(css = ".product-item")
	@FindBy (css = ".product-item div div h2 a.product-item-link")
	List<WebElement> jdProducts;
	
	
	Base base;

	public Select_product_pa(Base base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);
	}
	
	//********************************************************* Navigate & validate product page ************************************************************

	public String validateProductpage() {
		return brandpageactual.getText();


	} 

	//************************************************************* select product ******************************************************************

	public void selectProduct(String productName) {
		for (WebElement webElement : jdProducts) {
			String product = webElement.getText().trim();
			if (product.equals(productName)) {
				webElement.click();

				break;
			}
			
		}

	}


}
