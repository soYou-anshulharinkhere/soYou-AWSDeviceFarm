package pageobjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class Search_tab {
	protected IOSDriver driver;

	public Search_tab(IOSDriver driver) {
		this.driver = driver;
	}

	/* page labels */
	By searchField = By.xpath("//XCUIElementTypeSearchField[@name='Search']");
	By trending = By.xpath("//XCUIElementTypeStaticText[@name='Trending']");
	By clearText = By.xpath("//XCUIElementTypeButton[@name='Clear text']");
	By Cancel = By.xpath("//XCUIElementTypeButton[@name='Cancel']");
	By recentSearchtext = By.xpath("//XCUIElementTypeStaticText[@name='Recent Search']");
	By closeButton = By.xpath("//XCUIElementTypeButton[@name='close']");
	By cancelButton = By.xpath("//XCUIElementTypeButton[@name='Cancel']");
	By canvasTab = By.xpath("XCUIElementTypeTabBar[0]");
	By backButton = By.xpath("//XCUIElementTypeButton[@name='Back']");
	By back = By.xpath("//XCUIElementTypeButton[@name='back']");
	By close= By.xpath("//XCUIElementTypeButton[@name='close']");
	By tabBar = By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton");
	By trendingtaglist= By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell");
	By TabBar= By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton");
	By listcells= By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell");
	
	
	
	/* assert Trending */
	public boolean Trendingtext() throws InterruptedException {
		try {
			Thread.sleep(500);
			assert(driver.findElement(trending).isDisplayed());
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert Tab Bar */
	public boolean isTabBarDisplayed() {

		try {
			return driver.findElement(TabBar).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* assert Tab Bar */
	@SuppressWarnings("unchecked")
	public boolean clickonSearchTab() {

		try {
			List<WebElement> tabbar =  driver.findElements(TabBar);
			tabbar.get(4).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Trending */
	@SuppressWarnings("unchecked")
	public boolean TrendingTagNavigation() {
		try {
			assert(driver.findElement(trending).isDisplayed());
			List<WebElement> trendinglist = driver.findElements(trendingtaglist);
			trendinglist.size();
			trendinglist.get(0).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Trending */
	public boolean navigateTohashtagDetailView() throws InterruptedException {
		try {
	//		assert(driver.findElement(listcells).getSize());
//			List<WebElement> trendinglist = driver.findElements(listcells);
//			System.out.println(trendinglist.size());
//			trendinglist.get(0).click();
			TouchAction  ts= new TouchAction(driver).tap(239, 104).perform();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* click on Search Tag */
	@SuppressWarnings("unchecked")
	public boolean searchHastag(String searchtext) throws InterruptedException {
		try {
			driver.findElement(searchField).isDisplayed();
			driver.findElement(searchField).clear();
			driver.findElement(searchField).sendKeys(searchtext);
			Thread.sleep(500);
			System.out.println(driver.findElements(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell")).size());
			List<WebElement> list1 = driver.findElements(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell"));
			list1.get(0).click();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/* assert Trending */
	@SuppressWarnings("unchecked")
	public boolean isSearchbarDispalyed() {
		try {
			List<WebElement> list = driver.findElements(tabBar);
			list.get(4).click();
			assert(driver.findElement(searchField).isDisplayed());
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Trending */
	public boolean isbackbuttondisplayed() throws InterruptedException {
		try {
			Thread.sleep(3000);
			driver.findElement(back).click();
			Thread.sleep(500);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Trending */
	public boolean isbackarrowbuttondisplayed() throws InterruptedException {
		try {
			Thread.sleep(3000);
			driver.findElement(backButton).click();
			Thread.sleep(500);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Trending */
	@SuppressWarnings("unchecked")
	public boolean navigateToCanvas() throws InterruptedException {
		try {
			List<WebElement> list = driver.findElements(tabBar);
			list.get(0).isDisplayed();
			list.get(0).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Trending */
	public boolean isCleartextDispalyed() {
		try {
			driver.findElement(clearText).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	

	/* assert Trending */
	public boolean iscancelbuttonclicked() {
		try {
			driver.findElement(Cancel).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* click on Search User */
	@SuppressWarnings("unchecked")
	public boolean searchUser(String searchtext) throws InterruptedException {
		try {
			driver.findElement(searchField).clear();
			driver.findElement(searchField).sendKeys(searchtext);
			Thread.sleep(500);
			System.out.println(driver.findElements(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell")).size());
			Thread.sleep(500);
			List<WebElement> list1 = driver.findElements(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
			list1.get(0).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* Recent Search field */
	@SuppressWarnings("unchecked")
	public boolean recentSearch(String name) throws InterruptedException {
		try {
			assert(driver.findElement(recentSearchtext).isDisplayed());
			List<WebElement> list1 = driver.findElements(By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeStaticText"));
			list1.get(0).getText().equals(name);
			list1.get(0).click();
			Thread.sleep(1000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
}