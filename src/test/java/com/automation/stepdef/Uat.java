package com.automation.stepdef;



import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.UatPage;

import io.cucumber.java.en.*;

public class Uat extends Base{

	UatPage scenA = new UatPage();

	@Given("^User is in login page$")
	public void user_login_to_the_application() {
		String title=Elements.getCurrentUrl();
		System.out.println(title);
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String string) {
	    Elements.TypeText(UatPage.enterusername, string);
	}
	
	@When("user enters password {string}")
	public void user_enters_password(String string) {
	   Elements.TypeText(UatPage.enterpassword, string);
	}
	
	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	   Elements.click(UatPage.clickOnLoginButton);
	}
}
