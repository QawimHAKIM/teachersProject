package tek.sdet.framework.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	/*
	 * syntax for finding UI elements and storing them in POM classes
	 * @FindBy(locatorType = "value")
	 * public WebElement name;
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id = "search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton;
	
	@FindBy(id = "accountLink")
	public WebElement accountBtn;
	
	@FindBy(id = "orderLink")
	public WebElement ordersBtn;
	
	@FindBy(id = "logoutBtn")
	public WebElement logoutBtn;
	
	@FindBy(id = "cartBtn")
	public WebElement cartBtn;
	
	@FindBy(id = "heroImage")
	public WebElement homePagePicture;
	
	@FindBy(id = "categoryTitle")
	public WebElement shopByCategoryText;
	
	@FindBy(xpath = "//img[@class='image']")
	public Set<WebElement> homePageImages;
	
	@FindBy(xpath = "//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemonProduct;
	
	@FindBy(id = "signinLink")
	public WebElement signInBtn;
	
	
	
}
