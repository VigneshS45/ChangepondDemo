package page_actions;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base_pack.Base;

public class Add_product_pa {

	@FindBy(xpath = "//span[.=' Tennessee Whiskey Old No. 7 1l ']")
	WebElement productactual;

	//	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	//  @FindBy(xpath = "(//div[@class='fieldset']//button)[2]")
    //  @FindBy(css = "button#product-addtocart-button")
	 @FindBy(xpath = "//div[@class=\"actions \"]//button")
	WebElement addtobag_button;

	Base base;

	public Add_product_pa(Base base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);
	}

	//************************************************ Navigate & validate product details page ****************************************************

	public String validateProductDetailsPage() {
		return productactual.getText().trim();

	}

	//************************************************************* click addbutton *****************************************************************

	public void clickAddbutton()  {
		
		int clickAttempt = 0 ;
		
		while (clickAttempt<2) {
			try {
				base.getWait().until(ExpectedConditions.elementToBeClickable(addtobag_button));
				addtobag_button.click();
				break;
				
			} catch (ElementClickInterceptedException e) {
				
				clickAttempt++;
			}
			
		}

		
	
		

	}
}
