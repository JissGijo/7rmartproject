package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constants;
import pages.CategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class CategoryTest extends BaseClass {

	@Test(description = "Add a new Category", priority = 1)
	public void addingTheCategoryOne() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();

		// String category = ExcelUtility.readStringData(1, 0, "Category");
		// String link = ExcelUtility.readStringData(1, 1, "Category");
		String choosefile = Constants.TESTDATAFILE1;

		CategoryPage categorypage = new CategoryPage(driver);
		categorypage.clickCategoryPage();
		categorypage.clickCategoryNewButton();
		categorypage.addCatergoryField(choosefile);
		categorypage.clickDiscountField();
		categorypage.chooseFileButton(choosefile);
		categorypage.clickSaveButton();
		categorypage.categoryTitleDisplayed();
		boolean categoryTitleDisplayed = categorypage.categoryTitleDisplayed();
		Assert.assertTrue(categoryTitleDisplayed, "Element not found !");
	}

	@Test(description = "Search a category", priority = 2)
	public void searchTheCategory() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();

		CategoryPage categorypage = new CategoryPage(driver);
		categorypage.clickCategoryPage();
		categorypage.clickSearchField();
		categorypage.categorySearchField();
		categorypage.clickSearchButton();
	}

}
