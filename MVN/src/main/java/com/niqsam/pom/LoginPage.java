package com.niqsam.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="userName")
	private WebElement untbx;
	@FindBy(id="passWord")
	private WebElement pwdtbx;
	@FindBy(xpath="//input[@ title='Sign In']")
	private WebElement signin;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void login(String un,String pwd) {
		untbx.sendKeys(un);
		pwdtbx.sendKeys(pwd);
		signin.click();
	}
}
