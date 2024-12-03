package com.niqsam.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	@FindBy(xpath="//input[@ value='New Campaign']")
	private WebElement newCmpgnBtn;
	@FindBy(xpath="//input[@ name='property(Campaign Name)']")
	private WebElement cmpgnNameTbx;
	@FindBy(xpath="(//input[@ value='Save' ])[1]")
	private WebElement saveBtn;
	
	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getNewCmpgnBtn() {
		return newCmpgnBtn;
	}

	public WebElement getCmpgnNameTbx() {
		return cmpgnNameTbx;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	
}
