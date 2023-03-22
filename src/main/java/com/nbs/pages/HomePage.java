package com.nbs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.nbs.driver.DriverManager;
import com.nbs.enums.WaitType;
import com.nbs.utils.PageActionsUtils;

// HomePage -> HotelListPage -> ReservationPage -> PaymentPage -> AddressPage -> Quit without booking

public class HomePage {
	
	 	private static String checkInDate = "2023-03-22";	
	 	private static String checkOutDate = "2023-04-12";

	 	private static final By BTN_ACCEPT_COOKIES = By.xpath("//button[@id='onetrust-accept-btn-handler']");
	    private static final By TXTBOX_DESTINATION = By.xpath("//input[@name='ss']");
	    private static final By DATE_CHECKIN = By.xpath("//*[@data-date='" + checkInDate + "']");
	    private static final By DATE_CHECKOUT = By.xpath("//*[@data-date='" + checkOutDate + "']");
	    private static final By BTN_SUBMIT = By.cssSelector("button[type='submit']");
	    

	    public HomePage acceptCookies(){
		        PageActionsUtils.click(BTN_ACCEPT_COOKIES,WaitType.CLICKABLE);
		        return this;
		    }
	    
	    public HomePage enterDestination(String destination){
	        PageActionsUtils.sendKeys(TXTBOX_DESTINATION,destination);
	   	    DriverManager.getDriver().findElement(By.xpath("//input[@name='ss']")).sendKeys(Keys.ARROW_DOWN);		
	   	    DriverManager.getDriver().findElement(By.xpath("//input[@name='ss']")).sendKeys(Keys.ENTER);		
	        return this;
	    }
	        
	    
	    public HomePage enterDestination(){
		        PageActionsUtils.click(TXTBOX_DESTINATION,WaitType.CLICKABLE);
		        return this;
		    }

	    public HomePage selectCheckInDate() {
	        PageActionsUtils.click(DATE_CHECKIN,WaitType.CLICKABLE);
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        return this;
	    }
	    
	    public HomePage selectCheckOutDate(){
		        PageActionsUtils.click(DATE_CHECKOUT,WaitType.VISIBLE);
		        return this;
		    }

	    public HotelListPage clickSubmitBtn(){
	        PageActionsUtils.click(BTN_SUBMIT, WaitType.CLICKABLE);
	        return new HotelListPage();
	    }

}
