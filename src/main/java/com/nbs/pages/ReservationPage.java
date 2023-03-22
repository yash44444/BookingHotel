package com.nbs.pages;

import org.openqa.selenium.By;

import com.nbs.enums.WaitType;
import com.nbs.utils.PageActionsUtils;

public class ReservationPage {

	private static final By LINK_BOOK_RESERVATION = By.cssSelector("#hp_book_now_button");
	private static final By LINK_RESERVE = By.cssSelector(".bui-button__text.js-reservation-button__text");

	public ReservationPage clickBookYourReservation() {
		PageActionsUtils.click(LINK_BOOK_RESERVATION, WaitType.CLICKABLE);
		return new ReservationPage();
	}

	public PaymentPage clickReserve() {
		PageActionsUtils.click(LINK_RESERVE, WaitType.CLICKABLE);
		return new PaymentPage();
	}

}
