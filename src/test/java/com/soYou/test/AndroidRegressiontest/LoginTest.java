package com.soYou.test.AndroidRegressiontest;

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
//import com.extentReportManager.ExtentTestManager;
//import com.framework.internal.feature.BrowserInitializer;
import com.framework.internal.feature.AppInitializer;
import com.loany.obj.Signup.ObjSeekerSignUp;
import com.soYou.obj.AndroidRegressiontest.FeedActivityObj;
import com.soYou.obj.AndroidRegressiontest.LoginObj;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.commons.lang3.RandomStringUtils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.By;

public class LoginTest extends AppInitializer{
	
	 private AndroidDriver driver;
	
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

	private XSSFWorkbook wb;
	private XSSFWorkbook wb2;
	
	
	

//	@DataProvider(name="WelcomeSrc")
//	public Object[][] userdetails() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","WelcomeScreens");
//		return values;
//	}
	// 1st Welcome Screen --------------------->

	@Test(priority = 1)
	public void MobileNumberScreenTest() throws IOException, InterruptedException {

		LoginObj a = new LoginObj(getandroidDriver());		
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("1234");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.WelcomescreenSkip(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.MobileNumSrcHeader(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.MobileNumSrcSubHeader(), "Check whether Mobile Num Src SubHeader displaying  or not", "Entering mobile number"+phNo);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnSelectCountryDropDown(), "Check whether SelectCountryDropDown clicking or not", "SelectCountryDropDownn is clicking");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterCountryName(CountryName), "Check whether Country Name is entering or not", "Country Name is entering");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SelectCountryNameFromDrpDwn(), "Check whether Country Name From DrpDwn is selecting or not", "Country Name From DrpDwn is selecting");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
//	//	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.IsErrorEnterMobileNumberDisplay(), "Check whether Error for Enter MobileNumberDisplay is displaying or not", "Error for Enter MobileNumberDisplay is displaying");
//	Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterMobNo(phNo), "Check whether mobile no is entering  or not", "Mobile no is entering ");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
//		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.IsLoaderAfterSubmittingTheMobileNumberDisplay(), "Check whe	ther Loader After Submitting TheMobileNumberDisplay is displaying or not", " Loader After Submitting TheMobileNumberDisplay is displaying");
//	
//	}
//
//
//	
//	@Test(priority  = 2)
//	public void OTPScreenTest() throws  IOException, InterruptedException {
//		LoginObj a = new LoginObj(getandroidDriver());	
//		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.OTPsSrcHeader(), "Check whether OTP Src Header displaying or not", "OTP Src Header displaying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.OTPSrcSubHeader(), "Check whether OTP Src Sub Header displaying or not", "OTP Src Sub Header displaying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.RequestNewOTPText(), "Check whether Request for New OTP Text displaying or not", "Request for New OTP Text displaying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.InvalidOTPFirstEnter(InvalidOTP), "Check whether Invalid OTP Entering or not", "Invalid OTP is Entering");
//	    Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.WrongNumberclick(), "Check whether for Wrong Number edit click button is clicking or not", "Wrong Number edit click button is clicking ");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterMobNo(phNo), "Check whether Mob No is entering or not", "Mob No is entering");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next after entering mob no is clicking or not", " Next after entering mob no is clicking");
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.	getTest(),getandroidDriver(), a.ValidFirstOTP(ValidOTP), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.AllowPermissionForProfilePicUpload(), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
//		Thread.sleep(5000);
//	}
//	
//
//	
//	@Test(priority=3)
//	public void IntermidiateScreen()   throws  IOException, InterruptedException {
//		LoginObj a = new LoginObj(getandroidDriver());	
//		getandroidDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.FirstNameTextField(FirstName), "Check whether First Name Text is entering or not", "First Name Text is"+FirstName);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LastNameTextField(LastName), "Check whether Last Name Text is entering or not", "Last Name Text is"+LastName);
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickDefalultProfPicPlaceHolder(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.AllowPermissionForProfilePicUpload(), "Check whether Allow Permission For Profile PicUpload is allowing or not", "Allow Permission For Profile PicUpload is allowing");
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOpenCameraButton(),"Check whether Open Camera Button clicking or not", "Open Camera Button is clicking");
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.AllowPermissionForProfilePicUpload(), "Check whether Allow Permission For Profile PicUpload is allowing or not", "Allow Permission For Profile PicUpload is allowing");
//	//	a.NextButtonByText();
//		Thread.sleep(5000);
//	//	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
//		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
//		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCropDoneButton(), "Check whether Crop Done Button is clicking or not", "Crop Done Button is clicking");
//		
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickIntermidiateSrcDoneButton(), "Check whether Intermidiate Src Done Button is clicking or not", "Intermidiate Src Done Button is clicking");
//	}
//	@Test(priority = 4)
//	public void ComposePost() throws IOException, InterruptedException {
//
//		FeedActivityObj a = new FeedActivityObj(getandroidDriver());
//		LoginObj b = new LoginObj(getandroidDriver());
//		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.RecentTabClick(), "Check whether Recent Tab Clicking or not", "Recent Tab is Clicking");
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SeacrhIconRecentTab(), "Check whether Seacrh Icon Recent Tab is clicking or not", "Seacrh Icon Recent Tab is clicking");
//		
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SeacrhTextfield(), "Check whether Seacrh Text field is entering the friend name or not", "Seacrh Text field is entering the friend name");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SearchedResultSelect(), "Check whether selecting the search result or not", "selecting the search result");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SendSomethingSelect(), "Check whether adding the user to TO text field or not", "Adding the user to TO text field ");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ComposeMessage(), "Check whether composing the post or not", "Composing the post");
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ComposeImageAttachOptionThroughCamera(), "Check whether Country Name is entering or not", "Country Name is entering");
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.MediaPermission(), "Check whether Country Name is entering or not", "Country Name is entering");
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
////		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LocationAddcheck(), "Check whether adding the location or not", "Adding the location to compose post");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SendGift(), "Check whether Sending a Gift or not", "Ending a Gift");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.UnapprovedGiftPopUp(), "Check whether Showing the pop for unapproved post or not", "Showing the pop for unapproved post");
//		
//	}
//	@Test(priority = 5)
//	public void ReloginWithExistingUser() throws IOException, InterruptedException {
//
//		FeedActivityObj a = new FeedActivityObj(getandroidDriver());
//		LoginObj b = new LoginObj(getandroidDriver());
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CanvasTab(), "Check whether switching to canavas tab or not", "Switching to canavas tab");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SettingIconCanvasSrc(), "Check whether clicking  Setting Icon on Canvas Src or not", "Clicking  Setting Icon on Canvas Src");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Logout(), "Check whether Logging out or not", "Logging out properly");
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.WelcomescreenSkip(), "Check whether relogin and displaying the skip button or not", "Relogin and displaying the skip button");
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.MobileNumSrcHeader(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.MobileNumSrcSubHeader(), "Check whether Mobile Num Src SubHeader displaying  or not", "Entering mobile number");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickOnSelectCountryDropDown(), "Check whether SelectCountryDropDown clicking or not", "SelectCountryDropDownn is clicking");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.EnterCountryName(CountryName), "Check whether Country Name is entering or not", "Country Name is entering");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.SelectCountryNameFromDrpDwn(), "Check whether Country Name From DrpDwn is selecting or not", "Country Name From DrpDwn is selecting");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
//		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.IsErrorEnterMobileNumberDisplay(), "Check whether Error for Enter MobileNumberDisplay is displaying or not", "Error for Enter MobileNumberDisplay is displaying");
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.EnterMobNo("9425138712"), "Check whether mobile no is entering  or not", "Mobile no is entering ");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
//	Thread.sleep(5000);
//	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ValidFirstOTP(ValidOTP), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
//	
//}
//
//	@Test(priority = 6)
//	public void ApprovePost() throws IOException, InterruptedException {
//
//		FeedActivityObj a = new FeedActivityObj(getandroidDriver());
//		LoginObj b = new LoginObj(getandroidDriver());
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.NotificationTab(), "Check whether switching to notification tab or not", "Switching to notification tab");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.NotificationTabFirstRowSelection(), "Check whether selecting the unapproved user post from notifications list or not", "Selecting the unapproved user post from notifications list");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CommentDetailView(), "Check whether comment is entering to detail view or not", "Comment is entering to detail view");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CommentDetailViewSend(), "Check whether comment is sending to detail view or not", "Comment is sending to detail view");
//		Thread.sleep(5000);
//		a.Back();
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.BlockForFirstPost(), "Check whether able to block the received post or not", "Able to block the received post");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CanvasTab(), "Check whether able to select canvas tab or not to unblock the blocked user", "Able to select canvas tab");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SettingIconCanvasSrc(), "Check whether Setting Icon Canvas Src clicking or not", "Setting Icon in Canvas Src is clicking");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.BlockedUserInSettings(), "Check whether Blocked User option In Settings list is choosing or not", "Blocked User option In Settings list is choosing");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.BlockedUserOnFirstPosition(), "Check whether Blocked User On First Position are selecting or not", "Blocked User On First Position are selecting");
//		Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.UnblockUserButtonOnBlockedUserList(), "Check whether unblocking the blocked user or not", "unblocking the blocked user");
	}
	
}
