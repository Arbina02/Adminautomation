package src.SpecialistPortal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class PatientTest extends SchedulesTest
{
	@Test(priority=7, dependsOnMethods={"schedule"})
	public void patients() throws InterruptedException, AWTException 
	{	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[4]/li")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='head-level-search']")).click();
		driver.findElement(By.xpath("//input[@class='head-level-search']")).sendKeys("Nithin");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[1]/a/img")).click();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[2]/a/img")).click();
		driver.findElement(By.xpath("//div[@class='jconfirm-buttons']/button")).click();
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[3]/a/img")).click();	
		driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[1]/button")).click();
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[2]/button")).click();
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@id='patient_history_download']/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[4]/a/img")).click();
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@id='check_password_button']")).click();
		driver.findElement(By.xpath("//div[@class='modal fade forgot-modal show']/div/div/div[2]/a[1]/button")).click();
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@class='modal fade forgot-modal show']/div/div/div[2]/a[2]/button")).click();
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@class='modal fade forgot-modal show']/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[5]/a/img")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/p[1]/a"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[4]/li")).click();
}
}