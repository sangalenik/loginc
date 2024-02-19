package logintc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginfucntionality {
	WebDriver driver;
	
	public loginfucntionality(WebDriver driver)
	{
		this.driver=driver;
	}
	
   public void enter_Username(String UN)
   {
	   driver.findElement(By.id("username")).sendKeys(UN);
   }
	
   public void enter_password(String pw)
   {
	   driver.findElement(By.id("password")).sendKeys(pw);
   }
   
   public void submit()
   {
	   driver.findElement(By.id("submit")).click();
   }
}
