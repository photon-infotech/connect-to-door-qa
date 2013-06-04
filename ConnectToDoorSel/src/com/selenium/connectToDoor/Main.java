package com.selenium.connectToDoor;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverCommandProcessor;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.thoughtworks.selenium.DefaultSelenium;

public class Main {
	
	@Test
	public void main() throws Exception{
		/* Use Firefox */
		WebDriver browser = new FirefoxDriver();
		DefaultSelenium selenium = new DefaultSelenium(new WebDriverCommandProcessor("http://www.google.com", browser));
		
		/* Use Chrome Driver */
//		System.setProperty("webdriver.driver.chrome", "/Users/maretska/Documents/chromedriver");
//		WebDriver browser = new ChromeDriver();
//		DefaultSelenium selenium = new DefaultSelenium(new WebDriverCommandProcessor("http://www.google.com", browser));
		Login login = new Login();
		login.LoginPageTest(browser, selenium)
		.AttandanceListPageTest(selenium, browser)
		.DailyAttandancePageTest(selenium, browser)
		.ProfilePageTest(browser, selenium)
		.AttendanceFormTest(selenium, browser);
	}
}
