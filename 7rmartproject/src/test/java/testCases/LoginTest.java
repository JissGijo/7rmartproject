package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//import SelinumBasics.ExcelRead;
import automationCore.BaseClass;
import constants.Messages;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseClass {
	@Test(groups = { "smoke" }, description = "UserLogin With Valid Username and Valid Password", priority = 1)

	public void userLoginWithValidUsernameAndValidPassword() throws IOException

	{
		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();
		//boolean isdashboardDisplayed = loginpage.isdashboardDisplayed();
		//Assert.assertTrue(isdashboardDisplayed,Messages.ELEMENTNOTFOUND);
	}

	@Test(groups={"smoke"},description = "UserLogin With Valid Username and InValid Password", priority = 2)
	public void userLoginWithValidUsernameAndInValidPassword() throws IOException {

		String username = ExcelUtility.readStringData(2, 0, "Login");
		String password = ExcelUtility.readStringData(2, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();
		boolean iserrorMessageDisplayed = loginpage.iserrorMessageDisplayed();
		Assert.assertTrue(iserrorMessageDisplayed ,Messages.ALERTNOTFOUND);
	}

	@Test(description = "UserLogin With InValid Username and Valid Password", priority = 4)
	public void userLoginWithInValidUsernameAndValidPassword() throws IOException {


		String username = ExcelUtility.readStringData(3, 0, "Login");
		String password = ExcelUtility.readStringData(3, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();
	}

	@Test(description = "UserLogin With InValid Username and InValid Password", priority = 3)
	public void userLoginWithInValidUsernameAndInValidPassword() throws IOException {

		String username = ExcelUtility.readStringData(4, 0, "Login");
		String password = ExcelUtility.readStringData(4, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();

	}
}
