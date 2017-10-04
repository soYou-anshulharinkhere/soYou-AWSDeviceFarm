/* soYou Gyanmatrix Technologies pvt ltd.
 * created by kiran
 */
package pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.ios.IOSDriver;

public class IntermediateScreen {

	@SuppressWarnings("rawtypes")
	protected IOSDriver driver;

	@SuppressWarnings("rawtypes")
	public IntermediateScreen(IOSDriver driver) {
		this.driver = driver;
	}

	/* Page Labels */
	By camera = ByAccessibilityId.AccessibilityId("Camera");
	By gallery = ByAccessibilityId.AccessibilityId("Gallery");
	By EnterFirstName = By.xpath("//XCUIElementTypeTextField[@value='Enter First Name *']");
	By EnterLastName = By.xpath("//XCUIElementTypeTextField[@value='Enter Last Name *']");
	By OkLetmeInButton = By.xpath("//XCUIElementTypeButton[@name='OK, let me in']");
	By ORtitle = By.xpath("//XCUIElementTypeStaticText[@name='OR']");
	By OKalert = By.xpath("//XCUIElementTypeButton[@name='Ok']");
	By Facebooklinkbutton = By.xpath("//XCUIElementTypeButton[@name='facebook']");
	By Googlelinkbutton = By.xpath("//XCUIElementTypeButton[@name='google plus']");
	By chooseButton = By.xpath("//XCUIElementTypeButton[@name='Choose']");
	By nextButton = By.xpath("//XCUIElementTypeButton[@name='NEXT']");
	By AlbumList = By.xpath("//XCUIElementTypeCell");
	By CollectionView = By.xpath("//XCUIElementTypeCollectionView");
	By cellView = By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell");
	By OKButton = By.xpath("//XCUIElementTypeButton[@name='OK']");
	By captureButton = ByAccessibilityId.AccessibilityId("PhotoCapture");
	By UsePhoto =By.xpath("//XCUIElementTypeButton[@name='Use Photo']");
	By profilePicture = By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeImage");
	
	String emailId = "appsjoynworld@gmail.com";
	String fbpassword = "soyou@123";
	String password = "rockonnow";

	/*
	 * Entering first name
	 * 
	 * @param Firstname name of user
	 */
	public boolean IsEnterFirstNameFieldDisplayed(String Firstname) {
		try {
			assert (driver.findElement(EnterFirstName).isDisplayed());
			driver.findElement(EnterFirstName).sendKeys(Firstname);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/*
	 * Entering Last name of user
	 * 
	 * @param Lastname name of user
	 */
	public boolean IsenterLastNameFieldDisplayed(String Lastname) {
		try {
			assert (driver.findElement(EnterLastName).isDisplayed());
			driver.findElement(EnterLastName).sendKeys(Lastname);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/*
	 * verifying click on button
	 * 
	 * LetMeIn button click
	 */
	public boolean VerifyclickOnLetMeIn() throws InterruptedException {
		try {
	//		assert (driver.findElement(OkLetmeInButton).isDisplayed());
			driver.findElement(OkLetmeInButton).click();
			Thread.sleep(5000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
/*	
	@SuppressWarnings("unchecked")
	public boolean clickFacebook() throws InterruptedException {
		try {
			List<WebElement> list = driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton"));
			list.get(0).click();

			if(isConfirmLoginDisplayed()){
//				driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton")).get(0).click();
				list.get(0).click();
			}
			else {
				assert(driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeStaticText"))).isDisplayed();
				List<WebElement> list1 = driver.findElements(By.xpath("//XCUIElementTypeLink/XCUIElementTypeStaticText"));
				list1.get(0).click();

			driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeTextField")).sendKeys(emailId);
			driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeSecureTextField")).sendKeys(fbpassword);
			driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton")).click();
			if (isSavePasswordAlertDisplayed()){
				List<WebElement> list2 = driver.findElements(By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton"));
				list2.get(1).click();
//				driver.findElements(By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")).get(1).click();
				Thread.sleep(500);
				
			}
			}

			// TODO
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	@SuppressWarnings("unchecked")
	public boolean clickGoogle() throws InterruptedException {
		try { 
			List<WebElement> list = driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton"));
			list.get(1).click();
//			driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton")).get(1).click();
			Thread.sleep(1000);
		if(isUseAnotherAccountDisplayed()){
			driver.findElement(By.xpath("//XCUIElementTypeButton[@label='Use another account']")).click();
			driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeTextField")).sendKeys(emailId);
			driver.findElement(nextButton).click();
			driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeSecureTextField")).sendKeys(password);
			driver.findElement(nextButton).click();
			list.get(1).click();
//			driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton")).get(1).click();
		
		}
		// TODO
		return true;
	} catch (NoSuchElementException e) {
		return false;
	}	
}
*/
	
	@SuppressWarnings({ "unchecked" })
	public boolean setProfilePicture() throws InterruptedException {
		try {
			//To-Do
			driver.findElement(profilePicture).click();
			driver.findElement(camera).click();
			Thread.sleep(1000);
			if (isOkayButtonDisplayed()) {
				driver.findElement(OKButton).click();
				Thread.sleep(3000);
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(25000);
	//			driver.findElement(DoneButton).click();
				return true;
			} else {
				Thread.sleep(3000);
				driver.findElement(captureButton).click();
				Thread.sleep(3000);
				driver.findElement(UsePhoto).click();
				Thread.sleep(30000);
	//			driver.findElement(DoneButton).click();
//			driver.findElementByName("Camera").click();
//			if (isOkayButtonDisplayed()) {
//				driver.findElement(OKButton).click();
//				List<WebElement> cellList = driver.findElements(AlbumList);
//				System.out.println(cellList);
//				cellList.get(1).click();
//				return true;
//			} else {
//				List<WebElement> cellList = driver.findElements(AlbumList);
//				System.out.println((cellList).size());
//				cellList.get(1).click();
//				return true;
//			}
			}	} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		return true;
	}

	/* Selecting an image from collection view */
	@SuppressWarnings("unchecked")
	public boolean selectAnImageFromList() throws InterruptedException {
		try {
			assert (driver.findElement(CollectionView).isDisplayed());
			Thread.sleep(3000);
			System.out.println(driver.findElements(cellView).size());
			List<WebElement> cellList1 = driver.findElements(cellView);
			cellList1.get(25).click();
			Thread.sleep(5000);
			assert (driver.findElement(chooseButton).isDisplayed());
			driver.findElement(chooseButton).click();
			Thread.sleep(20000);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/* assert save password text */
	public boolean isSavePasswordAlertDisplayed() {

		try {
			return driver.findElementByName("Save Password").isDisplayed();
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

	/* assert Confirm Button */
	public boolean isConfirmLoginDisplayed() { 

		try {
			return driver.findElementByName("Confirm login").isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/* assert account Button */
	public boolean isUseAnotherAccountDisplayed() {

		try {
			 driver.findElementByName("Use another account").isDisplayed();
			 return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
}