package Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features={"src/test/resources/Feature"},
glue={"Cucumberstep"},plugin={"pretty","html: target/cucumber.html"})

public class runner extends AbstractTestNGCucumberTests 
{																																																																																																																																											

}
