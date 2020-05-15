package src.SpecialistPortal;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class AppointmentTest extends OverviewTest
{
	
	@Test(priority=5, dependsOnMethods={"over"})
	public void Appoint() throws InterruptedException, AWTException
	{
	    driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[2]/li")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        driver.findElement(By.xpath("//div[@class='main-content']/div/input[1]")).click();
	    driver.findElement(By.xpath("//div[@class='main-content']/div/input[1]")).sendKeys("Nithin Pushfierro");
	    Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//tr[@id='row_2391']/td[1]/a")).click();
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[2]/li")).click();
	    driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        driver.findElement(By.xpath("//tr[@id='row_2391']/td[6]/span/a[2]")).click();
        driver.findElement(By.xpath("//div[@id='patient_history']/div/div/div/p[2]/input[1]")).sendKeys("Password1");
        driver.findElement(By.xpath("//div[@id='patient_history']/div/div/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[1]/button"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        Thread.sleep(5000);
        WebElement ele = driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[2]/button"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='patient_history_download']/div/div/button")).click();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
         for(int i=1;i<=6;i++)
	    {
		    WebElement ele1 = driver.findElement(By.xpath("//li[@id='past_appointment_table_next']/a"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", ele1);
	    }    
	}
}
