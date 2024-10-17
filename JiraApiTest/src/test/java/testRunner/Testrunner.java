package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features={"C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\JiraApiTest\\src\\test\\resources\\feature\\jira.feature"},
glue={"steps","hooks"},
monochrome=false,
dryRun=false,  
plugin = {"pretty",	"html:target/htmlreport.html"})

public class Testrunner {
	


}
