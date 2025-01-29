package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {

  public WebDriver driver;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='small-box-footer']")
	private WebElement adminUsersClick;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newuserclick;
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernametextfield;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordtextfield;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']")
	private WebElement clicksavebutton;
	@FindBy(xpath = "//section[@class='content']//div[1]//a[2]")
	private WebElement searchfield;
	@FindBy(xpath = "//input[@id='un']")
	private WebElement categorysearchfield;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement searchbuttton;
	@FindBy(xpath = "//aa[@class='btn btn-rounded btn-warning']")
	private WebElement resetbutton;

	public void clickadminUsersPage() {
		adminUsersClick.click();
	}

	public void newUserClick() {
		newuserclick.click();
	}

	public void enterUsernameField() {
		usernametextfield.sendKeys("jiss");
	}
	public void enterPassword() {
		passwordtextfield.sendKeys("admin2");
	}

	public void clickUserType() {
		Select select = new Select(usertype);
		select.selectByVisibleText("Staff");
	}

	public void clickSaveButton() {
		clicksavebutton.click();
	}
	public void searchField()
	{
		searchfield.click();;
		
	}
	public void categorySearchField()
	{
		categorysearchfield.sendKeys("jiss");
	}
	public void searchButtonClick() {
		searchbuttton.click();
	}
	public void resetButtoncClick() {
		resetbutton.click();
		
	}
}
