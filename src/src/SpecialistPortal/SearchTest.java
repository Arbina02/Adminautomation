package src.SpecialistPortal;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchTest extends PatientTest
{
	@Test(priority=8, dependsOnMethods={"patients"})
	public void Specialist()
	{	
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[5]/li")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[1]/p")).click();
		WebElement radio = driver.findElement(By.xpath("//input[@id='13']"));
		radio.click();
		WebElement radio1 = driver.findElement(By.xpath("//input[@name='180']"));
		radio1.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[1]/p")).click();
		driver.findElement(By.xpath("//input[@id='location']")).sendKeys("Santa Ana");
		driver.findElement(By.xpath("//input[@id='physician_infos_name']")).sendKeys("Dr.Test Remote");
		driver.findElement(By.xpath("//input[@id='insurance_carrier']")).sendKeys("Aetna");
		driver.findElement(By.xpath("//img[@id='search_specialists']")).click();	
	}
}