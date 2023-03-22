package com.nbs.pages;

import org.openqa.selenium.By;

import com.nbs.enums.WaitType;
import com.nbs.utils.PageActionsUtils;

public class PaymentPage {

	private static final By TXT_FIRST_NAME = By.xpath("//input[@id='firstname']");
	private static final By TXT_LAST_NAME = By.xpath("//input[@id='lastname']");
	private static final By TXT_EMAIL = By.xpath("//input[@id='email']");
	private static final By BTN_GUEST = By.xpath("(//span[normalize-space()=\"I'm the main guest\"])[1]");
	private static final By BTN_FINAL_DETAILS = By.xpath("//span[contains(@class,'bui-button__text js-button__text')]");

	public PaymentPage enterFirstName(String firstname) {
		PageActionsUtils.sendKeys(TXT_FIRST_NAME, firstname);
		return new PaymentPage();
	}

	public PaymentPage enterLastName(String lastname) {
		PageActionsUtils.sendKeys(TXT_LAST_NAME, lastname);
		return new PaymentPage();
	}

	public PaymentPage enterEmail(String email) {
		PageActionsUtils.sendKeys(TXT_EMAIL, email);
		return new PaymentPage();
	}

	public PaymentPage clickToConfirmMainGuest() {
		PageActionsUtils.click(BTN_GUEST, WaitType.CLICKABLE);
		return new PaymentPage();
	}

	public AddressPage confirmFinalDetails() {
		PageActionsUtils.click(BTN_FINAL_DETAILS, WaitType.CLICKABLE);
		return new AddressPage();
	}

}
