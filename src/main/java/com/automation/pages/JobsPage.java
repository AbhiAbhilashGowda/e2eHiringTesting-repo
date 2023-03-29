package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class JobsPage {
<<<<<<< HEAD
	
public JobsPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
@FindBy(xpath = "(//img[@id='Jobs'])[1]")
public static WebElement clickonjobs;

@FindBy(xpath = "(//div[@class='result-job-card'])[1]")
public static WebElement clickonfirstjob;

@FindBy(xpath = "(//img[@loading='lazy'])[5]")
public static WebElement clickoncopylink;





=======

	public JobsPage() {

		PageFactory.initElements(Base.driver, this);

	}

	@FindBy(xpath = "(//img[@id='Jobs'])[1]")
	public static WebElement clickonjobs;

	@FindBy(xpath = "(//div[@class='result-job-card'])[1]")
	public static WebElement clickonfirstjob;

	@FindBy(xpath = "(//img[@loading='lazy'])[5]")
	public static WebElement clickoncopylink;
	
	
>>>>>>> 68fb9eb6dfe0e53016909ab4e54b6ccebf4a57e6
}
