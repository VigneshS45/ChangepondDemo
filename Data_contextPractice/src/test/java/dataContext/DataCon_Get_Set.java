package dataContext;

import java.util.Map;

public class DataCon_Get_Set {
	
	
	public static Map<String, String> credentials;
	
	public static Map<String, String> getCredentials() {
		return credentials;
	}

	public static void setCredentials(Map<String, String> credentials) {
		DataCon_Get_Set.credentials = credentials;
	}
}
