package apiMethodPractice;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JiraCtreateIssuePractice {
	
	@Test
	
	public void createIssue() {
		
		 RestAssured.baseURI="https://vickysam404.atlassian.net/";
		
		 String createIssue = RestAssured.given()
		.header("content-type","application/json")
		.header("Authorization","Basic  dmlja3lzYW00MDRAZ21haWwuY29tOkFUQVRUM3hGZkdGMEhJd3BfMDM5UEc0bFAxM0lIVFlEemYweXZpQUpxRUJRX1J6WnhTREFGS1NBVElERnd6TXRhVlQ4d2FsejBsWUp0X0laXzhhNkFhcm1WbmFKaUVFYlEwV2JSV2gyc3JJbjAtdGFFSkZ3UzRfbHJZMzhwUDhGOWxPbGljWU4wdm9EV1JxUzVtaE95QUExekpERUdyd09BTThCWlNFY3VxSFcxQ3FZVGtHNVhkRT05MkVGMzg2MA==")
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "       \"project\":\r\n"
				+ "       {\r\n"
				+ "          \"key\": \"SCRUM\"\r\n"
				+ "       },\r\n"
				+ "       \"summary\": \"Unable to click on the login button.\",\r\n"
				+ "       \"issuetype\": {\r\n"
				+ "          \"name\": \"Bug\"\r\n"
				+ "       }\r\n"
				+ "   }\r\n"
				+ "}").log().all().post("rest/api/2/issue").then().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath j=new JsonPath(createIssue);
		String t=j.getString("id");
		System.out.println(t);
		
		File ss=new File("C:\\Vignesh CPT\\Documents\\EOD Status document\\EOD image\\1.2.2024.png");
		RestAssured.given().pathParam("path", t)
		.header("X-Atlassian-Token","no-check")
		.header("Authorization","Basic  dmlja3lzYW00MDRAZ21haWwuY29tOkFUQVRUM3hGZkdGMEhJd3BfMDM5UEc0bFAxM0lIVFlEemYweXZpQUpxRUJRX1J6WnhTREFGS1NBVElERnd6TXRhVlQ4d2FsejBsWUp0X0laXzhhNkFhcm1WbmFKaUVFYlEwV2JSV2gyc3JJbjAtdGFFSkZ3UzRfbHJZMzhwUDhGOWxPbGljWU4wdm9EV1JxUzVtaE95QUExekpERUdyd09BTThCWlNFY3VxSFcxQ3FZVGtHNVhkRT05MkVGMzg2MA==")
		.multiPart("file",ss).log().all()
		.post("rest/api/2/issue/{path}/attachments").then().assertThat().statusCode(200);
	}
	
	
	@Test
public void getallEmployee() {
		
		RestAssured.baseURI="https://vickysam404.atlassian.net/";
		RequestSpecification request = RestAssured.given()
				.header("Accept","application/json")
			    .header("Authorization","Basic  dmlja3lzYW00MDRAZ21haWwuY29tOkFUQVRUM3hGZkdGMEhJd3BfMDM5UEc0bFAxM0lIVFlEemYweXZpQUpxRUJRX1J6WnhTREFGS1NBVElERnd6TXRhVlQ4d2FsejBsWUp0X0laXzhhNkFhcm1WbmFKaUVFYlEwV2JSV2gyc3JJbjAtdGFFSkZ3UzRfbHJZMzhwUDhGOWxPbGljWU4wdm9EV1JxUzVtaE95QUExekpERUdyd09BTThCWlNFY3VxSFcxQ3FZVGtHNVhkRT05MkVGMzg2MA==");
		Response response = request.request(Method.GET,"api/2/issue/id=10007");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		
		
	}

}
