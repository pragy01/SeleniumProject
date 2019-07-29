package com.nielsen.stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.nielsen.pageFactory.MyModulesPage;
import com.nielsen.pageFactory.OneBuyBackoffice_OrderManagement_CatalogM_Location;
import com.nielsen.pageFactory.OneBuyBackoffice_OrderManagement_CatalogM_Exibition;

import core.generic.Utilities;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;



public class NSO_1BBO_OrderManagement_CatalogM_Location 
{
	// Local variables
		private MyModulesPage objMyModulesPage = new MyModulesPage();
		private OneBuyBackoffice_OrderManagement_CatalogM_Location objOneBuyBackofficePage_Location = new OneBuyBackoffice_OrderManagement_CatalogM_Location();
		private OneBuyBackoffice_OrderManagement_CatalogM_Exibition objOneBuyBackofficePage_Exhibition = new OneBuyBackoffice_OrderManagement_CatalogM_Exibition();
		private Utilities objUtilities = new Utilities();
		
		
		@When("^Navigate to 1BBO$")
		public void NavigateTo1BBO()  
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objMyModulesPage.clickMore());
			Assert.assertTrue(objMyModulesPage.clickOneBuyBackOffice());
		}
		
		@And("^Create Location$")
		public void createLocation(DataTable table)  
		{
			List<List<String>> data = table.raw();
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickMenuViewer());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickOrderManagement());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickCatalogManagement());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickLocation());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickCreate());
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectRegion(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectCountry(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectLanguage(data.get(1).get(2)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.setLocationName(data.get(1).get(3)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.setLocationShortName(data.get(1).get(4)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickCreateBtnOnPopUp());
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectRegionForSearch(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectCountryForSearch(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.setLocationNameForSearch(data.get(1).get(3)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickSearchBtnforLocation());
			Assert.assertTrue(objOneBuyBackofficePage_Location.verifyItemAdded(data.get(1).get(3)));
		}
		
		@And("^Modify Location$")
		public void updateLocation(DataTable table)
		{
			List<List<String>> data = table.raw();
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAddedItem(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.clickModify());
			Assert.assertTrue(objOneBuyBackofficePage_Location.setLocationName(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.setLocationShortName(data.get(1).get(2)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.clickUpdate());
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectRegionForSearch(data.get(1).get(3)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectCountryForSearch(data.get(1).get(4)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.setLocationNameForSearch(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickSearchBtnforLocation());
			Assert.assertTrue(objOneBuyBackofficePage_Location.verifyItemAdded(data.get(1).get(1)));
		}
		
		@And("^Delete Location$")
		public void DeleteLocation(DataTable table)
		{
			List<List<String>> data = table.raw();
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickBack());
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectRegionForSearch(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectCountryForSearch(data.get(1).get(2)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.setLocationNameForSearch(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickSearchBtnforLocation());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAddedItem(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickDelete());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickYes_Popup());
		}
		
		@And("^Create Location characteristics$")
		public void createLocationCharacteristics(DataTable table)
		{
			List<List<String>> data = table.raw();
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAddedItem(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickManageCharacteristics());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickCreate());
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectRegion(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectCountry(data.get(1).get(2)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectLanguage(data.get(1).get(3)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.setAttributeNameForCreate(data.get(1).get(4)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectCharacheristicTypeForCreate(data.get(1).get(5)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickCreateBtnOnPopUp());
			Assert.assertTrue(objOneBuyBackofficePage_Location.verifyItemAdded(data.get(1).get(4)));
		}
		
		@And("^Define Location characteristics value$")
		public void defineLocationCharacteristicsValue(DataTable table)
		{
			List<List<String>> data = table.raw();
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAddedItem(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickManageCharacteristicsValue());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAddCharacteristicsValue());
			Assert.assertTrue(objOneBuyBackofficePage_Location.setDiscription(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.setShortDiscription(data.get(1).get(2)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.setExtremeAbbreviation(data.get(1).get(3)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickCreate_ManageValue());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAddedItem(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.verifyAddedValueToAttribute(data.get(1).get(1)));
		}
		
		@And("^Assign Value To Location characteristics$")
		public void AssignValueToLocationCharacteristics(DataTable table)
		{
			List<List<String>> data = table.raw();
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAssign());
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectValueToAssign(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAssign_value());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickCloseBtn_AssignValue());
		}
		
		@And("^Assign GlobalId to Location$")
		public void assignGlobalIdToLocation(DataTable table)
		{
			List<List<String>> data = table.raw();
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAddedItem(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAssignGlobalId());
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectCountry(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.selectLanguage(data.get(1).get(2)));
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickCreateBtnOnPopUp());
		}
		
		@And("^Create Exhibition$")
		public void createExhibition(DataTable table)
		{
			List<List<String>> data = table.raw();
			/*Assert.assertTrue(objOneBuyBackofficePage_Location.clickMenuViewer());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickOrderManagement());
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickCatalogManagement());*/
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.clickExhibition());
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.clickCreate());
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.selectRegion(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.selectCountry(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.selectLanguage(data.get(1).get(2)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.setExhibitionName(data.get(1).get(3)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.setShortName(data.get(1).get(4)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.clickCreateBtnOnPopUp());
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.selectRegionForSearch(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.selectCountryForSearch(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.setExhibitionNameForSearch(data.get(1).get(3)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.clickSearchBtnforExhibition());
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.verifyExhibitionAdded(data.get(1).get(3)));
		}
		
		@And("^Modify Exhibition$")
		public void updateExhibition(DataTable table)
		{
			List<List<String>> data = table.raw();
			Assert.assertTrue(objOneBuyBackofficePage_Location.clickAddedItem(data.get(1).get(0)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.clickModify());
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.setExhibitionName(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.setShortName(data.get(1).get(2)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.clickUpdate());
			/*Assert.assertTrue(objOneBuyBackofficePage_Exhibition.selectRegionForSearch(data.get(1).get(3)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.selectCountryForSearch(data.get(1).get(4)));*/
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.setExhibitionNameForSearch(data.get(1).get(1)));
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.clickSearchBtnforExhibition());
			Assert.assertTrue(objOneBuyBackofficePage_Exhibition.verifyExhibitionAdded(data.get(1).get(1)));
		}
}
