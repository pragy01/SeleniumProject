package com.testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun = false,
		strict = true,
		features = {"src/test/java/com/nielsen/features"},
		glue = {"core.Hooks", "com.nielsen.stepDefinitions"},
		tags = {"@NSO_1BBO"},
		monochrome = true,
		format = {
				"pretty",
				"html:src/test/java/testresult/cucumber-report",
				"junit:src/test/java/testresult/cucumber-report/cucumber.xml",
				"json:src/test/java/testresult/cucumber-report/cucumber.json"
		}
		)
/**
 * @ScriptName    : TestRunner
 * @Description   : This class contains   
 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:                      
 */
public class RunnerTest
{ 	
	
}