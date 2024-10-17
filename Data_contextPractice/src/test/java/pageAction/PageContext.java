package pageAction;

import org.openqa.selenium.support.PageFactory;

import base.Base;

public class PageContext {
	
	Base base;
	
	public PageContext(Base base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);		
	}

}
