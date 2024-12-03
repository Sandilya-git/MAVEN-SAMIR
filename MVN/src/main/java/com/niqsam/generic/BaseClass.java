package com.niqsam.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.niqsam.pom.HomePage;
import com.niqsam.pom.LoginPage;
public class BaseClass {
	public static WebDriver driver;
	public FileUtils f=new FileUtils();
	@BeforeTest
	public void openBrowser() throws IOException {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.getPropertyData("url");
		driver.get(url);
	}

	@BeforeMethod
	public void login() throws IOException {
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		LoginPage l=new LoginPage(driver);
		l.login(un,pwd);

	}
	@AfterMethod
	public void logout() throws InterruptedException {
		HomePage h=new HomePage(driver);
		Thread.sleep(2000);
		h.setLogout();
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
