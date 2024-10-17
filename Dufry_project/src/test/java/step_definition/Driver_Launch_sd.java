package step_definition;

import org.picocontainer.annotations.Inject;

import io.cucumber.java.en.Given;
import page_actions.Driver_launch_pa;

public class Driver_Launch_sd {
	
	
	@Inject Driver_launch_pa launch;
	
	//*********************************************************** Launching the URL ***********************************************************************
	
	@Given("User launch the Dufry application")
	public void user_launch_the_dufry_application() {
	   launch.launchDriver();
	}
	


}
