package apiMethodPractice;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class OauthPractice {
	
	@Test
	public void postOauth() {
		String res1 = RestAssured.given()
		.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.formParam("grant_type", "client_credentials")
		.formParam("scope", "trust")
		.when().log().all()
		.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
		System.out.println(res1);
		JsonPath j=new JsonPath(res1);
		String token=j.getString("access_token");
	
//		@Test
//   public void getdetailsUseToken() {		
		String res2 = RestAssured.given()
		.header("Accept","application/json")
		.queryParams("access_token", token)
		.when()
        .get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").asString();
		System.out.println(res2);
		
//   }
	
	
	
	}
	

}
