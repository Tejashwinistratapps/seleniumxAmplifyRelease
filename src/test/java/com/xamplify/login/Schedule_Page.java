package com.xamplify.login;

import java.sql.SQLException;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Schedule_Page extends PageCampaign {
	@AfterTest	
	public void schedule() throws InterruptedException, SQLException
	{
		
		driver.findElement(By.xpath(properties.getProperty("p_schedule"))).click();//click on now
	 	Thread.sleep(4000);
		JavascriptExecutor pjs1 = (JavascriptExecutor) driver;
		pjs1.executeScript("window.scrollTo(document.body.scrollHeight,0)");//to scroll down the page
	 	
	    WebElement we1=driver.findElement(By.xpath(properties.getProperty("psch_click")));//click on schedule button
		we1.click();
Thread.sleep(8000);
driver.findElement(By.xpath(properties.getProperty("psch_date_click1"))).click();//click on to get today date

Calendar calendar = Calendar.getInstance();

int hours = calendar.get(Calendar.HOUR_OF_DAY);

System.out.println(hours);
if(hours < 12  )
	
	
{
driver.findElement(By.xpath(properties.getProperty("psch_date_hour"))).sendKeys("1");
Thread.sleep(5000);
driver.findElement(By.xpath(properties.getProperty("psch_date_min"))).sendKeys("11");
Thread.sleep(5000);
}
else
{
	driver.findElement(By.xpath(properties.getProperty("psch_date_hour"))).sendKeys("11");
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("psch_date_min"))).sendKeys("59");
	Thread.sleep(5000);
}


WebElement pcountry_drpdwn=driver.findElement(By.xpath(properties.getProperty("pselect_country")));//select country
Select pcountry1=new Select(pcountry_drpdwn);
Thread.sleep(5000);
pcountry1.selectByValue("103");
Thread.sleep(15000);
driver.findElement(By.xpath(properties.getProperty("p_schedulelast"))).click();//schedule
Thread.sleep(8000);



		
		
	}

}
