package com.selenium.connectToDoor;


import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.DefaultSelenium;

public class AttandanceList extends Abstract {

	public AttandanceList(DefaultSelenium selenium) throws Exception{
		waitForElement(selenium, ATTENDACE_MENU_BUTTON_LIST);
		
	}
	
	public DailyAttandance AttandanceListPageTest(DefaultSelenium selenium ,WebDriver browser) throws Exception{
		PageFactory.initElements(browser, this);
		AttendanceList.click();
		waitForElement(selenium, inputDatePicker);
		browser.findElement(By.xpath(inputDatePicker)).click();
		waitForElement(selenium, iconNextMount);
		
		for (int a = 1 ;; a++){
			browser.findElement(By.xpath(iconNextMount)).click();
			waitForText(2);
			if (a>=3) break;
			try { if (selenium.isVisible("February")) break;} catch(Exception e){}
		}
		waitForElement(selenium, date31);
		browser.findElement(By.xpath(date31)).click();
		waitForText(2);
		browser.findElement(By.xpath(untilDatePicker)).click();
		waitForText(1);
		browser.findElement(By.xpath(date2)).click();
		
		for (int i= 0;;i++){
			waitForText(2);
			browser.findElement(By.xpath(SEARCH_BUTTON_TEXT)).click();
			SwitchSearchBy(i,browser,selenium);
			if (i>=3){
				System.out.println("Success To Search By Test for All Category");
				break;
			} 
		}
		
		WebElement Print = browser.findElement(By.className("attendance-list-print"));

		( ( JavascriptExecutor ) browser )
        .executeScript( "window.onbeforeunload = function(e){};" );
		
		
		
		waitForText(10);
		/* To scroll page with Javascripts Function */
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		jse.executeScript("scroll(0, 250)");
		waitForText(2);
		Back.click();
		return new DailyAttandance(selenium, browser);
	}
	
	
	public void SwitchSearchBy(int index, WebDriver browser, DefaultSelenium selenium) throws Exception{
		PageFactory.initElements(browser, this);
		List<WebElement> SearchByList = browser.findElements(By.className("content-li"));
		waitForText(3);
		switch (index){
		case 0 :
			/* Date */
			waitForText(2);
			System.out.println("Search By Date Test");
			SearchByList.get(0).click();
			waitForText(3);
			ButtonSearchList.click();
			waitForElement(selenium, Buddy_Arifin);
			break;
		case 1 :
			/* Name */
			waitForText(2);
			System.out.println("Search By Name Test");
			SearchByList.get(1).click();
			waitForText(2);
			SearchTextField.sendKeys(DataSearch[0]);
			waitForText(3);
			ButtonSearchList.click();
			waitForElement(selenium, Buddy_Arifin);
			break;
		case 2 :
			/* Project ID */
			System.out.println("Search By Project ID Test");
			waitForText(2);
			SearchByList.get(2).click();
			waitForText(3);
			SearchTextField.sendKeys(DataSearch[1]);
			ButtonSearchList.click();
			waitForElement(selenium, Buddy_Arifin);
			break;
		case 3 :
			/* Employee ID*/
			System.out.println("Search By Employee ID Test");
			waitForText(2);
			SearchByList.get(3).click();
			SearchTextField.sendKeys(DataSearch[2]);
			waitForText(3);
			ButtonSearchList.click();
			waitForElement(selenium, Buddy_Arifin);
			break;
		}
	}
	
}
