package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constants;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends BaseClass {


	@Test(description = "Add a news", priority = 1)
	public void addingTheNews() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();
		
        // add news 
		String addNews= Constants.TESTDATAFILE1;
		
	    //String addNews=  ExcelUtility.readStringData(1,0, "News");
		ManageNewsPage managepage = new ManageNewsPage(driver);
		managepage.clickmanagenewsmenu();
		managepage.clicknewfield();
		managepage.clicksavebutton();
		managepage.newstextfield(addNews);
		managepage.clicksavebutton();
		//boolean isnewsTitleDisplayed = ManageNewsPage.isnewsTitleDisplayed();
		//Assert.assertTrue(isnewsTitleDisplayed, "Element not found !");

	}

}
