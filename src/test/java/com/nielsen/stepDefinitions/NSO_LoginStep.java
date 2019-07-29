package com.nielsen.stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.nielsen.pageFactory.AssetManagementPage;
import com.nielsen.pageFactory.NSO_LoginPage;

import core.generic.Utilities;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;



public class NSO_LoginStep 
{
	// Local variables
		//private NSO_LoginPage objNSO_LoginPage = new NSO_LoginPage();
	     private NSO_LoginPage objNSO_LoginPage= new NSO_LoginPage();
		
		//private Utilities objUtilities = new Utilities();
		private Utilities objUtilities= new Utilities();
		
		@Given("^Login to NSO application$")
		public void Login_To_NSO_Application()  
		{
			
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objNSO_LoginPage.setNSOUsername("vaishali.mahale.consultant@nielsen.com"));
			Assert.assertTrue(objNSO_LoginPage.setNSOPassword("Password@19"));
			Assert.assertTrue(objNSO_LoginPage.clickLogin());
		}
		
		
}
