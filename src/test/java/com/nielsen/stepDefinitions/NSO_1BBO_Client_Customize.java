package com.nielsen.stepDefinitions;

import java.util.List;

import org.testng.Assert;

import com.nielsen.pageFactory.BBO_Client_Customize;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class NSO_1BBO_Client_Customize {
	
	private BBO_Client_Customize obj_BBO_Client_Customize= new BBO_Client_Customize();
	
	
	@And("^Navigate to Client Customization Page$")
	public void Navigate_to_Client_Customization_Page() {
		Assert.assertTrue(obj_BBO_Client_Customize.dropCountry("LATAM"));
		Assert.assertTrue(obj_BBO_Client_Customize.clickMenuViewer());
		Assert.assertTrue(obj_BBO_Client_Customize.clickOrderManagement());
		Assert.assertTrue(obj_BBO_Client_Customize.clickClientCustomize());
			
	}
	
	@And("^Select the client in for Customization$")
	public void Select_client(DataTable table) {
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(0));
		Assert.assertTrue(obj_BBO_Client_Customize.selectRegion(data.get(1).get(0)));
		Assert.assertTrue(obj_BBO_Client_Customize.selectCountry(data.get(1).get(1)));
		Assert.assertTrue(obj_BBO_Client_Customize.ClickAllClientSearch());
		Assert.assertTrue(obj_BBO_Client_Customize.SearchClient(data.get(1).get(2)));
		Assert.assertTrue(obj_BBO_Client_Customize.ClickSearch());
		Assert.assertTrue(obj_BBO_Client_Customize.Expand_client(data.get(1).get(2)));
			
		
	}
	
	 @And("^Create product group for client$")
	 public void create_product_group(DataTable table)
	 {
		 List<List<String>> data = table.raw();
		 Assert.assertTrue(obj_BBO_Client_Customize.ExpandProduct(data.get(1).get(0)));
		 Assert.assertTrue(obj_BBO_Client_Customize.clickCreate());
		 Assert.assertTrue(obj_BBO_Client_Customize.typeGroupName(data.get(1).get(1)));
		 
		 
	 }

}
