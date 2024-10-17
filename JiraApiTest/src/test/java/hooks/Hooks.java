package hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import base.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	Baseclass base;
	
	public Hooks(Baseclass base) {
		this.base=base;
	}
	
	@Before
	public void before_sc() {
		
	// reading the property for base uri
		
	Properties property = new Properties();
	try {
		property.load(new FileInputStream("C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\JiraApiTest\\src\\test\\resources\\utils\\jira.properties"));
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	
	base.setBaseuri(property);
	
 
	}
	
	@After
	public void after_sc() {
		

	}
}
