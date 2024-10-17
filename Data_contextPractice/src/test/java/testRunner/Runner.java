package testRunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import hooks.Hooks;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\Data_contextPractice\\src\\test\\resources\\feature\\dataContext.feature"},
    glue={"stepDefinition","hooks"},
    monochrome=false,
    dryRun=false,  
    plugin = {"pretty",	"html:target/htmlreport.html", "json:target/cucumber-report/Cucumber.json","junit:taget/junit-report/report.xml"})
public class Runner extends AbstractTestNGCucumberTests {
	
	@Parameters("browser")
	@BeforeTest
	public void setBrowser(String browser) {
		Hooks.tLocal.set(browser);
	}
}
