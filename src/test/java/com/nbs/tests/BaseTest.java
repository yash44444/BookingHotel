package com.nbs.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.nbs.driver.Driver;

public class BaseTest {
	
	
	 @BeforeMethod
	    public void setUp(){
	        Driver.initDriver();
	    }

	    @AfterMethod
	    public void afterMethod(){
	        Driver.tearDown();
	    }

}
