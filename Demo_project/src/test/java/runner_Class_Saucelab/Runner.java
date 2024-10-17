package runner_Class_Saucelab;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( features={"C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\Demo_project\\src\\test\\resources\\feature\\Saucelab.feature"},
                  glue={"step_definitio_Saucelab","hookspack"},monochrome=false,dryRun=false, plugin = {"pretty","html:target/htmlreport.html", 
				  "json:target/cucumber-report/Cucumber.json"})
public class Runner{

}