package src.SpecialistPortal;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SchedulesTest extends AppointmentTest 
{
	@Test(priority=6, dependsOnMethods={"Appoint"})
	public void schedule() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[3]/li")).click();
		driver.findElement(By.xpath("//div[@class='main-content']/div[1]/h2/a/i")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='jconfirm-closeIcon']")).click();
		Select From=new Select(driver.findElement(By.xpath("//select[@id='morning_start_1']")));
		From.selectByIndex(8);
		Select To=new Select(driver.findElement(By.xpath("//select[@id='morning_end_1']")));
		To.selectByIndex(18);
		Select Afternoon=new Select(driver.findElement(By.xpath("//select[@id='evening_start_1']")));
		Afternoon.selectByIndex(0);
		Select Too=new Select(driver.findElement(By.xpath("//select[@id='evening_end_1']")));
		Too.selectByIndex(14);
		driver.findElement(By.xpath("//tr[@id='tr_7']/td[4]/button")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-sub']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-can']")).click();
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs appointment-tabs tabs-2']/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='schedule-subtab1']/div/div/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td/span/a[1]")).click();
		driver.findElement(By.xpath("//div[@id='schedule-subtab1']/div/div/div/table/tbody/tr/td[2]/table/tbody/tr[1]/td/span/a[2]")).click();
		driver.findElement(By.xpath("//button[@id='3_62']")).click();
		driver.findElement(By.xpath("//button[@id='4_70']")).click();
		driver.findElement(By.xpath("//button[@id='4_71']")).click();
		driver.findElement(By.xpath("//button[@id='5_82']")).click();
		driver.findElement(By.xpath("//button[@id='5_79']")).click();
		driver.findElement(By.xpath("//button[@id='6_80']")).click();
		driver.findElement(By.xpath("//button[@id='6_87']")).click();
		driver.findElement(By.xpath("//div[@id='schedule-subtab1']/div/div/div/table/tbody/tr/td[7]/table/tbody/tr[1]/td/span/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='schedule-tab2']/div[1]/ul/li[2]/a")).click();
	    String month="May";
		String year="2020";
	    String date="29";
	    while(true){
	    String element = driver.findElement(By.xpath("//div[@id='schedule-subtab2']/div[1]/div/div[1]/div/p")).getText();
	   if(element.equals(month)) 
	   { 
		    String ele= driver.findElement(By.xpath("//div[@id='schedule-subtab2']/div[1]/div/div[1]/div/h3")).getText();
		   if(ele.equals(year))
	    	{
	    		break;
	    	}}
	    	else
	    	{
	    	
	    		driver.findElement(By.xpath("//div[@id='schedule-subtab2']/div[1]/div/div[1]/a[2]/span[2]")).click();		
	    	}
	    }
	   driver.findElement(By.xpath("//*[@id=\"schedule-subtab2\"]/div[1]/div/div[3]/div/div/a[contains(text(),"+date+")]")).click();
       Thread.sleep(3000);
	   Select From1=new Select(driver.findElement(By.xpath("//select[@id='morning_start']")));
       From1.selectByIndex(5);
       Select To1=new Select(driver.findElement(By.xpath("//select[@id='morning_end']")));
       To1.selectByIndex(17);
       Select Evg=new Select(driver.findElement(By.xpath("//select[@id='evening_start']")));
       Evg.selectByIndex(4);
       Select EvgTo=new Select(driver.findElement(By.xpath("//select[@id='evening_end']")));
       EvgTo.selectByIndex(18);
       driver.findElement(By.xpath("//table[@class='day-schedule']/tbody/tr[2]/td[1]/button")).click();
       driver.findElement(By.xpath("//table[@class='day-schedule']/tbody/tr[3]/td[4]/button")).click();
       driver.findElement(By.xpath("//table[@class='day-schedule']/tbody/tr[4]/td[5]/button")).click();
       driver.findElement(By.xpath("//div[@id='myModal']/div/div/div[2]/button[1]")).click();
       driver.findElement(By.xpath("//div[@id='myModal']/div/div/div[2]/button[2]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@id='myModal']/div/div/button")).click();    
	}		
}
