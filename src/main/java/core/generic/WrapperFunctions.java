package core.generic;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javafx.scene.control.Alert;

public class WrapperFunctions
{
	private StepBase objStepBase = new StepBase();

	
	public void waitForElementToBeClickable(By locator, int waitInSeconds) 
	{
		try 
		{
			Wait<WebDriver> wait = new WebDriverWait(objStepBase.getDriver(), waitInSeconds).ignoring(StaleElementReferenceException.class);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} 
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	/**
	 * @Method: waitForElementPresence
	 * @Description: This is wrapper method wait for element presence
	 * @param locator - By identification of element
	 * @param waitInSeconds - wait time 
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public void waitForElementPresence(By locator, int waitInSeconds) 
	{
		try 
		{
			Wait<WebDriver> wait = new WebDriverWait(objStepBase.getDriver(), waitInSeconds).ignoring(StaleElementReferenceException.class);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} 
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	} 

	/**
	 * @Method: checkElement_Existance
	 * @Description: This is wrapper method to check the existence of any web element on the page
	 * @param locator - By identification of element
	 * @param waitInSeconds - wait time 
	 * @return - true if element present  
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean checkElementExistence(By locator, int... sTimeInSecond)
	{
		try 
		{
			WebDriverWait wait = null;
			if(sTimeInSecond.length > 0)
			{
				wait = new WebDriverWait(objStepBase.getDriver(), sTimeInSecond[0]);
			}
			else
			{
				wait = new WebDriverWait(objStepBase.getDriver(), 10);
			}
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			WebElement ele= objStepBase.getDriver().findElement(locator);
			return ele.isDisplayed();
		}
		catch(Exception exception)
		{
			exception.printStackTrace(); 
			return false;
		}
	}
	
	public boolean clickUsingJavascriptExecutor(By locator)
	{
		JavascriptExecutor js = (JavascriptExecutor)objStepBase.getDriver();
		js.executeScript("arguments[0].click();", locator);
		return true;
	}
	

	/**
	 * @Method: click
	 * @Description: This is wrapper method to click on web element 
	 * @param locator - By identification of element
	 * @return - true if click successful
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean click(By locator) 
	{
		waitForElementToBeClickable(locator, 10);
		WebElement webElement = objStepBase.getDriver().findElement(locator);
		try
		{
			webElement.click();
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean navigateTo(String url) 
	{
		
		objStepBase.getDriver().navigate().to(url);
		return true;
		
	}
	
	public void nowURL(){
		System.out.println(objStepBase.getDriver().getCurrentUrl());
		
		
		
	}

	/**
	 * @Method: doubleClick
	 * @Description: This is wrapper method used for doubleClick on element
	 * @param locator - By identification of element
	 * @return - true if double click successful
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean doubleClick(By locator)
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = objStepBase.getDriver().findElement(locator);
		try
		{
			Actions actionBuilder = new Actions(objStepBase.getDriver());
			actionBuilder.doubleClick(webElement).build().perform();
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: setText
	 * @Description: This is wrapper method to set text for input element
	 * @param locator - By identification of element
	 * @param fieldValue - field value as string 
	 * @return - true if text entered successfully
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean setText(By locator, String fieldValue) 
	{
		
		waitForElementPresence(locator, 10);
		WebElement webElement = objStepBase.getDriver().findElement(locator);
		try
		{
			// replace the text
			JavascriptExecutor executor = (JavascriptExecutor)objStepBase.getDriver();
			executor.executeScript("arguments[0].click();", webElement);
			webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			webElement.sendKeys(Keys.DELETE);
			webElement.clear();
			webElement.sendKeys(fieldValue);
			//webElement.sendKeys(Keys.TAB);
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: getText
	 * @Description: This is wrapper method to get text form input elements
	 * @param locator - By identification of element
	 * @param textBy - get text by value attribute (set textBy as value)/ by visible text (set textBy as text)
	 * @return - text as string
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date: 
	 */
	public String getText(By locator, String textBy) 
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = objStepBase.getDriver().findElement(locator);
		try
		{
			String strText = "";
			if(textBy.equals("value"))
				strText = webElement.getAttribute("value");
			else if(textBy.equalsIgnoreCase("text"))
				strText = webElement.getText();
			return strText; 
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return null;
		}
	}

	/**
	 * @Method: selectCheckBox
	 * @Description: This is wrapper method select/deselect checkbox
	 * @param locator - By identification of element
	 * @param status - select/deselect 
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean selectCheckBox(By locator, boolean status) 
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = objStepBase.getDriver().findElement(locator);
		try
		{
			if(webElement.getAttribute("type").equals("checkbox"))   
			{
				if((webElement.isSelected() && !status) || (!webElement.isSelected() && status))
					webElement.click();
				return true;
			}
			else
				return false;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: isCheckBoxSelected
	 * @Description: This is wrapper checkbox is selected or not
	 * @param locator - By identification of element
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean isCheckBoxSelected(By locator, boolean status) 
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = objStepBase.getDriver().findElement(locator);
		boolean state = false;
		try
		{
			if(webElement.getAttribute("type").equals("checkbox"))   
				state = webElement.isSelected();

			return state;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: selectRadio
	 * @Description: This is wrapper method select/deselect radio button
	 * @param locator - By identification of element
	 * @param status - select/deselect 
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean selectRadioButton(By locator, boolean status)
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = objStepBase.getDriver().findElement(locator);
		try
		{
			if(webElement.getAttribute("type").equals("radio"))   
			{
				if((webElement.isSelected() && !status) || (!webElement.isSelected() && status))
					webElement.click();
				return true;
			}
			else
				return false;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: mouseHover
	 * @Description: This is wrapper method used for Mouse Hovering to the element
	 * @param locator - By identification of element
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean mouseHover(By locator)
	{
		
		//waitForElementPresence(locator, 10);
		WebElement webElement = objStepBase.getDriver().findElement(locator);
		try
		{
			Actions actionBuilder = new Actions(objStepBase.getDriver());
			actionBuilder.moveToElement(webElement).build().perform();
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: switchToWindowUsingTitle
	 * @Description: This is wrapper method used switch to window using the given title
	 * @param locator - Window title
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean switchToWindowUsingTitle(String windowTitle)
	{
		try
		{
			String mainWindowHandle = objStepBase.getDriver().getWindowHandle();
			Set<String> openWindows = objStepBase.getDriver().getWindowHandles();
			if (!openWindows.isEmpty()) 
			{
				for (String windows : openWindows) 
				{
					String window = objStepBase.getDriver().switchTo().window(windows).getTitle();
					System.out.println("****************+"+window);
					if (windowTitle.equals(window)) 
						return true;
					else 
						objStepBase.getDriver().switchTo().window(mainWindowHandle);
				}
			}
			return false;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean handleAlert()
	{
		int i=0;
		while(i++<30)
		{
			try
			{
				Alert alert = (Alert) objStepBase.getDriver().switchTo().alert();
				alert.close();
				break;
			}
			catch(NoAlertPresentException e)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				continue;
			}
		}
		
		return true;
	}

	
	public boolean selectDropDownOption(By locator, String option, String... selectType) 
	{
		try
		{
			waitForElementPresence(locator, 10);
			WebElement webElement = objStepBase.getDriver().findElement(locator);
			Select sltDropDown = new Select(webElement);

			if(selectType.length > 0 && !selectType[0].equals(""))
			{
				if(selectType[0].equals("Value"))
					sltDropDown.selectByValue(option);
				else if(selectType[0].equals("Text"))
					sltDropDown.selectByVisibleText(option);
				else if(selectType[0].equals("Index"))
					sltDropDown.selectByIndex(Integer.parseInt(option));

				return true;
			}
			else
			{
				// Web elements from dropdown list 
				List<WebElement> options = sltDropDown.getOptions();
				boolean blnOptionAvailable = false;
				int iIndex = 0;
				for(WebElement weOptions : options)  
				{  
					if (weOptions.getText().trim().equals(option))
					{
						sltDropDown.selectByIndex(iIndex);
						blnOptionAvailable = true;
					}
					else
						iIndex++;
					if(blnOptionAvailable)
						break;
				}
				if(blnOptionAvailable)
					return true;
				else
					return false;
			}
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean dropDownOption(By locator, String option)
	{
		waitForElementPresence(locator, 10);
		click(locator);
		objStepBase.getDriver().findElement(By.xpath("//li[contains(text(), '\"+option+\"')]")).click();
		return true;
	}
	
	public boolean dropDownOption1(By locator, String option)
	{
		waitForElementPresence(locator, 10);
		click(locator);
		objStepBase.getDriver().findElement(By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']/div/ul/li[contains(text(),'\"+option+\"')]")).click();
		return true;
	}
	
	public boolean dropDownOptionCountry(By locator, String option)
	{
		waitForElementPresence(locator, 10);
		click(locator);
		objStepBase.getDriver().findElement(By.xpath("//ul[@id='combo-1386-picker-listEl']//li[contains(text(),'\"+option+\"')]")).click();
		return true;
	}
	
	public boolean dropDownOptionLanguage(By locator, String option)
	{
		waitForElementPresence(locator, 10);
		click(locator);
		objStepBase.getDriver().findElement(By.xpath("//li[contains(text(), '"+option+"')]")).click();
		return true;
	}
	
	public boolean dropDownOptionSearchRegion(By locator, String option)
	{
		waitForElementPresence(locator, 10);
		click(locator);
		objStepBase.getDriver().findElement(By.xpath("//li[contains(text(), '"+option+"')]")).click();
		return true;
	}
	
	public boolean dropDownOptionSearchRegion_exhibition(By locator, String option)
	{
		waitForElementPresence(locator, 10);
		click(locator);
		objStepBase.getDriver().findElement(By.xpath("//li[contains(text(), '"+option+"')][@class='x-boundlist-item']")).click();
		return true;
	}

	/**//*[contains(text(),'BRAZIL')]/ancestor::td/preceding-sibling::td//span[@class='x-grid-checkcolumn']
	 * @Method: getSelectedValueFormDropDown
	 * @Description: This is wrapper method select drop down element
	 * @param locator - By identification of element
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public String getSelectedValueFormDropDown(By locator) 
	{
		try
		{
			waitForElementPresence(locator, 10);
			Select selectDorpDown = new Select(objStepBase.getDriver().findElement(locator));
			String selectedDorpDownValue = selectDorpDown.getFirstSelectedOption().getText();
			return selectedDorpDownValue;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return null;
		}

	}
	
	
	public String switchToFrame(String iframe) 
	{
		try
		{
		
			objStepBase.getDriver().switchTo().frame(iframe);
			return null;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return null;
		}

	}
	/**
	 * @Method: selectRadioButtonForSpecificColumn
	 * @Description: This is wrapper method to select radio button from table with respect to particular column content
	 * @param locator - By identification of element (table with all rows)
	 * @param columnContent - String column content
	 * @columnNumberForRadio - integer column number for radio button
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean selectRadioButtonForSpecificColumn(By locator, String columnContent, int columnNumberForRadio) 
	{
		try
		{
			waitForElementPresence(locator, 10);
			List<WebElement> weResultTable = objStepBase.getDriver().findElements(locator);
			for(WebElement weRow : weResultTable)
			{
				List<WebElement> weColumns = weRow.findElements(By.xpath(".//td"));
				for(WebElement weColumn : weColumns)
				{
					if(weColumn.getText().trim().equals(columnContent))
					{
						WebElement webElement = weRow.findElement(By.xpath(".//td['" + columnNumberForRadio + "']/input[@type='radio']"));
						JavascriptExecutor executor = (JavascriptExecutor)objStepBase.getDriver();
						executor.executeScript("arguments[0].click();", webElement);
					}
				}
			}
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: selectCheckBoxForSpecificColumn
	 * @Description: This is wrapper method to select check box from table with respect to particular column content
	 * @param locator - By identification of element (table with all rows)
	 * @param columnContent - String column content
	 * @columnNumberForRadio - integer column number for radio button
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean selectCheckBoxForSpecificColumn(By locator, String columnContent, int columnNumberForRadio) 
	{
		try
		{
			waitForElementPresence(locator, 10);
			List<WebElement> weResultTable = objStepBase.getDriver().findElements(locator);
			for(WebElement weRow : weResultTable)
			{
				List<WebElement> weColumns = weRow.findElements(By.xpath(".//td"));
				for(WebElement weColumn : weColumns)
				{
					if(weColumn.getText().trim().equals(columnContent))
						weRow.findElement(By.xpath(".//td['" + columnNumberForRadio + "']/span/input[@type='checkbox']")).click();
				}
			}
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: verifyTableContent
	 * @Description: 
	 * @param locator - By identification of element (table with all rows)
	 * @param columnHeader - String column header
	 * @param columnContent - String column content
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean verifyTableContent(By locator, String columnHeader, String columnContent) 
	{
		Hashtable<String , String> dataColumnHeader = new Hashtable<String, String>();
		int intColumnNumber = 1;
		boolean blnverify = false;
		try
		{
			waitForElementPresence(locator, 10);
			WebElement weResultTable = objStepBase.getDriver().findElement(locator);

			List<WebElement> weColumnsHeaders = weResultTable.findElements(By.xpath(".//thead/tr/th"));
			for(WebElement weColumnHeader : weColumnsHeaders)
			{
				String strHeader = weColumnHeader.getText().trim();
				if(!strHeader.equals(""))
					dataColumnHeader.put(strHeader, String.valueOf(intColumnNumber));
				intColumnNumber ++;
			}

			List<WebElement> weRows = weResultTable.findElements(By.xpath(".//tbody/tr"));
			for(WebElement weRow : weRows)
			{
				System.out.println( dataColumnHeader.get(columnHeader));
				WebElement weExceptedClm = weRow.findElement(By.xpath(".//td[" + dataColumnHeader.get(columnHeader) + "]"));
				if(weExceptedClm.getText().trim().contains(columnContent))
					blnverify = true;
			}

			return blnverify;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: verifyTableContentAndCheckSelected
	 * @Description: 
	 * @param locator - By identification of element (table with all rows)
	 * @param columnHeader - String column header
	 * @param columnContent - String column content
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean verifyTableContentAndCheckSelected(By locator, String columnHeader, String columnContent, int checkboxColumnNumber) 
	{
		Hashtable<String , String> dataColumnHeader = new Hashtable<String, String>();
		int intColumnNumber = 1;
		boolean blnverify = false;
		try
		{
			waitForElementPresence(locator, 10);
			WebElement weResultTable = objStepBase.getDriver().findElement(locator);

			List<WebElement> weColumnsHeaders = weResultTable.findElements(By.xpath(".//thead/tr/th"));
			for(WebElement weColumnHeader : weColumnsHeaders)
			{
				String strHeader = weColumnHeader.getText().trim();
				if(!strHeader.equals(""))
					dataColumnHeader.put(strHeader, String.valueOf(intColumnNumber));
				intColumnNumber ++;
			}

			List<WebElement> weRows = weResultTable.findElements(By.xpath(".//tbody/tr"));
			for(WebElement weRow : weRows)
			{
				WebElement weExceptedClm = weRow.findElement(By.xpath(".//td[" + dataColumnHeader.get(columnHeader) + "]"));
				if(weExceptedClm.getText().trim().contains(columnContent))
				{
					WebElement weCheckBox = weRow.findElement(By.xpath(".//td[" + checkboxColumnNumber + "]/span/input[@type='checkbox']"));
					boolean blnIsSelected = weCheckBox.isSelected();
					if(blnIsSelected)
					{
						blnverify = true;
					}
				}
			}
			return blnverify;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @Method: view table details
	 * @Description: 
	 * @param locator - By identification of table element
	 * @Author: Vinayak Shejavale(Harman) @Creation Date : 24 May 2018   @Modified Date:
	 */
	public boolean viewTableContent(By locator) 
	{
		try
		{
			WebElement weResultTable = objStepBase.getDriver().findElement(locator);

			int intHeaderNumber = 1;
			List<WebElement> weColumnsHeaders = weResultTable.findElements(By.xpath(".//thead/tr/th"));
			System.out.println("************************* Table Header details *************");
			for(WebElement weColumnHeader : weColumnsHeaders)
			{
				System.out.println("Table Header * " + intHeaderNumber + " *--->" + weColumnHeader.getText());
				intHeaderNumber++;
			}

			List<WebElement> weRows = weResultTable.findElements(By.xpath(".//tbody/tr"));
			int intRowNum = 1 ;
			System.out.println("************************* Table content details *************");
			for(WebElement weRow : weRows)
			{
				System.out.println("**********Row Number  " + intRowNum + " *************");
				int intClmNum = 1 ;  
				List<WebElement> weClmns = weRow.findElements(By.xpath(".//td"));
				for(WebElement weClmn : weClmns)
				{
					System.out.println("Column Number---->" + intClmNum);
					System.out.println("Column Text-------->" + weClmn.getText());
					intClmNum++;
				}
				intRowNum++;
			}
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}


}

