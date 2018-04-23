/* soYou Gyanmatrix Technologies pvt ltd.
 * created by kiran
 */
package pageobjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.ios.IOSDriver;
 
public class Notifications_tab {
	
	@SuppressWarnings("rawtypes")
	protected IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public Notifications_tab(IOSDriver driver) {
		this.driver = driver;
	}

	/* page labels */
	By notifcationstitle= By.xpath("//XCUIElementTypeStaticText[@name='Notifications'");
	By notificationscell = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell");
	By backwardButton = By.xpath("//XCUIElementTypeButton[@name='backward arrow']");
	By back = By.xpath("//XCUIElementTypeNavigationBar/XCUIElementTypeButton[@name='Back']");
	By closeButton = By.xpath("//XCUIElementTypeButton[@name='close']");
	By moreButton = By.xpath("//XCUIElementTypeButton[@name='more black']");
	By spambutton = By.xpath("//XCUIElementTypeButton[@name='Spam']");
	By spamtext = By.xpath("//XCUIElementTypeStaticText[@name='Do you wish to report this gift as Spam?']");
	By yesButton = By.xpath("//XCUIElementTypeButton[@name='Yes']");
	By noButton = By.xpath("//XCUIElementTypeButton[@name='No']");
	By spamdonetext = By.xpath("//XCUIElementTypeStaticText[@name='You marked this content as spam']");
	By okButton = By.xpath("//XCUIElementTypeButton[@name='Ok']");
	By TabbarButton = By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton");
	By Backbutton = ByAccessibilityId.AccessibilityId("Back");
	
	
	/* verify notification title */
	public boolean verifynotificationtitle() {
		try {
			driver.findElement(notifcationstitle).isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Back button */
	public boolean isBackbuttonClicked() {
		try {
			assert(driver.findElement(Backbutton).isDisplayed());
			driver.findElement(Backbutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* swipe to You Tab */
	@SuppressWarnings("unused")
	public boolean SwipeToYouTab() {
		try {
			TouchAction ts = new TouchAction(driver).press(343, 258).moveTo(-315, 1).release().perform();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	/* verify notification title */
	@SuppressWarnings("unused")
	public boolean SwipeToFriendsTab() {
		try {
			TouchAction  ts= new TouchAction(driver).press(24, 160).moveTo(374, 0).release().perform();
		return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	/* verify comment notification */
	@SuppressWarnings("unchecked")
	public boolean verifycommentnotification() {
		try {
			List<WebElement> list = driver.findElements(TabbarButton);
			list.get(3).click();
			driver.findElement(notificationscell).isDisplayed();
			List<WebElement> list1 = driver.findElements(notificationscell);
			list1.get(1).click();
			driver.findElement(By.xpath("//XCUIElementTypeCell/XCUIElementTypeButton")).click();
			driver.findElement(backwardButton).click();
			driver.findElement(back).click();
			list.get(0).click();
//			driver.findElements(By.xpath("///XCUIElementTypeTabBar/XCUIElementTypeButton")).get(0).click();
		//	assert(driver.findElements(By.xpath("//XCUIElementTypeCell/XCUIElementTypeButton")).get(1).isDisplayed());
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* verify post notification */
	@SuppressWarnings("unchecked")
	public boolean verifypostnotification() throws InterruptedException {
		try {
			Thread.sleep(500);
			List<WebElement> list = driver.findElements(TabbarButton);
		//	list.get(0).click();
			list.get(3).click();
			Thread.sleep(1000);
		//assert(	driver.findElement(notificationscell).isDisplayed());
			List<WebElement> cellList = driver.findElements(notificationscell);
			cellList.get(2).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* verify post notification */
	@SuppressWarnings("unchecked")
	public boolean verifyFreindspostnotification() throws InterruptedException {
		try {
			Thread.sleep(1000);
			
			List<WebElement> cellList = driver.findElements(notificationscell);
			System.out.println(cellList.size());
			cellList.get(2).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
		/* mark post as spam */
		@SuppressWarnings("unchecked")
		public boolean marksPostAsSpam() {
			
			try {
				List<WebElement> list = driver.findElements(TabbarButton);
				list.get(0).click();
				list.get(3).click();
				driver.findElement(notificationscell).isDisplayed();
				List<WebElement> cellList = driver.findElements(notificationscell);
				cellList.get(4).click();
//				driver.findElements(notificationcell).get(4).click();
				driver.findElement(moreButton).click();
				driver.findElement(spambutton).click();
				driver.findElement(spamtext).isDisplayed();
				driver.findElement(yesButton).click();
				driver.findElement(spamdonetext).isDisplayed();
				driver.findElement(okButton).click();
				driver.findElement(back).click();
				List<WebElement> elementList = driver.findElements(By.xpath("//XCUIElementTypeCell/XCUIElementTypeButton"));
				elementList.get(0).click();
//				driver.findElements(By.xpath("///XCUIElementTypeTabBar/XCUIElementTypeButton")).get(0).click();
				return true;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
	}
		
}