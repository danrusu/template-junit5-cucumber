package firstProject.base;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/firstProject"},
        glue = {"firstProject.stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber"})
public class CucumberRunner {
}