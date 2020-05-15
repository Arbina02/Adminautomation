package src.SpecialistPortal;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;	
     
  @Test(priority=1)
  public void Invalid() throws InterruptedException
		{
	    System.setProperty("Webdriver.gecko.driver", "");
		driver=new FirefoxDriver();
		driver.get("https://qa.accesselitenow.com/specialist/login");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("nm+qaopcp@conciergekeyhealth.com");
	    driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("password");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    Thread.sleep(2000);
	}
 
@Test(priority=2, dependsOnMethods={"Invalid"})
public void Forgotpassword() 
{
	driver.findElement(By.xpath("//form[@id='login_form_id']/p/a")).click();
	driver.findElement(By.xpath("//input[@id='forgot_password_email']")).sendKeys("nm+qaop@conciergekeyhealth.com");
	//driver.findElement(By.xpath("//button[@class='btn btn-sub']")).click();
    driver.findElement(By.xpath("//input[@value='Reset Password']")).click();	
}

@Test(priority=3, dependsOnMethods={"Forgotpassword"})
public void singin() throws InterruptedException
  {
	  driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("nm+qaopcp@conciergekeyhealth.com");
	  driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Password1");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  Thread.sleep(2000);
  }
  
}
