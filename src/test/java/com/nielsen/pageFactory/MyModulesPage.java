package com.nielsen.pageFactory;

import org.openqa.selenium.By;

import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class MyModulesPage 
{
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	
	// input
		
	//link
		By lnkmore = By.xpath("//div[@class='moreAllModulestext']");
		
	//buttons
		By btnOneBuyBackOffice = By.xpath("//div[contains(text(), 'OneBuyBO')]");
		By btnAssetManagement = By.xpath("//*[contains(text(), 'Asset Management')]");
				
		public boolean clickOneBuyBackOffice()
		{
			return objWrapperFunctions.click(btnOneBuyBackOffice);
			
		}
		
		public boolean clickAssetManagement()
		{	
			objUtilities.waitForPageLoad();
			objWrapperFunctions.waitForElementToBeClickable(btnAssetManagement, 90);
			return objWrapperFunctions.click(btnAssetManagement);
		}
		
		public boolean clickMore()
		{
			objWrapperFunctions.waitForElementToBeClickable(lnkmore, 300);
			return objWrapperFunctions.click(lnkmore);
		}
}
