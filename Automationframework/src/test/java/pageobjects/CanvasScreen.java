/* soYou Gyanmatrix Technologies pvt ltd.
 * created by kiran
 */
package pageobjects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.ios.IOSDriver;

public class CanvasScreen {
	@SuppressWarnings("rawtypes")
	protected IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public CanvasScreen(IOSDriver driver) {
		this.driver = driver;
	}
	/*page labels*/
	By settingsButton = By.xpath("//XCUIElementTypeButton[@name='settings']");
	By ProfilePicture = By.name("Default_FB");
	By coverPicture = By.name("cover_Canvas");
	By notificationsTab = By.xpath("//XCUIElementTypeButton[@name='Notifications']");
	By popovertext = ByAccessibilityId.AccessibilityId("Send something to a friend... and see what comes back");
	By sentItemttab = By.xpath("//XCUIElementTypeButton[@name='Sent Items']");
	By canvasTab = By.xpath("XCUIElementTypeTabBar[0]");
	By searchTab = By.xpath("XCUIElementTypeTabBar[1]");
	By composeTab = By.xpath("XCUIElementTypeTabBar[2]");
	By noGiftsText = By.name("No gifts found");
	By swipePrivate = ByAccessibilityId.AccessibilityId("Swipe Next");
	By SwipePrevious = ByAccessibilityId.AccessibilityId("Swipe Previous");
	By menubutton = ByAccessibilityId.AccessibilityId("menu");
	
	/* click on Settings button */
	public boolean IsSettingsButtonDisplayed() {
		try {
			driver.findElement(settingsButton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	/* click on notificationsTab button */
	public boolean IscanvasPopUpDisplayed() throws InterruptedException {
		try {
			Thread.sleep(5000);
			return driver.findElement(popovertext).isDisplayed();	 
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* click on notificationsTab button */
	public boolean IsnotificationsTabDisplayed() {
		try {
			driver.findElement(notificationsTab).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* click on sentItemttab button */
	public boolean IssentItemttabDisplayed() {
		try {
			driver.findElement(sentItemttab).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean navigateToPrivateCanvas() throws InterruptedException {
		try {
			driver.findElement(swipePrivate).click();
			Thread.sleep(2000);;
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public boolean IsSwipePreviousDisplayed() {
		try {
			driver.findElement(SwipePrevious).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean IsHamburgerMenuDisplayed() {
		try {
			driver.findElement(menubutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* click on canvasTab button */
	public boolean IscanvasTabDisplayed() {
		try {
			driver.findElement(canvasTab).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* click on searchTab button */
	public boolean IssearchTabDisplayed() {
		try {
			driver.findElement(searchTab).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* click on composeTab button */
	public boolean IscomposetabDisplayed() {
		try {
			driver.findElement(composeTab).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* verify noGiftsText button */
	public boolean IsnoGiftsTextDisplayed() {

		try {
			driver.findElement(By.name("noGiftsText")).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
}