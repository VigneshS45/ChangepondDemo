package runner_Class_Saucelab;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\sauce_lab_di_picco\\src\\test\\resources\\feature\\Saucelab.feature",
glue = {"step_definitio_Saucelab","hookspack"}, monochrome = true, dryRun = false, strict = true)

public class Test_runner_saucelab {

}
