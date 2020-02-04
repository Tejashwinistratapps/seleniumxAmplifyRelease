package com.xamplify.login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class PageCampaign {
	
	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("rdata.properties");//properties file
	//@BeforeMethod 
	@BeforeTest
	public void pcampaign() throws InterruptedException, SQLException {
		driver.get("https://release.xamplify.io/home/dashboard/welcome");

		Thread.sleep(5000);
		Properties properties = PropertiesFile.readPropertyFile("rdata.properties");

		WebDriverWait wait = new WebDriverWait(driver, 30);// Wait till the element is not visible
		
		WebElement pcampele = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("page_campaignhover"))));
		pcampele.click(); // hover on campaign

		Actions pcamp_action = new Actions(driver);
		pcamp_action.moveToElement(pcampele).perform();
		Thread.sleep(5000);
		WebElement create_pcampele = driver.findElement(By.xpath(properties.getProperty("page_createcampaign"))); //click on create campaign
		pcamp_action.moveToElement(create_pcampele);
		pcamp_action.click();
		pcamp_action.perform();
		Thread.sleep(5000);
		WebDriverWait waitc1= new WebDriverWait(driver, 40);
		WebElement popncamp = waitc1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("page_openecampaign")))); //select email campaign
		popncamp.click();
		List<String> campaignNames = new ArrayList<String>();
		String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
				properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString("campaign_name").toLowerCase());			//query,if campaign name already exists checking 
		}
		String campaignNameFromProp = properties.getProperty("pwrite_campaigname").toLowerCase();

		driver.findElement(By.id(properties.getProperty("pcampaignName")))
				.sendKeys(properties.getProperty("pwrite_campaigname"));
		Thread.sleep(5000);
		if (campaignNames.indexOf(campaignNameFromProp) > -1) {
			driver.findElement(By.id(properties.getProperty("pcampaignName"))).clear();
			driver.findElement(By.id(properties.getProperty("pcampaignName")))
					.sendKeys(properties.getProperty("pwrite_campaigname") + "_" + System.currentTimeMillis());
		}
		
		
		 	driver.findElement(By.xpath(properties.getProperty("p_through_campaign"))).click();//through campaign
		 	Thread.sleep(4000);
		    

		    driver.findElement(By.id(properties.getProperty("p_subject"))).sendKeys("subject for page");//send data to the subject field 
		 	Thread.sleep(4000);

		    driver.findElement(By.id(properties.getProperty("p_preheader"))).sendKeys("page-preheader");//send data to pre header
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_Notify_Me_emailon"))).click();//notify me when email on
		 	Thread.sleep(4000);
		 	
		    
		    driver.findElement(By.xpath(properties.getProperty("p_Notify_Me_link_opened"))).click();//notify me when link opened
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_Pushto"))).click();//push to marketo toggle on
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_Pushtomarketo"))).click();//select marketo check box
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_Pushtohubspot"))).click();//select hub spot check box
		 	Thread.sleep(4000);

		 	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");//to scroll down the page
		 	
		 	driver.findElement(By.xpath(properties.getProperty("p_next1"))).click();//next page 
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_partnerlist"))).click();//select partner list
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_partnerlist_preview"))).click();//preview of the partner list
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_partnerlist_preview_close"))).click();//close the preview of partner list
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_next2"))).click();//next page
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_template"))).click();//to select template
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_template_preview"))).click();//preview of the template
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_template_preview_close"))).click();//close the preview of the template
		 	Thread.sleep(4000);

		    driver.findElement(By.id(properties.getProperty("p_search"))).click();//search bar
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_search1"))).sendKeys("ga");//send data to the search bar
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_search1"))).sendKeys(Keys.ENTER);//click on enter in keyboard
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_next3"))).click();//clear the text in search bar
		 	Thread.sleep(4000);

		   
}
}