package page_actions;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_pack.Base;

public class Select_brand_pa {

	@FindBy(css = "#page-title-heading")
	WebElement liquorPageActual;

	@FindBy(css = ".align-items-center")
	List<WebElement> topbrands;


	Base base;
	public Select_brand_pa(Base base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);
	}


	//****************************************************** Naviget & validate liquor module *********************************************************

	public String validateLiquorModule() {

		return liquorPageActual.getText();


	}

	//***************************************************************** click brand *********************************************************************

	public void selectBrand(String brandName) {
		for (WebElement webElement : topbrands) {
			String brands = webElement.getAttribute("href");
			if (brands.contains(brandName)) {
				webElement.click(); 
				break;
			}
		}

	}


}
