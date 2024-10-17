package apiMethodPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;                                                                                       

public class Oauth20 {
	
	public void practiceOauth20() {
		 
   
		
		String accessToken = RestAssured.given()
		.queryParam("code","")
		.queryParam("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParam("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("grant_type","authorization_code")
		.queryParam("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
		.when()
		.post("https://www.googleapis.com/oauth2/v4/token").asString();
		  JsonPath js = new JsonPath(accessToken);
		  String token = js.getString("access_token");
		
		
		
		String response = RestAssured.given()
		.queryParam("access_token", token)
		.when()
		.get("https://rahulshettyacademy.com/getCourse.php").asString();
	
		
		

	}

}
