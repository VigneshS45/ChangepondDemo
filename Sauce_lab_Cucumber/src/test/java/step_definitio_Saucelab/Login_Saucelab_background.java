package step_definitio_Saucelab;

import Page_actions_SuuceLab.Login_App_Saucelab;
import base_pack.Base_classs;
import cucumber.api.java.en.Given;

public class Login_Saucelab_background extends Base_classs  {


    
	Login_App_Saucelab lp=new Login_App_Saucelab(driver);


	@Given("user should enters the Username {string} and Password {string}")
	public void user_should_enters_the_Username_and_Password(String user, String pass) {

		lp.Set_Username_password(user, pass);

	}


	@Given("user click on the Login button")
	public void user_click_on_the_Login_button() {
		lp.click_login();

	}



}
