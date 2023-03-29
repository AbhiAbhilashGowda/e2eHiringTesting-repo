package com.automation.stepdef;

import java.util.Iterator;
import java.util.Set;
<<<<<<< HEAD
import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.JobsPage;
import com.automation.pages.UatloginPage;

=======

import com.automation.base.Base;
import com.automation.framework.Elements;

import com.automation.pages.JobsPage;

import com.automation.pages.UatloginPage;
>>>>>>> 68fb9eb6dfe0e53016909ab4e54b6ccebf4a57e6

import cucumber.api.java.en.*;

public class Jobs extends Base {

<<<<<<< HEAD
	UatloginPage scenA = new UatloginPage();
	JobsPage scenB=new JobsPage();
	
	 @Then("^I click on jobs$")
	 public void i_click_on_jobs() throws Throwable {
	 Thread.sleep(2000);
	 Elements.click(JobsPage.clickonjobs);
	 Thread.sleep(4000);

	 }

	 @Then("^I select first job$")
	 public void i_select_first_job() throws Throwable {

	 Thread.sleep(2000);
	 Elements.click(JobsPage.clickonfirstjob);
	 Set<String> handles = driver.getWindowHandles();
	 Iterator<String> it = handles.iterator();
	 while (it.hasNext()) {
	 String parent = it.next();
	 String newwin = it.next();
	 driver.switchTo().window(newwin);
	 Thread.sleep(5000);
	 }
	 }

	 @Then("^I click on copylink$")
	 public void i_select_share_on_mail() throws Throwable {
	 Thread.sleep(2000);
	 Elements.click(JobsPage.clickoncopylink);
	 Thread.sleep(4000);

	 }

	}

	

=======
	JobsPage scend = new JobsPage();
	UatloginPage scenA = new UatloginPage();

	@Then("^I click on jobs$")
	public void i_click_on_jobs() throws Throwable {
		Thread.sleep(2000);
		Elements.click(JobsPage.clickonjobs);
		Thread.sleep(4000);

	}

	@Then("^I select first job$")
	public void i_select_first_job() throws Throwable {

		Thread.sleep(2000);
		Elements.click(JobsPage.clickonfirstjob);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String parent = it.next();
			String newwin = it.next();
			driver.switchTo().window(newwin);
			Thread.sleep(5000);
		}
	}

	@Then("^I click on copylink$")
	public void i_select_share_on_mail() throws Throwable {
		Thread.sleep(2000);
		Elements.click(JobsPage.clickoncopylink);
		Thread.sleep(4000);

	}

}
>>>>>>> 68fb9eb6dfe0e53016909ab4e54b6ccebf4a57e6
