package com.nbs.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nbs.driver.DriverManager;
import com.nbs.enums.WaitType;
import com.nbs.utils.PageActionsUtils;

public class HotelListPage {

	private static final By LINK_AVAILABILITY = By.xpath("(//button[@type='button'])[14]");

	public ReservationPage checkAvailabilityOfHotels() {
		PageActionsUtils.click(LINK_AVAILABILITY, WaitType.CLICKABLE);
		 String currentWindowHandle = DriverManager.getDriver().getWindowHandle();
		 DriverManager.getDriver().findElement(By.xpath("(//span[@class='e57ffa4eb5'][normalize-space()='See availability'])[1]")).click();

		 WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(100));
		 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		 
		 Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();

		 for (String windowHandle : windowHandles) {
		     if (!windowHandle.equals(currentWindowHandle)) {
		    	 DriverManager.getDriver().switchTo().window(windowHandle);
		         break;
		     }
		 }
		return new ReservationPage();
	}

}
