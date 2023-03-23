# Booking Hotel 
This is a mini automation framework which tests the e2e journey of hotel booking on booking.com website.
Since the test run on a live website, the test do not submit any reservations and exists from the final payment page.

## Installation
clone the project from github: git clone https://github.com/yash44444/BookingHotel.git

## Tool stack
This aurtomation framework uses the combination of -
eclipse IDE
selenium
Maven build tool
TestNG test framework
Page Object Model design pattern
Java, JDK 11 
Github repo for source code maintainance.

## How to run
1) Either go to the test directly. src/test/java/Test1 and click on Run option below @Test annotation. or
2) Rt click on Testng.xml , run as testng.xml file.
3) The data is placed in config.properties file which is invoked by the tests under run.
4) testng reports will be generated under test-output directory. Open index.html in browser.

## How to test PWA
* PWAs should meet the requirements of a PWA such as working on HTTPS, being responsive, being installable.
* PWAs API calls should be thoroughly tested until consistent benahour is attained. 
* PWAs should be responsive and work well on different devices. Test the PWA on various screen sizes, operating systems, and browsers.
* PWAs should work offline or in a low-quality network environment. Test the PWA in offline mode, and see how it performs.
* PWAs should be installable on the device’s home screen. 
* PWAs should load fast and perform well. Test the PWA's loading speed, user experience, and overall performance.
* PWAs should be secure and follow the best security practices. Test the security features of the PWA, such as HTTPS, content security policies, etc.
* PWAs should support push notifications. Test the push notification feature of the PWA.
* PWAs should be accessible to all users, including users with disabilities. 
