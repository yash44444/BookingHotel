import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.nbs.config.ConfigFactory;

public class Test1 {

	@Test(description = "To verify the title of the orangeHRM website")	 
	 public void launchApplication() throws InterruptedException{
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(chromeOptions);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();;
		 driver.get(ConfigFactory.getConfig().url());
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
 		 js.executeScript("window.scroll(0,200)");
 		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		 driver.findElement(By.xpath("//input[@name='ss']")).sendKeys("Devon");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='ss']")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath("//input[@name='ss']")).sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		 
		 // click calendar
 		 driver.findElement(By.xpath("//button[normalize-space()='Check-in Date']")).click();
		 
 		 Thread.sleep(3000);
 
 		 // select date
 		 
 		 
 		 driver.findElement(By.cssSelector("[aria-label='28 March 2023']")).click();
 		 Thread.sleep(2000);
 	
 		 
 		 driver.findElement(By.xpath("span[aria-label='2 April 2023'] span")).click();
		 			 
//		 String checkInMonth = "March 2023";
		 String checkInDate = "24";	
//		 
//		 while(true) {
//			  String month = driver.findElement(By.xpath("//h3[normalize-space()='March 2023']")).getText();
//			  if(month.equalsIgnoreCase(checkInMonth)) {
//				  break;
//			  }
//			  else {
//				  Thread.sleep(2000);
//				  driver.findElement(By.xpath("//button[@type='button']//span[@class='b6dc9a9e69 e6c50852bd']//*[name()='svg']")).click();
//			  }
//	 }
//		 
//
		 List<WebElement> dates = driver.findElements(By.xpath("//table[@class='aadb8ed6d3']//td"));
		 for(WebElement element:dates) {
			 String date = element.getText();
			 if(date.equals(checkInDate)) {
			 element.click();
			 break;		 
	}}}
//	
 }

				  
	 
