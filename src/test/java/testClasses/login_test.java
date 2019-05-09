package testClasses;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pageObjectClasses.login_pom;

public class login_test 
{
	public WebDriver driver;
	login_pom cp;
	
	@BeforeMethod
	public void launchCompatio() throws InterruptedException
	{
		driver = DriverClass.set();
		cp =  new login_pom(driver);
		driver.get("http://gms-qa-app.s3-website.us-east-2.amazonaws.com/");
		driver.manage().window().fullscreen();Thread.sleep(2000);
	}
	
	@Test(enabled=false)
	public void a_elementsTest() throws InterruptedException
	{
		Assert.assertEquals("Compatio", driver.getTitle());
		Assert.assertEquals(cp.clogo.isDisplayed() && cp.clogo.getSize().width==161 && cp.clogo.getSize().height==50, true);
		Assert.assertEquals(cp.login.getText(), "Log In");
		Assert.assertEquals(cp.email.getText(), "Email Address");
		Assert.assertEquals(cp.emailplc.isDisplayed(), true);
		Assert.assertEquals(cp.pswrd.getText(), "Password");
		Assert.assertEquals(cp.pswrdplc.isDisplayed(), true);
		Assert.assertEquals(cp.loginbtn.getText(), "Log In");
		Assert.assertEquals(cp.forgot.getText(), "Forgot Password?");
		Assert.assertEquals(cp.account.getText(), "Don’t have an account? Request Access");
	}
	
	@Test(enabled=false)
	public void b_login() throws InterruptedException
	{
		cp.emailplc.sendKeys("navneet.kumar@kiwitech.com");Thread.sleep(3000);
		cp.pswrdplc.sendKeys("Jaimaa26$");Thread.sleep(3000);
		cp.loginbtn.click();Thread.sleep(3000);
	}
	
	@Test(enabled=true)
	public void c_forgot() throws InterruptedException
	{
		cp.forgot.click();Thread.sleep(3000);
	}
	
	@Test(enabled=true)
	public void d_rqst() throws InterruptedException
	{
		cp.rqstaccess.click();Thread.sleep(3000);
	}
	
	@AfterMethod
	public void closeCompatio()
	{
		System.out.println("Testing Closed.");
		driver.quit();
		System.out.println("Browser Closed");
	}
	
}
