package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
	public WebDriver driver;

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()=\"Category\"]")
	private WebElement clickcategorymenu;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement clickcategorynew;
	@FindBy(xpath = "//input[@id='category']")
	private WebElement categoryfield;
	@FindBy(xpath = "//li[@id='134-selectable']")
	private WebElement discountfield;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement choosefilebutton;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clicksavebutton;
	@FindBy(xpath = "//h1[text()=\"Add Category\"]")
	private WebElement iscategorytitledisplayed;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchfield;
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement categorysearchfield;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	private WebElement searchbuttton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	private WebElement resetbutton;

	public void clickCategoryPage() {
		clickcategorymenu.click();
	}

	public void clickCategoryNewButton() {
		clickcategorynew.click();
	}

	public void addCatergoryField(String category) {
		categoryfield.sendKeys("Honey2796");
	}

	public void clickDiscountField() {
		discountfield.click();
	}

	public void chooseFileButton(String link) {
		choosefilebutton.sendKeys(link);
	}

	public void clickSaveButton() {

		Actions act = new Actions(driver);
		act.moveToElement(clicksavebutton).click().perform();

	}

	public boolean categoryTitleDisplayed() {
		return iscategorytitledisplayed.isDisplayed();
	}

	public void clickSearchField() {
		searchfield.click();
	}

	public void categorySearchField() {
		categorysearchfield.sendKeys("chocolate");
	}

	public void clickSearchButton() {
		searchbuttton.click();
	}

	public void clickResetButton() {
		resetbutton.click();
	}
}
