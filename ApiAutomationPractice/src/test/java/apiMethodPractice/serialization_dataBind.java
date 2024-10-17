package apiMethodPractice;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class serialization_dataBind {
	
	
	Data_binding db=new Data_binding();
	
	@Test
	
	public void setEmployee() throws JsonProcessingException {
		db.setfName("Ragu");
		db.setlName("S");
		db.setEmail("ragu@gmail.com");
		db.setSkills(Arrays.asList("java","selenium"));
		
		ObjectMapper oB=new ObjectMapper();
		String json = oB.writerWithDefaultPrettyPrinter().writeValueAsString(db);
		System.out.println(json);

	}

}
