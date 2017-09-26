package com.soYou.obj.iOSregressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.ios.IOSDriver;

public class Profile {
	
	public IOSDriver iOSdriver;
	public Profile(IOSDriver driver){
		this.iOSdriver=driver;
	}
	
	
//	public Profile(WebDriver driver)
//	{
//		this.driver=driver;
//	}
//
//	
//	public WebDriver driver;
	  By firstclick=ByAccessibilityId.AccessibilityId("Welcome to soYou");
	  By allMenuTab=By.xpath("//XCUIElementTypeTabBar");
	  By allMenu=By.xpath("//XCUIElementTypeButton");
	  By completePage=By.xpath("//XCUIElementTypeTable");      // complete table of the page
	  By allTextField=By.xpath("//XCUIElementTypeCell//XCUIElementTypeTextField");            // all the cell of the page 
	  By bioAnddisableTradeButton=By.xpath("//XCUIElementTypeCell//XCUIElementTypeStaticText"); 
	  By disableTradeButton=By.xpath("//XCUIElementTypeCell//XCUIElementTypeSwitch");
	  
	  By bioField=By.xpath("//XCUIElementTypeOther//XCUIElementTypeTextView");
	  
	  //for password change operation ---
	  By completePasswordpage=By.xpath("//XCUIElementTypeTable");
	  By allPasswordFields=By.xpath("//XCUIElementTypeCell//XCUIElementTypeSecureTextField");
	  By PasswordFields=By.xpath("//XCUIElementTypeSecureTextField");
	  // common for entire page ----
	  By cancelButton=ByAccessibilityId.AccessibilityId("Cancel");
	  By saveButton=ByAccessibilityId.AccessibilityId("Save");

	  //for new user Add Password
	  By _addNewPassword=By.xpath("//XCUIElementTypeSecureTextField[value='New password']");
	  By _addNewPasswordAgain=By.xpath("//XCUIElementTypeSecureTextField[value='New password, again']");
	  
	
	  
	  public boolean isfirstclick(){
		  try{
			  WebElement el=iOSdriver.findElement(firstclick);
		  el.click();
		  return true;
		  }catch(NoSuchElementException e){
			  return false;
		  }
		
	  
	  
	  
//	  
//	  
//	  // Verify the fields are present or not --------------------------------------------------------------------------
//	  public boolean isProfileMenuDisplay(){
//		  try{
//			  List<WebElement> el=driver.findElement(allMenuTab).findElements(allMenu);
//			return   el.get(3).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isFirstNameFieldDisplay(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		    System.out.println("FirstName:"+el.get(0).getText());    
//			return   el.get(0).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isLastNameFieldDisplay(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		    System.out.println("LastName:"+el.get(1).getText());
//			return   el.get(1).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isUserNameFieldDisplay(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		    System.out.println("Username:"+el.get(2).getText());
//			return   el.get(2).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  
//	  public boolean isEmailIDFieldDisplay(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		    System.out.println("EmailID:"+el.get(3).getText());
//			return   el.get(3).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isChangePasswordFieldDisplay(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		    System.out.println("Change Password:"+el.get(4).getText());
//			return   el.get(4).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isPrivacyPolicyDisplay(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		    System.out.println("PrivacyPolicy:"+el.get(5).getText());
//			return   el.get(5).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isTermsofServiceDisDisplay(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		    System.out.println("TermsofService:"+el.get(6).getText());
//			return   el.get(6).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isEditYourBioFieldDisplay(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(bioAnddisableTradeButton);
//		    System.out.println("Bio:"+el.get(0).getText());
//			return   el.get(0).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isDisableTradeFieldDisplay(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(bioAnddisableTradeButton);
//		    System.out.println("DisableTrade Field:"+el.get(2).getText());
//			return   el.get(2).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isDisableTradeButtonEnabled(){
//		  try{
//		    List<WebElement> el=driver.findElement(completePage).findElements(disableTradeButton);
//		    System.out.println("DisableTrade Button:"+el.get(0).getText());
//			return   el.get(0).isEnabled();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  // Action performed to update values --------------------------------------------------------------------------
//	  
//	  public void selectProfileMenu(){
//		  List<WebElement> el=driver.findElement(allMenuTab).findElements(allMenu);
//		  el.get(3).click();
//	  }
//	  public void updateFirstName(String updatedFirstName){
//		try{
//		  List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
////		  System.out.println("Size OF Total Fields:"+el.size());
////		  for(int i=0;i<el.size();i++){
////			  System.out.println(" Fields Values:"+el.get(i).getText());
////		  }
//		  el.get(0).clear();
//		  el.get(0).sendKeys(updatedFirstName);
//		}catch(NoSuchElementException e){
//			System.out.println("Unable to clear and update firstname");
//		}
//	  }
//	  public void updateLastName(String updatedLastName){
//		try{
//		  List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		  el.get(1).clear();
//		  el.get(1).sendKeys(updatedLastName);
//		}catch(NoSuchElementException e){
//			System.out.println("Unable to  update Lastname");
//		}
//	  }
//	  public void updateUsername(String updatedUsername){
//		try{
//		  List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		  el.get(2).clear();
//		  el.get(2).sendKeys(updatedUsername);
//		}catch(NoSuchElementException e){
//			System.out.println("Unable to  update Username");
//		}
//	  }
//	  public void updateEmailID(String updatedEmailID){
//		try{
//		  List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		  el.get(3).clear();
//		  el.get(3).sendKeys(updatedEmailID);
//		}catch(NoSuchElementException e){
//			System.out.println("Unable to  update EmailID");
//		}
//	  }
//	  public void clickOnBio(){
//		try{
//		  List<WebElement> el=driver.findElement(completePage).findElements(bioAnddisableTradeButton);
//		  el.get(0).click();
//		}catch(NoSuchElementException e){
//			System.out.println("Unable to  click on bio");
//		}
//	  }
//	  public void enterTheBio(String bio){
//		try{
//		  WebElement el=driver.findElement(bioField);
//		  el.click();
//		  el.clear();
//		  el.sendKeys(bio);
//		  
//		}catch(NoSuchElementException e){
//			System.out.println("Unable to  enter  bio");
//		}
//	  }
//	  
//	  // save and cancel common for all-----------
//	  public boolean isSaveButtonDisplay(){
//		  try{
//			  return driver.findElement(saveButton).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isCancelButtonDisplay(){
//		  try{
//			  return driver.findElement(cancelButton).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public void clickOnSaveButton(){
//		  try{
//			  driver.findElement(saveButton).click();
//		  }catch(NoSuchElementException e){
//			  System.out.println("Unable to click on Save");
//		  }
//	  }
//	  public void clickOnCancelButton(){
//		  try{
//			  driver.findElement(cancelButton).click();
//		  }catch(NoSuchElementException e){
//			  System.out.println("Unable to click on Cancel");
//		  }
//	  }
//	  
//	  // wait methods ----------------------------
//	  public void waitForCancelButton(){
//		  try{
//		  WebDriverWait wait=new WebDriverWait(driver,60);
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(cancelButton));
//		  }catch(Exception e){
//			  System.out.println("Wait timeout for cancel button");
//		  }
//	  }
//	  public void waitChangePasswordButton(){
//		  try{
//			  List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		  WebDriverWait wait=new WebDriverWait(driver,60);  
//		  wait.until(ExpectedConditions.visibilityOfAllElements(el));
//		  }catch(Exception e){
//			  System.out.println("Wait timeout for Add Password button");
//		  }
//	  }
//	  
//	  
//	  
//	  
//	  // for changing password ------------------------------------------------------------------------
//	  public void clickOnChangePassword(){
//		try{
//		  List<WebElement> el=driver.findElement(completePage).findElements(allTextField);
//		  el.get(4).click();
//		 
//		}catch(NoSuchElementException e){
//			System.out.println("Unable to  click On Change  Password ");
//		}
//	  }
//	  // verify the fields are present or not ----------------
//	  public boolean isCurrentPasswordFieldDisplay(){
//		  try{
//			  List<WebElement> el=driver.findElement(completePasswordpage).findElements(allPasswordFields);
//			  System.out.println("Current Pass:"+el.get(0).getText());
//			  return el.get(0).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isNewPasswordFieldDisplay(){
//		  try{
//			  List<WebElement> el=driver.findElement(completePasswordpage).findElements(allPasswordFields);
//			  System.out.println("New Password:"+el.get(1).getText());
//			  return el.get(1).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isNewPasswordAgainFieldDisplay(){
//		  try{
//			  List<WebElement> el=driver.findElement(completePasswordpage).findElements(allPasswordFields);
//			  System.out.println("New PasswordAgain:"+el.get(2).getText());
//			  return el.get(2).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  // update the password values ------------------------
//	  
//	  public void enterCurrentPassword(String currentpassword){
//		  try{
//			 List<WebElement> el=driver.findElement(completePasswordpage).findElements(allPasswordFields);
//			 el.get(0).click();
//			 el.get(0).sendKeys(currentpassword);
//		  }catch(NoSuchElementException e){
//			  System.out.println("Current Password  not found");
//		  }
//	  }
//	  public void enterNewPassword(String newpassword){
//		  try{
//			 List<WebElement> el=driver.findElement(completePasswordpage).findElements(allPasswordFields);
//			 el.get(1).sendKeys(newpassword);
//		  }catch(NoSuchElementException e){
//			  System.out.println("New Password  field not found ");
//		  }
//	  }
//	  public void enterNewPasswordAgain(String newpassword){
//		  try{
//			 List<WebElement> el=driver.findElement(completePasswordpage).findElements(allPasswordFields);
//			 el.get(2).sendKeys(newpassword);
//		  }catch(NoSuchElementException e){
//			  System.out.println("New Password Again field not found ");
//		  }
//	  }
//	  // Add Password for new User---------------------------------------------------------------------------------------
//	  
//	  // check the fields is displaying or not ------
//	  public boolean isAddNewPasswordDisplay(){
//		  try{
//			  List<WebElement> el=driver.findElements(PasswordFields);
//			  System.out.println(el.size());
//			  for(int i=0;i<el.size();i++){
//				  System.out.println("Index:"+i+" Value:"+el.get(i).getText());
//			  }
//		    return el.get(1).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  public boolean isAddNewPasswordAgainDisplay(){
//		  try{
//			  List<WebElement> el=driver.findElements(PasswordFields);
//				return el.get(2).isDisplayed();
//		  }catch(NoSuchElementException e){
//			  return false;
//		  }
//	  }
//	  // enter the new password -----
//	  public void enterAddNewPassword(String newPassword){
//		
//		    List<WebElement> el=driver.findElements(PasswordFields);
//			// el.get(1).click();
//			 el.get(1).sendKeys(newPassword);
//	
//	  }
//	  public void enterAddNewPasswordAgain(String newPasswordAgain){
//		  
//		  List<WebElement> el=driver.findElements(PasswordFields);
//			// el.get(2).click();
//			 el.get(2).sendKeys(newPasswordAgain);
//	
//	  }
//	  //clear password
//	  public void clearAddNewPassword(){
//			try{
//		    List<WebElement> el=driver.findElements(PasswordFields);
//			// el.get(1).click();
//			 el.get(1).clear();
//			}catch(Exception e){
//				System.out.println("Unable to clear AddNewPassword");
//			}
//	  }
//	  public void clearAddNewPasswordAgain(){
//		  try{
//		  List<WebElement> el=driver.findElements(PasswordFields);
//			// el.get(2).click();
//			 el.get(2).clear();
//	  }catch(Exception e){
//			System.out.println("Unable to clear AddNewPasswordAgain");
//		}
//	
//	  }
	  
	  }
	  }
