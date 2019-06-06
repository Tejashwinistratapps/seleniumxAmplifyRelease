package com.xamplify.login;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Emailcampaign {

	

	 WebDriver driver = Instance.getInstance();
	 
		Properties properties = PropertiesFile.readPropertyFile("datafile.properties");
		

		@BeforeMethod
		
		public void ecampaign() throws InterruptedException, SQLException
		{
			driver.get("https://release.xamplify.io/home/dashboard/welcome");

			
			
						Thread.sleep(15000);
						Properties properties = PropertiesFile.readPropertyFile("datafile.properties");

						Thread.sleep(10000);
						WebElement campele=driver.findElement(By.xpath(properties.getProperty("e_campaignhover")));
																		
																				
						Actions camp_action=new Actions(driver);
						 camp_action.moveToElement(campele).perform();
						 Thread.sleep(5000);
						 WebElement create_campele= driver.findElement(By.xpath(properties.getProperty("e_createcampaign")));
						 camp_action.moveToElement(create_campele);
						 camp_action.click();
						 camp_action.perform();
						Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("e_openecampaign"))).click();		
					Thread.sleep(5000);
					
					List<String> campaignNames = new ArrayList<String>();
					String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",properties.getProperty("user.name"));
					ResultSet resultSet = DatabaseConnection.getResultSet(query);
					while (resultSet.next()) {
						campaignNames.add(resultSet.getString("campaign_name").toLowerCase());
					}
					String campaignNameFromProp = properties.getProperty("ewrite_campaign").toLowerCase();
					
					driver.findElement(By.id(properties.getProperty("ecampaignName"))).sendKeys(properties.getProperty("ewrite_campaign"));	
					Thread.sleep(5000);
					if(campaignNames.indexOf(campaignNameFromProp)>-1) {
						driver.findElement(By.id(properties.getProperty("ecampaignName"))).clear();
						driver.findElement(By.id(properties.getProperty("ecampaignName"))).sendKeys(properties.getProperty("ewrite_campaign")+"_"+System.currentTimeMillis());	
					}
					Thread.sleep(3000);								
				/*driver.findElement(By.xpath(properties.getProperty("through_partner"))).click();
					Thread.sleep(3000);	*/																				//through partner//		
					driver.findElement(By.name(properties.getProperty("subjectline"))).sendKeys("subject line:-)...");
					driver.findElement(By.name(properties.getProperty("preheader"))).sendKeys("preHeader.:-0)");
					//driver.findElement(By.className(properties.getProperty("notifyme"))).click();									
					driver.findElement(By.id(properties.getProperty("next"))).click();								
					Thread.sleep(5000);
					
					driver.findElement(By.xpath(properties.getProperty("e_prtnrlst_srch"))).sendKeys("g3 testing mails");
					Thread.sleep(5000);
					
					
					driver.findElement(By.xpath(properties.getProperty("esrch_slct_prtnrlst_clck"))).click();										
					Thread.sleep(5000);
					
					
					driver.findElement(By.xpath(properties.getProperty("eslct_prtnrlst"))).click();										
					Thread.sleep(8000);
					
					
					driver.findElement(By.xpath(properties.getProperty("epartnerlist_preview"))).click();		
					Thread.sleep(5000);
					
					/*	WebElement  c1=driver.findElement(By.xpath(properties.getProperty("eprtnr_prvwpagenation")));

				 for(int a=0;a<=6;a++) {
						  driver.findElement(By.xpath(properties.getProperty("eprtnr_prvwpagenation"))).click();
							Thread.sleep(3000);
						 }
					*/
					 
					 
					 
					/* 
					 WebElement eg = driver.findElement(By.xpath(properties.getProperty("eplist")));
							 List<WebElement> links = eg.findElements(By.tagName("li"));
							 for (int i = 0; i <= links.size()+2; i++)
							 {
								 System.out.println(i);
								// System.out.println(links.size());
							   //  System.out.println(links.get(i).getText());
							  

								 WebElement  c1=driver.findElement(By.xpath(properties.getProperty("eprtnr_prvwpagenation")));
								 c1.click();
								 Thread.sleep(2000);
								 System.out.println(i +"clicked");
										 	
							 
							 } 
				
	
					Thread.sleep(5000);*/
					driver.findElement(By.xpath(properties.getProperty("eclose_partnerpreview"))).click();	
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("enext2"))).click();						
				Thread.sleep(10000);

				/*JavascriptExecutor js = (JavascriptExecutor) driver;
					  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
					  
					 Thread.sleep(8000);
					
					WebElement eg1 = driver.findElement(By.xpath(properties.getProperty("eplist2")));
					 List<WebElement> links1 = eg1.findElements(By.tagName("li"));
					 for (int j = 1; j <= links1.size()-2; j++)
					 {
						 System.out.println(j);
						System.out.println(links1.size());
					    System.out.println(links1.get(j).getText());
					  

						 WebElement  c2=driver.findElement(By.xpath(properties.getProperty("epagenation")));
						 Thread.sleep(10000);
						 c2.click();
						 Thread.sleep(9000);
						 System.out.println(j +"clicked");
								 	
					 
					 } */
	
					 Thread.sleep(3000);
					driver.findElement(By.xpath(properties.getProperty("egoto_top"))).click();
					Thread.sleep(3000);
				
					
					driver.findElement(By.xpath(properties.getProperty("ebasic_tmplt"))).click();
					Thread.sleep(8000);
					
					driver.findElement(By.xpath(properties.getProperty("eupld_tmplt"))).click();
					Thread.sleep(8000);

					driver.findElement(By.xpath(properties.getProperty("erglr_tmplt"))).click();
					Thread.sleep(8000);
					driver.findElement(By.xpath(properties.getProperty("eall_tmplt"))).click();
					Thread.sleep(8000);
					
				driver.findElement(By.xpath(properties.getProperty("esrch_tmplt"))).sendKeys("basicEcomTemp");			
				Thread.sleep(5000);
				

				driver.findElement(By.xpath(properties.getProperty("esrch_tmplt_clck"))).click();
				Thread.sleep(8000);
				
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				  js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				  Thread.sleep(5000);

					JavascriptExecutor js11 = (JavascriptExecutor) driver;
					  js11.executeScript("window.scrollTo(0,document.body.scrollHeight)");
					  Thread.sleep(8000);
				driver.findElement(By.xpath(properties.getProperty("esrch_tmplt_slct_last"))).click();
				Thread.sleep(11000);
				
				driver.findElement(By.xpath(properties.getProperty("esrch_tmplt_clck_clr_srch"))).click();
				Thread.sleep(5000);
				
				
				driver.findElement(By.xpath(properties.getProperty("eselect_template"))).click();
				Thread.sleep(8000);
				
				driver.findElement(By.xpath(properties.getProperty("etemplate_prvw"))).click();
				Thread.sleep(5000);

				driver.findElement(By.xpath(properties.getProperty("etemplate_prvw_cls"))).click();
				Thread.sleep(5000);
				
				
				
					driver.findElement(By.xpath(properties.getProperty("next31"))).click();
					Thread.sleep(5000);
					
			}
			

				@Test(priority=30,enabled=true)
				public void email_savetest() throws InterruptedException {
					
					driver.findElement(By.xpath(properties.getProperty("autorespone1"))).click();
					Thread.sleep(5000);
				WebElement ele_drpdwn=driver.findElement(By.xpath(properties.getProperty("drp_dwn_click")));
				//rdrpdwn.click();
				Select when_to_send_email=new Select(ele_drpdwn);
				Thread.sleep(5000);
				when_to_send_email.selectByValue("20");
				Thread.sleep(15000);
				
		driver.findElement(By.name("subject")).sendKeys("subject line:send immediately after clicked");
				Thread.sleep(5000);
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
				driver.findElement(By.xpath("html/body")).click();
				driver.switchTo().activeElement().sendKeys("Hello:send immediately after clicked,thanku for clicking immediately");

				driver.switchTo().defaultContent();
				
				
				driver.findElement(By.xpath(properties.getProperty("save"))).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath(properties.getProperty("testmail"))).click();
				
				Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mailid"))).sendKeys("agayatri@stratapps.com");
				
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("submit"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("ok"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("save2"))).click();
				Thread.sleep(8000);

				}
				
				
				@Test(priority=31,enabled=true)
				public void email_now() throws InterruptedException {
					
					driver.findElement(By.xpath(properties.getProperty("autorespone1"))).click();
					Thread.sleep(5000);
				WebElement ele_drpdwn=driver.findElement(By.xpath(properties.getProperty("drp_dwn_click")));
				
				driver.findElement(By.xpath(properties.getProperty("subject2"))).sendKeys("subject line2:send if not clicked");
				Thread.sleep(5000);
			
				driver.switchTo().defaultContent();
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
				driver.findElement(By.xpath("html/body")).click();
				driver.switchTo().activeElement().sendKeys("Hello,send if not clicked:please click the mail");

				driver.switchTo().defaultContent();
				
				
				driver.findElement(By.xpath(properties.getProperty("now_campaign"))).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath(properties.getProperty("now_launch"))).click();
				
				Thread.sleep(5000);


				}
				
				
				
				@Test(priority=32,enabled=true)
				public void email_schedule() throws InterruptedException {
					
					driver.findElement(By.xpath(properties.getProperty("autorespone1"))).click();
					Thread.sleep(5000);
				WebElement ele_drpdwn=driver.findElement(By.xpath(properties.getProperty("drp_dwn_click")));
				//rdrpdwn.click();
				Select when_to_send_email=new Select(ele_drpdwn);
				Thread.sleep(5000);
				when_to_send_email.selectByValue("21");
				Thread.sleep(15000);
				driver.findElement(By.xpath(properties.getProperty("email_xdays"))).sendKeys("1");
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("subject3"))).sendKeys("subject3:schedule");
				Thread.sleep(5000);
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
				driver.findElement(By.xpath("html/body")).click();
				driver.switchTo().activeElement().sendKeys("Hello:campgin is scheduled for 1 day...");

				driver.switchTo().defaultContent();
				
				
				
				/*driver.findElement(By.xpath(properties.getProperty("evselect_temp"))).click();
				Thread.sleep(5000);*/
				driver.findElement(By.xpath(properties.getProperty("email_schedule_click"))).click();
				Thread.sleep(5000);
				
			
				
				
				driver.findElement(By.xpath(properties.getProperty("select_date"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("nxt_mnth_clck"))).click();
				Thread.sleep(5000);

				

				driver.findElement(By.xpath(properties.getProperty("date_click"))).click();
				Thread.sleep(5000);
				
				WebElement country_drpdwn=driver.findElement(By.xpath(properties.getProperty("select_country")));
				Select country1=new Select(country_drpdwn);
				Thread.sleep(5000);
				country1.selectByValue("238");
				Thread.sleep(15000);
				driver.findElement(By.xpath(properties.getProperty("email_schedulelast"))).click();
				Thread.sleep(5000);

				}
				
				

				@Test(priority=33,enabled=true)
					public void email_savetest1() throws InterruptedException {

					driver.findElement(By.xpath(properties.getProperty("email_visit_email"))).click();
					Thread.sleep(5000);
					WebElement rdrpdwn=driver.findElement(By.xpath(properties.getProperty("eresponse_drpdwn")));
					//rdrpdwn.click();
					Select reason=new Select(rdrpdwn);
					Thread.sleep(5000);
					reason.selectByValue("13");
					Thread.sleep(15000);
					driver.findElement(By.xpath(properties.getProperty("evsubject"))).sendKeys("subject:email is opened");
					Thread.sleep(5000);
					
					driver.switchTo().defaultContent();
					driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
					driver.findElement(By.xpath("html/body")).click();
					driver.switchTo().activeElement().sendKeys("Hello:email is opened,thanku for opening email");

					driver.switchTo().defaultContent();
					
					/*driver.findElement(By.xpath(properties.getProperty("evselect_temp"))).click();
					Thread.sleep(5000);*/
					driver.findElement(By.xpath(properties.getProperty("evsave_click"))).click();
					Thread.sleep(5000);
					
					driver.findElement(By.xpath(properties.getProperty("evsave"))).click();
					Thread.sleep(5000);
					

					}
					
					
					@Test(priority=34,enabled=true)
					public void email_now1() throws InterruptedException {

						driver.findElement(By.xpath(properties.getProperty("email_visit_email"))).click();
						Thread.sleep(5000);
					WebElement rdrpdwn=driver.findElement(By.xpath(properties.getProperty("eresponse_drpdwn")));
					//rdrpdwn.click();
					Select reason=new Select(rdrpdwn);
					Thread.sleep(5000);
					reason.selectByValue("0");
					Thread.sleep(15000);
					driver.findElement(By.xpath(properties.getProperty("evreply_xdays"))).sendKeys("2");
					Thread.sleep(5000);
					
					
					driver.findElement(By.xpath(properties.getProperty("evsubject2"))).sendKeys("email not opened in 2 days-)");
					Thread.sleep(5000);
					/*driver.findElement(By.xpath(properties.getProperty("evselect_temp2"))).click();
					Thread.sleep(5000);*/
					
					driver.switchTo().defaultContent();
					driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
					driver.findElement(By.xpath("html/body")).click();
					driver.switchTo().activeElement().sendKeys("Hello:email is not opened for 2 days;please open the email");

					driver.switchTo().defaultContent();
					
					driver.findElement(By.xpath(properties.getProperty("evnow_click"))).click();
					Thread.sleep(5000);
					
					driver.findElement(By.xpath(properties.getProperty("evnow_launch"))).click();
					Thread.sleep(5000);
					

					}
					

					@Test(priority=35,enabled=true)
					public void email_schedule1() throws InterruptedException {
						

						driver.findElement(By.xpath(properties.getProperty("email_visit_email"))).click();
						Thread.sleep(5000);
						
					WebElement rdrpdwn=driver.findElement(By.xpath(properties.getProperty("eresponse_drpdwn")));
					//rdrpdwn.click();
					Select reason=new Select(rdrpdwn);
					Thread.sleep(5000);
					reason.selectByValue("16");
					Thread.sleep(15000);
					
					driver.findElement(By.xpath(properties.getProperty("evsubject3"))).sendKeys("send immeditely after email is opnd");
					Thread.sleep(5000);
					/*driver.findElement(By.xpath(properties.getProperty("evselect_temp3"))).click();
					Thread.sleep(5000);*/
					
					driver.switchTo().defaultContent();
					driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
					driver.findElement(By.xpath("html/body")).click();
					driver.switchTo().activeElement().sendKeys("Hello:send immeditely after email is opnd,thnku for opening");

					driver.switchTo().defaultContent();
					
					driver.findElement(By.xpath(properties.getProperty("evschedule_click"))).click();
					Thread.sleep(5000);
					
					driver.findElement(By.xpath(properties.getProperty("evsch_date"))).click();
					Thread.sleep(5000);
					
					driver.findElement(By.xpath("/html/body/div[2]/div[1]/span[2]")).click();
					Thread.sleep(5000);

					driver.findElement(By.xpath(properties.getProperty("evsch_date_click"))).click();
					Thread.sleep(5000);

					
					
					
					WebElement e_sch_cntry_drpdwn=driver.findElement(By.xpath(properties.getProperty("evsch_country")));
					//country_drpdwn.click();
					Select sch_country1=new Select(e_sch_cntry_drpdwn);
					Thread.sleep(5000);
					sch_country1.selectByValue("103");// india
					Thread.sleep(5000);
					
					
					driver.findElement(By.xpath(properties.getProperty("evsch_lastclick"))).click();
					Thread.sleep(5000);
					
					}
					
					

				
				
				
		}


			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
