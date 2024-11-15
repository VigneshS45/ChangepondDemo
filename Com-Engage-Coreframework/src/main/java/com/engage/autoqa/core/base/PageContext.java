package com.engage.autoqa.core.base;

import org.openqa.selenium.support.PageFactory;

public class PageContext extends TestContext {
	
	TestContext testcontext;
	
	public PageContext(TestContext testcontext) {
		this.testcontext=testcontext;
		PageFactory.initElements(testcontext.driver, this);
	}

}
