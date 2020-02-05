package com.xamplify.login;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ManagePageCampaign {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("rdata.properties");


	@Test(priority=411,enabled=true)
	public void search_Copy_Edit_Preview_Delete() throws InterruptedException {


		driver.get("https://release.xamplify.io/home/dashboard");
		driver.findElement(By.xpath(properties.getProperty("page_hover"))).click();//hover
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_manage_hover"))).click();//manage
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("page_tab"))).click();//page
		Thread.sleep(3000);
		/*driver.findElement(By.xpath(properties.getProperty("page_gridview"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_listview"))).click();

		Thread.sleep(4000);*/
		driver.findElement(By.xpath(properties.getProperty("page_search"))).click();//search
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_search"))).sendKeys("pagec1");//send data
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_search_click"))).click();//click on search
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_gearicon"))).click();//gear icon
		Thread.sleep(3000);
		driver.findElement(By.linkText("Copy Campaign")).click();//copy camp
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_cpy_save"))).click();//save
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_gearicon"))).click();//gear
		Thread.sleep(3000);
		driver.findElement(By.linkText("Edit")).click();//edit
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_click_ManageCampaigns"))).click();//click on manage campaigns
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_click_ManageCampaigns_no"))).click();//click on no
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_gearicon"))).click();//gear icon
		Thread.sleep(3000);
		driver.findElement(By.linkText("Preview Campaign")).click();//preview
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("page_preview1"))).click();//click inside preview
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("close_page_preview1"))).click();//close preview
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("close_preview_campagin"))).click();//close other preview
		Thread.sleep(3000);


		driver.findElement(By.xpath(properties.getProperty("page_gearicon"))).click();//gear icon
		Thread.sleep(3000);

		driver.findElement(By.linkText("Delete")).click();//delete
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_yes_delete"))).click();//yes



	}
	@Test(priority=412,enabled=true)
	public void sortby_previewdelete() throws InterruptedException {
		Thread.sleep(5000);


		driver.get("https://release.xamplify.io/home/campaigns/manage");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_gearicon_third"))).click();//gear icon for third page campaign
		Thread.sleep(3000);
		JavascriptExecutor js_down = (JavascriptExecutor) driver;
		js_down.executeScript("window.scrollTo(0,100)");
		Thread.sleep(5000);


		driver.findElement(By.xpath(properties.getProperty("page_preivewdelete_partner"))).click();//click on preview & delete partner 

		Thread.sleep(3000);

		new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown")))).selectByVisibleText("Email ID(A-Z)");//sort email id A to Z

		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown")))).selectByVisibleText("Email ID(Z-A)");//sort email id Z to A
		Thread.sleep(3000);

		new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown")))).selectByVisibleText("First Name(ASC)");//sort First name ascending
		Thread.sleep(3000);

		new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown")))).selectByVisibleText("First Name(DESC)");//sort First name descending
		Thread.sleep(3000);

		new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown")))).selectByVisibleText("Last Name(ASC)");//sort Last name ascending
		Thread.sleep(3000);

		new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown")))).selectByVisibleText("Last Name(DESC)");//sort Last name descending
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_previewdelete_search"))).click();//search
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_previewdelete_search"))).sendKeys("gayatri");//data sent in search bar
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_previewdelete_search"))).sendKeys(Keys.ENTER);//click enter
		Thread.sleep(3000);

		String s=driver.findElement(By.xpath(properties.getProperty("page_aftersearch_getext"))).getText();//get the text11
		System.out.println(s);

		String Excepted="No Data Found.";


		if(s.equals(Excepted)) {
			Thread.sleep(3000);
			System.out.println("unable to delete the partner because already it is deleted/not there in the list");
			driver.findElement(By.xpath(properties.getProperty("page_clck_managecampaigns"))).click();//click on manage campaigns


		}


		else {

			driver.findElement(By.xpath(properties.getProperty("page_previewdeletepartner_delete"))).click();//click for delete 
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("page_previewdeletepartner_yesdelete"))).click();//click for yes delete
			Thread.sleep(3000);
			System.out.println("Deleted Partner successfully from the campaign");

			driver.findElement(By.xpath(properties.getProperty("page_clck_managecampaigns"))).click();//click on manage campaigns
			Thread.sleep(3000);
		}


	}
	@Test(priority=413,enabled=true)
	public void grid_Analytics() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://release.xamplify.io/home/campaigns/manage");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_gridview"))).click();//click for grid view
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_search"))).sendKeys("pagec11");//send data
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_search_click"))).click();//click after data is entered
		Thread.sleep(3000);

		WebElement we1=driver.findElement(By.xpath(properties.getProperty("page_hover_cmpgnbasedreports")));//hover on campaign based reports

		Actions mpaction_hover=new Actions(driver);

		mpaction_hover.moveToElement(we1).perform();
		Thread.sleep(4000);



		driver.findElement(By.xpath(properties.getProperty("page_hover_cmpgnbasedreports_click"))).click();//click on campaign based reports
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_info_preview"))).click();//page info
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("page_info_preview_close"))).click();//page info close
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_partnerlist_click"))).click();//partner list info
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_partnerlist_close"))).click();//partner list info close
		Thread.sleep(3000);


		driver.findElement(By.xpath(properties.getProperty("page_recipients"))).click();//click for recipients
		Thread.sleep(3000);


		driver.findElement(By.xpath(properties.getProperty("page_recipients_search"))).sendKeys("gayatri");//send data into search bar
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_recipients_search_click"))).click();//click after data entered in search bar
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_recipients_search_click_clear"))).click();//clear the search bar
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_recipients_gearicon"))).click();//click on gear icon
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_recipients_exportoexcel"))).click();//click on export to excel
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_recipients_close"))).click();//close the recipients
		Thread.sleep(3000);


		driver.findElement(By.xpath(properties.getProperty("page_inside_search"))).sendKeys("gayatri");//send data to search
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_inside_search_click"))).click();//click after data entered in search bar

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("page_inside_search_click_clear"))).click();//clear the  search bar

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_inside_gearicon"))).click();//click for gear icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("page_inside_export"))).click();//click on export to excel icon



	}


}







