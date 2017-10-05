/* soYou Gyanmatrix Technologies pvt ltd.
 * created by kiran
 */
package pageobjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.ios.IOSDriver;

public class Settingsmenupage {
	protected IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public Settingsmenupage(IOSDriver driver) {
		this.driver = driver;
	}

	/* page labels */
	By noblockeduser = By.xpath("//XCUIElementTypeStaticText[@name='No Blocked User(s)']");
	By Backbutton = ByAccessibilityId.AccessibilityId("Back");
	By About = ByAccessibilityId.AccessibilityId("About");
	By soYouLogo = ByAccessibilityId.AccessibilityId("soyou_logo");
	By done = ByAccessibilityId.AccessibilityId("Done");
	By Accountbutton = By.xpath("//XCUIElementTypeStaticText[@name='ACCOUNT']");
	By Profilebutton = By.name("Profile");
	By captureButton = ByAccessibilityId.AccessibilityId("PhotoCapture");
	By giftcamera = ByAccessibilityId.AccessibilityId("Gift Camera");
	By BlockedUsersbutton = By.xpath("//XCUIElementTypeStaticText[@name='Blocked Users']");
	By Abouttext = By.xpath("//XCUIElementTypeStaticText[@name='ABOUT']");
	By Privacybutton = By.xpath("//XCUIElementTypeStaticText[@name='Privacy Policy']");
	By privacytext = By.name("SoYou Privacy Policy to be included with General Availability release.");
	By Termsbutton = By.xpath("//XCUIElementTypeStaticText[@name='Terms']");
	By Logoutbutton = By.xpath("//XCUIElementTypeStaticText[@name='Log out']");
	By menuButton = By.xpath("//XCUIElementTypeButton[@name='menu']");
	By OKbutton = By.xpath("//XCUIElementTypeButton[@name='OK']");
	By yesButton = By.xpath("//XCUIElementTypeButton[@name='Yes']");
	By noButton = By.xpath("//XCUIElementTypeButton[@name='No']");
	By SMSVerificationmessage=By.name("SoYou will send an SMS message to verify your phone number.");
	By chooseButton = By.xpath("//XCUIElementTypeButton[@name='Choose']");
	By OKButton = By.xpath("//XCUIElementTypeButton[@name='OK']");
	By UseButton = By.xpath("//XCUIElementTypeButton[@name='Use']");
	By CameraButton = By.xpath("//XCUIElementTypeButton[@name='Camera']");
	By RemoveButton = By.xpath("//XCUIElementTypeButton[@name='Remove']");
	By editIcon = ByAccessibilityId.AccessibilityId("Edit Icon");
	By OKalert = By.xpath("//XCUIElementTypeButton[@name='Ok']");
	By UsePhoto =By.xpath("//XCUIElementTypeButton[@name='Use Photo']");
	By edit = ByAccessibilityId.AccessibilityId("Edit");
	By textField = By.xpath("//XCUIElementTypeTextField");
	By addFriends = ByAccessibilityId.AccessibilityId("Add Friends");
	By imageButton = By.xpath("//XCUIElementTypeButton[@name='Button']");
	By ImageCell = By.xpath("//XCUIElementTypeCell");
	By imageselectButton = By.xpath("//XCUIElementTypeButton[@name='Select(1)']");
	By AllPhotos = By.xpath("//XCUIElementTypeCell[@name='All Photos']");
	
	/* assert Back button */
	public boolean isBackbuttonClicked() {
		try {
			driver.findElement(Backbutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert Add Friends Button */
	public boolean isAddFriendsButtonClicked() {
		try {
			driver.findElement(addFriends).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Account button */
	public boolean Accountbutton() {
		try {
			driver.findElement(menuButton).click();
			driver.findElement(Accountbutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert OK Button */
	public boolean isOKButtonDisplayed() {

		try {
			return driver.findElementByName("OK").isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* Entering user details */
	@SuppressWarnings("unchecked")
	public boolean enteruserdetails(String firstname, String lastname) {

	try{
		driver.findElement(menuButton).click();
		driver.findElement(Profilebutton).click();
		List<WebElement> edit = driver.findElements(editIcon);
		List<WebElement> textFields= driver.findElements(textField);
		textFields.get(0).clear();
		edit.get(0).sendKeys(firstname);
		textFields.get(1).clear();
		edit.get(1).sendKeys(lastname);
		driver.getKeyboard().sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//XCUIElementTypeTextField[1]")).clear();
//		driver.findElement(By.xpath("//XCUIElementTypeTextField[1]")).sendKeys(firstname);
//		driver.findElement(By.xpath("//XCUIElementTypeTextField[2]")).clear();
//		driver.findElement(By.xpath("//XCUIElementTypeTextField[2]")).sendKeys(lastname);
//		driver.findElement(OKbutton).click();
		driver.findElement(Backbutton).click();
		driver.findElement(Backbutton).click();
		return true;
	}
		catch(org.openqa.selenium.NoSuchElementException e){
			return false;
		}
	}
	
	/* click on Profile button */
	@SuppressWarnings("unchecked")
	public boolean enteruserdetails(String firstname, String lastname,String email) throws InterruptedException {
		try{
		driver.findElement(menuButton).click();
		driver.findElement(By.name("Profile")).click();
		List<WebElement> edit = driver.findElements(editIcon);
		List<WebElement> textFields= driver.findElements(textField);
		textFields.get(0).clear();
		edit.get(0).sendKeys(firstname);
		textFields.get(1).clear();
		edit.get(1).sendKeys(lastname);
		driver.getKeyboard().sendKeys(Keys.ENTER+"\n");
		driver.findElement(Backbutton).click();
		driver.findElement(Backbutton).click();
		Thread.sleep(200);
		return true;
		}
		catch(org.openqa.selenium.NoSuchElementException e){
			return false;
		}
	}
	
	/* click on Blocked Users button */
	public boolean isBlockedUsersbuttonDisplayed() {
		try {
			
			driver.findElement(BlockedUsersbutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert About text */
	public boolean isAbouttextDisplayed() throws InterruptedException {
		try {
			Thread.sleep(1000);
			return  driver.findElement(Abouttext).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* click on Privacy button */
	public boolean isPrivacyPolicyButtonDisplayed() throws InterruptedException {
		try {
			driver.findElement(Privacybutton).click();
			Thread.sleep(3000);
			driver.findElement(Privacybutton).isDisplayed();
			driver.findElement(privacytext).isDisplayed();
			driver.findElement(done).click();
			//TO DO
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* click on Terms button */
	public boolean isTermsbuttonDisplayed() throws InterruptedException {
		try {
			driver.findElement(Termsbutton).click();
			Thread.sleep(3000);
			driver.findElement(By.name("Terms and Conditions")).isDisplayed();
			driver.findElement(By.name("SoYou Terms to be included with General Availability release")).isDisplayed();
			driver.findElement(done).click();
			//To Do
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	/* click on About button */
	public boolean clickOnAboutbutton() throws InterruptedException {
		try {
			driver.findElement(About).click();
			Thread.sleep(2000);
			driver.findElement(soYouLogo).isDisplayed();
			driver.findElement(By.name("(c) Joyn Inc. 2017")).isDisplayed();
			driver.findElement(Backbutton).click();
			//To Do
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* click on Logout button */
	public boolean clickOnLogoutButton() throws InterruptedException {
		try {
			Thread.sleep(5000);
			driver.findElement(Logoutbutton).click();
			driver.findElement(yesButton).click();
	//		assert(driver.findElement(SMSVerificationmessage).isDisplayed());
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
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
	
	/* set profile picture */
		@SuppressWarnings("unchecked")
		public boolean setProfilepicture() throws InterruptedException{
			try {
				driver.findElement(Profilebutton).click();
				List<WebElement> e = driver.findElements(edit);
				e.get(0).click();
				driver.findElement(By.name("Camera")).click();
				if (isOKButtonDisplayed()) {
					driver.findElement(OKButton).click();
					driver.findElement(captureButton).click();
					Thread.sleep(3000);
					driver.findElement(UsePhoto).click();
					Thread.sleep(10000);
					return true;
				} else {
					Thread.sleep(1000);
					driver.findElement(captureButton).click();
					Thread.sleep(3000);
					driver.findElement(UsePhoto).click();
					Thread.sleep(10000);

				}
			driver.findElement(Backbutton).click();
			driver.findElement(Backbutton).click();
			return true;
				
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		
		/* update profile picture */
		
	@SuppressWarnings("unchecked")
	public boolean updateProfilepicture() throws InterruptedException {
		try {
			Thread.sleep(2000);
			driver.findElement(menuButton).click();
			driver.findElement(Profilebutton).click();
			List<WebElement> list = driver.findElements(edit);
			list.get(0).click();
			driver.findElement(By.name("Camera")).click();
			if (isOKButtonDisplayed()) {
				driver.findElement(OKbutton).click();
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(10000);
				return true;
			} else {
				Thread.sleep(2000);
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(10000);
			}
			driver.findElement(Backbutton).click();
			driver.findElement(Backbutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
		
		/* update cover picture */
		@SuppressWarnings("unchecked")
		public boolean updateCoverpicture() throws InterruptedException  {
			try {
				Thread.sleep(2000);
				driver.findElement(menuButton).click();
				driver.findElement(Profilebutton).click();
				List<WebElement> list = driver.findElements(edit);
				list.get(1).click();
				driver.findElementByName("Photos").click();
				Thread.sleep(1000);
				driver.findElement(AllPhotos).click();
//				List<WebElement> e2 = driver.findElements(ImageCell);
//				System.out.println(e2);
//				e2.get(11).click();
				Thread.sleep(2000);
				TouchAction  ts= new TouchAction(driver).tap(61, 668).perform();
				driver.findElement(done).click();
				Thread.sleep(15000);
				driver.findElement(Backbutton).click();
				driver.findElement(Backbutton).click();
				return true;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
	
		
		/* assert OK Button */
		public boolean isNoProfilePicture(){
			
			try{
				return driver.findElementByName("Gallery").isDisplayed();
			}catch(org.openqa.selenium.NoSuchElementException e){
				return false;
			}
		}

		public boolean IsMenuButtonClicking() throws InterruptedException{
			try {
				Thread.sleep(2000);
				driver.findElement(menuButton).click();
			
			return true;
				
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		
		public boolean IsNoBlockedUserTextDisplayed() throws InterruptedException{
			try {
				Thread.sleep(2000);
				driver.findElement(noblockeduser).isDisplayed();
				driver.findElement(Backbutton).click();
		//		assert(driver.findElement(BlockedUsersbutton).isDisplayed());
			
			return true;
				
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		
}