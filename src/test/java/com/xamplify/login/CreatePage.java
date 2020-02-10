package com.xamplify.login;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatePage {
	  
	Properties properties = PropertiesFile.readPropertyFile("rdata.properties");  
	WebDriver driver = Instance.getInstance();
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

@Test(priority=431,enabled=true)
	  public void Page_RegularPrivate() throws Exception {
		
		    driver.get("https://release.xamplify.io/home/dashboard"); // calls the webpage.
		    Thread.sleep(5000);
		    driver.findElement(By.xpath(properties.getProperty("ldesignclick"))).click(); // clicks on the design button on the side left bar.
		    Thread.sleep(8000);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scrolls the webpage.
			Thread.sleep(3000);
		    driver.findElement(By.xpath(properties.getProperty("ldesignpage"))).click(); // clicks on the design page.
		    Thread.sleep(8000);
		    driver.findElement(By.xpath(properties.getProperty("lregular"))).click(); // clicks on the regular button.
		    Thread.sleep(8000);
		    JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scrolls the web page.
		    Thread.sleep(10000);
		    Actions action = new Actions(driver);
		    WebElement we = driver.findElement(By.xpath(properties.getProperty("lcreateIconclick"))); //mousehover onto the '+' icon to create the page.
		    action.moveToElement(we).build().perform();
		    we.click();
		    Thread.sleep(10000);
		    driver.findElement(By.xpath(properties.getProperty("lshowforms"))).click(); // clicks on the show forms.
		    Thread.sleep(4000);
		    
		    driver.switchTo().defaultContent();
		    Thread.sleep(8000);
		    
		    /*
		     * Search,Sort by,Preview Icon and Preview Close
		     */
			
		    Select updateddesc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
		    updateddesc.selectByVisibleText("Updated On (DESC)");
		    Thread.sleep(5000);
		    Select nameaz = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
		    nameaz.selectByVisibleText("Name (A-Z)");
		    Thread.sleep(5000);
		    Select createdondesc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
		    createdondesc.selectByVisibleText("Created On (DESC)");
		    Thread.sleep(5000);
		    Select nameza = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
		    nameza.selectByVisibleText("Name (Z-A)");
		    Thread.sleep(5000);
		    Select createdonasc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
		    createdonasc.selectByVisibleText("Created On (ASC)");
		    Thread.sleep(5000);
		    Select updatedasc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
		    updatedasc.selectByVisibleText("Updated On (ASC)");
		    
		    Thread.sleep(8000);	

			WebElement Video_search1 = driver.findElement(By.xpath((properties.getProperty("lsearchfield"))));//to find search bar
			Video_search1.sendKeys("Mandatory Form");
			driver.findElement(By.xpath((properties.getProperty("lsearchclick")))).click();//to click on search after data entered
			Thread.sleep(8000);


			/*driver.findElement(By.xpath(("//button[@class='glyphicon glyphicon-remove search-box-item-clear']"))).click();//clear the search bar

			Thread.sleep(8000);
			
			Actions action2 = new Actions(driver);
		    WebElement we2 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]/i[1]")); //mousehover onto the '+' icon to create the page.
		    action2.moveToElement(we2).build().perform();
		    we2.click();
		    
		    
		    //driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]/i[1]")).click(); // clicks on the preview button
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//div[@id='form-preview-modal']//button[@class='close-circle']")).click(); // closes the form preview.
		    Thread.sleep(3000);*/
		    
		    String CopiedText = driver.findElement(By.xpath(properties.getProperty("lcopylink"))).getAttribute("value").toString(); // copies the link of the form.
		    System.out.println(CopiedText);
		    
		    Thread.sleep(4000);
		    driver.findElement(By.xpath(properties.getProperty("lpopupclose"))).click(); // closes the form popup.
		    Thread.sleep(10000);
		     
		   driver.switchTo().defaultContent();
		   driver.switchTo().frame(
					driver.findElement(By.xpath(properties.getProperty("liframeswitch")))); // control switches to iframe.
			Thread.sleep(15000);
			
			
			 /*
			  *  start shopping click & paste the copied url in the url input text under content.
			  */
			 
			
			/*driver.findElement(By.xpath("//*[@id=\"30-0-3\"]/div[2]/div/div[1]/div")).click();
			
			driver.switchTo().defaultContent();
			
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,-1000)", "");

			WebElement Copypaste = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
			Copypaste.sendKeys(CopiedText);
			Thread.sleep(4000);*/
			
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("lsavebutton"))).click(); //save button 
		    
		    Thread.sleep(5000);
		    
		    driver.switchTo().defaultContent();
		    Thread.sleep(3000);
		    driver.findElement(By.id((properties.getProperty("lpagenamefield")))).clear(); // clears the page name input field.
		    Thread.sleep(5000);
			driver.findElement(By.id((properties.getProperty("lpagenamefield"))))
					.sendKeys(("AutomatedPage") + "_" + System.currentTimeMillis()); // gives the name of the page.
		    Thread.sleep(5000);
		    new Select(driver.findElement(By.id(properties.getProperty("lpagetype")))).selectByVisibleText("PRIVATE"); // change the type of the page.
		    Thread.sleep(8000);
		      
		    WebElement element = driver.findElement(By.xpath(properties.getProperty("ldiv"))); // finds the div.
		    
		    JavascriptExecutor js11= (JavascriptExecutor) driver;
		    js11.executeScript("arguments[0].click();", element); 
		    driver.findElement(By.xpath(properties.getProperty("lsave2"))).click(); // clicks on the save button. 
		    Thread.sleep(4000);
		    driver.findElement(By.xpath(properties.getProperty("lsuccessclose"))).click();
		    Thread.sleep(4000); 
		    }
		  

@Test(priority=432,enabled=true)
	  public void Page_RegularPublic() throws Exception {
		
			driver.get("https://release.xamplify.io/home/dashboard"); // calls the webpage.
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("ldesignclick"))).click(); // clicks on the design button on the side left bar.
			Thread.sleep(8000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scrolls the webpage.
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("ldesignpage"))).click(); // clicks on the design page.
			Thread.sleep(8000);
			driver.findElement(By.xpath(properties.getProperty("lregular"))).click(); // clicks on the regular button.
			Thread.sleep(8000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scrolls the web page.
			Thread.sleep(10000);
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath(properties.getProperty("lcreateIconclick"))); //mousehover onto the '+' icon to create the page.
			action.moveToElement(we).build().perform();
			we.click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(properties.getProperty("lshowforms"))).click(); // clicks on the show forms.
			Thread.sleep(4000);
	    
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
	    
	    /*
	     * Search,Sort by,Preview Icon and Preview Close
	     */
		
			Select updateddesc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
			updateddesc.selectByVisibleText("Updated On (DESC)");
			Thread.sleep(5000);
			Select nameaz = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
			nameaz.selectByVisibleText("Name (A-Z)");
			Thread.sleep(5000);
			Select createdondesc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
			createdondesc.selectByVisibleText("Created On (DESC)");
			Thread.sleep(5000);
			Select nameza = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
			nameza.selectByVisibleText("Name (Z-A)");
			Thread.sleep(5000);
			Select createdonasc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
			createdonasc.selectByVisibleText("Created On (ASC)");
			Thread.sleep(5000);
			Select updatedasc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
			updatedasc.selectByVisibleText("Updated On (ASC)");
	    
			Thread.sleep(8000);	

			WebElement Video_search1 = driver.findElement(By.xpath((properties.getProperty("lsearchfield"))));//to find search bar
			Video_search1.sendKeys("Mandatory Form");
			driver.findElement(By.xpath((properties.getProperty("lsearchclick")))).click();//to click on search after data entered
			Thread.sleep(8000);


			/*driver.findElement(By.xpath(("//button[@class='glyphicon glyphicon-remove search-box-item-clear']"))).click();//clear the search bar

			Thread.sleep(8000);
		
			Actions action2 = new Actions(driver);
	    	WebElement we2 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]/i[1]")); //mousehover onto the '+' icon to create the page.
	    	action2.moveToElement(we2).build().perform();
	    	we2.click();
	    
	    
	    	//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]/i[1]")).click(); // clicks on the preview button
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//div[@id='form-preview-modal']//button[@class='close-circle']")).click(); // closes the form preview.
	    	Thread.sleep(3000);*/
	    
			String CopiedText = driver.findElement(By.xpath(properties.getProperty("lcopylink"))).getAttribute("value").toString(); // copies the link of the form.
			System.out.println(CopiedText);
	    
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("lpopupclose"))).click(); // closes the form popup.
			Thread.sleep(10000);
	     
			driver.switchTo().defaultContent();
			driver.switchTo().frame(
			driver.findElement(By.xpath(properties.getProperty("liframeswitch")))); // control switches to iframe.
			Thread.sleep(15000);
		
		
		 /*
		  *  start shopping click & paste the copied url in the url input text under content.
		  */
		 
		
			/*driver.findElement(By.xpath("//*[@id=\"30-0-3\"]/div[2]/div/div[1]/div")).click();
		
			driver.switchTo().defaultContent();
		
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,-1000)", "");

			WebElement Copypaste = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
			Copypaste.sendKeys(CopiedText);
			Thread.sleep(4000);*/
		
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("lsavebutton"))).click(); //save button 
	    
			Thread.sleep(5000);
	    
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.findElement(By.id((properties.getProperty("lpagenamefield")))).clear(); // clears the page name input field.
			Thread.sleep(5000);
			driver.findElement(By.id((properties.getProperty("lpagenamefield"))))
				.sendKeys(("AutomatedPage") + "_" + System.currentTimeMillis()); // gives the name of the page.
			Thread.sleep(5000);
			new Select(driver.findElement(By.id(properties.getProperty("lpagetype")))).selectByVisibleText("PUBLIC"); // change the type of the page.
			Thread.sleep(8000);
	      
			WebElement element = driver.findElement(By.xpath(properties.getProperty("ldiv"))); // finds the div.
	    
			JavascriptExecutor js11= (JavascriptExecutor) driver;
			js11.executeScript("arguments[0].click();", element); 
			driver.findElement(By.xpath(properties.getProperty("lsave2"))).click(); // clicks on the save button. 
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("lsuccessclose"))).click();
			Thread.sleep(4000);
	      }
	
@Test(priority=433,enabled=true)
	  public void Page_CobrandingPrivate() throws Exception {
		
		driver.get("https://release.xamplify.io/home/dashboard"); // calls the webpage.
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(properties.getProperty("ldesignclick"))).click(); // clicks on the design button on the side left bar.
	    Thread.sleep(8000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scrolls the webpage.
		Thread.sleep(3000);
	    driver.findElement(By.xpath(properties.getProperty("ldesignpage"))).click(); // clicks on the design page.
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(properties.getProperty("lCobranded"))).click(); // clicks on the regular button.
	    Thread.sleep(8000);
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scrolls the web page.
	    Thread.sleep(10000);
	    Actions action = new Actions(driver);
	    WebElement we = driver.findElement(By.xpath(properties.getProperty("lcreateIconclick"))); //mousehover onto the '+' icon to create the page.
	    action.moveToElement(we).build().perform();
	    we.click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath(properties.getProperty("lshowforms"))).click(); // clicks on the show forms.
	    Thread.sleep(4000);
	    
	    driver.switchTo().defaultContent();
	    Thread.sleep(8000);
	    
	    /*
	     * Search,Sort by,Preview Icon and Preview Close
	     */
		
	    Select updateddesc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
	    updateddesc.selectByVisibleText("Updated On (DESC)");
	    Thread.sleep(5000);
	    Select nameaz = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
	    nameaz.selectByVisibleText("Name (A-Z)");
	    Thread.sleep(5000);
	    Select createdondesc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
	    createdondesc.selectByVisibleText("Created On (DESC)");
	    Thread.sleep(5000);
	    Select nameza = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
	    nameza.selectByVisibleText("Name (Z-A)");
	    Thread.sleep(5000);
	    Select createdonasc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
	    createdonasc.selectByVisibleText("Created On (ASC)");
	    Thread.sleep(5000);
	    Select updatedasc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
	    updatedasc.selectByVisibleText("Updated On (ASC)");
	    
	    Thread.sleep(8000);	

		WebElement Video_search1 = driver.findElement(By.xpath((properties.getProperty("lsearchfield"))));//to find search bar
		Video_search1.sendKeys("Mandatory Form");
		driver.findElement(By.xpath((properties.getProperty("lsearchclick")))).click();//to click on search after data entered
		Thread.sleep(8000);


		/*driver.findElement(By.xpath(("//button[@class='glyphicon glyphicon-remove search-box-item-clear']"))).click();//clear the search bar

		Thread.sleep(8000);
		
		Actions action2 = new Actions(driver);
	    WebElement we2 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]/i[1]")); //mousehover onto the '+' icon to create the page.
	    action2.moveToElement(we2).build().perform();
	    we2.click();
	    
	    
	    //driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]/i[1]")).click(); // clicks on the preview button
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@id='form-preview-modal']//button[@class='close-circle']")).click(); // closes the form preview.
	    Thread.sleep(3000);*/
	    
	    String CopiedText = driver.findElement(By.xpath(properties.getProperty("lcopylink"))).getAttribute("value").toString(); // copies the link of the form.
	    System.out.println(CopiedText);
	    
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(properties.getProperty("lpopupclose"))).click(); // closes the form popup.
	    Thread.sleep(10000);
	     
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame(
				driver.findElement(By.xpath(properties.getProperty("liframeswitch")))); // control switches to iframe.
		Thread.sleep(15000);
		
		
		 /*
		  *  start shopping click & paste the copied url in the url input text under content.
		  */
		 
		
		/*driver.findElement(By.xpath("//*[@id=\"30-0-3\"]/div[2]/div/div[1]/div")).click();
		
		driver.switchTo().defaultContent();
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,-1000)", "");

		WebElement Copypaste = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		Copypaste.sendKeys(CopiedText);
		Thread.sleep(4000);*/
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lsavebutton"))).click(); //save button 
	    
	    Thread.sleep(5000);
	    
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    driver.findElement(By.id((properties.getProperty("lpagenamefield")))).clear(); // clears the page name input field.
	    Thread.sleep(5000);
		driver.findElement(By.id((properties.getProperty("lpagenamefield"))))
				.sendKeys(("AutomatedPage") + "_" + System.currentTimeMillis()); // gives the name of the page.
	    Thread.sleep(5000);
	    new Select(driver.findElement(By.id(properties.getProperty("lpagetype")))).selectByVisibleText("PRIVATE"); // change the type of the page.
	    Thread.sleep(8000);
	      
	    WebElement element = driver.findElement(By.xpath(properties.getProperty("ldiv"))); // finds the div.
	    
	    JavascriptExecutor js11= (JavascriptExecutor) driver;
	    js11.executeScript("arguments[0].click();", element); 
	    driver.findElement(By.xpath(properties.getProperty("lsave2"))).click(); // clicks on the save button. 
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(properties.getProperty("lsuccessclose"))).click();
	    Thread.sleep(4000);
	      }

@Test(priority=434,enabled=true)
public void Page_CobrandingPublic() throws Exception {
	
		driver.get("https://release.xamplify.io/home/dashboard"); // calls the webpage.
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ldesignclick"))).click(); // clicks on the design button on the side left bar.
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scrolls the webpage.
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("ldesignpage"))).click(); // clicks on the design page.
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("lCobranded"))).click(); // clicks on the regular button.
		Thread.sleep(8000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scrolls the web page.
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(properties.getProperty("lcreateIconclick"))); //mousehover onto the '+' icon to create the page.
		action.moveToElement(we).build().perform();
		we.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("lshowforms"))).click(); // clicks on the show forms.
		Thread.sleep(4000);
  
		driver.switchTo().defaultContent();
		Thread.sleep(8000);
  
  /*
   * Search,Sort by,Preview Icon and Preview Close
   */
	
  	Select updateddesc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
  	updateddesc.selectByVisibleText("Updated On (DESC)");
  	Thread.sleep(5000);
  	Select nameaz = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
  	nameaz.selectByVisibleText("Name (A-Z)");
  	Thread.sleep(5000);
  	Select createdondesc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
  	createdondesc.selectByVisibleText("Created On (DESC)");
  	Thread.sleep(5000);
  	Select nameza = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
  	nameza.selectByVisibleText("Name (Z-A)");
  	Thread.sleep(5000);
  	Select createdonasc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
  	createdonasc.selectByVisibleText("Created On (ASC)");
  	Thread.sleep(5000);
  	Select updatedasc = new Select(driver.findElement(By.xpath(properties.getProperty("lsortby"))));
  	updatedasc.selectByVisibleText("Updated On (ASC)");
  
  	Thread.sleep(8000);	

	WebElement Video_search1 = driver.findElement(By.xpath((properties.getProperty("lsearchfield"))));//to find search bar
	Video_search1.sendKeys("Mandatory Form");
	driver.findElement(By.xpath((properties.getProperty("lsearchclick")))).click();//to click on search after data entered
	Thread.sleep(8000);


	/*driver.findElement(By.xpath(("//button[@class='glyphicon glyphicon-remove search-box-item-clear']"))).click();//clear the search bar

	Thread.sleep(8000);
	
	Actions action2 = new Actions(driver);
  	WebElement we2 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]/i[1]")); //mousehover onto the '+' icon to create the page.
  	action2.moveToElement(we2).build().perform();
  	we2.click();
  
  
  //driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]/i[1]")).click(); // clicks on the preview button
  	Thread.sleep(5000);
  	driver.findElement(By.xpath("//div[@id='form-preview-modal']//button[@class='close-circle']")).click(); // closes the form preview.
  	Thread.sleep(3000);*/
  
	String CopiedText = driver.findElement(By.xpath(properties.getProperty("lcopylink"))).getAttribute("value").toString(); // copies the link of the form.
  	System.out.println(CopiedText);
  
  	Thread.sleep(4000);
  	driver.findElement(By.xpath(properties.getProperty("lpopupclose"))).click(); // closes the form popup.
  	Thread.sleep(10000);
   
  	driver.switchTo().defaultContent();
 	driver.switchTo().frame(
			driver.findElement(By.xpath(properties.getProperty("liframeswitch")))); // control switches to iframe.
	Thread.sleep(15000);
	
	
	 /*
	  *  start shopping click & paste the copied url in the url input text under content.
	  */
	 
	
	/*driver.findElement(By.xpath("//*[@id=\"30-0-3\"]/div[2]/div/div[1]/div")).click();
	
	driver.switchTo().defaultContent();
	
	JavascriptExecutor js3 = (JavascriptExecutor) driver;
	js3.executeScript("window.scrollBy(0,-1000)", "");

	WebElement Copypaste = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-landing-page[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-preview-popup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
	Copypaste.sendKeys(CopiedText);
	Thread.sleep(4000);*/
	
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("lsavebutton"))).click(); //save button 
  
	Thread.sleep(5000);
  
  	driver.switchTo().defaultContent();
  	Thread.sleep(3000);
  	driver.findElement(By.id((properties.getProperty("lpagenamefield")))).clear(); // clears the page name input field.
  	Thread.sleep(5000);
	driver.findElement(By.id((properties.getProperty("lpagenamefield"))))
			.sendKeys(("AutomatedPage") + "_" + System.currentTimeMillis()); // gives the name of the page.
	Thread.sleep(5000);
  	new Select(driver.findElement(By.id(properties.getProperty("lpagetype")))).selectByVisibleText("PUBLIC"); // change the type of the page.
  	Thread.sleep(8000);
    
  	WebElement element = driver.findElement(By.xpath(properties.getProperty("ldiv"))); // finds the div.
  
  	JavascriptExecutor js11= (JavascriptExecutor) driver;
  	js11.executeScript("arguments[0].click();", element); 
  	driver.findElement(By.xpath(properties.getProperty("lsave2"))).click(); // clicks on the save button. 
  	Thread.sleep(4000);
  	driver.findElement(By.xpath(properties.getProperty("lsuccessclose"))).click();
  	Thread.sleep(4000);
    }
	  
	/*@AfterClass(alwaysRun = false)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }*/

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	  
	}




