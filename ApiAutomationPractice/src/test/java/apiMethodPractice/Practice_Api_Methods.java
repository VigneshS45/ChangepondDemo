package apiMethodPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Practice_Api_Methods extends DataProvider_practice {
	
	
	@Test(enabled = false)
	public void getallEmployee() {
		
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification request = RestAssured.given();
		Response response = request.request(Method.GET,"employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		
		
	}
	@Test(enabled = false)
	public void postOneEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification request = RestAssured.given().header("content-type","application/json").body(" {\r\n"
				+ "        \"fName\": \"Amirtharaj\",\r\n"
				+ "        \"lName\": \"S\",\r\n"
				+ "        \"email\": \"Amirtharaj@gmail.com\",\r\n"
				+ "        \"Skills\": [\r\n"
				+ "            \"Csharp\",\r\n"
				+ "            \"Rest Assured\"\r\n"
				+ "        ]\r\n"
				+ "    }");
		Response response = request.request(Method.POST,"employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		
	}
	
	@Test (dataProvider ="put")
	public void putOneEmployee(String load) {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification request = RestAssured.given().header("content-type","application/json").body(load);
//				.body(" {\r\n"
//				+ "        \"fName\": \"vicky\",\r\n"
//				+ "        \"lName\": \"S\",\r\n"
//				+ "        \"email\": \"vickysam404@gmail.com\",\r\n"
//				+ "        \"Skills\": [\r\n"
//				+ "            \"Selenium\",\r\n"
//				+ "            \"cucumber\"\r\n"
//				+ "        ]\r\n"
//				+ "    }");
		
		Response response = request.request(Method.PUT,"employees/b3e6");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		
	}
	@Test(enabled  =false)
	public void deleteEmployee() {
		RestAssured.baseURI="http://localhost:3000/employees/9";
		RequestSpecification request = RestAssured.given();
		Response response = request.request(Method.DELETE);
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());

	}

}
