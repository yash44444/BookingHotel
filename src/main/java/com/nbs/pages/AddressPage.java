package com.nbs.pages;

import org.openqa.selenium.By;

import com.nbs.utils.PageActionsUtils;

public class AddressPage {
	
	 private static final By TXT_ADDRESS = By.xpath("//input[@id='address1']");
	 private static final By TXT_CITY = By.xpath("//input[@id='city']");
	 private static final By TXT_PHONE= By.xpath("//input[@id='phone']");
	 
	 public AddressPage enterAddress(String address) {
			PageActionsUtils.sendKeys(TXT_ADDRESS, address);
			return new AddressPage();
		}
	 
	 public AddressPage enterCity(String city) {
			PageActionsUtils.sendKeys(TXT_CITY, city);
			return new AddressPage();
		}
	 
	 public AddressPage enterPhoneNumber(String phoneNumber) {
			PageActionsUtils.sendKeys(TXT_PHONE, phoneNumber);
			return new AddressPage();
		}
	 
	

}
