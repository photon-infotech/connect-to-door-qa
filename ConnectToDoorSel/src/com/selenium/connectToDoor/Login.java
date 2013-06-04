package com.selenium.connectToDoor;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.thoughtworks.selenium.DefaultSelenium;

public class Login extends Abstract{

	public Login(){
		
	}
	
	@Test
	public AttandanceList LoginPageTest(WebDriver browser, DefaultSelenium selenium) throws Exception{
//		Login Page = PageFactory.initElements(browser, Login.class);
		PageFactory.initElements(browser, this);
		/* Start Test Case */
		browser.get(URL);
		browser.manage().window().maximize();
		LoginFB.click();
		waitForText(2);
		
		/* To handle two Window */
		Set<String> handels = browser.getWindowHandles();
		Iterator<String> it = handels.iterator();
		while (it.hasNext()){
			String parent = it.next();
			String newwin = it.next();
			browser.switchTo().window(newwin);
		
			//Invalid Input ID
			waitForElement(selenium, userNameFB);
			WebElement inputUserNameFB = browser.findElement(By.xpath(userNameFB));
			inputUserNameFB.sendKeys("fake");
			waitForElement(selenium, password);
			WebElement inputPasswordFB = browser.findElement(By.xpath(password));
			inputPasswordFB.sendKeys("fake");
			waitForElement(selenium, masuk);
			browser.findElement(By.xpath(masuk)).click();
			Assert.assertFalse("Error Display",!selenium.isVisible(Alert));
			System.out.println("Error Display");
			
			//Valid Input ID
			waitForElement(selenium, INPUT_NAME_EMAIL);
			browser.findElement(By.xpath(INPUT_NAME_EMAIL)).sendKeys(HIdden_email);
			waitForElement(selenium, INPUT_NAME_PASS);
			browser.findElement(By.xpath(INPUT_NAME_PASS)).sendKeys(Hidden_Pass);
			waitForElement(selenium, masuk);
			browser.findElement(By.xpath(masuk)).click();
			

			browser.switchTo().window(parent);
		}
		
		waitForElement(selenium, employeeID);
		WebElement inputEmployeeID = browser.findElement(By.xpath(employeeID));
		
		inputEmployeeID.sendKeys("00000");
		waitForElement(selenium, continueButton);
		ContinueButton.click();
		waitForElement(selenium, checkIn);
		Checkin.click();
		
		while (!selenium.isTextPresent(OK_BUTTON_POPUP)){
			try{ waitForText(3);
				if (selenium.isVisible(OK_BUTTON_POPUP)){
					waitForText(3);
					browser.findElement(By.xpath(OK_BUTTON_POPUP)).click();
					break;
				} else{
					System.out.println("Success to CheckIN");
					break;}
			}catch(Exception e){}
		}
		return new AttandanceList(selenium);
	}
	
	

}
