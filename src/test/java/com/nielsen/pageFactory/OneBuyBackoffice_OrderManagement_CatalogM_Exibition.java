package com.nielsen.pageFactory;

import org.openqa.selenium.By;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;

import core.generic.WrapperFunctions;

public class OneBuyBackoffice_OrderManagement_CatalogM_Exibition 
{
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	// input
	
	By textExhibitionName = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Exhibition Name')]//ancestor::label/following-sibling::div[1]//input");
	By textShortName = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Short Name')]//ancestor::label/following-sibling::div[1]//input");
	By textSearchExhibitionName = By.xpath("//div[@class='x-panel x-fit-item x-panel-default']//span[contains(text(),'Exhibition Name')]/ancestor::div[1]//input");
	
	//link
		
	//menu items
		By menuViewer = By.xpath("//span[@class='x-btn-icon-el x-btn-icon-el-default-toolbar-small x-fa fa-navicon ']");
		By menuOrderManagement = By.xpath("//*[contains(text(), 'Order Management')]");
		By menuCatalogManagement = By.xpath("//*[contains(text(), 'Order Management')]/ancestor::div[@class='x-treelist-row']/following-sibling::ul//*[contains(text(), 'Catalog Maintenance')]");
		By menuExhibition = By.xpath("//span[contains(text(),'Exhibition')]");
		
	//labels
		By lblSearchResult = By.xpath("//*[@id='catalogmaintenance-searchresultgrid-1045_header-title-textEl']");
		
	//buttons
		By btnCreate = By.xpath("//span[contains(text(), 'CREATE')][@class='x-btn-inner x-btn-inner-Action_Imp-small']");
		By btnCreate_onPopup= By.xpath("//table[@class='x-table-layout']//ancestor::div[3]//span[contains(text(), 'CREATE')]");
		By btnSearch = By.xpath("//*[contains(text(), 'RESET')]/ancestor::a/preceding-sibling::a[2]//span[@class='x-btn-inner x-btn-inner-default-small']");
		By btnModify = By.xpath("//span[contains(text(),'MODIFY')]");
		By btnUpdate = By.xpath("//span[contains(text(),'UPDATE')]");
		
	//Drop downs
		By drpRegion = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Region')]/ancestor::label/following-sibling::div[1]/div/div[2]");
		By drpCountry = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Country')]/ancestor::label/following-sibling::div[1]/div/div[2]");
		By drpLanguage = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Language')]//ancestor::label/following-sibling::div/div[1]/div[2]");		
		By drpRegionSearch = By.xpath("//div[@class='x-panel x-fit-item x-panel-default']//span[contains(text(),'Region')]//ancestor::div[1]/div[1]/div[1]/div[2]");
		By drpCountrySearch = By.xpath("//div[@class='x-panel x-fit-item x-panel-default']//span[contains(text(),'Country')]//ancestor::div[1]/div[1]/div[1]/div[2]");
		
		
//		public boolean mouseHoverOrderManagement()
//		{
//			objWrapperFunctions.switchToWindowUsingTitle("OneBuyBO");
//			objWrapperFunctions.waitForElementToBeClickable(menuOrderManagement, 15);
//			return objWrapperFunctions.mouseHover(menuOrderManagement);
//		}
		
		public boolean clickMenuViewer()
		{
			objWrapperFunctions.switchToWindowUsingTitle("OneBuyBO");
			objWrapperFunctions.waitForElementToBeClickable(menuViewer, 180);
			return objWrapperFunctions.click(menuViewer);
		}
		
		public boolean clickOrderManagement()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return objWrapperFunctions.click(menuOrderManagement);
		}
		
		public boolean clickSearchResult()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return objWrapperFunctions.click(lblSearchResult);
		}
		
		public boolean clickCatalogManagement()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return objWrapperFunctions.click(menuCatalogManagement);
		}
		
		public boolean clickExhibition()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objWrapperFunctions.switchToWindowUsingTitle("OneBuyBO");
			objWrapperFunctions.waitForElementToBeClickable(menuExhibition, 180);
			return objWrapperFunctions.click(menuExhibition);
		}
		
//		public boolean clickLocationSikuli()
//		{
//			Screen screen = new Screen();
//			Pattern image = new Pattern(System.getProperty("user.dir") + "/src/main/resources/Images/Location.JPG");
//			try {
//				screen.wait(image, 15);
//				screen.click(image);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return true;
//		}
		
		public boolean clickCreate()
		{
			System.out.println("****************C1**********************");
			return objWrapperFunctions.click(btnCreate);
		}
		
		public boolean selectRegion(String region)
		{
			objWrapperFunctions.waitForElementPresence(drpRegion, 90);
			return objWrapperFunctions.dropDownOption1(drpRegion, region);
		}
		
		public boolean selectCountry(String country)
		{
			objWrapperFunctions.waitForElementPresence(drpCountry, 90);
			return objWrapperFunctions.dropDownOptionCountry(drpCountry, country);
		}
		
		public boolean selectLanguage(String language)
		{
			objWrapperFunctions.waitForElementPresence(drpLanguage, 90);
			return objWrapperFunctions.dropDownOptionLanguage(drpLanguage, language);
		}
		
		public boolean setExhibitionName(String exhibitionName)
		{
			objWrapperFunctions.waitForElementPresence(textExhibitionName, 90);
			return objWrapperFunctions.setText(textExhibitionName, exhibitionName);
		}
		
		public boolean setShortName(String exhibitionShortName)
		{
			objWrapperFunctions.waitForElementPresence(textShortName, 90);
			return objWrapperFunctions.setText(textShortName, exhibitionShortName);
		}
		
		public boolean clickCreateBtnOnPopUp()
		{
			objWrapperFunctions.waitForElementToBeClickable(btnCreate_onPopup, 90);
			return objWrapperFunctions.click(btnCreate_onPopup);
		}
		
		public boolean selectRegionForSearch(String region)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objWrapperFunctions.switchToWindowUsingTitle("OneBuyBO");
			objWrapperFunctions.waitForElementPresence(drpRegionSearch, 90);
			return objWrapperFunctions.dropDownOptionSearchRegion_exhibition(drpRegionSearch, region);
		}
		
		public boolean selectCountryForSearch(String country)
		{
			objWrapperFunctions.waitForElementPresence(drpCountrySearch, 90);
			objWrapperFunctions.click(drpCountrySearch);
			By countryOption=By.xpath("//li[contains(text(), '"+country+"')][@class='x-boundlist-item']");
			objWrapperFunctions.waitForElementPresence(countryOption, 90);
			return objWrapperFunctions.click(countryOption);
		}
		
		public boolean setExhibitionNameForSearch(String locationName)
		{
			objWrapperFunctions.waitForElementPresence(textSearchExhibitionName, 90);
			return objWrapperFunctions.setText(textSearchExhibitionName, locationName);
		}
		
		public boolean clickSearchBtnforExhibition()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objWrapperFunctions.waitForElementToBeClickable(btnSearch, 90);
			return objWrapperFunctions.click(btnSearch);
		}
		
		public boolean verifyExhibitionAdded(String exhibitionName)
		{
			By locator = By.xpath("//div[contains(text(),'"+exhibitionName+"')]");
			return objWrapperFunctions.checkElementExistence(locator, 90);
			
		}
		
		public boolean clickModify()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objWrapperFunctions.waitForElementToBeClickable(btnModify, 90);
			return objWrapperFunctions.click(btnModify);
		}
		
		public boolean clickUpdate()
		{
			objWrapperFunctions.waitForElementToBeClickable(btnUpdate, 90);
			return objWrapperFunctions.click(btnUpdate);
		}
}
