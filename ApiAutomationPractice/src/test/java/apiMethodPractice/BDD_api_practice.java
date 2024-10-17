package apiMethodPractice;

import  io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BDD_api_practice {
	
	@Test
	public void posBdd() {
		RestAssured.baseURI="http://localhost:3000/";
		given().header("content-type","application/json")
		.body("{\r\n"
				+ "    \"id\": \"851d\",\r\n"
				+ "    \"fName\": \"Vignesh\",\r\n"
				+ "    \"lName\": \"S\",\r\n"
				+ "    \"email\": \"ragugokul976@gmail.com\",\r\n"
				+ "    \"Skills\": [\r\n"
				+ "      \"Selenium\",\r\n"
				+ "      \"Rest Assured\"\r\n"
				+ "    ]\r\n"
				+ "  }").when().put("Employees/851d");
		

	}

}
