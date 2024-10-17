package apiActions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;

import base.Baseclass;
import dataContext.DataCon_Get_Set;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateIssueActions {
	
	Baseclass base;
	
	public CreateIssueActions(Baseclass base) {
		this.base=base;
	}
	
	//***************************************User will get the request from excel sheet using datakey************************************************* 
	
	public void getTestData(String key, String sheet, String path) {
		
		List<Map<String, String>> data = dataContext.DataContext.getData(key, sheet, path);
		Map<String, String> dataMap=data.get(0);
		DataCon_Get_Set.setCredentials(dataMap);
		
		}
	
	// ********************************************User will hit the endpoint with request body*******************************************************
	
	public void hitEndpoint() throws IOException, ParseException {
		    RestAssured.baseURI=base.getBaseuri().getProperty("baseuri");
	
		    Response response = RestAssured.given()
	                .header("Content-Type", DataCon_Get_Set.getCredentials().get("content-type"))
	                .header("Authorization", DataCon_Get_Set.getCredentials().get("Authorization"))
	                .body(dataContext.DataBind_Filereading.readJson())  
	                .post(DataCon_Get_Set.getCredentials().get("endPoint"));
		    
		              int status = response.getStatusCode();
		              String statuscode = String.valueOf(status);
		              DataCon_Get_Set.setStatuscode(statuscode);
		                                  
	}
	
	//********************************************************User will validate the status code*******************************************************
	
	public String validateStatusCode() {
		
		return DataCon_Get_Set.getStatuscode();
		
		

	}
}
