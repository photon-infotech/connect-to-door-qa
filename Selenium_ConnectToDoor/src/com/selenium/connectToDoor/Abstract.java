package com.selenium.connectToDoor;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SeleneseCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebDriverCommandProcessor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.DataProvider;

import junit.framework.TestCase;
import com.google.common.base.Function;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class Abstract {
	WebDriver browser;
	protected static final String BUTTON_CREATE_ACCOUNT = "//div[@class='attendance-form-button-create-account']";
	private static final String WAIT_FOR_ELEMENT_VISIBLE = " <<<< Loading >>>>";
	protected static final String Buddy_Arifin = "//div[contains(text(), 'Buddy Arifin')]";
	protected static final String Alert = "//div[@class='pam login_error_box uiBoxRed']";
	protected static final String URL = "http://172.17.10.165/Attendance-UI/assets/www/html/Attendance.html#attendanceLoginFacebook";
	protected static final String ATTENDACE_MENU_BUTTON_LIST = "//div[@class='attendace-menu-button-list']";
	protected static final String SEARCH_BUTTON_TEXT = "//div[@class='search-button-text']";
	
//	DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*safari", "http://www.google.com");
//	CommandExecutor executor = new SeleneseCommandExecutor(selenium);
//	DesiredCapabilities dc = new DesiredCapabilities();
//	WebDriver browser = new RemoteWebDriver(executor, dc);
//	DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.google.com");
//	DefaultSelenium selenium = new WebDriverBackedSelenium(browser, "http://www.google.com");
	
	/* login */ 
	protected static final String loginFB = "//div[@class='button-login-facebook']";
	protected static final String userNameFB = "//input[@class='inputtext']";
	protected static final String password = "//input[@class='inputpassword']";
	protected static final String masuk = "//input[@id='u_0_1']";
	protected static final String employeeID = "//input[@class='employee-id-input-bg']";
	protected static final String continueButton = "//div[@class='continue-button']";
	protected static final String checkIn = "//div[@class='attendance-menu-button-checkin']";
	protected static final String signOut = "//div[@class='attendance-footer-right']";
	protected static final String Hidden_Pass = "1234567890";
	protected static final String HIdden_email = "ridho.jetfire@hotmail.com";
	protected static final String INPUT_NAME_PASS = "//input[@name='pass']";
	protected static final String INPUT_NAME_EMAIL = "//input[@name='email']";
	protected static final String OK_BUTTON_POPUP = "//div[contains(@class, 'navigation-controler')][last()]//div[@class='attendance-dom']//div[@class='avs-mask-main']//div[contains(@class,'avs-ok-button')]";
	
	@CacheLookup
	@FindBy(how=How.XPATH, using= loginFB)
	WebElement LoginFB;
	@CacheLookup
	@FindBy(how=How.XPATH, using= continueButton)
	WebElement ContinueButton;
	@CacheLookup
	@FindBy(how=How.XPATH, using=checkIn)
	WebElement Checkin;
	
	/* Attandance List */
	protected static final String inputDatePicker = "//input[@class='attendance-list-date-start hasDatepicker']";
	protected static final String iconNextMount = "//span[@class='ui-icon ui-icon-circle-triangle-w']";
	protected static final String january = "//span[contains(text(), 'January')]";
	protected static final String date31 = "//a[contains(text(), '28')]";
	protected static final String untilDatePicker = "//input[@class='attendance-list-date-until hasDatepicker']";
	protected static final String date2 = "//a[contains(text(), '2')]";
	protected static final String Button_Search_AttendanceList = "//div[@class='attendance-list-button-search']";
	protected static final String Search_By_TextField = "//input[@class='attendance-search-input-text']";
	String[] DataSearch = {"Buddy Arifin","1624","I0061" };
	
	@CacheLookup
	@FindBy(how=How.XPATH, using=Button_Search_AttendanceList)
	WebElement ButtonSearchList;
	@CacheLookup
	@FindBy(how=How.XPATH, using=Search_By_TextField)
	WebElement SearchTextField;
	
	/* Check Out */
	protected static final String alreadyCheckIn = "//div[@class='avs-error-image']";
	protected static final String okCheckInButton = "//div[@style='']/div/div/div[2]";
	protected static final String checkOut = "//div[@class='attendance-menu-button-checkout']";
	
	/* Profile */
	protected static final String profile = "//div[@class='attendance-menu-button-profile']";
	protected static final String ATTENDANCE2 = "//div[@class= 'attendance-profile-button-attendance']";
	@CacheLookup
	@FindBy(how=How.XPATH, using= profile)
	WebElement Profile;
	@CacheLookup
	@FindBy(how=How.XPATH, using = ATTENDANCE2)
	WebElement Attendance;
	/* Daily Attendance & Attendance List */
	protected static final String attandanceList = "//div[@class='attendace-menu-button-list']";
	protected static final String dailyAttandance = "//div[@class='attendace-menu-button-attendance']";
	protected static final String husein = "//div[contains(text(),'Husin Basari')]";
	protected static final String Havid = "//div[contains(text(),'Havid Yulianto')]";
	protected static final String backButton = "//div[@class='attendance-footer-left']";
	protected static final String searchEmployeeID = "//div[@class='content-dd']/div[4]";
	@CacheLookup
	@FindBy(how=How.XPATH, using= attandanceList)
	WebElement AttendanceList;
	@CacheLookup
	@FindBy(how=How.XPATH, using= dailyAttandance)
	WebElement DailyAttendance;
	
	/* Attendance Report */
	protected static final String FILTER_BY = "//div[@class='attendance-report-image-arrow']";
	protected static final String FEBRUARY = "//a[contains(text(),'February')]";
	protected static final String REPORT_MONTH_YEAR_PICKER = "//div[@class = 'attendance-report-month-year-picker']";
	protected static final String ATTENDANCE_MENU_BUTTON_REPORT = "//div[@class='attendance-menu-button-report']";
	@CacheLookup
	@FindBy (how=How.XPATH, using = ATTENDANCE_MENU_BUTTON_REPORT)
	WebElement AttendanceReport;
	@CacheLookup
	@FindBy (how=How.XPATH, using=REPORT_MONTH_YEAR_PICKER)
	WebElement DatePickerAttendanceReport;
	@CacheLookup
	@FindBy(how=How.XPATH, using=FEBRUARY)
	WebElement Date_February;
	@CacheLookup
	@FindBy(how=How.XPATH, using = FILTER_BY)
	WebElement FilterBy;
	
	
	/* Attendance Form */
	protected static final String ATTENDANCEFORM_BUTTON = "//div[@class='attendance-menu-button-form']";
	@CacheLookup
	@FindBy (how = How.XPATH, using = backButton)
	WebElement Back;
	@CacheLookup
	@FindBy(how=How.XPATH, using=ATTENDANCEFORM_BUTTON)
	WebElement AttendanceFormButton;
	@CacheLookup
	@FindBy(how=How.XPATH, using = BUTTON_CREATE_ACCOUNT)
	WebElement CreateAccountButton;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-background-input-fullname attendance-form-visible']")
	WebElement Fullname;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-background-input-username attendance-form-visible']")
	WebElement Username;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-background-input-employeeid attendance-form-visible']")
	WebElement EmployeeID;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-background-input-projectid attendance-form-visible']")
	WebElement ProjectID;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-bg-input-coff attendance-form-visible']")
	WebElement COff;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-bg-input-condolences attendance-form-visible']")
	WebElement Condolences;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-bg-input-married attendance-form-visible']")
	WebElement Married;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-input-bg-maternity attendance-form-visible']")
	WebElement Maternity;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-input-bg-onsite attendance-form-visible']")
	WebElement Onsite;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-bg-input-paternity attendance-form-visible']")
	WebElement Paternity;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-bg-input-annual attendance-form-visible']")
	WebElement AnnualLeave;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-bg-input-email-facebook attendance-form-visible']")
	WebElement EmailFacebook;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-bg-input-email attendance-form-visible']")
	WebElement EmailPhoton;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='form-signature-input attendance-form-visible']")
	WebElement Signature;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-bg-input-sick attendance-form-visible']")
	WebElement Sick;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//div[@class='attendance-form-button-save']")
	WebElement SaveAccountButton;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//div[@class='attendance-form-button-edit-account']")
	WebElement EditAccountButton;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//div[@class='attendance-form-image-arrow']")
	WebElement SearchAccountBy;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@class='attendance-form-background-input-name']")
	WebElement InputEditAccount;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//div[@class='attendance-form-button-search attendance-form-visible']")
	WebElement SearchAccountButton;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//div[@class='attendance-form-button-delete']")
	WebElement DeleteAccountButton;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//div[@class='attendance-form-input-name attendance-form-visible']/input")
	WebElement InputEditAccountII;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//div[@class='attendance-form-button-delete-account']")
	WebElement DeleteAccount;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//div[contains(@class, 'navigation-controler')][last()]//div[@class='attendance-dom']//div[@class='avs-mask-main']//div[contains(@class,'avs-yes-button')]")
	WebElement YesButton;
	
	String[] DataAccount = {"QA TEST", "QA_AQ", "88888", "12345", "12", 
			"100002209905044", "nazgul_sick@yahoo.com", 
			"QA Signature", "TEST QA"};
	
	
	
	public int waitForText (int a) {
		for (int second = 0;; second++) {
			if (second >= 60);
			try {if (second >= a -1) break;} catch(Exception e){}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return a;
	}
	public void waitForElement(DefaultSelenium selenium,String element) throws Exception {
		System.out.println(WAIT_FOR_ELEMENT_VISIBLE);
		while (!selenium.isTextPresent(element)){
			waitForText(3);
			System.out.print(".");
			try {if (selenium.isVisible(element))
			System.out.println(">>>>>> Success For Load Element");
			break;} catch (Exception e){}
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void waitSecond(WebDriver browser, String element) {
		WebElement checkThisElement = browser.findElement(By.xpath(element)); 
		while (!checkThisElement.isDisplayed()){
			waitForText(5);
			System.out.println(WAIT_FOR_ELEMENT_VISIBLE);
//			try {if (checkThisElement.isDisplayed())
//			System.out.println("This element has display: "+element);
//			break;
//			}catch (Exception e){}
		}
	}
	/* To wait Element Until Visible */
	public static WebElement explicitWait(WebDriver browser, final By by){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(browser)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver browser) {
                return browser.findElement(by);
        }
		});
		return element;}
	
	
}

