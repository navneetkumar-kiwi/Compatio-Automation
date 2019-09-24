package testClasses;

import static org.testng.Assert.assertEquals;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pageObjectClasses.login_pom;
import testListeners.SingleDataProvider;

public class login_test 
{
	public WebDriver driver;
	login_pom cp;
	
	@BeforeMethod
	public void launchCompatio() throws InterruptedException
	{
		driver = DriverClass.set();
		cp =  new login_pom(driver);
		String url = "http://gms-dev-app.s3-website.us-east-2.amazonaws.com/";
		driver.get(url);
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
	
	@Test(dataProvider = "data", dataProviderClass = SingleDataProvider.class, enabled=true)
	public void c_login(String username, String password) throws InterruptedException
	{
		cp.emailplc.sendKeys("avanish.jaiswal@kiwitech.com");Thread.sleep(3000);
		cp.pswrdplc.sendKeys("India@123");Thread.sleep(3000);
		cp.loginbtn.click();Thread.sleep(3000);
		Assert.assertEquals(cp.logout.getText(), "Logout");
	}
	
	@AfterMethod
	public void closeCompatio()
	{
		System.out.println("Testing Closed.");
		driver.quit();
		System.out.println("Browser Closed");
	}
	
}
