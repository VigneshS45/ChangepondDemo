package apiMethodPractice;

import org.testng.annotations.DataProvider;

public class DataProvider_practice {
	
	
	@DataProvider(name = "put")
	
	public Object[] steData() {
		return new Object[]   {" \r\n"
				+ "        \"fName\": \"Amirtharaj\",\r\n"
				+ "        \"lName\": \"S\",\r\n"
				+ "        \"email\": \"amir@gmail.com\",\r\n"
				+ "        \"Skills\": [\r\n"
				+ "            \"Csharp\",\r\n"
				+ "            \"Rest Assured\"\r\n"
				+ "    }"
	 };
  }
}
