package runner_pack;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features={"C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\Dufry_project\\src\\test\\resources\\feature\\create_order.feature"},
    glue={"step_definition","hooks_pack"},
    monochrome=false,
    dryRun=false,
    tags = "@search",  
    plugin = {"pretty",	"html:target/htmlreport.html", "json:target/cucumber-report/Cucumber.json"})

public class Test_runner1 extends AbstractTestNGCucumberTests{
	

}
