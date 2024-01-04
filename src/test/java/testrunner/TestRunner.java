package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/resources/accc.feature"}, //the path of the feature files
			glue={"stepdef"},
			
			 plugin = { "pretty",
				     "html:target/cucumber-reports/cucumber-pretty", 
				     "json:target/cucumber-reports/CucumberTestReport.json"
		/* "rerun:target/cucumber-reports/rerun.txt" */ }
						//the path of the step definition files
		
			)
	 
	public class TestRunner {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	

