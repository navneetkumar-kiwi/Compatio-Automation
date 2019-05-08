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
	
	@Test(enabled=true)
	public void a_elementsTest() throws InterruptedException
	{
		Assert.assertEquals("Compatio", driver.getTitle());
		Assert.assertEquals(cp.clogo.isDisplayed() && cp.clogo.getSize().width==161 && cp.clogo.getSize().height==50, true);
	}
	
	@AfterMethod
	public void closeCompatio()
	{
		System.out.println("Testing Closed.");
		driver.quit();
		System.out.println("Browser Closed");
	}
	
}
