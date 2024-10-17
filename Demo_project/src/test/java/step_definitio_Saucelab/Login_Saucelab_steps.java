package step_definitio_Saucelab;
import org.picocontainer.annotations.Inject;

import Page_actions_SauceLab.Login_App_page_action;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_Saucelab_steps {


	@Inject 
	Login_App_page_action login;

	//  ****************************************** Launching the website**********************************************************

	@Given("User launch the website Swag Labs {string}")
	public void user_launch_the_website_swag_labs(String URL) {
		login.lauch_website(URL);
	}
	

	//  ****************************************** Set_Username_password**********************************************************

	@Given("User enters the Username {string} and Password {string}")
	public void user_enters_the_username_and_password(String username, String password) {

		login.set_Username_password(username, password);

	}	

	//  ****************************************** click_login********************************************************************

	@Then("User click on the Login button")
	public void user_click_on_the_login_button() {
		login.click_login();


	}



}
