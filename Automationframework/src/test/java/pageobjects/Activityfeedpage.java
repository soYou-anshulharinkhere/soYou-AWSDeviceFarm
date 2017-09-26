package pageobjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class Activityfeedpage {
	@SuppressWarnings("rawtypes")
	protected IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public Activityfeedpage(IOSDriver driver) {
		this.driver = driver;
	}

	/* page labels */
	By Tabbar = By.xpath("//XCUIElementTypeTabBar");
	By ActivtyText = By.xpath("//XCUIElementTypeStaticText[@name='Activity']");
	By Activitycell = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell");
	By Usernamecell = By.xpath("//XCUIElementTypeCell/XCUIElementTypeStaticText");
	By Backbutton = By.xpath("//XCUIElementTypeButton[@name='Back']");

	@SuppressWarnings("unchecked")
	public boolean viewPostFromActivityFeed() throws InterruptedException {
		try {

			driver.findElement(Tabbar).isDisplayed();
			List<WebElement> list = driver.findElements(Tabbar);
			list.get(4).click();
		//	driver.findElements(Tabbar).get(4).click();
			assert (driver.findElement(ActivtyText).isDisplayed());
			System.out.println(driver.findElements(Activitycell).size());
			List<WebElement> Activitylist = driver.findElements(Activitycell);
			Activitylist.get(1).click();
			//driver.findElements(Activitycell).get(1).click();
			Thread.sleep(500);
			assert (driver.findElement(Usernamecell).isDisplayed());
			driver.findElement(Backbutton).click();
			assert (driver.findElement(ActivtyText).isDisplayed());
			list.get(0).click();
	//		driver.findElements(Tabbar).get(0).click();
			assert (driver.findElementByAccessibilityId("menu").isDisplayed());
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	/* assert Tab Bar */
	public boolean isTabBarDisplayed(){
		
		try{
			return driver.findElement(Tabbar).isDisplayed();
		}catch(Exception e){
			return false;
		}
	}
}