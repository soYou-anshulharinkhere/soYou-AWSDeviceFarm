package com.soYou.test.AndroidRegressiontest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ExcelReader;
import com.extentReportManager.ExtentTestManager;
import com.extentReportManager.ExtentTestManager;
//import com.framework.internal.feature.BrowserInitializer;
import com.framework.internal.feature.AppInitializer;
import com.loany.obj.Signup.ObjSeekerSignUp;
import com.soYou.obj.AndroidRegressiontest.Regressionobj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.lang3.RandomStringUtils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.By;

public class Regressiontest extends AppInitializer{
	private static final String UserFirstName = "UserFirstName";
	private static final String UserLastName = "UserLastName";
	
	//public int indexOfMobileNumber=31;
	String randomNumbers = RandomStringUtils.randomNumeric(5);
	String phNo = 49393+randomNumbers;	
	String randomName = RandomStringUtils.randomAlphabetic(4);
	
	String FirstName = UserFirstName+randomName;
	String LastName = UserLastName+randomName;
	
	
	String CountryName= "India";
	String InvalidOTP= "2222";
	String ValidOTP="1111";
	String SearchTextField="Arman Katre";
	String ComposeMessage="Automation Text For Compose";
	String ExistingphNo="9425138712";
	String comments="AutomationTestComments";
	String ShareComposeText="ShareComposeTextFromAutomation";
	String ChannelName="AutomatedChannel";
	
	
   String text="Phone";

	private XSSFWorkbook wb;
	private XSSFWorkbook wb2;

//	@DataProvider(name="WelcomeSrc")
//	public Object[][] userdetails() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","WelcomeScreens");
//		return values;
//	}
	// 1st Welcome Screen --------------------->

	@Test(priority = 1)
	public void welcomeScreens() throws IOException, InterruptedException {
		
		Regressionobj a = new Regressionobj (getandroidDriver());
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.WelcomeScreenSkip(), "Check whether SKIP button is clicking or not", "SKIP button is clicking");
	}
	
	
	@Test(priority = 2)
	public void MobileNumberScreenTest() throws IOException, InterruptedException {

		Regressionobj a = new Regressionobj(getandroidDriver());		
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.MobileNumSrcHeader(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.MobileNumSrcSubHeader(), "Check whether Mobile Num Src SubHeader displaying  or not", "Entering mobile number"+phNo);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnSelectCountryDropDown(), "Check whether SelectCountryDropDown clicking or not", "SelectCountryDropDownn is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterCountryName(CountryName), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SelectCountryNameFromDrpDwn(), "Check whether Country Name From DrpDwn is selecting or not", "Country Name From DrpDwn is selecting");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.IsErrorEnterMobileNumberDisplay(), "Check whether Error for Enter MobileNumberDisplay is displaying or not", "Error for Enter MobileNumberDisplay is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterMobNo(phNo), "Check whether mobile no is entering  or not", "Mobile no is entering ");
		
//		a.Backtohomesrc();        
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Entercontactonsrch(text), "Check whether Invalid OTP Entering or not", "Invalid OTP is Entering");
//		a.ContactAppclick();
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.AllowPermission(), "Check whether Allowing contact Permission or not", "Allowing contact Permission");
		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.IsLoaderAfterSubmittingTheMobileNumberDisplay(), "Check whether Loader After Submitting TheMobileNumberDisplay is displaying or not", " Loader After Submitting TheMobileNumberDisplay is displaying");
	}
	
	@Test(priority=3)
	public void OTPScreenTest() throws  IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.OTPsSrcHeader(), "Check whether OTP Src Header displaying or not", "OTP Src Header displaying");
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.OTPSrcSubHeader(), "Check whether OTP Src Sub Header displaying or not", "OTP Src Sub Header displaying");
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.RequestNewOTPText(), "Check whether Request for New OTP Text displaying or not", "Request for New OTP Text displaying");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.InvalidOTPEnter(InvalidOTP), "Check whether Invalid OTP Entering or not", "Invalid OTP is Entering");
		Thread.sleep(5000);
		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.IsOTPMisMatchWarningDisplay(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.WrongNumberclick(), "Check whether for Wrong Number edit click button is clicking or not", "Wrong Number edit click button is clicking ");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterMobNo(phNo), "Check whether Mob No is entering or not", "Mob No is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next after entering mob no is clicking or not", " Next after entering mob no is clicking");
		Thread.sleep(9000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ValidOTP(ValidOTP), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.AllowContactPermission(), "Check whether allowing the contact permission or not", "Contact permission is allowed");
		
	}
	
	@Test(priority=4)
	public void IntermidiateScreenTest()   throws  IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickDefalultProfPicPlaceHolder(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.AllowPermissionForProfilePicUpload(), "Check whether Allow Permission For Profile PicUpload is allowing or not", "Allow Permission For Profile PicUpload is allowing");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOpenCameraButton(),"Check whether Open Camera Button clicking or not", "Open Camera Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCropDoneButton(), "Check whether Crop Done Button is clicking or not", "Crop Done Button is clicking");
		Thread.sleep(9000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.FirstNameTextField(FirstName), "Check whether First Name Text is entering or not", "First Name Text is"+FirstName);
		Thread.sleep(9000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LastNameTextField(LastName), "Check whether Last Name Text is entering or not", "Last Name Text is"+LastName);
		Thread.sleep(9000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickIntermidiateSrcDoneButton(), "Check whether Intermidiate Src Done Button is clicking or not", "Intermidiate Src Done Button is clicking");

	}
	
	@Test(priority=5)
	public void Canvas()   throws  IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickSeocndTab(), "Check whether Secondtab is clicking and dispalying or not", "Second tab is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickProfileMenuBurgerButton(), "Check whether ProfileMenuBurgerButton is clicking and dispalying or not", "ClickProfileMenuBurgerButton is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickProfileoption(), "Check whether Profile option is clicking and dispalying or not", "firstTab is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickDefalultProfPicPlaceHolderinprofilescreen(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickRemovePhoto(), "Check whether RemovePhoto is clicking or not", "RemovePhoto is clicking");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DefalultProfPicPlaceHolderinprofilescreen(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickAddANewPhoto(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOpenCameraButton(),"Check whether Open Camera Button clicking or not", "Open Camera Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCropDoneButton(), "Check whether Crop Done Button is clicking or not", "Crop Done Button is clicking");
Thread.sleep(9000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickBannerimagedit(), "Check whether Banner image edit is clicking or not", "Banner image edit is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOpenCameraButton(),"Check whether Open Camera Button clicking or not", "Open Camera Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCropDoneButton(), "Check whether Crop Done Button is clicking or not", "Crop Done Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickProfEditSaveButton(), "Check Prof Edit Save Button is clicking or not", "Prof Edit Save Button is clicking");	
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.OptionScreenBackButton(), "Check whether OptionScreenBackButton is clicking and dispalying or not", "OptionScreenBackButton is clicking and dispalying");

	}
	
	@Test(priority=6)
	public void BlockUserTest()   throws  IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Recent4thTab(), "Check whether Recent4thTab is clicking and dispalying or not", "Recent4thTab is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SearchIcon(), "Check whether SearchIcon is clicking and dispalying or not", "SearchIcon is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SearchTextfield(SearchTextField), "Check whether SearchTextfield is clicking and dispalying or not", "SearchTextfield is clicking and dispalying");
	Thread.sleep(5000);
//	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SearchListFirstUser(), "Check whether SearchListFirstUser is clicking and dispalying or not", "SearchListFirstUser is clicking and dispalying");
//    Thread.sleep(5000);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CanvasThreeDotBlockButton(), "Check whether CanvasThreeDotBlockButton is clicking and dispalying or not", "CanvasThreeDotBlockButton is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Block(), "Check whether Block is clicking and dispalying or not", "Block is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickSeocndTab(), "Check whether SeocndTab is clicking and dispalying or not", "SeocndTab is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickProfileMenuBurgerButton(), "Check whether Profile MenuBurger Button is clicking and dispalying or not", "Profile Menu Burger Button is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.BlockedUserOption(), "Check whether Blocked User Option is clicking and dispalying or not", "Blocked User Option is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.BlockedFirstUserInList(), "Check whether Blocked First User In List is clicking and dispalying or not", "Blocked First User in List is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.UnblockYes(), "Check whether Unblock Yes is clicking and dispalying or not", "Unblock Yes is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.BlockedScreenBack(), "Check whether Blocked Screen back is clicking and dispalying or not", " Blocked Screen back is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.OptionScreenBackButton(), "Check whether OptionScreenBackButton is clicking and dispalying or not", "OptionScreenBackButton is clicking and dispalying");

	}
	@Test(priority=7)
	public void ComposeAndCommentonSentPost() throws IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Recent4thTab(), "Check whether Recent4thTab is clicking and dispalying or not", "Recent4thTab is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Recent4thTab(), "Check whether Recent4thTab is clicking and dispalying or not", "Recent4thTab is clicking and dispalying");
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SearchIcon(), "Check whether SearchIcon is clicking and dispalying or not", "SearchIcon is clicking and dispalying");
		Thread.sleep(5000);
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.RecentSearchedUser(), "Check whether RecentSearchedUser is clicking and dispalying or not", "RecentSearchedUser is clicking and dispalying");
//		Thread.sleep(9000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SearchListFirstUser(), "Check whether firstTab is clicking and dispalying or not", "firstTab is clicking and dispalying");
//	    Thread.sleep(9000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.composetab(), "Check whether composetab is clicking and dispalying or not", "composetab is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ComposeTextField(ComposeMessage), "Check whether ComposeTextField is clicking and dispalying or not", "ComposeTextField is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Camera(), "Check whether Camera is clicking and dispalying or not", "Camera is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Location(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.locationPermission(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SelectThisLocation(), "Check whether Location Button is clicking or not", "Location Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SelectLocation(), "Check whether SelectLocation Button is clicking or not", "SelectLocation Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SendButton(), "Check whether SendButton Button is clicking or not", "SendButton Button is clicking");
		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ShareComposeDone(), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickSeocndTab(), "Check whether Click Seocnd Tab is clicking and dispalying or not", "Click Seocnd Tab is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickProfileMenuBurgerButton(), "Check whether Profile Menu Burger Button is clicking and dispalying or not", "Profile Menu Burger Button is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LogoutOption(), "Check whether LogoutOption is clicking and dispalying or not", "LogoutOption is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LogoutYesPermission(), "Check whether LogoutYesPermission is clicking and dispalying or not", "LogoutYesPermission is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.WelcomeScreenSkip(), "Check whether WelcomeScreenSkip button is clicking or not", "WelcomeScreenSkip button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnSelectCountryDropDown(), "Check whether SelectCountryDropDown clicking or not", "SelectCountryDropDownn is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterCountryName(CountryName), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SelectCountryNameFromDrpDwn(), "Check whether Country Name From DrpDwn is selecting or not", "Country Name From DrpDwn is selecting");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.IsErrorEnterMobileNumberDisplay(), "Check whether Error for Enter MobileNumberDisplay is displaying or not", "Error for Enter MobileNumberDisplay is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterMobNo(phNo), "Check whether mobile no is entering  or not", "Mobile no is entering ");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ValidOTP(ValidOTP), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
 		
	}
	
	@Test(priority=8)
	public void LoginExistingUserContact() throws IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickSeocndTab(), "Check whether SeocndTab Button is clicking or not", "SeocndTab Button is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickProfileMenuBurgerButton(), "Check Profile Menu Burger Button is clicking or not", "Profile Menu Burger Button is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LogoutOption(), "Check whether LogoutOption Button is clicking or not", "LogoutOption Button is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LogoutYesPermission(), "Check whether Logout Yes Permission Button is clicking or not", "Logout Yes Permission Button is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.WelcomeScreenSkip(), "Check whether Welcome Screen Skip button is clicking or not", "Welcome Screen Skip button is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnSelectCountryDropDown(), "Check whether SelectCountryDropDown clicking or not", "SelectCountryDropDownn is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterCountryName(CountryName), "Check whether Country Name is entering or not", "Country Name is entering");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SelectCountryNameFromDrpDwn(), "Check whether Country Name From DrpDwn is selecting or not", "Country Name From DrpDwn is selecting");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterMobNo(ExistingphNo), "Check whether existing mobile no is entering  or not", "existing Mobile no is entering ");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");		
	Thread.sleep(5000);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ValidOTP(ValidOTP), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
	}
	
	@Test(priority=9)
	public void ResharePost() throws IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.NotificationTab(), "Check whether NotificationTab is clicking or not", "NotificationTab is clicking");
	Thread.sleep(5000);	
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ForFirstAcceptButtonOnNotification(), "Check whether NotificationTab is clicking or not", "NotificationTab is clicking");
	Thread.sleep(4000);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.FirstNotificationDetailVieNavigation(), "Check whether FirstNotificationDetailVieNavigation is clicking or not", "FirstNotificationDetailVieNavigation is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DetailViewScreenCommentTextField(comments),"Check whether DetailViewScreenCommentTextField is clicking or not", "DetailViewScreenCommentTextField is clicking");
Thread.sleep(5000);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DetailViewScreenSendButton(), "Check whether DetailViewScreenSendButton is clicking or not", "DetailViewScreenSendButton is clicking");
	Thread.sleep(9000);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ScrollUp(), "Check whether scrolling up or not", "scrolling up");
	Thread.sleep(5000);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Reshare(), "Check whether Reshare is clicking or not", "Reshare is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ShareOnsoYou(), "Check whether ShareOnsoYou is clicking or not", "ShareOnsoYou is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ForwardToListFirstContact(), "Check whether ForwardToListFirstContact is clicking or not", "ForwardToListFirstContact is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ForwardToDone(), "Check whether ForwardToDone is clicking or not", "ForwardToDone is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ShareComposeTextField(ShareComposeText), "Check whether ShareComposeTextField is clicking or not", "ShareComposeTextField is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ShareComposeDone(), "Check whether ShareComposeDone is clicking or not", "ShareComposeDone is clicking");
	
	}
	
	@Test(priority=10)
	public void CurrentUserLogin() throws IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickSeocndTab(), "Check whether SeocndTab is clicking and dispalying or not", "SeocndTab is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickProfileMenuBurgerButton(), "Check whether ProfileMenuBurgerButton is clicking and dispalying or not", "ProfileMenuBurgerButton is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LogoutOption(), "Check whether LogoutOption is clicking and dispalying or not", "LogoutOption is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LogoutYesPermission(), "Check whether LogoutYesPermission is clicking and dispalying or not", "LogoutYesPermission is clicking and dispalying");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.WelcomeScreenSkip(), "Check whether SKIP button is clicking or not", "SKIP button is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnSelectCountryDropDown(), "Check whether SelectCountryDropDown clicking or not", "SelectCountryDropDownn is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterCountryName(CountryName), "Check whether Country Name is entering or not", "Country Name is entering");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SelectCountryNameFromDrpDwn(), "Check whether Country Name From DrpDwn is selecting or not", "Country Name From DrpDwn is selecting");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterMobNo(phNo), "Check whether same mobile no is re-entering  or not", "Mobile no is re-entering ");
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");		
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ValidOTP(ValidOTP), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
	}
	@Test(priority=11)
	public void CreateChannel() throws IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
		//CreateChannel
	
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.composetab(), "Check whether composetab is clicking and dispalying or not", "composetab is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Plusbutton(), "Check whether Plusbutton is clicking and dispalying or not", "Plusbutton is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CreateChannel(), "Check whether Create Channel is clicking and dispalying or not", "Create Channel is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DefalultProfPicPlaceHolderinprofilescreen(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickAddANewPhoto(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOpenCameraButton(),"Check whether Open Camera Button clicking or not", "Open Camera Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCropDoneButton(), "Check whether Crop Done Button is clicking or not", "Crop Done Button is clicking");
		Thread.sleep(9000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickBannerimagedit(), "Check whether ClickBannerimagedit Button is clicking or not", "Crop Done Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOpenCameraButton(),"Check whether Open Camera Button clicking or not", "Open Camera Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCropDoneButton(), "Check whether Crop Done Button is clicking or not", "Crop Done Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ChannelNameTextField(ChannelName), "Check whether ChannelNameText is entering and dispalying or not", "ChannelNameText is entering and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CreateChannelNextButton(), "Check whether CreateChannelNextButton is clicking and dispalying or not", "CreateChannelNextButton is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CreateChannelSelectFirstUserFromList(), "Check whether CreateChannelSelectFirstUserFromList is clicking and dispalying or not", "CreateChannelSelectFirstUserFromList is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CreateChannelDoneButton(), "Check whether CreateChannelDoneButton is clicking and dispalying or not", "CreateChannelDoneButton is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ComposeTextField(ComposeMessage), "Check whether ComposeText is entering and dispalying or not", "ComposeText is entering and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SendButton(), "Check whether SendButton is clicking and dispalying or not", "SendButton is clicking and dispalying");
	
	
}
//	@Test(priority=12)
//	public void ActivitySearch() throws  IOException, InterruptedException {
//		Regressionobj a = new Regressionobj(getandroidDriver());	
//		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		//Activity Search
//		
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ActivityTab(), "Check whether ActivityTab is clicking and dispalying or not", "ActivityTab is clicking and dispalying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ActivityTabsearchField(ChannelName), "Check whether Activity Tab search text is entering and dispalying or not", "Activity Tab search text is entering");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Firstrowinactivity(), "Check whether Firstrowinactivity is clicking and dispalying or not", "Firstrowinactivity is clicking and dispalying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DetailViewScreenCommentTextField(comments), "Check whether DetailViewScreenCommentTextField is clicking and dispalying or not", "DetailViewScreenCommentTextField is clicking and dispalying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DetailViewScreenSendButton(), "Check whether DetailViewScreenSendButton is clicking and dispalying or not", "DetailViewScreenSendButton is clicking and dispalying");
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DetailViewScreenCommentTextField(comments), "Check whether DetailViewScreenCommentText is entering and dispalying or not", "DetailViewScreenCommentTextField is entering and dispalying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DetailViewScreenSendButton(), "Check whether DetailViewScreenSendButton is clicking and dispalying or not", "DetailViewScreenSendButton is clicking and dispalying");
//		Thread.sleep(5000);
//	}
	@Test(priority=12)
	public void DeletePost() throws  IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickSeocndTab(), "Check whether SeocndTab is clicking and dispalying or not", "SeocndTab is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.FirstitemFromCanvas(), "Check whether FirstitemFromCanvas is clicking and dispalying or not", "FirstitemFromCanvas is clicking and dispalying");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DetailScreenThreeDotButton(), "Check whether CanvasThreeDotBlockButton is clicking and dispalying or not", "CanvasThreeDotBlockButton is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DetailViewDeleteOption(), "Check whether DetailViewDeleteOption is clicking and dispalying or not", "DetailViewDeleteOption is clicking and dispalying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.DeleteConfirmation(), "Check whether DeleteConfirmation is clicking and dispalying or not", "DeleteConfirmation is clicking and dispalying");
		
	}
}