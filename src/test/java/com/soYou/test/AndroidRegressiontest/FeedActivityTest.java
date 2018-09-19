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
import com.soYou.obj.AndroidRegressiontest.CanvasObj;
import com.soYou.obj.AndroidRegressiontest.FeedActivityObj;
import com.soYou.obj.AndroidRegressiontest.LoginObj;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.commons.lang3.RandomStringUtils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.By;

public class FeedActivityTest extends AppInitializer{
	String CountryName= "India";
	String ValidOTP="1111";

	@Test(priority = 4)
	public void ComposePost() throws IOException, InterruptedException {

		FeedActivityObj a = new FeedActivityObj(getandroidDriver());
		LoginObj b = new LoginObj(getandroidDriver());
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.RecentTabClick(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SeacrhIconRecentTab(), "Check whether Country Name is entering or not", "Country Name is entering");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SeacrhTextfield(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SearchedResultSelect(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SendSomethingSelect(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ComposeMessage(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ComposeImageAttachOptionThroughCamera(), "Check whether Country Name is entering or not", "Country Name is entering");
		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.MediaPermission(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LocationAddcheck(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SendGift(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.UnapprovedGiftPopUp(), "Check whether Country Name is entering or not", "Country Name is entering");
		
	}
	@Test(priority = 5)
	public void ReloginWithExistingUser() throws IOException, InterruptedException {

		FeedActivityObj a = new FeedActivityObj(getandroidDriver());
		LoginObj b = new LoginObj(getandroidDriver());
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CanvasTab(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SettingIconCanvasSrc(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.Logout(), "Check whether Country Name is entering or not", "Country Name is entering");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.WelcomescreenSkip(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.MobileNumSrcHeader(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.MobileNumSrcSubHeader(), "Check whether Mobile Num Src SubHeader displaying  or not", "Entering mobile number");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickOnSelectCountryDropDown(), "Check whether SelectCountryDropDown clicking or not", "SelectCountryDropDownn is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.EnterCountryName(CountryName), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.SelectCountryNameFromDrpDwn(), "Check whether Country Name From DrpDwn is selecting or not", "Country Name From DrpDwn is selecting");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.IsErrorEnterMobileNumberDisplay(), "Check whether Error for Enter MobileNumberDisplay is displaying or not", "Error for Enter MobileNumberDisplay is displaying");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.EnterMobNo("9425138712"), "Check whether mobile no is entering  or not", "Mobile no is entering ");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
	Thread.sleep(5000);
	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ValidFirstOTP(ValidOTP), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
	
}

	@Test(priority = 6)
	public void ApprovePost() throws IOException, InterruptedException {

		FeedActivityObj a = new FeedActivityObj(getandroidDriver());
		LoginObj b = new LoginObj(getandroidDriver());
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.NotificationTab(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.NotificationTabFirstRowSelection(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CommentDetailView(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CommentDetailViewSend(), "Check whether Country Name is entering or not", "Country Name is entering");
		Thread.sleep(5000);
		a.Back();
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.BlockForFirstPost(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CanvasTab(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SettingIconCanvasSrc(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.BlockedUserInSettings(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.BlockedUserOnFirstPosition(), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.UnblockUserButtonOnBlockedUserList(), "Check whether Country Name is entering or not", "Country Name is entering");
		
}
}