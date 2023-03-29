package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Uatlogin.feature",
							"classpath:FeatureFiles/Jobs.feature"
						  },
glue={"classpath:com.automation.stepdef"},
plugin={"html:target/cucumber_html_report"},
tags= {"@Jobss","@one"})

public class Runner {
	
}