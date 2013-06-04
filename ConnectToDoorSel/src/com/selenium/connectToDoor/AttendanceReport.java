package com.selenium.connectToDoor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.DefaultSelenium;

public class AttendanceReport extends Abstract {
	
	public AttendanceReport(DefaultSelenium selenium) throws Exception{
		waitForElement(selenium, ATTENDANCE_MENU_BUTTON_REPORT);
	}
	
	public void AttendanceReportPageTest(DefaultSelenium selenium, WebDriver browser) throws Exception {
		PageFactory.initElements(browser, this);
		AttendanceReport.click();
		waitForElement(selenium, REPORT_MONTH_YEAR_PICKER);
		DatePickerAttendanceReport.click();
		waitForElement(selenium, FEBRUARY);
		Date_February.click();
		FilterBy.click();
	}

}
