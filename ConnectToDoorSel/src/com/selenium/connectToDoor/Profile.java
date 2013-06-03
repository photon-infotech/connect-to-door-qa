package com.selenium.connectToDoor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.DefaultSelenium;

public class Profile extends Abstract {
	
	public Profile(DefaultSelenium selenium) throws Exception{
		waitForElement(selenium, profile);
	}
	
	public AttendanceForm ProfilePageTest (WebDriver browser, DefaultSelenium selenium) throws Exception{
		PageFactory.initElements(browser, this);
//		Profile Page = PageFactory.initElements(browser, Profile.class);
		Profile.click();
		waitForElement(selenium, ATTENDANCE2);
		Attendance.click();
		return new AttendanceForm(selenium);
	}
}
