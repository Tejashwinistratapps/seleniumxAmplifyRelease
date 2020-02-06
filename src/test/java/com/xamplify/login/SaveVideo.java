package com.xamplify.login;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class SaveVideo extends VideoCampaign {
				// @AfterMethod  [for auto responses...comment @AfterTest annotation and use @Aftermethod , extends  AutoResponsesVideo]
	@AfterTest
	public void vsave() throws InterruptedException, SQLException
	{
		driver.findElement(By.xpath(properties.getProperty("v_testmail"))).click();//click on send test mail
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("v_mailid"))).sendKeys("gayatrialla11@gmail.com");//send data in the test mail field
		driver.findElement(By.xpath(properties.getProperty("vsubmit"))).click();//click submit
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("vok"))).click();//click ok
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(properties.getProperty("vsave1"))).click();//click save
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("vsave_spamcheck"))).click();//click spam check
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("vsave_insidespamcheck"))).click();//click again spam check
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("vsave_inside_refresh"))).click();//click refresh 
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("vsave_spam_close"))).click();//close spam check
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("vsaved"))).click();//click on save 
		Thread.sleep(5000);
	}

	
}
