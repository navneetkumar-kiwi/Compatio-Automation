package pageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pom
{
	WebDriver driver;
	public login_pom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    /***ELEMENTS***/
	
	@FindBy(xpath= "//img[@src='/assets/images/compatio.png']")
	public WebElement clogo;
	
	@FindBy(xpath = "//p[contains(text(),'Log In')]")
	public WebElement login;
	
	@FindBy(xpath = "//label[contains(text(),'Email Address')]")
	public WebElement email;	
	
	@FindBy(xpath = "//input[@placeholder='name@company.com']")
	public WebElement emailplc;
	
	@FindBy(xpath = "//label[contains(text(),'Password')]")
	public WebElement pswrd;
	
	@FindBy(xpath = "//input[@placeholder='Enter a password']")
	public WebElement pswrdplc;
	
	@FindBy(xpath = "//button[contains(text(),'Log In')]")
	public WebElement loginbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot Password')]")
	public WebElement forgot;
	
	@FindBy(xpath = "//div[contains(text(),'Don’t have an account?')]")
	public WebElement account;
	
	@FindBy(xpath="//button[@class='btn outline-secondary']")
	public WebElement logout;
}
