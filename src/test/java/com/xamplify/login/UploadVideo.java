package com.xamplify.login;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadVideo
{
	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("rdata.properties");//properties file9999


	@BeforeMethod

	public void uploadvideo() throws InterruptedException, SQLException, IOException
	{
		driver.get("https://release.xamplify.io/home/dashboard");

		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));//mouse hover to content
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload_contentclick"))).click();//click on upload content
		Thread.sleep(8000);

	}

	@Test(priority=41,enabled=true)
	public void upload_browse() throws InterruptedException, IOException {


		//logger.debug("starting video browse");
		//driver.get("https://release.xamplify.io/home/videos/upload");
		//Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("vBrowse_click"))).click();//click on browse

		Thread.sleep(10000);

		Runtime.getRuntime().exec(properties.getProperty("AutoIt")); //to execute auto it file
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("vBrowse_Upload"))).click();//click on upload 
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("vBrowse_Home_click"))).click();//click on home 
		Thread.sleep(3000);
		//logger.debug(" video is processing");

		driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();//save the popup
		Thread.sleep(10000);
		///logger.debug("end video upload browse");

	}
	@Test(priority=42,enabled=true)
	public void upload_web() throws InterruptedException {

		/*Thread.sleep(3000);

		//logger.debug("starting record video from webcam");
		 */
		/*driver.get("https://release.xamplify.io/home/videos/upload");*/
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("webclick"))).click();//click on web
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("camclick"))).click();//click on camera icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("record"))).click();//click on record button
		Thread.sleep(11000);
		driver.findElement(By.xpath(properties.getProperty("stop"))).click();//click to stop the recording
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Upload')]")).click();//click on upload button
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("vBrowse_Home_click"))).click();//click on home 
		Thread.sleep(3000);
		//driver.navigate().refresh();

		//	driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();

		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();	
		//driver.findElement(By.xpath(properties.getProperty("crossclick"))).click();

		//logger.debug("end record video from webcam");
	}


	@Test(priority=43,enabled=true)
	public void upload_dropbox() throws InterruptedException {


		//Thread.sleep(3000);
		/*
	//	logger.debug("Starting select video from dropbox");
		 */
		/*driver.get("https://release.xamplify.io/home/videos/upload");*/
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("vdropbox_click"))).click();//click on dropbox

		Set<String> hashset = (HashSet<String>) driver.getWindowHandles();//to handle the windows
		List<String> list = new ArrayList<String>(hashset);//to get the lists 
		System.out.println(list.toString());

		Thread.sleep(5000);

		driver.switchTo().window(list.get(1));//to switch the current window
		System.out.println(list.get(1));

		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("vdropbox_signin"))).click();//sign in to drop box

		WebElement EmailidElement = driver.findElement(By.xpath(properties.getProperty("vdrop_box_username_click"))); //dropbox username to click 
		EmailidElement.sendKeys(properties.getProperty("vdrop_box_username"));//enter the username
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_next_click"))).click();//click for  next 

		Thread.sleep(3000);

		WebElement EmailpwdElement = driver.findElement(By.name(properties.getProperty("vdrop_box_pwd_click"))); //password field to click
		EmailpwdElement.sendKeys(properties.getProperty("vdrop_box_pwd"));//to enter the password
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_pwd_next"))).click();//click for next 

		Thread.sleep(8000);				

		driver.findElement(By.className(properties.getProperty("vdrop_box_item_select"))).click();
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_choose"))).click();//to click for selected video

		Thread.sleep(8000);

		driver.switchTo().window(list.get(0));//switch to window

		driver.findElement(By.xpath(properties.getProperty("vBrowse_Home_click"))).click();//click for home 
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();//save the popup
		Thread.sleep(5000);



	}


	/**
	 * @throws InterruptedException
	 */
	@Test(priority=44,enabled=true)
	public void upload_box() throws InterruptedException {


		/*


		//logger.debug("Starting select video from box");
		 */
		/*		driver.get("https://release.xamplify.io/home/videos/upload");
		 */		Thread.sleep(3000);
		 driver.findElement(By.xpath(properties.getProperty("vbox_click"))).click();//click for box

		 Set<String> hashset1 = (HashSet<String>) driver.getWindowHandles();//to handle the windows
		 List<String> list1 = new ArrayList<String>(hashset1);//get all the lists
		 System.out.println(list1.toString());

		 Thread.sleep(5000);

		 driver.switchTo().window(list1.get(1));//switch to the window
		 System.out.println(list1.get(1));

		 Thread.sleep(7000);

		 WebElement EmailidElement1 = driver.findElement(By.name(properties.getProperty("vbox_login"))); //click for box to login 
		 EmailidElement1.sendKeys(properties.getProperty("vbox_Username"));//to enter the user name for box

		 driver.findElement(By.xpath(properties.getProperty("vbox_login_submit"))).click();//next 

		 Thread.sleep(3000);

		 WebElement EmailpwdElement1 = driver.findElement(By.name(properties.getProperty("vbox_pwd_click"))); //click for password field
		 EmailpwdElement1.sendKeys(properties.getProperty("vbox_pwd"));//to enter the password  for box

		 driver.findElement(By.xpath(properties.getProperty("vbox_submit"))).click();//next

		 Thread.sleep(8000);

		 driver.findElement(By.xpath(properties.getProperty("vbox_filter"))).click();//click for filter 
		 Thread.sleep(4000);


		 driver.findElement(By.xpath(properties.getProperty("vbox_filter_clickdate"))).click();//click for date filter
		 Thread.sleep(8000);
		 driver.findElement(By.xpath(properties.getProperty("vbox_filter_clickdate_oldest"))).click();//click on oldest option
		 Thread.sleep(5000);
		 WebElement radio1=driver.findElement(By.xpath(properties.getProperty("vbox_item_radio")));//to choose the video
		 radio1.click();

		 driver.findElement(By.xpath(properties.getProperty("vbox_item_select"))).click();//selected video 

		 Thread.sleep(5000);

		 driver.switchTo().window(list1.get(0));//switch to the window


		 driver.findElement(By.xpath(properties.getProperty("vBrowse_Home_click"))).click();//click for home
		 Thread.sleep(3000);

		 driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();//popup to save
		 Thread.sleep(3000);
		 //driver.navigate().refresh();


		 //logger.debug("end select video from box");

	}


	@Test(priority=45,enabled=false)
	public void upload_gdrive() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("GD_click"))).click();//click for google drive
		Thread.sleep(5000);

		Set<String> hashset2 = (HashSet<String>) driver.getWindowHandles();//to handle the multiple windows
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

			Thread.sleep(3000);

			WebElement EmailidElement2 = driver.findElement(By.id(properties.getProperty("GD_username_click")));//click for username field
			EmailidElement2.sendKeys(properties.getProperty("GD_username"));//to enter data for username

			driver.findElement(By.xpath(properties.getProperty("GD_Next"))).click();//next to click 

			Thread.sleep(3000);

			WebElement PwdElement2 = driver.findElement(By.xpath(properties.getProperty("GD_pwd_click")));//click for password field
			PwdElement2.sendKeys(properties.getProperty(("GD_pwd")));//to enter data for password

			driver.findElement(By.xpath(properties.getProperty("GD_Next1"))).click();//next
			Thread.sleep(4000);
			driver.switchTo().window(list2.get(0));
			Thread.sleep(10000);

			driver.switchTo().frame(2);

			System.out.println("successfully switched the frame");
			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("GD_video"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("GD_video_select"))).click();
			//logger.debug("selecting the video from google drive completed");

			System.out.println("successfully uploaded the video from google drive");
		}
		else 
		{
			driver.switchTo().defaultContent();
			Thread.sleep(5000);

			driver.switchTo().frame(2);

			System.out.println("successfully switched the frame");
			Thread.sleep(8000);

			driver.findElement(By.xpath(properties.getProperty("GD_video"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("GD_video_select"))).click();
			System.out.println("successfully uploaded the video from google drive");
		}
		//logger.debug("selecting the video from google drive completed");
		Thread.sleep(3000);
		//driver.close();

	}
	/*


	driver.switchTo().alert().accept();

	 */

}




