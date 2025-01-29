package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constants;
import pages.AdminUsersPage;
import pages.CategoryPage;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends BaseClass{
	

	@Test(groups = { "smoke" }, description = "add a subcategory", priority = 1)
	public void addSubCategory() throws IOException  {
		
	String username = ExcelUtility.readStringData(1, 0, "Login");
	String password = ExcelUtility.readStringData(1, 1, "Login");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickSignInButton();

    String choosefile= Constants.TESTDATAFILE3;
    //String category = ExcelUtility.readStringData(1, 0, "SubCategory");
	SubCategoryPage objs= new SubCategoryPage(driver);
	objs.subCategoryMenu();
	objs. clickNewCategory();
	objs.selectCategory();
	objs.CategoryField();
	objs.entersubCategory(choosefile);
	objs.chooseFilebutton(choosefile);
	objs.clickSavebutton();
	
	}}
	