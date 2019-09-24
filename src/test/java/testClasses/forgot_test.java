package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pageObjectClasses.forgot_pom;
import pageObjectClasses.login_pom;

public class forgot_test 
{
	public WebDriver driver;
	login_pom cp;
	forgot_pom cp1;
	String reset;
	
	@BeforeMethod
	public void launchCompatio() throws InterruptedException
	{
		driver = DriverClass.set();
		cp =  new login_pom(driver);
		cp1 = new forgot_pom(driver);
		String url = "http://gms-dev-app.s3-website.us-east-2.amazonaws.com/";
		driver.get(url);
		driver.manage().window().fullscreen();Thread.sleep(2000);
	}
	
	@Test(enabled=true)
	public void a_frgtelementsTest() throws InterruptedException
	{
		cp.forgot.click();Thread.sleep(2000);
		Assert.assertEquals(cp1.clogo.isDisplayed() && cp1.clogo.getSize().width==161 && cp1.clogo.getSize().height==50, true);
		Assert.assertEquals(cp1.forgotpswrd.getText(), "Forgot Password?");
		Assert.assertEquals(cp1.email.getText(), "Email Address");
		Assert.assertEquals(cp1.emailplc.isDisplayed(), true);
		Assert.assertEquals(cp1.instructions.getText(), "Send Me Instructions");
		cp.emailplc.sendKeys("navneet@yopmail.com");Thread.sleep(2000);
		cp1.instructions.click();Thread.sleep(3000);
		Assert.assertEquals(cp1.clogo.isDisplayed() && cp1.clogo.getSize().width==161 && cp1.clogo.getSize().height==50, true);Thread.sleep(2000);
		Assert.assertEquals(cp1.ack1.isDisplayed(), true);Thread.sleep(2000);
		Assert.assertEquals(cp1.ack2.isDisplayed(), true);Thread.sleep(2000);
		Assert.assertEquals(cp1.ack3.isDisplayed(), true);
	}
	
	@Test(enabled=true)
	public void b_resetlink() throws InterruptedException
	{
		driver.get("http://www.yopmail.com/en/");Thread.sleep(5000);
		cp1.yopmail.sendKeys("navneet@yopmail.com");Thread.sleep(5000);
		cp1.yopmail1.click();Thread.sleep(5000);
		driver.switchTo().frame("ifmail");Thread.sleep(5000);
		reset = cp1.reset.getText();
	}
	
	@Test(enabled=true)
	public void resetpswrd() throws InterruptedException
	{
		driver.get(reset);Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeCompatio()
	{
		System.out.println("Testing Closed.");
		driver.quit();
		System.out.println("Browser Closed");
	}
	
}
