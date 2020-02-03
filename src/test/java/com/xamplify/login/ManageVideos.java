package com.xamplify.login;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManageVideos {

	Properties properties = PropertiesFile.readPropertyFile("rdata.properties");
	WebDriver driver = Instance.getInstance();

	@BeforeMethod
	public void managevideo_MouseHover() throws InterruptedException 
	{

		WebElement mousehver=driver.findElement(By.xpath("//a[@href='javascript:;']//i[@class='fa fa-cloud-upload']"));//hover_uploadcontent
		Actions act6=new Actions(driver);
		act6.moveToElement(mousehver).perform();
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//span[contains(text(),'Manage Videos')]")).click();//click on Manage videos
	}




	@Test(priority=21,enabled=true)
	public void managevideo_Edit() throws IOException, InterruptedException 
	{


		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("mv_edit_icon"))).click();		//click on edit icon
		Thread.sleep(6000);

		WebElement v_title=driver.findElement(By.xpath(properties.getProperty("mv_title")));	//add extra milliseconds to the title
		v_title.sendKeys( "_" + System.currentTimeMillis());

		Select dropdown = new Select(driver.findElement(By.xpath(properties.getProperty("mv_select_category"))));//to select category
		dropdown.selectByVisibleText("Technology (General)");//to select technology option
		Thread.sleep(5000);
		System.out.println("Technology (General) drop down selected");	

		WebElement Video_Tag = driver.findElement(By.xpath(properties.getProperty("mv_tags"))); //click on Tags field
		Video_Tag.sendKeys("Mountains11"); //to enter the text for tags
		Video_Tag.sendKeys(Keys.ENTER);	//click enter
		Thread.sleep(5000);

		WebElement Edit_radio=driver.findElement(By.xpath(properties.getProperty("mv_slct_scndradio")));//to select 2nd thumb nail
		Edit_radio.click();

		driver.findElement(By.xpath(properties.getProperty("mv_upld_thumnail"))).click();	//upload thumb nail 
		Thread.sleep(8000);
		Runtime.getRuntime().exec("D:\\Selenium\\Files\\Image1.exe"); //run the auto it file
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mv_vdeappearnce_clck"))).click();//click for video appearnace
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("mv_vdeappearnce_toggle_off"))).click();//toggle off 

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mv_vdeappearnce_toggle_on"))).click();//toggle on
		Thread.sleep(3000);//toggle on


		driver.findElement(By.xpath(properties.getProperty("mv_vdeappearnce_toggle_again_off"))).click();//toggle off 
		Thread.sleep(5000);//toggle off

		//due to call to action
		/*	driver.findElement(By.xpath("//h4[contains(text(),'Call to Action')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"callaction\"]/div[2]/div[1]/div/div/switch/div/div/span[3]")).click();
Thread.sleep(5000);	


WebElement uppervalue=driver.findElement(By.xpath("//textarea[@id='upperValue']"));
uppervalue.sendKeys("watch complete video");

WebElement lowervalue=driver.findElement(By.xpath("//textarea[@id='lowerValue']"));
lowervalue.sendKeys("tq");
Thread.sleep(5000);	

		 */

		//due to call to action
		driver.findElement(By.xpath(properties.getProperty("mv_toparrow_button"))).click();//click for go to top arrow
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("mv_saveorupdate"))).click();//either save or update button
		Thread.sleep(8000);

		String mv_responseMessage1=driver.findElement(By.xpath(properties.getProperty("mv_responseMessage"))).getAttribute("id");//response message after video is saved

		if(mv_responseMessage1.equals("responseMessage")) {
			System.out.println("video sucessfully done");
		}

		
	}

	@Test(priority=22,enabled=true)
	public void sortby_Create() throws IOException, InterruptedException
	{
		Thread.sleep(8000);

		Select dropdown_sort1 = new Select(driver.findElement(By.xpath(properties.getProperty("Sort_az"))));//a to z sort
		dropdown_sort1.selectByVisibleText("Title (A-Z)");
		Thread.sleep(8000);
		Select dropdown_sort2 = new Select(driver.findElement(By.xpath(properties.getProperty("Sort_za"))));//z to a sort
		dropdown_sort2.selectByVisibleText("Title (Z-A)");
		Thread.sleep(8000);
		Select dropdown_sort3 = new Select(driver.findElement(By.xpath(properties.getProperty("Sort_date_asc"))));//sort date asc
		dropdown_sort3.selectByVisibleText("Upload Date (ASC)");
		Thread.sleep(8000);
		Select dropdown_sort4 = new Select(driver.findElement(By.xpath(properties.getProperty("Sort_date_desc"))));//sort date desc
		dropdown_sort4.selectByVisibleText("Upload Date (DESC)");
		Thread.sleep(8000);

		Select dropdown_cat = new Select(driver.findElement(By.xpath(properties.getProperty("select_category"))));// select category drop down
		dropdown_cat.selectByVisibleText("Accounting");	

		Thread.sleep(8000);



		driver.findElement(By.xpath(properties.getProperty("mv_gridview"))).click();//click on grid view 
		Thread.sleep(8000);	

		driver.findElement(By.xpath(properties.getProperty("mv_Listview"))).click();//click on list view 
		Thread.sleep(8000);	
		driver.findElement(By.xpath(properties.getProperty("mv_crt_cmpgn"))).click();//click on create campaign icon

		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("mv_crt_cmpgn_check"))).isDisplayed();//check create campaign is displayed
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mv_cmpgn_home"))).click();//click on home
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mv_cmpgn_no"))).click();//Click on 'no' for not to save campaign 
		Thread.sleep(5000);

	}



	@Test(priority=23,enabled=true)
	public void manage_Video_Grid_Analytics_() throws IOException, InterruptedException 
	{
		Thread.sleep(7000);	
		driver.findElement(By.xpath(properties.getProperty("mv_gridview"))).click();//grid view
		Thread.sleep(8000);	

		Select dropdown_cat = new Select(driver.findElement(By.xpath(properties.getProperty("select_category"))));//select category
		dropdown_cat.selectByVisibleText("Accounting");	//to select accounting in drop down

		Thread.sleep(8000);

		Actions actions = new Actions(driver);

		WebElement analytics_hover=driver.findElement(By.xpath(properties.getProperty("mv_anlytcs_hover")));//hover on analytics icon
		Thread.sleep(9000);

		actions.moveToElement(analytics_hover).perform();
		analytics_hover.click();
		Thread.sleep(5000);


		driver.findElement(By.xpath(properties.getProperty("mv_anlytcs_hover_check"))).isDisplayed();//check whether analytics page is displayed
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mv_anlytcs_mngevdes"))).click();//back to manage videos
		Thread.sleep(5000);




	}




	@Test(priority=24,enabled=true)
	public void managevideo_delete() throws IOException, InterruptedException 
	{
		Thread.sleep(8000);	

		driver.findElement(By.xpath(properties.getProperty("mv_gridview"))).click();//grid view

		Thread.sleep(8000);	

		WebElement Video_search1 = driver.findElement(By.xpath(properties.getProperty("mv_gridview_search")));//to find search bar
		Video_search1.sendKeys("recorded");
		driver.findElement(By.xpath(properties.getProperty("mv_gridview_search_click"))).click();//to click on search after data entered
		Thread.sleep(8000);


		driver.findElement(By.xpath(properties.getProperty("mv_clr_srch"))).click();//clear the search bar

		Thread.sleep(8000);

		Select dropdown_sort4 = new Select(driver.findElement(By.xpath(properties.getProperty("Sort_date_asc"))));//sort date ascending
		dropdown_sort4.selectByVisibleText("Upload Date (ASC)");
		Thread.sleep(8000);




		Actions actions1 = new Actions(driver);

		WebElement delete_hover=driver.findElement(By.xpath(properties.getProperty("mv_dlticon_hover")));//hover on delete
		Thread.sleep(5000);
		System.out.println("1  1");

		actions1.moveToElement(delete_hover).perform();


		String s=delete_hover.getAttribute("title");

		if(s.equals("Delete video"))
		{

			Thread.sleep(9000);
			WebElement d=driver.findElement(By.xpath(properties.getProperty("mv_dlticon")));//click on delete icon
			System.out.println("1  1232");

			d.click();
			Thread.sleep(9000);

			driver.findElement(By.xpath(properties.getProperty("mv_dlticon_yes"))).click();//click on 'yes' to delete the video
			System.out.println("video deleted successfully");

		}
		else {
			System.out.println("1  3");

		}
		System.out.println("1  4");
		


	}

}
