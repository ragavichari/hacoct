package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\general\\git\\batch\\hackbatch\\src\\test\\resources\\features",
glue="stepDefinitions",
dryRun=false,
monochrome=true,
plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	             
}		)

public class testrun {

}
