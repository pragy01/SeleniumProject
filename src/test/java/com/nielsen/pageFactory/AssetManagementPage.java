package com.nielsen.pageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;

import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class AssetManagementPage 
{
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	
	//2016/11/16 12:08:43
	
	// input
		By textMarketName = By.xpath("//span[contains(text(), 'Market Name:')]/ancestor::label/following-sibling::div//input");
	
	//checkbox
		
		
	//menu items
		By menuManagementTab = By.xpath("//span[contains(text(), 'Management')]");
		By menuMarket = By.xpath("//div[@class='x-menu x-layer x-menu-default x-border-box'][1]//span[contains(text(), 'Market')]");
		
	//Buttons
		By buttonPlus = By.xpath("//img[@class='x-tool-img x-tool-plus']");
		By buttonFetch = By.xpath("//*[contains(text(), 'Fetch')]");
		By buttonSave = By.xpath("//span[contains(text(), 'Save')]");
		By buttonRightArrow = By.xpath("//span[@style='background-image:url(resources/images/core/hierarchypicker/select.gif);']");
		
	//Drop-downs
		By dropLOB = By.xpath("//span[contains(text(), 'Lob ')]/ancestor::label/following-sibling::div/div[1]/div[2]");
		By dropStatus = By.xpath("//span[contains(text(), 'Status:')]/ancestor::label/following-sibling::div/div[1]/div[2]");
		By dropLevel = By.xpath("//span[contains(text(), 'Level:')]/ancestor::label/following-sibling::div/div[1]/div[2]");
	//text
		By txtMarketAdded = By.xpath("//div[contains(text(), 'Market Added Successfully.')]");
//		public boolean mouseHoverOrderManagement()
//		{
//			objWrapperFunctions.switchToWindowUsingTitle("OneBuyBO");
//			objWrapperFunctions.waitForElementToBeClickable(menuOrderManagement, 15);
//			return objWrapperFunctions.mouseHover(menuOrderManagement);
//		}
		
		public boolean clickManagementTab()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objUtilities.waitForPageLoad();
			objWrapperFunctions.switchToWindowUsingTitle("Nielsen Operations - STAR");
			objUtilities.waitForPageLoad();
			objWrapperFunctions.handleAlert();
			objWrapperFunctions.switchToWindowUsingTitle("Nielsen Operations - STAR");
			return objWrapperFunctions.click(menuManagementTab);
		}
		
		public boolean clickMarket()
		{
			
			objWrapperFunctions.waitForElementToBeClickable(menuMarket, 90);
			return objWrapperFunctions.click(menuMarket);
		}
		
		public boolean clickPlusButton()
		{
			objUtilities.waitForPageLoad();
			try
			{
				objWrapperFunctions.switchToWindowUsingTitle("Nielsen Operations - STAR");
				objWrapperFunctions.waitForElementToBeClickable(buttonPlus, 30);
				return objWrapperFunctions.click(buttonPlus);
			}
			catch(Exception exception)
			{
				By btnOK= By.xpath("//span[contains(text(), 'OK')][@data-ref='btnInnerEl']");
				objWrapperFunctions.waitForElementToBeClickable(btnOK, 90);
				objWrapperFunctions.click(btnOK);
				objWrapperFunctions.waitForElementToBeClickable(buttonPlus, 30);
				return objWrapperFunctions.click(buttonPlus);
			}
		}
		
		public boolean clickDropLOB(String LOB)
		{
			objWrapperFunctions.waitForElementToBeClickable(dropLOB, 30);
			objWrapperFunctions.click(dropLOB);
			By option = By.xpath("//*[@class='x-boundlist-list-ct x-unselectable']//li[contains(text(), '"+LOB+"')]");
			objWrapperFunctions.waitForElementToBeClickable(dropLOB, 30);
			return objWrapperFunctions.click(option);
		}
		
		public boolean setMarketName()
		{
			String marketName = "TestMarket"+System.currentTimeMillis();
			objWrapperFunctions.waitForElementPresence(textMarketName, 30);
			return objWrapperFunctions.setText(textMarketName, marketName);
		}
		
		public boolean clickDropStatus(String Status)
		{
			objWrapperFunctions.waitForElementToBeClickable(dropStatus, 30);
			objWrapperFunctions.click(dropStatus);
			By option = By.xpath("//*[@class='x-boundlist-list-ct x-unselectable']//li[contains(text(), '"+Status+"')]");
			return objWrapperFunctions.click(option);
		}
		
		public boolean clickDropLevel(String Level)
		{
			objWrapperFunctions.waitForElementToBeClickable(dropLevel, 30);
			objWrapperFunctions.click(dropLevel);
			By option = By.xpath("//*[@class='x-boundlist-list-ct x-unselectable']//li[contains(text(), '"+Level+"')]");
			return objWrapperFunctions.click(option);
		}
		
		public boolean clickbtnFetch()
		{
			objWrapperFunctions.waitForElementToBeClickable(buttonFetch, 30);
			return objWrapperFunctions.click(buttonFetch);
		}
		
		public boolean selectGeographyData(String country)
		{
			By chkGeogrphyData = By.xpath("//div[contains(text(), '"+country+"')]/ancestor::tr//div[@role='presentation']");
			return objWrapperFunctions.click(chkGeogrphyData);
		}
		
		public boolean clickbtnRightarrow()
		{
			objWrapperFunctions.waitForElementToBeClickable(buttonRightArrow, 30);
			return objWrapperFunctions.click(buttonRightArrow);
		}
		
		public boolean clickbtnSave()
		{
			objWrapperFunctions.waitForElementToBeClickable(buttonSave, 30);
			return objWrapperFunctions.click(buttonSave);
		}
		
		public boolean verifyMarketAdded()
		{
			objWrapperFunctions.waitForElementPresence(txtMarketAdded, 30);
			return objWrapperFunctions.checkElementExistence(txtMarketAdded, 30);
		}
		
	}
