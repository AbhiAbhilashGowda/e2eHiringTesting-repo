package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Uatlogin.feature",
							//"classpath:FeatureFiles/ScenarioB.feature"
						  },
glue={"classpath:com.automation.stepdef"},
plugin={"html:target/cucumber/report.html"})

public class Runner {
	
}