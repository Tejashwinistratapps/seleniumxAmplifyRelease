package com.xamplify.login;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ScheduleVideo extends VideoCampaign {
	// @AfterMethod  [for auto responses...comment @AfterTest annotation and use @Aftermethod , extends  AutoResponsesVideo]
	@AfterTest
	public void vschedule() throws InterruptedException, SQLException
	{
	driver.findElement(By.xpath(properties.getProperty("v_schedule_click"))).click();//click on schedule 
	Thread.sleep(5000);
	WebElement dateTable = driver.findElement(By.xpath(properties.getProperty("v_schdule_date")));//click on calendar
    dateTable.click();
    
  
    
    		WebElement we1=driver.findElement(By.xpath(properties.getProperty("v_schdule_selectdate")));//click on select date
    		we1.click();
	Thread.sleep(8000);
	
	
	driver.findElement(By.xpath(properties.getProperty("vschdule_date_hour"))).sendKeys("11");//send data in hours
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("vschdule_date_min"))).sendKeys("59");//send data in minutes
	Thread.sleep(5000);
	
	
WebElement country_drpdwn=driver.findElement(By.xpath(properties.getProperty("v_schedule_cntrydrpdwn")));//select country drop down
Select country1=new Select(country_drpdwn);
Thread.sleep(5000);
country1.selectByValue("103");
Thread.sleep(15000);
driver.findElement(By.xpath(properties.getProperty("v_schedule"))).click();//click on schedule
Thread.sleep(8000);

}

}
