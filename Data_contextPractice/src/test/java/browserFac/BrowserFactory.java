package browserFac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

	WebDriver driver;

	public  WebDriver getBrowser(String browser) {

		switch (browser.toLowerCase()) {

		case "chrome": driver=new ChromeDriver();

		break;

		case "edge":driver=new EdgeDriver();

		break;
		
		default: System.out.println("NA");
		}
		return driver;
	}
}