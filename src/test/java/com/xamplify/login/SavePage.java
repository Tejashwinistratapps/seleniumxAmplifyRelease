package com.xamplify.login;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class SavePage extends PageCampaign {
	@AfterTest
	public void save() throws InterruptedException, SQLException
	{
		 	Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("p_save"))).click();//click on save
	 	Thread.sleep(4000);

	    driver.findElement(By.xpath(properties.getProperty("p_saved"))).click();	//click on save last

		
		
	}
}
