package src.SpecialistPortal;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ResourcesTest extends SearchTest
{
	@Test(priority=9, dependsOnMethods={"patients"})
	public void Resource() throws InterruptedException 
	{	
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[6]/li")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@class='btn loginbtn pricing_report_0']")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']/a/span")).click();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@id='reference']/div/div/div[2]/div[1]/div/div/video")).click();
		Thread.sleep(78000);  
	}

}