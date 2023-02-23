package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//h1[@class='account__information-username']")
	public WebElement userText;
	
	@FindBy(xpath = "//h1[@class='account__information-email']")
	public WebElement emailText;
	
	@FindBy(id = "nameInput")
	public WebElement nameField;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneField;
	
	@FindBy(id = "emailInput")
	public WebElement emailField;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement updateBtn;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPasswordField;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordField;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassField;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePasswordBtn;
	
	@FindBy(xpath = "(//h1[@class='account__title'])[1]")
	public WebElement walletText;
	
	@FindBy(xpath = "//h1[@class='account__payments-title']")
	public WebElement cardsAndAccountText;
	
	@FindBy(xpath = "//p[contains(@class, 'text-sm')]")
	public WebElement addPaymentLink;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberField;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardField;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expMonth;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
