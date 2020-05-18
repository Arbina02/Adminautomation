package src.SpecialistPortal;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class OverviewTest extends LoginTest {

	@Test(priority=4, dependsOnMethods={"singin"})
	public void over() throws AWTException, InterruptedException 
	{
		driver.findElement(By.xpath("//div[@id='main_content']/div[2]/div/div/div[1]/div/p[2]/a")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@id='specialistAgreementModal']/div/div/button")).click();
		try {
			driver.findElement(By.xpath("//div[@class='announcements']/div/div[2]/div/p[2]/a")).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@class='announcements']/div/div[2]/div/p[2]/a")));
		}
		Thread.sleep(1000);
		driver.get("https://qa.accesselitenow.com/specialists/resources");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[1]/li")).click();
		driver.findElement(By.xpath("//div[@class='side-head-sec margin-t30'][1]/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='main_content']/p[1]/a")).click();
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[1]/li")).click();
		driver.findElement(By.xpath("//div[@id='main_content']/div[7]/p/a")).click();
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[1]/li")).click();
		driver.findElement(By.xpath("//input[@id='search_patients']")).click();
		driver.findElement(By.xpath("//input[@id='search_patients']")).sendKeys("simple");
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='main_content']/p[2]/a")).click();
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[1]/li")).click();

	} 
}
