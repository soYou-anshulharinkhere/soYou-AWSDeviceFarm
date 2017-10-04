/* soYou Gyanmatrix Technologies pvt ltd.
 * created by kiran
 */
package pageobjects;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.tools.DocumentationTool.Location;

import org.aspectj.asm.IProgramElement.Accessibility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.ios.IOSDriver;

@SuppressWarnings("unused")
public class LoginScreen {
	@SuppressWarnings("rawtypes")
	public IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public LoginScreen(IOSDriver driver) {
		this.driver = driver;
	}

	/* Page Labels */
	By DontAllowPermissions = By.xpath("//XCUIElementTypeButton[@name='Don’t Allow']");
	By Verifyyournumbertitle = By.name("Verify Your Number");
	By SMSVerificationmessage = By.name("SoYou will send an SMS message to verify your phone number.");
	By Countryselectiontab = By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton");
	By mobilenumberfield = By.xpath("//XCUIElementTypeTextField[@value='Mobile Number']");
	By mobilenumberfield2 = By.xpath("//XCUIElementTypeTextField");
	By countrycode = By.name("+91");
	By submitbutton = ByAccessibilityId.AccessibilityId("Submit");
	By searchcountry = By.xpath("//XCUIElementTypeTextField[@value='Search']");
	By cancel = ByAccessibilityId.AccessibilityId("Cancel");
	By EnterOTPtitle = By.xpath("//XCUIElementTypeStaticText[@name='Enter OTP']");
	By allow = ByAccessibilityId.AccessibilityId("Allow");
	By Dont_allow = ByAccessibilityId.AccessibilityId("Don’t Allow");
	By Done = ByAccessibilityId.AccessibilityId("Done");
	By CountrySearchBar = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell");
	By OTPValue = By.xpath("//XCUIElementTypeButton[@name='1']");
	By OKButton = ByAccessibilityId.AccessibilityId("OK");
	By ResendOtp = By.xpath("XCUIElementTypeButton[@name='Resend OTP']");
	
	/* click on submit button */
	public boolean clickSubmit() {
		try {
			driver.findElement(submitbutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Submit Button is  not Displayed");
			return false;
		}
	}

	/* click on cancel button */
	public boolean clickCancel() {
		try {
			driver.findElement(cancel).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Cancel Button is  not Displayed");
			return false;
		}
	}

	/*
	 * Entering mobile number
	 * 
	 * @param mobileNumber of the user
	 */
	public boolean IsMobileNumberFieldDisplayed(String mobileNumber) {
		try {
			assert (driver.findElement(mobilenumberfield).isDisplayed());
			driver.findElement(mobilenumberfield).clear();
			driver.findElement(mobilenumberfield).sendKeys(mobileNumber);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Mobile Number is not entered");
			return false;
		}
	}

	/*
	 * Enter OTP number
	 * 
	 * @param OTPnumber which user receives
	 */
	public boolean EnterOTP() throws InterruptedException {
		try {
			Thread.sleep(1000);
			for (int i = 0; i <= 3; i++) {
				// click the button 1 in loop
				driver.findElement(OTPValue).click();
				}
			Thread.sleep(1000);
			if (isOkayButtonDisplayed()) {
					driver.findElement(OKButton).click();
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Select country cell is  not Displayed");
			return false;
		}
	}

	/* assert OK Button */
	public boolean isOkayButtonDisplayed() {

		try {
			return driver.findElement(OKButton).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/*
	 * asserting Select country cell
	 */
	public boolean ISSelectCountryCellDisplayed()throws InterruptedException {
		try {
			if (IsNotoficationPermissionPopupDisplayed()) {
				driver.findElement(allow).click();
				Thread.sleep(500);
				driver.findElement(Countryselectiontab).isDisplayed();
				driver.findElement(Countryselectiontab).click();
				return true;
			} else {
				driver.findElement(Countryselectiontab).isDisplayed();
				driver.findElement(Countryselectiontab).click();
				return true;
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Select country cell is  not Displayed");
			return false;
		}
	}

	/*
	 * asserting Country searchbar
	 * 
	 * @param country name name of the country which is selected
	 */
	@SuppressWarnings("unchecked")
	public boolean ISSelectCountrysearchBarDisplayed(String countryname)throws InterruptedException {
		try {
			driver.findElement(searchcountry).isDisplayed();
			driver.findElement(searchcountry).sendKeys(countryname);
			List<WebElement> countryList = driver.findElements(CountrySearchBar);
			countryList.get(0).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Select country searchbar is  not Displayed");
			return false;
		}
	}

	/* assert Allow Button */
	public boolean IsNotoficationPermissionPopupDisplayed() {
		try {
			driver.findElement(allow).isDisplayed();
			driver.findElement(allow).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Allow Button is  not Displayed");
			return false;
		}
	}

	/*
	 * Resend OTP number
	 * 
	 * @param OTPnumber which user receives
	 */
	public boolean resendOTP() throws InterruptedException {
		try {
			Thread.sleep(30000);
			driver.findElement(ResendOtp).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Resend OTP is  not Displayed");
			return false;
		}
	}

	/*
	 * verifying selected Country
	 * 
	 * @param countryname name of the country which is selected
	 */
	public boolean VerifySelectedCountry(String countryname)
			throws InterruptedException {
		try {
			driver.findElement(Countryselectiontab).getText().equals(countryname);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/*
	 * Verifying mobile number
	 * 
	 * @param mobileNumber Mobile number which is entered
	 */
	public boolean VerifyTheMobileNumber(String MobileNumber) throws InterruptedException {
		try {
			Thread.sleep(5000);
			System.out.println("value"+driver.findElement(mobilenumberfield2).getAttribute("value"));
			return driver.findElement(mobilenumberfield2).getAttribute("value").equals(MobileNumber);
			
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Entered Mobile Number is not matched");
			return false;
		}
	}

	/* Verify EnterOTPtitle */
	public boolean VerifyEnterOTPtitle() throws InterruptedException {
		try {
	//		Thread.sleep(5000);
			return driver.findElement(EnterOTPtitle).isDisplayed();
			
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Enter OTP Title is  not Displayed");
			return false;
		}
	}

	/* Verify mobile number title */
	public boolean VerifyMobileNumberTitle() {
		try {
			driver.findElement(Verifyyournumbertitle).isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println(" Verify Mobile Number text is  not Displayed");
			return false;
		}
	}
}