package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import logintc.loginfucntionality;


public class loginpage {
	WebDriver driver;
	
	@BeforeClass
	public void browser() 
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		}

	
	
	@Test
	public void logintoapp() throws InterruptedException
	{
		loginfucntionality lf =new loginfucntionality(driver);
		lf.enter_Username("student");
		lf.enter_password("Password123");
		Thread.sleep(2000);
		lf.submit();
		String t =driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]")).getText();
		Assert.assertEquals("Logged In Successfullyh", t);
	}
}
