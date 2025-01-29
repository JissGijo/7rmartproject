package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Manage News']")
	private WebElement clickmanagenewsmenu;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement clicknewfield;

	@FindBy(xpath = "//textarea[@id='news']")
	private WebElement newstextfield;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clicksavebutton;
	@FindBy(xpath="//h1[@class='m-0 text-dark']")
    private WebElement newsTitleDisplayed;
    
	public void clickmanagenewsmenu() {
		clickmanagenewsmenu.click();
	}

	public void clicknewfield() {
		clicknewfield.click();

	}

	public void newstextfield(String news) {
		newstextfield.sendKeys(news);
	}

	public void clicksavebutton() {
		clicksavebutton.click();
	}
	
	
	}

