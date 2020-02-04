package com.xamplify.login;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadContent 
{


	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("rdata.properties");//properties file

	@BeforeMethod

	public void upload_Content() throws InterruptedException, SQLException, IOException
	{

		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));//hover to contentjj
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload_Click"))).click();//click for upload content
		Thread.sleep(10000);

		//Browse//


		driver.findElement(By.xpath(properties.getProperty("cBrowse_click"))).click();//browse to click

		Thread.sleep(3000);

		Runtime.getRuntime().exec(properties.getProperty("cAutoIt")); //to run auto it file
		System.out.println("successfully uploaded the Content from local");
		Thread.sleep(8000);
	}

	@Test(priority=56,enabled=true)
	public void upload_Dropbox() throws InterruptedException {


		//UploadClick-1//
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));//hover to content
		Actions act1 = new Actions(driver);
		act1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload_Click"))).click();//click for upload content
		Thread.sleep(5000);

		//DropBox//

		driver.findElement(By.xpath(properties.getProperty("cdropbox_click"))).click();//click for drop box

		Thread.sleep(5000);

		Set<String> hashset3 = (HashSet<String>) driver.getWindowHandles();//to handle all the windows
		List<String> list3 = new ArrayList<String>(hashset3);
		System.out.println(list3.toString());

		Thread.sleep(8000);

		driver.switchTo().window(list3.get(1));
		System.out.println(list3.get(1));

		Thread.sleep(5000);				

		driver.findElement(By.xpath(properties.getProperty("vdropbox_signin"))).click();//drop box sign in

		WebElement emailidElement = driver.findElement(By.xpath(properties.getProperty("vdrop_box_username_click"))); //user name for drop box
		emailidElement.sendKeys(properties.getProperty("vdrop_box_username"));//enter user name
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_next_click"))).click();//click next
		Thread.sleep(3000);
		WebElement EmailpwdElement = driver.findElement(By.name(properties.getProperty("vdrop_box_pwd_click"))); //password for drop box
		EmailpwdElement.sendKeys(properties.getProperty("vdrop_box_pwd"));//enter password
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_pwd_next"))).click();//click for next

		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("cdropbox_item_select"))).click();
		driver.findElement(By.xpath(properties.getProperty("cdrop_box_choose"))).click();//to click for selected item

		Thread.sleep(5000);

		driver.switchTo().window(list3.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("cdrop_box_after_home"))).click();//click for home
		System.out.println("successfully uploaded the Content from DropBox");
		Thread.sleep(5000);
	}

	@Test(priority=57,enabled=true)
	public void upload_Box() throws InterruptedException {


		//UploadClick-2//
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));//hover to content
		Actions act2 = new Actions(driver);
		act2.moveToElement(ele2).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload_Click"))).click();//click for upload content
		Thread.sleep(10000);

		//Box//
		driver.findElement(By.xpath(properties.getProperty("cbox_click"))).click();//click for Box

		Set<String> hashset4 = (HashSet<String>) driver.getWindowHandles();//to handle the windows
		List<String> list4 = new ArrayList<String>(hashset4);
		System.out.println(list4.toString());

		Thread.sleep(5000);

		driver.switchTo().window(list4.get(1));
		System.out.println(list4.get(1));

		Thread.sleep(12000);

		WebElement EmailidElement1 = driver.findElement(By.name(properties.getProperty("vbox_login"))); //login for box
		EmailidElement1.sendKeys(properties.getProperty("vbox_Username"));//entered data for user name 

		driver.findElement(By.xpath(properties.getProperty("vbox_login_submit"))).click();//next

		Thread.sleep(3000);

		WebElement EmailpwdElement1 = driver.findElement(By.name(properties.getProperty("vbox_pwd_click"))); //click for password
		EmailpwdElement1.sendKeys(properties.getProperty("vbox_pwd"));//enter data for password 

		driver.findElement(By.xpath(properties.getProperty("vbox_submit"))).click();//next

		Thread.sleep(12000);

		WebElement radio2=driver.findElement(By.xpath(properties.getProperty("cbox_item_radio")));
		radio2.click();

		driver.findElement(By.xpath(properties.getProperty("cbox_item_select"))).click();//selected item

		Thread.sleep(5000);

		driver.switchTo().window(list4.get(0));

		driver.findElement(By.xpath(properties.getProperty("cbox_after_home"))).click();//click for home
		System.out.println("successfully uploaded the Content from Box");
		Thread.sleep(10000);
	}

	@Test(priority=58,enabled=false)
	public void upload_Googledrive() throws InterruptedException {

		//UploadClick-2//
		Thread.sleep(3000);
		WebElement ele3 = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));
		Actions act3 = new Actions(driver);
		act3.moveToElement(ele3).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload_Click"))).click();
		Thread.sleep(10000);

		//GoogleDrive//
		driver.findElement(By.xpath(properties.getProperty("GD_Content_click"))).click();
		Thread.sleep(5000);

		Set<String> hashset2 = (HashSet<String>) driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(hashset2);
		System.out.println(list2.toString());
		System.out.println("size of current windows " + list2.size());
		if(Integer.valueOf(list2.size())==2) 
		{

			Set<String> hashset21 = (HashSet<String>) driver.getWindowHandles();
			List<String> list21 = new ArrayList<String>(hashset21);
			System.out.println(list21.toString());

			Thread.sleep(5000);

			driver.switchTo().window(list21.get(1));
			System.out.println("Google drive window" +list21.get(1));
			System.out.println("switched to googledrive window");
			Thread.sleep(3000);

			WebElement EmailidElement2 = driver.findElement(By.id(properties.getProperty("GD_username_click")));
			EmailidElement2.sendKeys(properties.getProperty("GD_username"));

			driver.findElement(By.xpath(properties.getProperty("GD_Next"))).click();

			Thread.sleep(3000);

			WebElement PwdElement2 = driver.findElement(By.xpath(properties.getProperty("GD_pwd_click")));
			PwdElement2.sendKeys(properties.getProperty(("GD_pwd")));

			driver.findElement(By.xpath(properties.getProperty("GD_Next1"))).click();
			Thread.sleep(4000);
			driver.switchTo().window(list2.get(0));
			Thread.sleep(10000);

			driver.switchTo().frame(2);

			System.out.println("successfully switched the frame");
			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("GD_content"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("GD_Content_select"))).click();
			System.out.println("successfully uploaded the Content from google drive");
		}
		else 
		{
			driver.switchTo().defaultContent();
			Thread.sleep(5000);

			driver.switchTo().frame(2);

			System.out.println("successfully switched the frame");
			Thread.sleep(8000);

			driver.findElement(By.xpath(properties.getProperty("GD_content"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("GD_Content_select"))).click();
			System.out.println("successfully uploaded the Content from google drive");
		}

		Thread.sleep(3000);
		driver.close();	

	}
}