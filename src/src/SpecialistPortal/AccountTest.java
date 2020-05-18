package src.SpecialistPortal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class AccountTest extends ResourcesTest
{
	@Test(priority=10, dependsOnMethods={"Resource"})
	public void Profile() throws InterruptedException, AWTException 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[2]/a[1]/li")).click();
		driver.findElement(By.xpath("//input[@id='user_middle_name']")).clear();
		Select gender=new Select(driver.findElement(By.xpath("//select[@id='user_gender']")));
		gender.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		String month="January 1993";
		String date="12";
		while(true){
			String element = driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]")).getText();
			if(element.equals(month)) 
			{ 
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[1]")).click();		
			}
		}
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td[contains(text(),"+date+")]")).click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);	
		driver.findElement(By.xpath("//input[@id='physician_account_details_phone_number']")).sendKeys("741-185-0147");
		Select Speciality=new Select(driver.findElement(By.xpath("//select[@id='user_physician_info_attributes_specialty_id']")));
		Speciality.selectByIndex(26);  
		Select Sub=new Select(driver.findElement(By.xpath("//select[@id='user_physician_info_attributes_sub_specialty_id']")));
		Sub.selectByIndex(0);
		driver.findElement(By.xpath("//a[@class='account-form-btn btn custom_btn add add_specialty_btn add_nested_fields']")).click();
		driver.findElement(By.xpath("//*[@id=\"health_detail\"]/div[1]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/a")).click();
		driver.findElement(By.xpath("//textarea[@id='user_physician_info_attributes_areas_of_expertise']")).sendKeys("Orthopedic, Dermatology,Acupunture");
		driver.findElement(By.xpath("//input[@id='user_title']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='user_instagram']")).sendKeys("test1");
		driver.findElement(By.xpath("//input[@id='user_facebook']")).sendKeys("test2");
		driver.findElement(By.xpath("//input[@id='user_twitter']")).sendKeys("test3");
		Select option=new Select(driver.findElement(By.xpath("//select[@id='insurance_company_list']")));
		option.selectByIndex(4);
		driver.findElement(By.xpath("//input[@id='user_physician_info_attributes_physician_educations_attributes_0_school']")).sendKeys("st.johns");
		driver.findElement(By.xpath("//input[@id='user_physician_info_attributes_physician_educations_attributes_0_degree']")).sendKeys("MBBS");
		driver.findElement(By.xpath("//input[@id='user_physician_info_attributes_physician_educations_attributes_0_year']")).sendKeys("1995");
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[4]/div[1]/a")).click();
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[4]/div[1]/div[2]/div/div/a")).click();
		driver.findElement(By.xpath("//input[@id='physician_internship']")).sendKeys("test4");
		driver.findElement(By.xpath("//input[@id='physician_residency']")).sendKeys("test3");
		driver.findElement(By.xpath("//input[@id='is_residency']")).click();
		driver.findElement(By.xpath("//input[@id='physician_fellowship']")).sendKeys("test5");
		driver.findElement(By.xpath("//input[@id='is_fellowship']")).click();
		driver.findElement(By.xpath("//a[@class='account-form-btn btn custom_btn add add1st add_nested_fields']")).click();
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[1]/div/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='user_board_certifications_attributes_0_description']")).sendKeys("yes");
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[2]/div/div/div/a")).click();
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[2]/div/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='user_professional_groups_attributes_0_description']")).sendKeys("Test3");
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[3]/div/div/div/a")).click();
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[3]/div/div/div/div[2]/a")).click();
		driver.findElement(By.id("user_physician_info_attributes_personal_statement")).sendKeys("test7");
		driver.findElement(By.id("user_physician_info_attributes_important_message_to_patients")).sendKeys("test8");
		//driver.findElement(By.xpath("//button[@class='btn btn-sub']")).click();
		driver.findElement(By.xpath("//button[@class='btn custom_btn submit_btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Mohan");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nm1@concierkeyhealth.com");
		driver.findElement(By.xpath("//input[@id='staff_phone_number']")).sendKeys("1236548790");
		driver.findElement(By.xpath("//div[@class='schedule-btn-group justify-content-center']/button[1]")).click();
		//driver.findElement(By.xpath("//div[@class='schedule-btn-group justify-content-center']/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/ul/li[3]/a")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.quit();    
	}
}