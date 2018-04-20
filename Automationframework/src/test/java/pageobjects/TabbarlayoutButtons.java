package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.ios.IOSDriver;

public class TabbarlayoutButtons {

	protected IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public TabbarlayoutButtons(IOSDriver driver) {
		this.driver = driver;
	}

	/* page labels */
	By Firsttab = By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[1]");
	By Secondtab = By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[2]");
	By Composetab = By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[3]");
	By Fourthtab = By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[4]");
	By Fifthtab = By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[5]");
	
	
	
	
	//Tab Bar Layout
		public boolean Firsttab() {
			try {
				driver.findElement(Firsttab).click();
				return true;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		
		public boolean Secondtab() {
			try {
				driver.findElement(Secondtab).click();
				return true;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		public boolean Composetab() {
			try {
				driver.findElement(Composetab).click();
				return true;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		public boolean Fourthtab() {
			try {
				driver.findElement(Fourthtab).click();
				return true;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		public boolean Fifthtab() {
			try {
				driver.findElement(Fifthtab).click();
				return true;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		
		
		
		
}
