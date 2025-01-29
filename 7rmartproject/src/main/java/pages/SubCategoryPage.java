package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubCategoryPage {
	public WebDriver driver;

	public SubCategoryPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()=\"Sub Category\"]")
	private WebElement clickSubcategorymenu;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement clicknewcategory;
	@FindBy(xpath = "//select[@class='form-control selectpicker']")
	private WebElement categoryfield;
	@FindBy(xpath = "//option[@value='554']")
	private WebElement selectcategory;
	@FindBy(xpath="//input[@id='subcategory']")
	private WebElement entersubcategoryfield;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement choosefilebutton;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clicksavebutton;
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']")
	private WebElement clickcancelbutton;
	@FindBy(xpath = "//h1[@class='m-0 text-dark']")
	private WebElement issubcategorytitledisplayed;
	
	public void subCategoryMenu() {
		clickSubcategorymenu.click();
	}
	public void clickNewCategory() {
		clicknewcategory.click();
	}
	public void selectCategory() {
		selectcategory.click();
	}
	public void CategoryField() {
		categoryfield.click();
	}
	
	public void entersubCategory(String category) {
		entersubcategoryfield.sendKeys("phone test");
		 
	}
	public void chooseFilebutton(String link) {
		choosefilebutton.sendKeys(link);
		 
	}
	public void clickSavebutton() {
		clicksavebutton.click();
		 
	}
	public void cancelButton() {
		clickcancelbutton.click();
	}
	public boolean categoryTitleDisplayed() {
		return issubcategorytitledisplayed.isDisplayed();
	}


}
