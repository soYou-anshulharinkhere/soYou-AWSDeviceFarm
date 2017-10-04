 package pageobjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.ios.IOSDriver;

import com.google.common.collect.ImmutableList;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.ios.IOSDriver;

public class composescreen {
	@SuppressWarnings("rawtypes")
	protected IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public composescreen(IOSDriver driver) {
		this.driver = driver;
	}
	

	/* page labels */
	By nameField = By.xpath("//XCUIElementTypeTextField[@value='Enter name(s)']");
	By cancelButton = By.xpath("//XCUIElementTypeButton[@name='Cancel']");
	By plusbutton = By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton");
	By descriptiontext = By.xpath("//XCUIElementTypeTextView[@name='Say some thing.....'");
	By imageButton = By.xpath("//XCUIElementTypeButton[@name='Button']");
	By AllPhotos = ByAccessibilityId.AccessibilityId("All Photos");
	By videoButton = By.xpath("//XCUIElementTypeButton[@name='Gift Video']");
	By videoCellList = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton");
	By cameraButton = By.xpath("//XCUIElementTypeButton[@name='Gift Camera']");
	By captureButton = ByAccessibilityId.AccessibilityId("PhotoCapture");
	By giftcamera = ByAccessibilityId.AccessibilityId("Gift Camera");
	By sendButton = By.xpath("//XCUIElementTypeButton[@name='Send']");
	By contactstext = By.name("“SoYou” Would Like to Access Your Contacts");
	By searchContact = By.xpath("//XCUIElementTypeSearchField[@name='Search']");
	By CloseButton =  By.xpath("//XCUIElementTypeButton[@name='close']");
	By LogoutButton = By.xpath("//XCUIElementTypeButton[@name='log out']");
	By peopletext = By.xpath("//XCUIElementTypeStaticText[@name='People']");
	By addButton = By.xpath("//XCUIElementTypeButton[@name='add']");
	By GroupButton = By.name("GroupButton"); 
	By PeopleButton = By.xpath("//XCUIElementTypeButton[@name='People']");
	By selectButton = By.xpath("//XCUIElementTypeNavigationBar/XCUIElementTypeButton[2]");
	By FriendsinSoYou = By.xpath("//XCUIElementTypeStaticText[@name='Friends who are in SoYou']");
	By clearText = By.xpath("//XCUIElementTypeButton[@name='Clear text']");
	By proceedalert = By.xpath("//XCUIElementTypeButton[@name='Proceed");
	By Abort = By.xpath("//XCUIElementTypeOther");
	By alerttext = By.name("Either you can selecet Multiple People or Group, So selected Contacts will be Unselected, Do you wish to Continue");
	By creategroup = By.name("Create Group");
	By nextbutton = By.xpath("//XCUIElementTypeButton[@name='next']");
	By ProfilepicPlaceHolder = By.xpath("//XCUIElementTypeImage[@name='Default_FB']");
	By ChannelNameButton = By.xpath("//XCUIElementTypeTextField[@value='Channel Name']");
	By OKalert = By.xpath("//XCUIElementTypeButton[@name='Ok']");
	By OKButton = ByAccessibilityId.AccessibilityId("OK");
	By backbutton = By.xpath("//XCUIElementTypeButton[@name='Back']");
	By DoneButton = By.xpath("//XCUIElementTypeButton[@name='Done']");
	By imageselectButton = By.xpath("//XCUIElementTypeButton[@name='Select(1)']");
	By Removebutton = By.xpath("//XCUIElementTypeButton[@name='Remove']");
	By choosebutton = By.xpath("//XCUIElementTypeButton[@name='Choose']");
	By ComposeTextArea = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTextView");
	By userTagging=By.xpath("//XCUIElementTypeCell/XCUIElementTypeStaticText[@name='Kiran Gmx']");
	By chooseButton = By.xpath("//XCUIElementTypeButton[@name='Choose']");
	By TabBar= By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton");
	By NoMatchFound = By.xpath("//XCUIElementTypeStaticText[@name='No Matches Found']");
	By TableListCell = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell");
	By AddButton =  ByAccessibilityId.AccessibilityId("Add");
	By AddFriends = ByAccessibilityId.AccessibilityId("Add Friends");
	By CreateChannel = ByAccessibilityId.AccessibilityId("Create Channel");
	By EditButton = ByAccessibilityId.AccessibilityId("Edit");
	By CollectionView = By.xpath("//XCUIElementTypeCollectionView");
	By cellView = By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell");
	By ActionList= By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton");
	By UsePhoto =By.xpath("//XCUIElementTypeButton[@name='Use Photo']");
	By ImageCell = By.xpath("//XCUIElementTypeCell/XCUIElementTypeOther");
	By VideoCell =  By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell");
	/* select user */
	@SuppressWarnings("unchecked")
	public boolean IsselectContactsDisplayed() throws InterruptedException {
		try {
			Thread.sleep(500);
			List<WebElement> cell = driver.findElements(TabBar);
			cell.get(2).click();
			driver.findElement(nameField).click();
			Thread.sleep(3000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* select user */
	@SuppressWarnings("unchecked")
	public boolean IsContactsListDisplayed() throws InterruptedException {
		try {
			List<WebElement> cell1 = driver.findElements(TableListCell);
			cell1.get(5).click();
			driver.findElement(selectButton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* assert OK Button */
	public boolean isOKButtonDisplayed() {
		try {
			return driver.findElement(OKButton).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* Verify Add Button */
	@SuppressWarnings("unchecked")
	public boolean VerifyIsAddButtonDisplayed() {
		try {
			List<WebElement> list = driver.findElements(TabBar);
			list.get(2).click();
			assert (driver.findElement(AddButton).isDisplayed());
			driver.findElement(AddButton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* create group */
	public boolean IscreateChannelButtonDisplayed(String groupName) throws InterruptedException {
		try {
			driver.findElement(CreateChannel).click();
		}catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		return false;
	}
			
	/* Enter Channel Name */
	public boolean IsEnterChannelNameDisplayed(String groupName) throws InterruptedException {
		try {
			assert(driver.findElement(ChannelNameButton).isDisplayed());
			driver.findElement(ChannelNameButton).sendKeys(groupName);
			driver.hideKeyboard();
		}catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		return false;
	}
	
	/* Set picture for Channel */
	@SuppressWarnings("unchecked")
	public boolean IsuserabletoAddChannelPicture(String groupName)throws InterruptedException {
		try {
			List<WebElement> Editlist = driver.findElements(EditButton);
			Editlist.get(1).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* Set Cover Picture for Channel */
	@SuppressWarnings("unchecked")
	public boolean IsuserabletoAddChannelCoverPicture(String groupName)throws InterruptedException {
		try {
			List<WebElement> Editlist = driver.findElements(EditButton);
			Editlist.get(0).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* Selecting an image from collection view */
	@SuppressWarnings("unchecked")
	public boolean ClickAnImageFromCamera() throws InterruptedException {
		try {
			List<WebElement> ActionSheetList = driver.findElements(ActionList);
			ActionSheetList.get(0).click();
			if (isOKButtonDisplayed()) {
				driver.findElement(OKalert).click();
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(10000);
	//			driver.findElement(DoneButton).click();
				return true;
			} else {
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(10000);
	//			driver.findElement(DoneButton).click();
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		return false;
	}
	
	/* assert OK Button */
	public boolean isOkayButtonDisplayed() {

		try {
			return driver.findElement(OKButton).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* Selecting an image from camera */
	public boolean ComposeImageFromCamera() throws InterruptedException {
		try {
			driver.findElement(giftcamera).click();
			if (isOKButtonDisplayed()) {
				driver.findElement(OKButton).click();
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(10000);
				return true;
			} else {
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(10000);
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		return true;
		
	}
	
	/* Selecting an image from collection view */
	@SuppressWarnings("unchecked")
	public boolean selectAnImageFromList() throws InterruptedException {
		try {
			List<WebElement> ActionSheetList= driver.findElements(ActionList);
			ActionSheetList.get(0).click();
			System.out.println(driver.findElements(TableListCell).size());
			List<WebElement> cellList1 = driver.findElements(TableListCell);
			cellList1.get(1).click();
			System.out.println(driver.findElements(cellView).size());
			List<WebElement> cellList2 = driver.findElements(cellView);
			cellList2.get(25).click();
			Thread.sleep(500);
		//	assert (driver.findElement(chooseButton).isDisplayed());
			driver.findElement(chooseButton).click();
			Thread.sleep(20000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert user list */
	public boolean isUserListDisplayed() {
		try {
			assert!(driver.findElements(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell")).isEmpty());
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* select group */
	@SuppressWarnings("unchecked")
	public boolean selectGroup() {
		try {
			if (isOKButtonDisplayed()) {
				driver.findElementByName("OK").click();
				return true;
			}
			List<WebElement> list= driver.findElements(By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton"));
			list.get(2).click();
//			driver.findElements(By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton")).get(2).click();
			driver.findElement(nameField).click();
			driver.findElement(plusbutton).click();
			driver.findElement(GroupButton).isDisplayed();
			driver.findElement(GroupButton).click();
			List<WebElement> list1= driver.findElements(By.xpath("//XCUIElementTypeCell"));
			list1.get(0).click();
//			driver.findElements(By.xpath("//XCUIElementTypeCell")).get(0).click();
			driver.findElement(selectButton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* select group with name */
	@SuppressWarnings("unchecked")
	public boolean selectGroup(String groupName) {
		try {
			if (isOKButtonDisplayed()) {
				driver.findElementByName("OK").click();
				List<WebElement> list= driver.findElements(By.name(groupName));
				list.get(0).click();
//				driver.findElements(By.name(groupName)).get(0).click();
				driver.findElement(selectButton).click();
				return true;
			}else { 
			System.out.println(driver.findElements(By.name(groupName)).size());
		//	driver.findElement(searchContact).sendKeys(groupName);
			driver.findElement(By.name(groupName)).click();
			driver.findElement(selectButton).click();
			return true;
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	/* select existing group with name */
	@SuppressWarnings("unchecked")
	public boolean selectExistingGroup(String groupName) {
		try {
			if (isOKButtonDisplayed()) {
				driver.findElementByName("OK").click();
				return true;
			}
			List<WebElement> list= driver.findElements(TabBar);
			list.get(2).click();
			driver.findElement(nameField).click();
			driver.findElement(plusbutton).click();
			if (isOKButtonDisplayed()) {
				driver.findElementByName("OK").click();
				driver.findElement(GroupButton).isDisplayed();
				driver.findElement(GroupButton).click();
				driver.findElement(By.name(groupName)).click();
				driver.findElement(selectButton).click();
				return true;
			}
			driver.findElement(GroupButton).isDisplayed();
			driver.findElement(GroupButton).click();
			driver.findElement(By.name(groupName)).click();
			driver.findElement(selectButton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	/* select image */
	@SuppressWarnings({ "unused" })
	public boolean selectImageFromGallery() throws InterruptedException {
		try {
			driver.findElement(imageButton).click();
			if (isOKButtonDisplayed()) {
				driver.findElement(OKButton).click();
				Thread.sleep(3000);
				driver.findElement(AllPhotos).click();
				System.out.println(driver.findElements(ImageCell).size());
				TouchAction  ts= new TouchAction(driver).tap(76, 178).perform();
//				List<WebElement> e = driver.findElements(ImageCell);
//				System.out.println(e);
//				e.get(0).click();
				driver.findElement(DoneButton).click();
				Thread.sleep(10000);
			}
			else {
				driver.findElement(imageButton).click();
				Thread.sleep(3000);
				driver.findElement(AllPhotos).click();
				System.out.println(driver.findElements(ImageCell).size());
				TouchAction  ts= new TouchAction(driver).tap(76, 178).perform();
//				List<WebElement> e = driver.findElements(ImageCell);
//				System.out.println(e);
//				e.get(0).click();
				driver.findElement(DoneButton).click();
				Thread.sleep(10000);
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* Select Video and send as gift */
	@SuppressWarnings("unchecked")
	public boolean selectvideoFromGallery() throws InterruptedException {
		try {
			driver.findElement(videoButton).click();
			System.out.println(driver.findElements(videoCellList).size());
			List<WebElement> e = driver.findElements(videoCellList);
			e.get(2).click();
			List<WebElement> list = driver.findElements(VideoCell);
			System.out.println(list);
			list.get(2).click();
			driver.findElement(choosebutton).click();
			Thread.sleep(20000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* Send Text */
	public boolean sendtext(String text) throws InterruptedException {
		try {
			driver.findElement(ComposeTextArea).isDisplayed();
		//	driver.findElement(ComposeTextArea).clear();
			driver.findElement(ComposeTextArea).sendKeys(text);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* Send Web-link */
	public boolean sendWeblinkt(String link) throws InterruptedException {
		try {
			driver.findElement(ComposeTextArea).isDisplayed();
			driver.findElement(ComposeTextArea).clear();
			driver.findElement(ComposeTextArea).sendKeys(link);
			driver.findElement(ComposeTextArea).sendKeys(" ");
			Thread.sleep(2000);
			// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* Tag a user */
	@SuppressWarnings("unchecked")
	public boolean userMention(String name) throws InterruptedException {
		try {
			driver.findElement(ComposeTextArea).isDisplayed();
			driver.findElement(ComposeTextArea).sendKeys("@");
			Thread.sleep(500);
			driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='@']")).sendKeys(name);
			Thread.sleep(500);
			if (isUserMentionDisplayed()) {
				List<WebElement> list = driver.findElements(userTagging);
				list.get(0).click();
				return true;
			} else {
				Thread.sleep(1000);
				if(!isUserMentionDisplayed()){
				driver.findElement(By.xpath("//XCUIElementTypeTextField")).clear();
				assert(driver.findElement(NoMatchFound).isDisplayed());
				driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Dismiss']")).click();
				}
			}

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert user mention */
	public boolean isUserMentionDisplayed(){
		
		try{
			driver.findElement(userTagging).isDisplayed();
			return true;
		}catch(org.openqa.selenium.NoSuchElementException e){
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

	/* assert no Match Found */
	public boolean isNoMatchFoundDisplayed(){
		
		try{
			return driver.findElement(NoMatchFound).isDisplayed();
		}catch(Exception e){
			return false;
		}
	}
	
	/* assert close Button Found */
	public boolean iscloseButtonDisplayed(){
		
		try{
			return driver.findElement(CloseButton).isDisplayed();
		}catch(Exception e){
			return false;
		}
	}
	
	/* click on Send Button */
	public boolean sendButton() throws InterruptedException {
		try {
			assert(driver.findElement(sendButton).isDisplayed());
			driver.findElement(sendButton).click();
			Thread.sleep(10000);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/* Enter Description */
	public boolean enterDescription(String description) {
		try {
			driver.findElement(descriptiontext).isDisplayed();
			driver.findElement(descriptiontext).sendKeys(description);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}