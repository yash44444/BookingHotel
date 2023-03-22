package com.nbs.tests;
import org.testng.annotations.Test;

import com.nbs.config.ConfigFactory;
import com.nbs.pages.HomePage;

public class Test1 extends BaseTest {

	@Test(description = "To test booking.com journey")
	public void launchApplication() {
		HomePage homepage = new HomePage();
		homepage.acceptCookies();
		homepage.enterDestination(ConfigFactory.getConfig().destination())
				.selectCheckInDate().selectCheckOutDate().clickSubmitBtn()
				.checkAvailabilityOfHotels()
				.clickBookYourReservation().clickReserve()
				.enterFirstName(ConfigFactory.getConfig().firstName())
				.enterLastName(ConfigFactory.getConfig().lastName())
				.enterEmail(ConfigFactory.getConfig().email())
				.clickToConfirmMainGuest()
				.confirmFinalDetails()
//				.enterAddress(ConfigFactory.getConfig().address())
//				.enterCity(ConfigFactory.getConfig().city())
				.enterPhoneNumber(ConfigFactory.getConfig().phone());

	}
}
