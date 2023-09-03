package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;




@CucumberOptions(features= {"src/test/java/features"},glue="stepDefinition"
,monochrome=true,publish=true,
//tags="@Nadiya"
//tags="@Regression" 
//tags="@Smoke and @Funtional"
//tags="@Smoke or @Funtional"
tags="not @Regression" //scenario will be ignored from execution
)
public class RunnerClass extends BaseClass {

	//to execute the cucumber script
	//extend the runnerclass created under runner pkg with AbstractTestNGCucumberTests
	//use @CucumberOptions on top of the class-->map feature file and step def 
	//features=set the path of the featurefile to be executed
	//glue =set the stepdef
	//monochrome-->reomove the junk character in th console set as true
	//publish -->generate the report
	
	
	
}
