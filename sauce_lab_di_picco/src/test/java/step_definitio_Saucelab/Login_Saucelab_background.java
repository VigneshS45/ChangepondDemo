package step_definitio_Saucelab;
import base_pack.Base_classs;
import cucumber.api.java.en.Given;



public class Login_Saucelab_background  {
	

Base_classs base;

public Login_Saucelab_background(Base_classs base) {
	this.base=base;
}

   


	@Given("user should enters the Username {string} and Password {string}")
	public void user_should_enters_the_Username_and_Password(String user, String pass) {
		
		base.getLogin().Set_Username_password(user, pass);
//          driver.getDriver().findElement(By.id("user-name")).sendKeys(user);
//          driver.getDriver().findElement(By.id("password")).sendKeys(pass);
//         context.getLogin_page().Set_Username_password(user, pass);

	}



	@Given("user click on the Login button")
	public void user_click_on_the_Login_button() {
		base.getLogin().click_login();
//		driver.getDriver().findElement(By.id("login-button")).click();
//        context.getLogin_page().click_login();
	}



}
