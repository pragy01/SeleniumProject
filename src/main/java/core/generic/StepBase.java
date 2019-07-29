package core.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

                      
 
public class StepBase
{
	// Local Variables
	protected static WebDriver driver = null;
	protected static WebDriverWait webDriverWait;
	protected static Scenario crScenario;

	
	public void setUp(Scenario cScenario)
	{
		crScenario = cScenario;
		try
		{
			// Load configuration file
			Properties objConfig = new Properties();
			objConfig.load(new FileInputStream(System.getProperty("user.dir") + "/src/main/java/core/config.properties"));
		 	
		  
			if(objConfig.getProperty("test.browser").equalsIgnoreCase("chrome"))
			{
				// Set the capabilities for WebDriver
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				options.addArguments("--no-sandbox");
		        options.addArguments("--disable-dev-shm-usage");
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				capabilities.setCapability("autoAcceptAlerts", true);
				//System.setProperty("webdriver.chrome.driver", ".\\src\\main\\java\\drivers\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver(capabilities);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
				driver.get(objConfig.getProperty("test.browser.url"));
			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	
	public void tearDown(Scenario scenario) 
	{
		try 
		{
			if (scenario.isFailed()) 
			{
				embedScreenshot();
			}
			driver.manage().deleteAllCookies();
			driver.quit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	/**
	 * @Method: getDriver
	 * @Description:  
	 * @return :Appium Driver instance
	 * @Author: Vinayak Shejavale(Harman)
	 * @Creation Date : 24 May 2018   @Modified Date:
	 */
	public WebDriver getDriver()
	{
		return driver;
	}

	
	public static void embedScreenshot()
	{
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		crScenario.embed(screenshot, "image/png"); //stick it in the report
	}
}
