package pageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgot_pom 
{
	WebDriver driver;
	public forgot_pom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/***ELEMENTS***/
	
	@FindBy(xpath= "//img[@src='/assets/images/compatio.png']")
	public WebElement clogo;
	
	@FindBy(xpath = "//p[contains(text(),'Forgot Password?')]")
	public WebElement forgotpswrd;
	
	@FindBy(xpath = "//label[contains(text(),'Email Address')]")
	public WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='name@company.com']")
	public WebElement emailplc;
	
	@FindBy(xpath = "//button[contains(text(),'Send Me Instructions')]")
	public WebElement instructions;
	
	@FindBy(xpath = "//p[contains(text(),'An email has been sent to ')]")
	public WebElement ack1;
	
	@FindBy(xpath = "//span[contains(text(),'navneet@yopmail.com')]")
	public WebElement ack2;
	
	@FindBy(xpath = "//p[text()=' with instructions to reset your password.']")
	public WebElement ack3;
	
	@FindBy(xpath= "//input[@id='login']")
	public WebElement yopmail;
	
	@FindBy(xpath= "//input[@type='submit']")
	public WebElement yopmail1;
	
	@FindBy(xpath= "//p[contains(text(),'http')]")
	public WebElement reset;

}
