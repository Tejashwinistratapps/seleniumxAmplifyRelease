package com.xamplify.login;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ManageCampagins {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("rdata.properties");

	@Test(priority =301, enabled = true)

	public void manage_campaign() throws InterruptedException {
		Thread.sleep(5000);
		/*
		 * driver.get("https://release.xamplify.io/home/dashboard/welcome");
		 * Thread.sleep(5000);
		 */
		WebElement mng_cmpgn = driver.findElement(By.xpath(properties.getProperty("campaignhover1")));
		Thread.sleep(5000);
		Actions camp_action = new Actions(driver);
		camp_action.moveToElement(mng_cmpgn).perform();
		driver.findElement(By.xpath(properties.getProperty("managecampaign"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("memail"))).click();
		Thread.sleep(5000);
		System.out.println("email clicked");
		driver.findElement(By.xpath(properties.getProperty("mvideo"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("msocial"))).click();
		Thread.sleep(5000);
		System.out.println("social clicked");
		driver.findElement(By.xpath(properties.getProperty("mall"))).click();
		Thread.sleep(5000);
		System.out.println("all clicked");
		
		driver.findElement(By.xpath(properties.getProperty("mcalendarview"))).click();
		Thread.sleep(5000);
		System.out.println("calendar clicked");
		
		driver.findElement(By.xpath(properties.getProperty("mcalendar_weekview"))).click();
		Thread.sleep(5000);
		System.out.println("calendar week clicked");
		driver.findElement(By.xpath(properties.getProperty("mcalendar_dayview"))).click();
		Thread.sleep(5000);
		System.out.println("calendar day clicked");
			driver.get("https://release.xamplify.io/home/campaigns");
			driver.findElement(By.xpath(properties.getProperty("mgridview"))).click();
			Thread.sleep(5000);
			
		System.out.println("grid clicked");
		driver.findElement(By.xpath(properties.getProperty("mlistview"))).click();
		Thread.sleep(5000);
		System.out.println("list clicked");
		WebElement ele_drpdwn = driver.findElement(By.xpath(properties.getProperty("msortby")));
		Select sort = new Select(ele_drpdwn);
		Thread.sleep(5000);
		sort.selectByIndex(1);
		Thread.sleep(6000);
		sort.selectByIndex(2);
		Thread.sleep(6000);
		sort.selectByIndex(3);
		Thread.sleep(5000);
		sort.selectByIndex(4);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("msearchdata"))).sendKeys("Automation_v");
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("msearchicon"))).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("cmpgnbasedreport"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_vdepreview"))).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("mc_vdeclosepreview"))).click();

		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("mc_emailpreview"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("mc_emailclose"))).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("mc_partnerlistpreview"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("mc_partnerlistclosepreview"))).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("mc_tot_receipents"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_tr_exporticon"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_tr_exporticon_click"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_tr_search"))).sendKeys("gayatri");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_tr_searchclick"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_tot_receipentsclose"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_act_receipents"))).click();
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("mc_act_exporticon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mc_act_exporticonclick"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_actr_search"))).sendKeys("gayatri");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_actr_searchclick"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mc_act_receipentsclose"))).click();
		Thread.sleep(3000);
		driver.get("https://release.xamplify.io/home/campaigns/manage");
		driver.findElement(By.xpath(properties.getProperty("msearchdata"))).sendKeys("Deploy Test Email Thro");
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("msearchicon"))).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("mc_settingsicon1"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_preview"))).click();

		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("mc_preview_close"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_settingsicon1"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_cpycampaign"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mc_cpy_cmpgn_save"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_settingsicon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mc_drft_delete"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_s_delete"))).click();
		Thread.sleep(5000);

	}

}
