package com.nielsen.pageFactory;

import org.openqa.selenium.By;

import core.generic.WrapperFunctions;

public class BBO_Client_Customize {
	
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	
	By menuViewer = By.xpath("//span[@class='x-btn-icon-el x-btn-icon-el-default-toolbar-small x-fa fa-navicon ']");
	By menuOrderManagement = By.xpath("//*[contains(text(), 'Order Management')]");
	By client_cus= By.xpath("//*[contains(text(), 'Order Management')]/ancestor::div[@class='x-treelist-row']/following-sibling::ul//*[contains(text(), 'Client Customization')]");
	// By drpRegion=By.xpath("//input[@name='RegionID']/ancestor::div[1]/following-sibling::div");
	// By drpCountry= By.xpath("//input[@name='countryID']/ancestor::div[1]/following-sibling::div");
	By searchBtn=By.xpath("//a[@class='x-btn x-obb-field x-unselectable x-column x-btn-default-small']//span[contains(text(),'SEARCH')]");
	By typeRegion=By.xpath("//input[@name='RegionID']");
	By typeCountry=By.xpath("//input[@name='countryID']");
	By serchClient=By.xpath("//input[@placeholder='Search Client']");
	By clickSearch=By.xpath("//input[@placeholder='Search Client']/parent::div/following-sibling::div");
	By createBtn=By.xpath("//div[@class='x-panel-header x-header x-header-noborder x-docked x-unselectable x-panel-header-searchGrid x-horizontal x-panel-header-horizontal x-panel-header-searchGrid-horizontal x-top x-panel-header-top x-panel-header-searchGrid-top x-docked-top x-panel-header-docked-top x-panel-header-searchGrid-docked-top x-box-layout-ct x-noborder-trl']//a[4]");
	By grpName=By.xpath("//iframe[@src='chrome-extension://hgimnogjllphhhkhlmebbmlgjoejdpjl/bar.html']/following-sibling::div/child::div[2]/descendant::div[11]/child::div[2]/div[1]");
	By clickCountry=By.xpath("//body[@id='ext-element-1']/child::div[7]/descendant::div[8]/child::div/div/div/input");
	
	
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
	
	
	public  boolean clickClientCustomize() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objWrapperFunctions.click(client_cus);			
	}
	
	public boolean selectRegion(String region)
	{

		return objWrapperFunctions.setText(typeRegion, region);
	}
	
	
	public boolean selectCountry(String country)
	{
		
		return objWrapperFunctions.setText(typeCountry, country);
	}
	
	public boolean ClickAllClientSearch() {
		return objWrapperFunctions.click(searchBtn);
	}
	
	
	public boolean ClickSearch() {
		return objWrapperFunctions.click(clickSearch);
		
		
		
	}
	public boolean SearchClient(String client) {
		return objWrapperFunctions.setText(serchClient, client);
	}
	
	public boolean Expand_client(String cName) {
		By expandClient= By.xpath("//span[contains(text(),'"+cName+"')]/parent::div/div[1]");
		return objWrapperFunctions.click(expandClient);
	}
	
	public boolean ExpandProduct(String cName) {
		
		By expandProd=By.xpath("//span[contains(text(),'"+cName+"')]/ancestor::table/following-sibling::table[1]/tbody/tr/td/div/div[2]");
		By ProdGrp= By.xpath("//span[contains(text(),'"+cName+"')]/ancestor::table/following-sibling::table[4]//span");
		objWrapperFunctions.click(expandProd);
		return objWrapperFunctions.click(ProdGrp);
	}
	
	public boolean clickCreate() {
		return objWrapperFunctions.click(createBtn);
	}
	
	public boolean typeGroupName(String name) {
		objWrapperFunctions.switchToFrame("chrome-extension://hgimnogjllphhhkhlmebbmlgjoejdpjl/bar.html");
		return objWrapperFunctions.setText(grpName, name);
	}
	
	public boolean dropCountry(String Region) {
		objWrapperFunctions.nowURL();
		return objWrapperFunctions.setText(clickCountry, Region);
	}
	
	
}
