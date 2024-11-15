package com.engage.autoqa.core.base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserManager  {
	
	TestContext testcontext;
	public BrowserManager(TestContext testcontext) {
		this.testcontext=testcontext;	
	}
	
	public void launchBrowser(String browsername) {
		switch (browsername) {
		
		case "chrome":
			testcontext.driver = new ChromeDriver();
			break;

		case "edge":
			testcontext.driver = new EdgeDriver();
			break;

		}
	}
}
