package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class MentorshipPage {
	
public MentorshipPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Email ID']")
	public static WebElement enteremail;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement enterpassword;
	
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-submit ant-btn-block styledComponents__StyledButton-sc-4947a9-0 gDuwDr']")
	public static WebElement clicklogin;
	@FindBy(xpath = "(//div[@class='navbar-wrapper-title'])[4]")
	public static WebElement clickonmentorship ;
	@FindBy(xpath = "//div[@id='rc-tabs-0-tab-1']")
	public static WebElement clickonoverview ;
	@FindBy(xpath = "//button[normalize-space()='Register for Orientation']")
	public static WebElement clickonorientation ;
	@FindBy(xpath = "(//input[@placeholder='Enter your name'])[1]")
	public static WebElement entername ;
	@FindBy(xpath = "//input[@placeholder='Enter your mail id']")
	public static WebElement enteremailinmentorshipgorm ;
	@FindBy(xpath = "//input[@placeholder='Enter your answer']")
	public static WebElement enterphonenumber ;
	@FindBy(xpath = "//input[@id='rc_select_0']")
	public static WebElement selectmentorshipprogram ;
	@FindBy(xpath = "//div[contains(text(),'Java Developer')]")
	public static WebElement selectjavadevelper;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default next-button']")
	public static WebElement clcikonsubmit ;
}

