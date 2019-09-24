package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pageObjectClasses.forgot_pom;
import pageObjectClasses.login_pom;
import pageObjectClasses.request_pom;

public class request_test 
{
	public WebDriver driver;
	login_pom cp;
	forgot_pom cp1;
	request_pom cp2;
	
	@BeforeMethod
	public void launchCompatio() throws InterruptedException
	{
		driver = DriverClass.set();
		cp2 = new request_pom(driver);
		driver.get("http://gms-qa-app.s3-website.us-east-2.amazonaws.com/");
		driver.manage().window().fullscreen();Thread.sleep(2000);
	}
	
	@Test(enabled=true)
	public void a_frgtelementsTest() throws InterruptedException
	{
		cp2.rqstaccess.click();Thread.sleep(2000);
		Assert.assertEquals(cp2.clogo.isDisplayed() && cp2.clogo.getSize().width==161 && cp2.clogo.getSize().height==50, true);
		Assert.assertEquals(cp2.rqstaccesstext.isDisplayed(), true);
		Assert.assertEquals(cp2.rqstaccesscontent.isDisplayed(), true);
		Assert.assertEquals(cp2.firstname.isDisplayed(), true);
	}
	
	@Test(enabled=false)
	public void a_frgtelementsTest1() throws InterruptedException
	{
		
	}
	
	@AfterMethod
	public void closeCompatio()
	{
		System.out.println("Testing Closed.");
		driver.quit();
		System.out.println("Browser Closed");
	}
	
}
