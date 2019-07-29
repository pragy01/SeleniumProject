package com.nielsen.pageFactory;

import org.openqa.selenium.By;

import core.generic.WrapperFunctions;

public class NSO_LoginPage 
{
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	// input
		By inpNSOUsername = By.id("USER");
		By inpNSOPassword = By.id("PASSWORD");
		
	//buttons
		By btnLogin = By.id("btnLogin");
		

		public boolean setNSOUsername(String fieldValue)
		{
			
			return objWrapperFunctions.setText(inpNSOUsername, fieldValue);
		}
		

		public boolean setNSOPassword(String fieldValue)
		{
			return objWrapperFunctions.setText(inpNSOPassword, fieldValue);
		}
		
		public boolean clickLogin()
		{
			objWrapperFunctions.waitForElementToBeClickable(btnLogin, 90);
			return objWrapperFunctions.click(btnLogin);
		}
}
