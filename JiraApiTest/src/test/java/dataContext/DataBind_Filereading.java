package dataContext;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

	public class DataBind_Filereading {
	
//		@Test
//		public static Object readjson() throws IOException, ParseException {
//	      
//	        JSONParser jsonParser = new JSONParser();
//	        FileReader fileReader = new FileReader("C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\JiraApiTest\\jira.json");
//	        Object parsedData = jsonParser.parse(fileReader);
//	        JSONObject jsonObject = (JSONObject) parsedData;
//
//	        
//	        fileReader.close();
//
//	        body(new String (Files.readAllBytes(Paths.get("C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\JiraApiTest\\jira.json"))))
//	        return jsonObject;
//		}

//		public static  void readJson()  {
//			 String filePath = "C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\JiraApiTest\\jira.json";
//		        
//		        try {
//		            
//		            Path path = Paths.get(filePath);
//		            String content = new String(Files.readAllBytes(path));
//		          System.out.println(content);
//		            
//		        } catch (IOException e) {
//		            
//		            System.err.println("An error occurred while reading the file: " + e.getMessage());
//		            e.printStackTrace();
//		        }
//		 
//		    
//		}
//		
//}
		
		public static  String readJson()  {
			 String filePath = "C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\JiraApiTest\\src\\test\\resources\\utils\\jira.json";
		        
		        try {
		        	  byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
		              return new String(jsonData, StandardCharsets.UTF_8);
		          } catch (IOException exp) {
		              return null;
		          }
		        }
		 
		    
		}
		

