package pageObjectClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class request_pom<WebElements> 
{
	WebDriver driver;
	public request_pom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/***ELEMENTS***/
	
	@FindBy(xpath = "//a[contains(text(),'Request Access')]")
	public WebElement rqstaccess;
	
	@FindBy(xpath= "//img[@src='/assets/images/compatio.png']")
	public WebElement clogo;
	
	@FindBy(xpath = "//h5[contains(text(),'Request Access')]")
	public WebElement rqstaccesstext;
	
	@FindBy(xpath = "//p[contains(text(),'Please use your work email address so we can connect you and your company’s products.')]")
	public WebElement rqstaccesscontent;
	
	@FindBy(xpath = "//label[contains(text(),'First Name')]")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@placeholder='John']")
	public WebElement john;
	
	@FindBy(xpath = "//label[contains(text(),'Last Name')]")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@placeholder='Anderson']")
	public WebElement anderson;
	
	@FindBy(xpath = "//select[@class='form-control']")
	public WebElement companyname;
	
	@FindBy(xpath = "//input[@placeholder='name@company.com']")
	public WebElement companyemail;
	
	@FindBy(xpath = "//input[@placeholder='(555) 555-5555']")
	public WebElement phone;
	
	@FindBy(xpath = "//button[contains(text(),'Request Access')]")
	public WebElement submit;
}