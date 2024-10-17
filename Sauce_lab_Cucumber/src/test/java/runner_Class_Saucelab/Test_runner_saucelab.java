package runner_Class_Saucelab;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( features = "C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\Sauce_lab_Cucumber\\src\\test\\resources\\featurefile_Saucelab\\Saucelab.feature",
glue = {"step_definitio_Saucelab","hookspack"}, monochrome = true, dryRun = false, strict = true, snippets = SnippetType.CAMELCASE)

public class Test_runner_saucelab {

}
