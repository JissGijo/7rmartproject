package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import pages.AdminUsersPage;
import pages.CategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends BaseClass{
	
	@Test(groups = { "smoke" }, description = "adding a new user", priority = 1)
	public void addNewUser() throws IOException  {
		
	String username = ExcelUtility.readStringData(1, 0, "Login");
	String password = ExcelUtility.readStringData(1, 1, "Login");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickSignInButton();


	AdminUsersPage obj= new AdminUsersPage(driver);
	obj.clickadminUsersPage();
	obj.newUserClick();
	obj.enterUsernameField();
	obj.enterPassword();
	obj.clickUserType();
	obj.clickSaveButton();
	}
	
	@Test(description = "Search a user", priority = 2)
	public void searchTheUsers() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();

		
		AdminUsersPage adminuser= new AdminUsersPage(driver);
		adminuser.clickadminUsersPage();
		adminuser.searchField();
		adminuser.categorySearchField();
		adminuser.searchButtonClick();
		
		adminuser.resetButtoncClick();
	
}}