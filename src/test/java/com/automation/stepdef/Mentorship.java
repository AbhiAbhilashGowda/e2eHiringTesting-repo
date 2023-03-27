package com.automation.stepdef;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.MentorshipPage;
import com.automation.pages.UatloginPage;

import cucumber.api.java.en.*;

public class Mentorship extends Base {

	MentorshipPage scenb = new MentorshipPage();
	UatloginPage scenA = new UatloginPage();

	@Then("^I click on mentorship$")
	public void i_click_on_mentorship() throws Throwable {
		Thread.sleep(1500);
		Elements.click(MentorshipPage.clickonmentorship);
		Thread.sleep(4000);

	}

	@Then("^I click on overview$")
	public void i_click_on_overview() throws Throwable {
		Elements.click(MentorshipPage.clickonoverview);
		Thread.sleep(5000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", " ");
		Thread.sleep(2000);

	}

	@Then("^I click on register for orientation$")
	public void i_click_on_register_for_orientation() throws Throwable {
		Thread.sleep(3000);
		Elements.click(MentorshipPage.clickonorientation);
		Thread.sleep(2000);
	}
 
	@Then("^I enter name \"([^\"]*)\"$")
	public void i_enter_name(String name) throws Throwable {
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		//iterate through your windows
		while (it.hasNext()){
		String parent = it.next();
		String newwin = it.next();
		driver.switchTo().window(newwin);
		Thread.sleep(2000);
		Elements.TypeText(MentorshipPage.entername, name);
		}

	}

	@Then("^I enter mailid in mentorship form \"([^\"]*)\"$")
	public void i_enter_mailid_in_mentorship_form(String mail) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(MentorshipPage.enteremailinmentorshipgorm, mail);
		Thread.sleep(2000);

	}

	@Then("^I enter phonenumber \"([^\"]*)\"$")
	public void i_enter_phonenumber(String number) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(MentorshipPage.enterphonenumber, number);
		Thread.sleep(2000);

	}

	@Then("^I select java developer in mentorship program$")
	public void i_select_java_developer_in_mentorship_program() throws Throwable {
		Thread.sleep(2000);
		Elements.click(MentorshipPage.selectmentorshipprogram);
		Thread.sleep(2000);
		Elements.click(MentorshipPage.selectjavadevelper);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", " ");
		Thread.sleep(2000);


	}

	@Then("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		Elements.click(MentorshipPage.clcikonsubmit);
	}

}
