package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"org.example.stepdefinitions"},
        plugin = {"pretty","html:target/cucumber-report", "json:target/cucumber.json"},
        monochrome = true
        )



public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider
    public Object[] [] scenarios(){
        return super.scenarios();
    }
}
