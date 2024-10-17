package hookspack;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base_pack.Base_classs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooksc {

	Base_classs base;

	public Hooksc(Base_classs base) {
		this.base = base;
	}

	@Before
	public void before_scenario() {

		WebDriver driver = new ChromeDriver();
		base.setDriver(driver);
		base.getDriver().manage().window().maximize();
		

	}

	@After
	public void after_scenario(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] ts = ((TakesScreenshot)base.getDriver()).getScreenshotAs(OutputType.BYTES);
//			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(ts, "fail/png", "Failed Scenario");
			
			
		}
		
//		base.getDriver().quit();
	}
}
