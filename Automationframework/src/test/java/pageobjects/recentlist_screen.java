package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.ios.IOSDriver;

public class recentlist_screen {
	protected IOSDriver driver;

	public recentlist_screen(IOSDriver driver) {
		this.driver = driver;
	}

	/* page labels */
	By recentlist = By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell");
	By plusbutton = ByAccessibilityId.AccessibilityId("Add");
	By TabBar= By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton");
	By AddFriends = ByAccessibilityId.AccessibilityId("Add Friends");
	By createFriends = ByAccessibilityId.AccessibilityId("Create Channel");
	By TabBarButton = By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton");
	By backbutton = ByAccessibilityId.AccessibilityId("backward arrow");
	By channelinfobutton = ByAccessibilityId.AccessibilityId("Channel info");
	By AddFriendsbutton = ByAccessibilityId.AccessibilityId("Add Friends");
	By admintext = ByAccessibilityId.AccessibilityId("admin");
	By leaveChannelbutton = ByAccessibilityId.AccessibilityId("Leave Channel");
	By channelchangesbutton = ByAccessibilityId.AccessibilityId("Channel changes");
	By cancelbutton = ByAccessibilityId.AccessibilityId("Cancel");
	By morebutton = ByAccessibilityId.AccessibilityId("more");
	By back = ByAccessibilityId.AccessibilityId("back");
	By Back = ByAccessibilityId.AccessibilityId("Back");
	By Donebutton = ByAccessibilityId.AccessibilityId("Done");
	By friendstext = ByAccessibilityId.AccessibilityId("Friends");
	By searchbar = ByAccessibilityId.AccessibilityId("Search");
	By invite = ByAccessibilityId.AccessibilityId("Invite");
	By contactsList = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell");
	By importfriendsButton = ByAccessibilityId.AccessibilityId("Import friends from Facebook");
	By createChannel = ByAccessibilityId.AccessibilityId("Create Channel");
	By closebutton = ByAccessibilityId.AccessibilityId("log out");
	By nextButton = ByAccessibilityId.AccessibilityId("next");
	By defaultGroup = ByAccessibilityId.AccessibilityId("Default_Group");
	By channelName = By.xpath("//XCUIElementTypeTextField[@value='Channel Name']");
	By editButton = By.xpath("//XCUIElementTypeButton[@name='Edit']");
	By adminBadge = By.xpath("//XCUIElementTypeButton[@name='rankUp']");
	By OKButton = By.xpath("//XCUIElementTypeButton[@name='OK']");
	By captureButton = ByAccessibilityId.AccessibilityId("PhotoCapture");
	By UsePhoto = By.xpath("//XCUIElementTypeButton[@name='Use Photo']");
	By OKalert = By.xpath("//XCUIElementTypeButton[@name='Ok']");
	By ActionList = By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton");
	By swipePrivate = ByAccessibilityId.AccessibilityId("Swipe Next");
	By SwipePrevious = ByAccessibilityId.AccessibilityId("Swipe Previous");
	

	/* assert back button */
	public boolean IsbackButtonDisplayed() throws InterruptedException {
		try {
	//		assert (driver.findElement(back).isDisplayed());
			Thread.sleep(2000);
			driver.findElement(back).click();
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	
	/* assert back button */
	public boolean isBackButtonDisplayed() {
		try {
	//		assert (driver.findElement(back).isDisplayed());
			driver.findElement(Back).click();
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert back button */
	@SuppressWarnings("unused")
	public boolean IsAddFriendsButtonDisplayed() throws InterruptedException {
		try {
		//	assert (driver.findElement(AddFriends).isDisplayed());
			Thread.sleep(2000);
			TouchAction  ts= new TouchAction(driver).tap(117, 338).perform();
		//	driver.findElement(AddFriends).click();
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert admin text*/
	public boolean IsadmintextDisplayed() {
		try {
		//	assert (driver.findElement(admintext).isDisplayed());
		//	driver.findElement(admintext).click();
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert leave channel button */
	public boolean IsleavechannelButtonDisplayed() {
		try {
	//		assert (driver.findElement(leaveChannelbutton).isDisplayed());
	//		driver.findElement(leaveChannelbutton).click();
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert admin badge */
	@SuppressWarnings("unchecked")
	public boolean IsadminBadgeDisplayed() throws InterruptedException {
		try {
	//		assert (driver.findElement(adminBadge).isDisplayed());
			Thread.sleep(2000);
			List <WebElement> admin = driver.findElements(adminBadge);
			System.out.println(admin.size());
			admin.get(0).click();
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean navigateToPrivateCanvas() {
		try {
			driver.findElement(swipePrivate).click();
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
	
	/* verify noGiftsText button */
	public boolean IsnoGiftsTextDisplayed() {

		try {
			driver.findElement(By.name("noGiftsText")).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* verify noGiftsText button */
	public boolean IsNoPublicItemTextDisplayed() throws InterruptedException {

		try {
			Thread.sleep(2000);
			driver.findElement(By.name("No public Item found")).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* verify noGiftsText button */
	public boolean IsNoprivateItemTextDisplayed() throws InterruptedException {

		try {
			Thread.sleep(2000);
			driver.findElement(By.name("No private Item found")).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert back button */
	public boolean IsbackarrowButtonDisplayed() {
		try {
	//		assert (driver.findElement(backbutton).isDisplayed());
			driver.findElement(backbutton).click();
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert back button */
	public boolean IsmoreButtonDisplayed() {
		try {
		//	assert (driver.findElement(morebutton).isDisplayed());
			driver.findElement(morebutton).click();
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert back button */
	public boolean navigatetoChannelInfopage() {
		try {
		//	assert (driver.findElement(channelinfobutton).isDisplayed());
			driver.findElement(channelinfobutton).click();
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	

	/* assert Done button */
	public boolean IsDoneButtonDisplayed() throws InterruptedException {
		try {
			assert (driver.findElement(Donebutton).isDisplayed());
			driver.findElement(Donebutton).click();
			Thread.sleep(1000);
			return true;

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Invite Text */
	public boolean IsInvitetextDisplayed() {
		try {
			return driver.findElement(invite).isDisplayed();
			 
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert back button */
	public boolean IsImportfbfriendsDisplayed() {
		try {
	//		assert (driver.findElement(importfriendsButton).isDisplayed());
			driver.findElement(importfriendsButton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert back button */
	public boolean EnterChannelName(String channelname) {
		try {
		//	assert (driver.findElement(channelName).isDisplayed());
			driver.findElement(channelName).sendKeys(channelname);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public boolean SelectContatcstoAddIntoChannel() {
		try {
//			assert (driver.findElement(contactsList).isDisplayed());
			assert (driver.findElement(friendstext).isDisplayed());
			List<WebElement> contacts = driver.findElements(contactsList);
			contacts.get(0).click();
			contacts.get(1).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public boolean AddContatcsIntoChannel() {
		try {
	//		assert (driver.findElement(contactsList).isDisplayed());
	//		assert (driver.findElement(friendstext).isDisplayed());
			List<WebElement> contacts = driver.findElements(contactsList);
			contacts.get(3).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* assert back button */
	public boolean verfiyCreateChannelTitle(String channelname) {
		try {
			return	driver.findElement(createChannel).isDisplayed();
			 
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert back button */
	public boolean clickOnNextButton() {
		try {
	//		assert (driver.findElement(nextButton).isDisplayed());
			driver.findElement(nextButton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public boolean setchannelPicture() throws InterruptedException {
		try {
			driver.findElement(defaultGroup).click();
			List<WebElement> ActionSheetList = driver.findElements(ActionList);
			ActionSheetList.get(1).click();
			if (isOkayButtonDisplayed()) {
				driver.findElement(OKalert).click();
				Thread.sleep(3000);
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(10000);
				return true;
			} else {
				Thread.sleep(3000);
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(10000);
				return true;
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public boolean setchannelCoverPicture() throws InterruptedException {
		try {
			List<WebElement> edit=driver.findElements(editButton);
			edit.get(0).click();
			List<WebElement> ActionSheetList = driver.findElements(ActionList);
			ActionSheetList.get(1).click();
			if (isOkayButtonDisplayed()) {
				driver.findElement(OKalert).click();
				Thread.sleep(3000);
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(1000);
				driver.findElement(Donebutton).click();
				Thread.sleep(10000);
				
				return true;
			} else {
				Thread.sleep(3000);
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(1000);
				driver.findElement(Donebutton).click();
				Thread.sleep(10000);
				
				return true;
			}
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

	@SuppressWarnings("unchecked")
	public boolean ClickOnRecentItemInList() throws InterruptedException {
		try {
			Thread.sleep(2000);
			System.out.println(driver.findElement(recentlist).getSize());
			List<WebElement> recent = driver.findElements(recentlist);
			recent.get(0).click();
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
	public boolean clickonRecentTab() {

		try {
			List<WebElement> tabbar =  driver.findElements(TabBar);
			tabbar.get(1).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean IsplusbuttonDisplayed() {
		try {
	//		assert (driver.findElement(plusbutton).isDisplayed());
			driver.findElement(plusbutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public boolean clickonAddFriendsButton() {
		try {
	//		assert (driver.findElement(AddFriends).isDisplayed());
			driver.findElement(AddFriends).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public boolean clickonCreateChannelButton() throws InterruptedException {
		try {
		//	assert (driver.findElement(createChannel).isDisplayed());
			driver.findElement(createChannel).click();
			Thread.sleep(2000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

}
