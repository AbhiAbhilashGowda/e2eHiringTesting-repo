package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class CampusHiringPage {
	
public CampusHiringPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "(//img[@alt='dropdown'])[1]")
	public static WebElement clickonmore ;
	
	@FindBy(xpath = "(//div[@class='more-menu-card'])[9]")
	public static WebElement clickoncampus ;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	public static WebElement clickonregister;
	@FindBy(xpath = "//input[@placeholder='First name']")
	public static WebElement enterFirstname ;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public static WebElement enterLastname ;
	@FindBy(xpath = "//input[@placeholder='Email ID']")
	public static WebElement enteremailidinregister ;
	@FindBy(xpath = "(//input[@placeholder='Password'])[1]")
	public static WebElement enterpasswordinregister ;
	@FindBy(xpath = "//button[@type='button']")
	public static WebElement clickregisterbutton ;
	@FindBy(xpath = "")
	public static WebElement enterphonenumber ;
	@FindBy(xpath = "")
	public static WebElement selectmentorshipprogram ;
	@FindBy(xpath = "")
	public static WebElement selectjavadevelper;
	@FindBy(xpath = "")
	public static WebElement clcikonsubmit ;
}

