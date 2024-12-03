package com.niqsam.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="//a[text()='Campaigns']")
	private WebElement campaignLink;
	@FindBy(xpath="(//a[@ class='topLink'])[6]")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void setcampaign() {
		campaignLink.click();
	}
	public void setLogout() {
		logoutLink.click();
	}
}

