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
import com.soYou.obj.AndroidRegressiontest.LoginObj;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.commons.lang3.RandomStringUtils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.By;

public class CanvasTest extends AppInitializer{
	

//	@DataProvider(name="WelcomeSrc")
//	public Object[][] userdetails() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","WelcomeScreens");
//		return values;
//	}
	// 1st Welcome Screen --------------------->

	//public int indexOfMobileNumber=31;
	
	private static final String UserFirstName = "UserFirstName";
	private static final String UserLastName = "UserLastName";
	String randomNumbers = RandomStringUtils.randomNumeric(5);
	String phNo = 49393+randomNumbers;	
	String randomName = RandomStringUtils.randomAlphabetic(4);
	
	
	String FirstName = UserFirstName+randomName;
	String LastName = UserLastName+randomName;
	
	@Test(priority = 4)
	public void EditProfile() throws IOException, InterruptedException {

		CanvasObj a = new CanvasObj(getandroidDriver());		
		LoginObj b = new LoginObj(getandroidDriver());
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SecondTab(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CanvasProfEdit(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.TitleBarEditprofiletext(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CameraEditIcon(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.RemoveImageOption(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ConfirmDelete(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SaveChanges(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		Thread.sleep(5000);
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CanvasProfEdit(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CameraEditIcon(), "Check whether Click Defalult ProfPic PlaceHolder is clicking or not", "Click Defalult ProfPic PlaceHolder is clicking");
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickOpenCameraButton(),"Check whether Open Camera Button clicking or not", "Open Camera Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickCameraButton(), "Check whether Click Camera Button is displaying and clicking or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickedOkButton(), "Check whether Ok Button is clicking or not", "Ok Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.ClickCropDoneButton(), "Check whether Crop Done Button is clicking or not", "Crop Done Button is clicking");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SaveChanges(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CanvasProfEdit(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ProfileEditBackClick(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.CanvasProfEdit(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.FirstNameTextField(FirstName + "A") , "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), b.LastNameTextField(LastName + "A") , "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ProfileEditBackClick() , "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ConfirmDelete() , "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		
	}
	
	@Test(priority = 5)
	public void EmptyCanvas() throws IOException, InterruptedException {

		CanvasObj a = new CanvasObj(getandroidDriver());	
		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.ProfileImagePlaceholderImage(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EmptyViewText(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.PointerToCompose(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EmptyViewCard(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");	
	}

}

