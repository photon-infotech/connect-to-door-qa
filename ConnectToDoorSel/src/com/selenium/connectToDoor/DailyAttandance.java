package com.selenium.connectToDoor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.DefaultSelenium;

public class DailyAttandance extends Abstract {
	
	public DailyAttandance(DefaultSelenium selenium, WebDriver browser) throws Exception{
		waitForElement(selenium, dailyAttandance);
	}
	
	public Profile DailyAttandancePageTest(DefaultSelenium selenium, WebDriver browser) throws Exception{
		PageFactory.initElements(browser, this);
		DailyAttendance.click();
		waitForElement(selenium, husein);
		
		/* To scroll page with Actions Function */
		WebElement huseinName = browser.findElement(By.xpath(husein));
		WebElement havid = browser.findElement(By.xpath(Havid));
		Actions builder = new Actions(browser);
		Action dragAndDropDown = builder.clickAndHold(huseinName)
								.moveToElement(havid)
								.release(havid)
								.build();
		dragAndDropDown.perform();
		
		Action dragAndDropUp = builder.clickAndHold(havid)
									.moveToElement(huseinName)
									.release(huseinName)
									.build();
		dragAndDropUp.perform();
		
		waitForElement(selenium, husein);
		waitForElement(selenium, backButton);
		Back.click();
		return new Profile(selenium);
	}
}
