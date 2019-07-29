package com.nielsen.pageFactory;

import org.openqa.selenium.By;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;

import core.generic.WrapperFunctions;

public class OneBuyBackoffice_OrderManagement_CatalogM_Location 
{
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	// input
	
	By textLocationName = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Location Name')]//ancestor::label/following-sibling::div[1]//input");
	By textLocationShortName = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Location Short Name')]//ancestor::label/following-sibling::div[1]//input");
	By textSearchLocationName = By.xpath("//div[@class='x-panel x-fit-item x-panel-default']//span[contains(text(),'Location Name')]/ancestor::div[1]//input");
	By textAttributeName = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Attribute Name')]//ancestor::label/following-sibling::div[1]//input");
	By textSearchAttributeName = By.xpath("//div[@class='x-panel x-fit-item x-panel-default']//span[contains(text(),'Attribute Name')]/ancestor::div[1]//input");
	By textManagevalue_Discription = By.xpath("//div[@data-qtip='DELETE']/ancestor::td/preceding-sibling::td[3]");
	By textManagevalue_ShortDiscription = By.xpath("//div[@data-qtip='DELETE']/ancestor::td/preceding-sibling::td[2]");
	By textManagevalue_ExtremeAbbreviation = By.xpath("//div[@data-qtip='DELETE']/ancestor::td/preceding-sibling::td[1]");
	By textManagevalue_Discription_input = By.xpath("//div[@data-qtip='DELETE']/ancestor::td/preceding-sibling::td[3]//input");
	By textManagevalue_ShortDiscription_input = By.xpath("//div[@data-qtip='DELETE']/ancestor::td/preceding-sibling::td[2]//input");
	By textManagevalue_ExtremeAbbreviation_input = By.xpath("//div[@data-qtip='DELETE']/ancestor::td/preceding-sibling::td[1]//input");
	
	//link
		
	//menu items
		By menuViewer = By.xpath("//span[@class='x-btn-icon-el x-btn-icon-el-default-toolbar-small x-fa fa-navicon ']");
		By menuOrderManagement = By.xpath("//*[contains(text(), 'Order Management')]");
		By menuCatalogManagement = By.xpath("//*[contains(text(), 'Order Management')]/ancestor::div[@class='x-treelist-row']/following-sibling::ul//*[contains(text(), 'Catalog Maintenance')]");
		By menuLocation = By.xpath("//span[contains(text(),'Location')][@class='x-tree-node-text ']");
	
	//labels
		By lblSearchResult = By.xpath("//*[@id='catalogmaintenance-searchresultgrid-1045_header-title-textEl']");
		
	//buttons
		By btnCreate = By.xpath("//span[contains(text(), 'CREATE')][@class='x-btn-inner x-btn-inner-Action_Imp-small']");
		By btnCreate_onPopup= By.xpath("//table[@class='x-table-layout']//ancestor::div[3]//span[contains(text(), 'CREATE')]");
		By btnSearch = By.xpath("//*[contains(text(), 'RESET')]/ancestor::a/preceding-sibling::a[2]//span[@class='x-btn-inner x-btn-inner-default-small']");
		By btnManageCharacteristics = By.xpath("//span[contains(text(),'Manage')]");
		By btnAssignGlobalId = By.xpath("//*[contains(text(),'ASSIGN')]/ancestor::a/preceding-sibling::a//*[contains(text(),'Assign GlobalId')]");
		By btnBackLocationcharacteristics = By.xpath("//*[contains(text(), 'RESET')]/ancestor::div[@class='x-box-inner'][1]//*[contains(text(),'Back')]");
		By btnManageCharacteristicsValue = By.xpath("//div[@data-qtip='Manage Values']/div");
		By btnAddCharacteristicsValue = By.xpath("//div[contains(text(),'Attribute Values')]/ancestor::div[1]/following-sibling::div/div");
		By btnCreate_ManageValue = By.xpath("//div[contains(text(), 'Manage Values')]/ancestor::div[@class='x-panel x-layer x-panel-OBB_window x-closable x-panel-closable x-panel-OBB_window-closable x-border-box']//*[contains(text(), 'CREATE')]");
		By btnAssign =By.xpath("//*[contains(text(),'ASSIGN')]");
		By btnAssign_value = By.xpath("//div[@class='x-panel x-layer x-panel-OBB_window x-closable x-panel-closable x-panel-OBB_window-closable x-border-box']//span[contains(text(), 'Assign')]");
		By btnClose_AssignValue = By.xpath("//div[@data-qtip='Close panel']");
		By btnDelete = By.xpath("//span[contains(text(), 'DELETE')]");
		By btnBack = By.xpath("//span[contains(text(), 'Back')]");
		By btnYes_Popup = By.xpath("//span[contains(text(), 'Yes')]");
		
	//Drop downs
		By drpRegion = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Region')]/ancestor::label/following-sibling::div[1]/div/div[2]");
		By drpCountry = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Country')]/ancestor::label/following-sibling::div[1]/div/div[2]");
		By drpLanguage = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Language')]//ancestor::label/following-sibling::div/div[1]/div[2]");		
		By drpRegionSearch = By.xpath("//div[@class='x-panel x-fit-item x-panel-default']//span[contains(text(),'Region')]//ancestor::div[1]/div[1]/div[1]/div[2]");
		By drpCountrySearch = By.xpath("//div[@class='x-panel x-fit-item x-panel-default']//span[contains(text(),'Country')]//ancestor::div[1]/div[1]/div[1]/div[2]");
		By drpCharacteristicType = By.xpath("//table[@class='x-table-layout']//span[contains(text(), 'Characteristic Type')]//ancestor::label/following-sibling::div/div[1]/div[2]");
		
		
//		public boolean mouseHoverOrderManagement()
//		{
//			objWrapperFunctions.switchToWindowUsingTitle("OneBuyBO");
//			objWrapperFunctions.waitForElementToBeClickable(menuOrderManagement, 15);
//			return objWrapperFunctions.mouseHover(menuOrderManagement);
//		}
		
		public boolean clickMenuViewer()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		
		public boolean clickLocation()
		{
			return objWrapperFunctions.click(menuLocation);
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
			return objWrapperFunctions.click(btnCreate);
		}
		
		public boolean clickDelete()
		{
			return objWrapperFunctions.click(btnDelete);
		}
		
		public boolean clickYes_Popup()
		{
			return objWrapperFunctions.click(btnYes_Popup);
		}
		
		public boolean clickBack()
		{
			return objWrapperFunctions.click(btnBack);
		}
		
		public boolean selectRegion(String region)
		{
			
			if(objWrapperFunctions.checkElementExistence(drpRegion, 90))
			{
			return objWrapperFunctions.dropDownOption1(drpRegion, region);
			}
			else
			{
				objWrapperFunctions.switchToWindowUsingTitle("OneBuyBO");
				return objWrapperFunctions.dropDownOption1(drpRegion, region);
			}
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
		
		public boolean setLocationName(String locationName)
		{
			objWrapperFunctions.waitForElementPresence(textLocationName, 90);
			return objWrapperFunctions.setText(textLocationName, locationName);
		}
		
		public boolean setLocationShortName(String locationShortName)
		{
			objWrapperFunctions.waitForElementPresence(textLocationShortName, 90);
			return objWrapperFunctions.setText(textLocationShortName, locationShortName);
		}
		
		public boolean clickCreateBtnOnPopUp()
		{
			objWrapperFunctions.waitForElementToBeClickable(btnCreate_onPopup, 90);
			return objWrapperFunctions.click(btnCreate_onPopup);
		}
		
		public boolean clickCreate_ManageValue()
		{
			objWrapperFunctions.waitForElementToBeClickable(btnCreate_ManageValue, 90);
			return objWrapperFunctions.click(btnCreate_ManageValue);
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
			return objWrapperFunctions.dropDownOptionSearchRegion(drpRegionSearch, region);
		}
		
		public boolean selectCountryForSearch(String country)
		{
			objWrapperFunctions.waitForElementPresence(drpCountrySearch, 90);
			return objWrapperFunctions.dropDownOptionSearchRegion(drpCountrySearch, country);
		}
		
		public boolean setLocationNameForSearch(String locationName)
		{
			objWrapperFunctions.waitForElementPresence(textSearchLocationName, 90);
			return objWrapperFunctions.setText(textSearchLocationName, locationName);
		}
		
		public boolean clickSearchBtnforLocation()
		{
			objWrapperFunctions.waitForElementToBeClickable(btnSearch, 90);
			return objWrapperFunctions.click(btnSearch);
		}
		
		public boolean verifyItemAdded(String name)
		{
			By locator = By.xpath("//div[contains(text(),'"+name+"')]");
			return objWrapperFunctions.checkElementExistence(locator, 90);
			
		}
		
		public boolean clickAddedItem(String name)
		{
			By locator = By.xpath("//div[contains(text(),'"+name+"')]");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return objWrapperFunctions.click(locator);
			
		}
		
		public boolean clickManageCharacteristics()
		{
			return objWrapperFunctions.click(btnManageCharacteristics);
			
		}
		
		public boolean setAttributeNameForCreate(String attributeName)
		{
			objWrapperFunctions.waitForElementPresence(textAttributeName, 90);
			return objWrapperFunctions.setText(textAttributeName, attributeName);
		}
		
		public boolean selectCharacheristicTypeForCreate(String characteristicType)
		{
			objWrapperFunctions.waitForElementPresence(drpCharacteristicType, 90);
			return objWrapperFunctions.dropDownOptionSearchRegion(drpCharacteristicType, characteristicType);
		}
		
		public boolean setAttributeNameForSearch(String attributeName)
		{
			objWrapperFunctions.waitForElementPresence(textSearchAttributeName, 90);
			return objWrapperFunctions.setText(textSearchAttributeName, attributeName);
		}
		
		public boolean clickAssignGlobalId()
		{
			return objWrapperFunctions.click(btnAssignGlobalId);
		}
		
		public boolean clickAssign()
		{
			return objWrapperFunctions.click(btnAssign);
		}
		
		public boolean clickManageCharacteristicsValue()
		{
			return objWrapperFunctions.click(btnManageCharacteristicsValue);
		}
		
		public boolean clickAddCharacteristicsValue()
		{
			return objWrapperFunctions.click(btnAddCharacteristicsValue);
		}
		
		public boolean setDiscription(String attributeName)
		{
			objWrapperFunctions.doubleClick(textManagevalue_Discription);
			return objWrapperFunctions.setText(textManagevalue_Discription_input, attributeName);
		}
		
		public boolean setShortDiscription(String attributeName)
		{
			objWrapperFunctions.doubleClick(textManagevalue_ShortDiscription);
			return objWrapperFunctions.setText(textManagevalue_ShortDiscription_input, attributeName);
		}
		
		public boolean setExtremeAbbreviation(String attributeName)
		{
			objWrapperFunctions.doubleClick(textManagevalue_ExtremeAbbreviation);
			objWrapperFunctions.waitForElementPresence(textManagevalue_ExtremeAbbreviation_input, 90);
			return objWrapperFunctions.setText(textManagevalue_ExtremeAbbreviation_input, attributeName);
		}
		
		public boolean verifyAddedValueToAttribute(String name)
		{
			By locator = By.xpath("//div[starts-with(text(), '"+name+"')]");
			return objWrapperFunctions.checkElementExistence(locator, 90);
		}
		
		public boolean selectValueToAssign(String value)
		{
			By locator = By.xpath("//div[@class='x-panel x-layer x-panel-OBB_window x-closable x-panel-closable x-panel-OBB_window-closable x-border-box']//*[starts-with(text(), '"+value+"')]/ancestor::tr/td[1]");
			return objWrapperFunctions.click(locator);
		}
		
		public boolean clickAssign_value()
		{
			return objWrapperFunctions.click(btnAssign_value);
		}
		
		public boolean clickCloseBtn_AssignValue()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return objWrapperFunctions.click(btnClose_AssignValue);
		}
}
