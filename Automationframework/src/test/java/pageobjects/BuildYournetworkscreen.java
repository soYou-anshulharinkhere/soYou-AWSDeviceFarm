/* soYou Gyanmatrix Technologies pvt ltd.
 * created by kiran
 */
package pageobjects;

import java.util.List;
import java.util.NoSuchElementException;

import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuildYournetworkscreen {
	@SuppressWarnings("rawtypes")
	protected IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public BuildYournetworkscreen(IOSDriver driver) {
		this.driver = driver;
	}

	/* page labels */
	By nameField = By.xpath("//XCUIElementTypeTextField[@value='Enter name(s)']");
	By BuildYourNetworkScreen = By.xpath("//XCUIElementTypeStaticText[@name='Build Your Network']");
	By Centerlogo = By.xpath("//XCUIElementTypeImage[@name='friends-icon']");
	By Invitemessagetitle = By.xpath("//XCUIElementTypeStaticText [@name='Things are better when you share with your friends. Invite your friends!']");
	By lookupfriendbutton = By.xpath("//XCUIElementTypeButton [@name='Look Up Friends']");
	By Skipbutton = By.xpath("//XCUIElementTypeButton [@name='Skip']");
	By plusbutton = By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton");
	By selectButton = By.xpath("//XCUIElementTypeButton[@name='verification mark']");
	

	/* click on LookUpFriends button */
	@SuppressWarnings("unchecked")
	public boolean clickLookUpFriends() {
		try {
			driver.findElement(Centerlogo).isDisplayed();
			driver.findElement(lookupfriendbutton).click();
			if (isOkayButtonDisplayed()) {
				driver.findElementByName("OK").click();
				driver.findElement(By.xpath("//XCUIElementTypeNavigationBar[@name='People']")).isDisplayed();
				List<WebElement> list = driver.findElements(By.xpath("//XCUIElementTypeCell"));
				list.get(2).click();
		//		driver.findElements(By.xpath("//XCUIElementTypeCell")).get(2).click();
				driver.findElement(selectButton).click();
				return true;
				} 
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
		
	}		

	/* assert OK Button */
	public boolean isOkayButtonDisplayed() {

		try {
			return driver.findElementByName("OK").isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/* click on Skip button */
	public boolean clickOnSkip() {
		try {
			driver.findElement(Skipbutton).click();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	/* assert page title */
	public boolean assertBuildYourNetwork() {
		try {
			return  driver.findElement(BuildYourNetworkScreen).isDisplayed();
			
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/* assert page logo */
	public boolean assertfriendsIcon() {
		try {
			return  driver.findElement(Centerlogo).isDisplayed();
			
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/* assert page Invite text */
	public boolean assertInvitetext() {
		try {
			return driver.findElement(Invitemessagetitle).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}