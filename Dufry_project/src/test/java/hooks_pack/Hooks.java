package hooks_pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base_pack.Base;
import dc.Brows_factory;
import dc.DataContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	Base base;

	public Hooks(Base base) {
		this.base=base;

	}
	
	@Before
	public void before_sc() {
        
//		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(base.getDriver(), Duration.ofSeconds(20));
		Brows_factory browseIns=new Brows_factory();
	    WebDriver driver = browseIns.getBrowser(DataContext.tLocal.get());
	    
		base.setDriver(driver);
		base.setWait(wait);
		base.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		base.getDriver().manage().window().maximize();
				
		Properties property = new Properties();
		try {
			property.load(new FileInputStream("./src/test/resources/dufry.properties"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		base.setProperty(property);
		base.getProperty().getProperty("Url");
	} 

	@After
	public void after_sc(){
		base.getDriver().quit();
	}

}

