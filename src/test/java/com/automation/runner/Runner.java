package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features={"classpath:FeatureFiles/UAT.feature"	},
glue={"classpath:com.automation.stepdef"},
plugin={"html:target/cucumber/report.html"})
=======
@CucumberOptions(features={"classpath:FeatureFiles/Uatlogin.feature",
		                   //"classpath:FeatureFiles/Mentorship.feature",
	                     	//"classpath:FeatureFiles/CampusHiring.feature",
		                    "classpath:FeatureFiles/Jobs.feature"
						  },
glue={"classpath:com.automation.stepdef"},
plugin={"html:target/cucumber_html_report"},
tags= {"@Jobss","@one"})
>>>>>>> 9fdc063d5db8bec6429e82c45799556274a00cb9

public class Runner {
	
}