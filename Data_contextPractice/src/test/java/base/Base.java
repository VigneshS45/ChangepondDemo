package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {
	
	private WebDriver driver;
	private Properties property;

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
