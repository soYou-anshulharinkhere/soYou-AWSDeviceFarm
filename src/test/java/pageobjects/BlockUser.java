package pageobjects;

import io.appium.java_client.ios.IOSDriver;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class BlockUser {

	protected IOSDriver driver;

	public BlockUser(IOSDriver driver) {
		this.driver = driver;
	}

	/* page labels */
	By searchField = By.xpath("//XCUIElementTypeSearchField[@name='Search']");
	By trending = By.xpath("//XCUIElementTypeStaticText[@name='Trending']");
	By clearText = By.xpath("//XCUIElementTypeButton[@name='Clear text']");
	By recentSearchtext = By
			.xpath("//XCUIElementTypeStaticText[@name='Recent Search']");
	By moreButton = By.xpath("//XCUIElementTypeButton[@name='more']");
	By blockButton = By.xpath("//XCUIElementTypeButton[@name='Block']");
	By unblockButton = By.xpath("//XCUIElementTypeButton[@name='Unblock']");
	By closeButton = By.xpath("//XCUIElementTypeButton[@name='close']");
	By cancelButton = By.xpath("//XCUIElementTypeButton[@name='Cancel']");
	By canvasTab = By.xpath("XCUIElementTypeTabBar[0]");

	/* Block user */
	public boolean blockUser() {
		try {
			driver.findElement(moreButton).isDisplayed();
			driver.findElement(moreButton).click();
			driver.findElement(blockButton).isDisplayed();
			driver.findElement(blockButton).click();
			driver.findElement(canvasTab).click();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/* Unblock user */
	public boolean unblockUser() {
		try {
			driver.findElement(moreButton).isDisplayed();
			driver.findElement(moreButton).click();
			driver.findElement(unblockButton).isDisplayed();
			driver.findElement(unblockButton).click();
			driver.findElement(closeButton).click();
			driver.findElement(searchField).click();
			driver.findElement(cancelButton).isDisplayed();
			driver.findElement(cancelButton).click();
			driver.findElement(canvasTab).click();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}