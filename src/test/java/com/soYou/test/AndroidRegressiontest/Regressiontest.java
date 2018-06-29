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
import com.soYou.obj.AndroidRegressiontest.Regressionobj;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

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

		Regressionobj a = new Regressionobj(getandroidDriver());		
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.WelcomescreenSkip(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.MobileNumSrcHeader(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.MobileNumSrcSubHeader(), "Check whether Mobile Num Src SubHeader displaying  or not", "Entering mobile number"+phNo);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnSelectCountryDropDown(), "Check whether SelectCountryDropDown clicking or not", "SelectCountryDropDownn is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterCountryName(CountryName), "Check whether Country Name is entering or not", "Country Name is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SelectCountryNameFromDrpDwn(), "Check whether Country Name From DrpDwn is selecting or not", "Country Name From DrpDwn is selecting");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.IsErrorEnterMobileNumberDisplay(), "Check whether Error for Enter MobileNumberDisplay is displaying or not", "Error for Enter MobileNumberDisplay is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterMobNo(phNo), "Check whether mobile no is entering  or not", "Mobile no is entering ");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next button on mobile no screen is clicking or not", "Next button on mobile no screen is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.IsLoaderAfterSubmittingTheMobileNumberDisplay(), "Check whether Loader After Submitting TheMobileNumberDisplay is displaying or not", " Loader After Submitting TheMobileNumberDisplay is displaying");
	}


	
	@Test(priority  = 2)
	public void OTPScreenTest() throws  IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.OTPsSrcHeader(), "Check whether OTP Src Header displaying or not", "OTP Src Header displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.OTPSrcSubHeader(), "Check whether OTP Src Sub Header displaying or not", "OTP Src Sub Header displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.RequestNewOTPText(), "Check whether Request for New OTP Text displaying or not", "Request for New OTP Text displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.InvalidOTPFirstEnter(InvalidOTP), "Check whether Invalid OTP Entering or not", "Invalid OTP is Entering");
	//	verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.IsOTPMisMatchWarningDisplay(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.WrongNumberclick(), "Check whether for Wrong Number edit click button is clicking or not", "Wrong Number edit click button is clicking ");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EnterMobNo(phNo), "Check whether Mob No is entering or not", "Mob No is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOnNext(), "Check whether Next after entering mob no is clicking or not", " Next after entering mob no is clicking");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ValidFirstOTP(ValidOTP), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.AllowPermissionForProfilePicUpload(), "Check whether Valid OTP is entering or not", "Valid OTP is entering");
		
		Thread.sleep(5000);
	}
	

	
	@Test(priority=3)
	public void IntermidiateScreen()   throws  IOException, InterruptedException {
		Regressionobj a = new Regressionobj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.FirstNameTextField(FirstName), "Check whether First Name Text is entering or not", "First Name Text is"+FirstName);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.LastNameTextField(LastName), "Check whether Last Name Text is entering or not", "Last Name Text is"+LastName);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickDefalultProfPicPlaceHolder(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.AllowPermissionForProfilePicUpload(), "Check whether Allow Permission For Profile PicUpload is allowing or not", "Allow Permission For Profile PicUpload is allowing");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickOpenCameraButton(),"Check whether Open Camera Button clicking or not", "Open Camera Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickCropDoneButton(), "Check whether Crop Done Button is clicking or not", "Crop Done Button is clicking");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickIntermidiateSrcDoneButton(), "Check whether Intermidiate Src Done Button is clicking or not", "Intermidiate Src Done Button is clicking");
	}

	
//	@Test(priority=4)
//	public void TabBarLayout()   throws  IOException, InterruptedException {
//		Regressionobj a = new Regressionobj(getandroidDriver());	
//		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickFirstTab(), "Check whether firstTab is clicking and dispalying or not", "firstTab is clicking and dispalying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickSecondTab(), "Check whether SecondTab is clicking and displaying or not", "SecondTab is clicking and displaying");
//		//verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickThirdTab(), "Check whether ThrirdTab is clicking and displaying or not", "ThrirdTab is clicking and displaying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickFourthTab(), "Check whether fourthtab is clicking and displayig or not", "fourthtab is clicking and displayig");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ClickFifthTab(), "Check whether fifthtab is clicking and displaying or not", "fifthtab is clicking and displaying");
//		
//	
//	}
}
