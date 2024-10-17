package Page_actions_SauceLab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_pack.Base_classs;

public class Login_App_page_action  {

	@FindBy(id="user-name")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(id="login-button")
	WebElement login;

	Base_classs base;

	//  ****************************************** Initializing the Web elements ************************************************

	public Login_App_page_action(Base_classs base) {
		this.base=base;
		PageFactory.initElements(base.getDriver(), this);
	}


	//  ****************************************** Launching the website ************************************************

	public void lauch_website(String URL) {
		base.getDriver().get(URL);

	}


	//  ****************************************** Set_Username_password**********************************************************

	public void set_Username_password(String user ,String Pass) {
		username.sendKeys(user);
		password.sendKeys(Pass);
	}

	//  ****************************************** click_login********************************************************************

	public void click_login() {
		login.click();
	}


}
