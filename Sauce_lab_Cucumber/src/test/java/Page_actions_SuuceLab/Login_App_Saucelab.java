package Page_actions_SuuceLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_App_Saucelab  {

	@FindBy(id="user-name")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(id="login-button")
	WebElement login;


	static WebDriver driver;


	public Login_App_Saucelab(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}

	//  ****************************************** Set_Username_password****************************************************

	public void Set_Username_password(String user ,String Pass) {
		username.sendKeys(user);
		password.sendKeys(Pass);
	}

	//  ****************************************** click_login****************************************************

	public void click_login() {
		login.click();
	}


}
