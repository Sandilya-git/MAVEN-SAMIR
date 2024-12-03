package com.niqsam.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.niqsam.generic.BaseClass;
import com.niqsam.pom.CreateCampaignPage;
import com.niqsam.pom.HomePage;
@Listeners(com.niqsam.generic.ListnerImplementation.class)
public class CampaignModule extends BaseClass {
	@Test
	public void createCampaign( ) {
		HomePage h=new HomePage(driver);
		h.setcampaign();
		CreateCampaignPage c=new CreateCampaignPage(driver);
		c.getNewCmpgnBtn().click();
		c.getCmpgnNameTbx().sendKeys("QSPIDERS LAUNCH");
		c.getSaveBtn().click();
  }
}