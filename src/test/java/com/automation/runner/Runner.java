package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Uatlogin.feature",
<<<<<<< HEAD
							"classpath:FeatureFiles/Jobs.feature"
						  },
glue={"classpath:com.automation.stepdef"},
plugin={"html:target/cucumber_html_report"})
//tags= {"@Jobss","@one"})
=======
		                   //"classpath:FeatureFiles/Mentorship.feature",
	                     	//"classpath:FeatureFiles/CampusHiring.feature",
		                    "classpath:FeatureFiles/Jobs.feature"
						  },
glue={"classpath:com.automation.stepdef"},
plugin={"html:target/cucumber_html_report"},
tags= {"@Jobss","@one"})
>>>>>>> 68fb9eb6dfe0e53016909ab4e54b6ccebf4a57e6

public class Runner {
	
}