//package com.soYou.test.AndroidRegressiontest;
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import utility.ExcelReader;
//import com.extentReportManager.ExtentTestManager;
////import com.extentReportManager.ExtentTestManager;
////import com.framework.internal.feature.BrowserInitializer;
//import com.framework.internal.feature.AppInitializer;
//import com.loany.obj.Signup.ObjSeekerSignUp;
//import com.soYou.obj.AndroidRegressiontest.CanvasObj;
//import com.soYou.obj.AndroidRegressiontest.RecentUserAndChannelObj;
//import com.soYou.obj.AndroidRegressiontest.Regressionobj;
//
//import java.io.File;
//import java.io.FileInputStream;
////import java.io.FileNotFoundException;
//
//import org.apache.commons.lang3.RandomStringUtils;
//
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
//import org.openqa.selenium.By;
//
//public class RecentUserAndChannelTest extends AppInitializer{
//	
//
//	String searchtext= "Randomtext";
////	@DataProvider(name="WelcomeSrc")
////	public Object[][] userdetails() throws Exception{
////		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","WelcomeScreens");
////		return values;
////	}
//	// 1st Welcome Screen --------------------->
//	
//	@Test(priority = 5)
//	public void Canvas() throws IOException, InterruptedException {
//
//		RecentUserAndChannelObj a = new RecentUserAndChannelObj(getandroidDriver());		
//		getandroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.FourthTab(), "Check whether mobile number header displaying or not", "Mobile number header is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EmptyViewCard(), "Check whether Country Name is entering or not", "Country Name is entering");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.EmptyViewText(),"Check whether Country Name is entering or not", "Country Name is entering");
//		
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.SearchTextField(searchtext),"Check whether Country Name is entering or not", "Country Name is entering");
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.NosearchResult(),"Check whether Country Name is entering or not", "Country Name is entering");
//		
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a."Check whether Country Name is entering or not", "Country Name is entering");
//		
//		verifyTrue(ExtentTestManager.getTest(),getandroidDriver(), a.MoreOptions(),"Check whether Country Name is entering or not", "Country Name is entering");
//		
//	}
//}
