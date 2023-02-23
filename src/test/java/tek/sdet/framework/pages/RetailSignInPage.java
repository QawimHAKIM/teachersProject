package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		// implementing the PageFactory class to initialize the UI elements 
		// using initElements method
		// this method accepts two parameters: (driver, this keyword which refers to variable 
		// of this class) 
		// in this case we are refering to UI elements that will store in this class
	}
	
	@FindBy(xpath = "//h1[text()='Sign in']")
	public WebElement signInPageLogo;
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement loginPageBtn;
	
	@FindBy(linkText = "Create New Account")
	public WebElement createNewAccountBtn;
	
	@FindBy(id = "newCompanyAccount")
	public WebElement wantToSellSomethingLink;
	
	
	
	
	
	
	
	
	
	
	
}
