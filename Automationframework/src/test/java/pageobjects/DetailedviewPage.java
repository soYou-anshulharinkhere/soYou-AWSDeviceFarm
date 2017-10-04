/* soYou 
 * Gyanmatrix Technologies pvt ltd.
 * created by kiran
 */
package pageobjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class DetailedviewPage {
	@SuppressWarnings("rawtypes")
	protected IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public DetailedviewPage(IOSDriver driver) {
		this.driver = driver;
	}
	/* page labels */

	By backbutton = By.xpath("//XCUIElementTypeButton[@name='Back']");
	By back = By.xpath("//XCUIElementTypeButton[@name='back']");
	By morebutton = By.xpath("//XCUIElementTypeButton[@name='more black']");
	By Playbutton = By.xpath("//XCUIElementTypeButton[@name='Play']");
	By sharebutton = By.xpath("//XCUIElementTypeCell/XCUIElementTypeButton[@name='share transparent']");
	By resharebutton = By.xpath("//XCUIElementTypeButton[@name='Share in soYou']");
	By fbsharebutton = By.xpath("//XCUIElementTypeButton[@name='Share to Facebook]']");
	By Tweetbutton = By.xpath("//XCUIElementTypeButton[@name='Tweet']");
	By Publicbutton = ByAccessibilityId.AccessibilityId("world");
	By privatebutton = ByAccessibilityId.AccessibilityId("Lock Square");
	By selectButton = By.xpath("//XCUIElementTypeButton[@name='tick box']");
	By searchContact = By.xpath("//XCUIElementTypeSearchField[@name='Search']");
	By nameField = By.xpath("//XCUIElementTypeTextField[@value='Enter name(s)']");
	By cancelButton = By.xpath("//XCUIElementTypeButton[@name='Cancel']");
	By plusbutton = By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton");
	By descriptiontext = By.xpath("//XCUIElementTypeTextView[@value='Say something...']");
	By imageButton = By.xpath("//XCUIElementTypeButton[@name='Button']");
	By videoButton = By.xpath("//XCUIElementTypeButton[@name='Gift Video']");
	By cameraButton = By.xpath("//XCUIElementTypeButton[@name='Gift Camera']");
	By sendButton = By.xpath("//XCUIElementTypeButton[@name='Send']");
	By SelectText= ByAccessibilityId.AccessibilityId("Select");
	By contactstext = By.name("“SoYou” Would Like to Access Your Contacts");
	By closeButton = By.xpath("//XCUIElementTypeButton[@name='log out']");
	By close= By.xpath("//XCUIElementTypeButton[@name='close']");
	By peopletext = By.xpath("//XCUIElementTypeStaticText[@name='People']");
	By addButton = By.xpath("//XCUIElementTypeButton[@name='add']");
	By GroupButton = By.xpath("//XCUIElementTypeButton[@name='Group']");
	By PeopleButton = By.xpath("//XCUIElementTypeButton[@name='People']");
	By FriendsinSoYou = By.xpath("//XCUIElementTypeStaticText[@name='Friends who are in SoYou']");
	By clearText = By.xpath("//XCUIElementTypeButton[@name='Clear text']");
	By proceedalert = By.xpath("//XCUIElementTypeButton[@name='Proceed");
	By Abort = By.xpath("//XCUIElementTypeOther");
	By alerttext = By.name("Either you can selecet Multiple People or Group, So selected Contacts will be Unselected, Do you wish to Continue");
	By creategroup = By.name("Create Group");
	By nextbutton = By.xpath("//XCUIElementTypeButton[@name='next']");
	By ProfilepicPlaceHolder = By.xpath("//XCUIElementTypeImage[@name='Default_FB']");
	By groupnamebutton = By.xpath("//XCUIElementTypeTextField[@value='Group Header']");
	By OKalert = By.xpath("//XCUIElementTypeButton[@name='Ok']");
	By composeTab = By.xpath("//XCUIElementTypeTabBar");
	By DoneButton = By.xpath("//XCUIElementTypeButton[@name='Done']");
	By imageselectButton = By.xpath("//XCUIElementTypeButton[@name='Select(1)']");
	By Removebutton = By.xpath("//XCUIElementTypeButton[@name='Remove']");
	By yesButton = By.xpath("//XCUIElementTypeButton[@name='Yes, do it!']");
	By noButton = By.xpath("//XCUIElementTypeButton[@name='No, thanks.']");
	By replyButton = By.xpath("//XCUIElementTypeButton[@name='Reply']");
	By replyingtext = By.xpath("//XCUIElementTypeStaticText[@value='Replying to']");
	By postCell = By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell");
	By tabBar = By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton");
	By linkcell =By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]");
	By SenderCell = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]");
	By addComment = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTextView[@value='Add a Comment']");
	By replycell = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTextView");
	By contactsCell = By.xpath("//XCUIElementTypeCell[4]");
	By GroupNameList = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Friends')]");
	By sender = By.xpath("//XCUIElementTypeCell/XCUIElementTypeButton");
	
	/* Re-share a Gift to group */
	@SuppressWarnings("unchecked")
	public boolean reshareGifttoGroup(String description) throws InterruptedException {
		try {
			
			List<WebElement> GroupsList= driver.findElements(GroupNameList);
			System.out.println(GroupsList.size());
			GroupsList.get(0).click();
		return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
}
	/* Re-share a Gift from canvas */
	@SuppressWarnings("unchecked")
	public boolean reshareGiftfromCanvas(String description) throws InterruptedException {
		try {
			List<WebElement> postList= driver.findElements(postCell);
			System.out.println(postList.size());
			TouchActions action = new TouchActions(driver) ;
			action.longPress(postList.get(0)).perform();
		return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
}
	
	/* assert Done Button */
	public boolean isDoneDisplayed() throws InterruptedException {

		try {
			driver.findElement(DoneButton).click();
			Thread.sleep(1000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Back Button */
	public boolean isBackButtonDisplayed() throws InterruptedException {

		try {
			Thread.sleep(2000);
			driver.findElement(backbutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* Clicking on share button from detailed view */
	public boolean IsShareButtonAbleToClick() {

		try {
			driver.findElement(sharebutton).click();
			driver.findElement(resharebutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* Clicking on share butoon from detailed view */
	public boolean SelectContactfromList() {

		try {
			if (isOkayButtonDisplayed()) {
				driver.findElementByName("OK").click();
				driver.findElement(contactsCell).click();
				driver.findElement(selectButton).click();
			} else {
				driver.findElement(contactsCell).click();
				driver.findElement(selectButton).click();
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* Add Text while re-sharing gift */
	public boolean ComposeTextWhileResharing(String description)
			throws InterruptedException {

		try {
			driver.findElement(descriptiontext).sendKeys(description);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* Re-share a Gift to user */
	@SuppressWarnings("unchecked")
	public boolean IsreshareGiftButtonAbletoClick() throws InterruptedException {
		try {
			List<WebElement> GiftList = driver.findElements(postCell);
			System.out.println(GiftList.size());
			GiftList.get(0).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert OK Button */
	public boolean isOkayButtonDisplayed() {

		try {
			return driver.findElementByName("OK").isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert Select text */
	public boolean isSelectTextDisplayed() {

		try {
			return driver.findElement(SelectText).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* navigate to Others Canvas */
	@SuppressWarnings("unchecked")
	public boolean navigatetoDetailViewofPost() throws InterruptedException {
		try {
		//	Thread.sleep(6000);
			List<WebElement>  e= driver.findElements(postCell);
			System.out.println(e.size());
			e.get(0).click();
			Thread.sleep(1000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* navigate to Others Canvas */
	@SuppressWarnings("unchecked")
	public boolean navigatetoOthersCanvas() throws InterruptedException {
		try {
			List<WebElement>  e= driver.findElements(postCell);
			System.out.println(e.size());
			e.get(0).click();
			driver.findElement(SenderCell).click();
			Thread.sleep(1000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Tab Bar */
	@SuppressWarnings("unchecked")
	public boolean clickoncanvasTab() {

		try {
			List<WebElement> tabbar =  driver.findElements(tabBar);
			tabbar.get(0).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* navigate to Others Canvas */
	@SuppressWarnings("unchecked")
	public boolean navigatetoOthersCanvasfromownCanvas() throws InterruptedException {
		try {
			List<WebElement>  e= driver.findElements(postCell);
			System.out.println(e.size());
			driver.findElement(sender).click();
			Thread.sleep(1000);
			driver.findElement(backbutton).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert AddComment text */
	public boolean isAddCommentFieldDisplayed(String commentText) {

		try {
	//		assert (driver.findElement(addComment).isDisplayed());
			driver.findElement(addComment).sendKeys(commentText);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert Send Button */
	public boolean isSendButtondAbletoClick() throws InterruptedException {

		try {
			
	//		assert (driver.findElement(sendButton).isDisplayed());
			driver.findElement(sendButton).click();
			Thread.sleep(2000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* comment on a post */
	@SuppressWarnings("unchecked")
	public boolean commentOnPost() throws InterruptedException {
		try {
	//		Thread.sleep(3000);
			List<WebElement> e = driver.findElements(postCell);
			System.out.println(e.size());
			e.get(0).click();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	/* assert View previous comments text */
	public boolean isVerifyPreviousCommentsDisplayed() {

		try {
			return driver.findElementByName("View previous comments").isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* reply comment on a post */
	@SuppressWarnings("unchecked")
	public boolean replyForComment(String commentText) throws InterruptedException {
		try {
//			List<WebElement>  e= driver.findElements(postCell);
//			System.out.println(e.size());
//			e.get(0).click();
			List<WebElement> list = driver.findElements(replyButton);
			list.get(1).click();
		//	assert(driver.findElement(replyingtext).isDisplayed());
			driver.findElement(replycell).sendKeys(commentText);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* navigate to Web-link view page */
	@SuppressWarnings("unchecked")
	public boolean navigatetoWeblinkviewpage() throws InterruptedException {
		try {
			System.out.println(driver.findElements(postCell).size());
			List<WebElement> Activitylist = driver.findElements(postCell);
			Activitylist.get(8).click();
			driver.findElement(linkcell).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Done']")).click();
			driver.findElement(backbutton).click();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/* Mark gift as private */
	@SuppressWarnings("unchecked")
	public boolean markasPrivate() throws InterruptedException {
		try {
			List<WebElement>  e= driver.findElements(postCell);
			System.out.println(e.size());
			e.get(0).click();
			Thread.sleep(500);
		//	assert(driver.findElement(privatebutton).isDisplayed());
			driver.findElement(privatebutton).click();
			Thread.sleep(500);
			driver.findElement(backbutton).click();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/* Mark gift as public */
	@SuppressWarnings("unchecked")
	public boolean markasPublic() throws InterruptedException {
		try {
			List<WebElement> e = driver.findElements(postCell);
			System.out.println(e.size());
			e.get(0).click();
			// driver.swipe(0, 64, 0, 306, 100);
			Thread.sleep(500);
			driver.findElement(Publicbutton).click();
			Thread.sleep(500);
			driver.findElement(backbutton).click();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}


/* verify all comments of a post */
@SuppressWarnings("unchecked")
public boolean verifyCommentsOfPost(String commentText) throws InterruptedException {
	try {
		Thread.sleep(1000);
		for (int i=0;i<=21;i++)
		{
			driver.findElement(addComment).sendKeys(commentText);
			driver.findElement(sendButton).click();
			Thread.sleep(3000);
		}
		driver.findElement(backbutton).click();
		Thread.sleep(1000);
		
		List<WebElement> e = driver.findElements(postCell);
		System.out.println(e.size());
		e.get(0).click();
		
		if(isVerifyPreviousCommentsDisplayed()){
			driver.findElementByName("View previous comments").click();
		}
		driver.findElement(backbutton).click();
		return true;
	} catch (org.openqa.selenium.NoSuchElementException e) {
		return false;
	 }
	}
}

	/* select group 
	public boolean selectGroup(String groupName) {
		try {
			driver.findElement(composeTab).click();
			driver.findElement(plusbutton).isDisplayed();
			driver.findElement(plusbutton).click();
			if (driver.findElementByName("OK").isDisplayed());
			{
				driver.findElementByName("OK").click();
			}
			driver.findElement(GroupButton).isDisplayed();
			driver.findElement(GroupButton).click();
			driver.findElement(By.name(groupName)).click();
			driver.findElement(selectButton).click();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
*/	
	