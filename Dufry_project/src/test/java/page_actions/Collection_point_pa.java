
package page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base_pack.Base;

public class Collection_point_pa {

    //   @FindBy(xpath = "//h1[.='Collection point']")
    //	WebElement collection_pageactual;
	
	@FindBy(xpath = "(//div[@class='modal-inner-wrap'])[3]")
	WebElement collectioPointPage;
    
    @FindBy(css =  ".modal-header h1")
    WebElement collection_title_actual;
    
    //    @FindBy(xpath = "//div[@class='custom-dropdown-wrapper control-field --terminal']/./div/./input")
    @FindBy(xpath = "(//div[@class=\"selected-option\"])[3]")
   	WebElement clickTerminal;
    
    //    @FindBy(css = "#terminal")
    //    WebElement clickTerminal;

	@FindBy(css = ".terminal-name")
	List<WebElement> terminal;
	
	@FindBy(css = ".date-input-wrapper")
	WebElement dateinputfiled;
	
	@FindBy (css = ".ui-state-default")
	List<WebElement> datePick;

	@FindBy(xpath = "//button[.='Confirm collection point']")
	WebElement confirm_button;

	@FindBy(css = "a[class=\"action showcart\"]")
	WebElement showcart;

	@FindBy(xpath = "//button[.='Order now']")
	WebElement ordernow_button;


	Base base;

	public Collection_point_pa(Base base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);
	}
	
	
	//******************************************************* Navigate&validate collection point page **************************************************

	public String validateCollectionPointPage()   {
		
		base.getWait().until(ExpectedConditions.visibilityOf(collection_title_actual));
		
		return collection_title_actual.getText();

	}

	//************************************************************** terminal selection *****************************************************************

	public void terminalSelection(String terminalname) {

		clickTerminal.click();

		for (WebElement webElement : terminal) {
			String terminal_select = webElement.getText();
			if (terminal_select.equals(terminalname)) {
				webElement.click();
				
				break;
			}

		}

	}

	//***************************************************************** select date *******************************************************************

	public void selectDate(String date) {
		
		dateinputfiled.click();

	    for (WebElement webElement : datePick) {
	    	String selectdate = webElement.getText();
	    	if ( selectdate.equals(date) ) {
	    		webElement.click();
				break;
			}
			
	    }	

	}

	//************************************************************* click confirm button  ***************************************************************

	public void clickConfirm() {
		confirm_button.click();

	}

	//*************************************************************** click showcart *******************************************************************

	public void clickShowcart() {
		showcart.click();

	}

//	//************************************************************ click ordernow button *******************************************************************
//
//	public void click_ordernow() {
//		ordernow_button.click();
//
//	}
}