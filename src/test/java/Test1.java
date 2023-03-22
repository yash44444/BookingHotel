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

	@Test(description = "To test booking.com journey")	 
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
		 	 

		 String checkInDate = "2023-03-22";	
		 String checkOutDate = "2023-03-22";	
		 
		 driver.findElement(By.xpath("//*[@data-date='" + checkInDate + "']")).click();
		 driver.findElement(By.xpath("//*[@data-date='" + checkOutDate + "']")).click();		 
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
		 driver.findElement(By.xpath("(//span[@class='e57ffa4eb5'][normalize-space()='See availability'])[1]")).click();
		 driver.findElement(By.xpath("(//span[@class='bui-button__text'][normalize-space()='Reserve'])[1]")).click();
		 driver.findElement(By.cssSelector(".bui-button__text.js-reservation-button__text")).click();

		 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Exeter");
		 driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Univ");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		 driver.findElement(By.xpath("(//span[normalize-space()=\"I'm the main guest\"])[1]")).click();
		 driver.findElement(By.xpath("//span[contains(@class,'bui-button__text js-button__text')]")).click();
		 
		 driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("victoria");
		 driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Swindon");
		 driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7824678246");
		 driver.findElement(By.xpath("button[name='book'] span[class='bui-button__text js-button__text']")).click();
 		
 		
 }}

				  
	 
