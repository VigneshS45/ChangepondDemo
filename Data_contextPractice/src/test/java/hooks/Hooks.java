package hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import base.Base;
import browserFac.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	Base base;

	public Hooks(Base base) {
		this.base=base;
	}
	
	public static ThreadLocal<String> tLocal= new ThreadLocal<String>();
	
	@Before
	public void before_sc() {
		Properties property = new Properties();
		try {
			property.load(new FileInputStream("./src/test/resources/dataCon.properties"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		base.setProperty(property);
	    BrowserFactory browseIns=new BrowserFactory();
	    WebDriver driver = browseIns.getBrowser(tLocal.get());
		base.setDriver(driver);
		base.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		base.getDriver().manage().window().maximize();
	} 

	@After
	public void after_sc(){
		base.getDriver().quit();
	}
}
