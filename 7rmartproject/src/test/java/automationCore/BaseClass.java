package automationCore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenshotUtility;

public class BaseClass {

	public WebDriver driver;

	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")    //  to do paramterize browser
	
	public void initializeBrowser(String browser) throws Exception {
		 
		 if(browser.equalsIgnoreCase("Chrome"))
		 {
			 driver = new ChromeDriver(); 
		 

		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		}
		 else if(browser.equalsIgnoreCase("Firefox"))
		 {
			 driver = new FirefoxDriver(); 
				driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
				driver.manage().window().maximize(); 
		 }
		 else if(browser.equalsIgnoreCase("InternetExplorer"))
		 {
			 driver = new InternetExplorerDriver(); 
				driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
				driver.manage().window().maximize(); 
		 }
		 else 
			 {
			 throw new Exception("invalid browser");
			 
			 }
	}

	
	/*public void intializeBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");

		driver.manage().window().maximize();
	}*/
	

	@AfterMethod(alwaysRun=true)
	public void driverQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenshotUtility screenShot = new ScreenshotUtility();
			screenShot.getScreenshot(driver, iTestResult.getName());
		}
		driver.quit();

	}

}
