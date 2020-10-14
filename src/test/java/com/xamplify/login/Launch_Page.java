package com.xamplify.login;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class Launch_Page extends PageCampaign{
	@AfterTest	
public void launch() throws InterruptedException, SQLException
{
	 	Thread.sleep(4000);

	driver.findElement(By.xpath(properties.getProperty("p_now"))).click();//click on now
 	Thread.sleep(4000);

    driver.findElement(By.xpath(properties.getProperty("p_nowlaunch"))).click();	//click on launch 

	
	
}

}
