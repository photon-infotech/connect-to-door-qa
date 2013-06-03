package com.selenium.connectToDoor;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.DefaultSelenium;


public class AttendanceForm extends Abstract{
	
	protected AttendanceForm setFullname(String Data, WebDriver browser) {
		PageFactory.initElements(browser, this);
		Fullname.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setUsername(String Data, WebDriver browser) {
		PageFactory.initElements(browser, this);
		Username.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setEmployeeID(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		EmployeeID.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setProjectID(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		ProjectID.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setCOff(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		COff.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setCondolences(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		Condolences.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setMarried(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		Married.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setMaternity(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		Maternity.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setOnsite(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		Onsite.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setPaternity(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		Paternity.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setAnnualLeave(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		AnnualLeave.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setEmailFacebook(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		EmailFacebook.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setEmailPhoton(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		EmailPhoton.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setSignature(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		Signature.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setSick(String Data,WebDriver browser) {
		PageFactory.initElements(browser, this);
		Sick.sendKeys(Data);
		return this;
	}
	protected AttendanceForm setFullName(String Data, WebDriver browser){
		PageFactory.initElements(browser, this);
		Fullname.sendKeys(Data);
		return this;
	}
	protected AttendanceForm getGender(WebDriver browser){
		browser.findElement(By.xpath("//div[@class='form-arrow-box-gender attendance-form-visible']")).click();
		List<WebElement> gender = browser.findElements(By.className("form-dropdown-gender-item"));
		waitForText(2);
		gender.get(0).click();
		return this;
	}
	protected AttendanceForm getRole(WebDriver browser){
		browser.findElement(By.xpath("//div[@class='form-arrow-box attendance-form-visible']")).click();
		List<WebElement> role = browser.findElements(By.className("form-approval-dropdown-item"));
		waitForText(2);
		role.get(4).click();
		return this;
	}
	protected AttendanceForm getStartWork(DefaultSelenium selenium, WebDriver browser){
		
		/* To scroll page with Javascripts Function */
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		jse.executeScript("scroll(0, 250)");
		
		browser.findElement(By.className("ui-datepicker-trigger")).click();
		browser.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		for (int a = 0 ;; a++){
			browser.findElement(By.xpath(iconNextMount)).click();
			waitForText(2);
			if (a>=3) break;
			try { if (selenium.isVisible("February")) break;} catch(Exception e){}
		}
		List<WebElement> date = browser.findElements(By.className("ui-state-default"));
		waitForText(2);
		date.get(12).click();
		return this;
	}
	
	public AttendanceForm(DefaultSelenium selenium) throws Exception{
		waitForElement(selenium, ATTENDANCEFORM_BUTTON);                                                              
	}
	
	
	public AttendanceReport AttendanceFormTest(DefaultSelenium selenium,WebDriver browser) throws Exception{
		PageFactory.initElements(browser, this);
		AttendanceFormButton.click();
		waitForElement(selenium, BUTTON_CREATE_ACCOUNT);
		CreateAccountButton.click();
		RegisterAccountData(selenium, browser);
		return new AttendanceReport(selenium);
	}
	
	public AttendanceForm RegisterAccountData(DefaultSelenium selenium, WebDriver browser){
		System.out.println("Register New Account Test");
		PageFactory.initElements(browser, this);
		
		setFullName(DataAccount[0],browser).setUsername(DataAccount[1],browser)
		.setEmployeeID(DataAccount[2],browser).setProjectID(DataAccount[3],browser)
		.setAnnualLeave(DataAccount[4],browser).setCOff(DataAccount[4],browser)
		.setCondolences(DataAccount[4],browser)
//		;SaveAccountButton.click();
		.setMarried(DataAccount[4],browser).setMaternity(DataAccount[4],browser)
		.setOnsite(DataAccount[4],browser).setPaternity(DataAccount[4],browser)
		.setSick(DataAccount[4], browser).setEmailFacebook(DataAccount[5],browser)
		.setEmailPhoton(DataAccount[6],browser).setSignature(DataAccount[7],browser)
		.getGender(browser).getRole(browser).getStartWork(selenium, browser);
		SaveAccountButton.click();
		waitForText(3);
		return EditAccountData(browser);
	}
	
	public AttendanceForm EditAccountData(WebDriver browser){
		System.out.println("Edit Account Test");
		PageFactory.initElements(browser, this);
		
		EditAccountButton.click();
		SearchAccountBy.click();
		List<WebElement> SearchBy = browser.findElements(By.className("attendance-form-content-drop-text"));
		waitForText(2);
		SearchBy.get(0).click();
		waitForText(2);
		InputEditAccount.sendKeys(DataAccount[1]);
		SearchAccountButton.click();
		waitForText(2);
		setUsername(DataAccount[8], browser);
		SaveAccountButton.click();
		return DeleteAccountData(browser);
	}
	
	public AttendanceForm DeleteAccountData(WebDriver browser){
		System.out.println("Delete Account Test");
		PageFactory.initElements(browser, this);
		
		DeleteAccount.click();
		SearchAccountBy.click();
		List<WebElement> SearchBy = browser.findElements(By.className("attendance-form-content-drop-text"));
		waitForText(3);
		SearchBy.get(1).click();
		waitForText(3);
		System.out.println("xxx");
		InputEditAccountII.sendKeys(DataAccount[2]);
		System.out.println("xxx");
		waitForText(3);
		SearchAccountButton.click();
		DeleteAccountButton.click();
		waitForText(2);
		YesButton.click();
		return this;
	}
}
