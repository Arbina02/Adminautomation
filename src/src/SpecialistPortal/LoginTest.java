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
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.chrome.driver",path+"\\lib\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://qa.accesselitenow.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='elite-email']")).sendKeys("nm+qaopcp@conciergekeyhealth.com");
		driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Test(priority=2, dependsOnMethods={"Invalid"})
	public void Forgotpassword() throws InterruptedException 
	{
		driver.findElement(By.xpath("//p[@class='elite-forgot-pwd']/a")).click();
		driver.findElement(By.xpath("//input[@id='forgot_password_email']")).sendKeys("nm+qaop@conciergekeyhealth.com");
		//driver.findElement(By.xpath("//div[@class='modal-footer justify-content-center']/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='reset_password_form']/button")).click();
	}

	@Test(priority=3, dependsOnMethods={"Forgotpassword"})
	public void singin() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='elite-email']")).sendKeys("nm+qaopcp@conciergekeyhealth.com");
		driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

}
