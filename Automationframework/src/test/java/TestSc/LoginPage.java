package TestSc;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

import pageobjects.LoginScreen;
import utility.ExcelReader;
import pageobjects.RandomGenerator;
import com.framework.internal.feature.AppInitializer;
import com.extentReportManager.ExtentTestManager;

public class LoginPage extends AppInitializer{
	
	@DataProvider(name="details")
	 public Object[][] userdetails() throws Exception{
	  Object[][] values=ExcelReader.getTableArray(".//Data//user_details.xlsx", "details");
	  return values;
	 }
	String MobileNumber=RandomGenerator.getNumber();
	
//	@Test(priority=6)
	public void NotificationPoup() throws IOException {
		LoginScreen login=new LoginScreen(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), login.IsNotoficationPermissionPopupDisplayed(), "Check Whether Notification Permissions PopUp is displaying or not", "Notification Permissions PopUp is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), login.IsNotoficationPermissionPopupDisplayed(), "Verify whether Notification popup permission is allowed", "Notification Permissions PopUp is Allowed");
	}

	@Test(priority=7,dataProvider="details")
	public void SelectCountryFromList(String mobilenumber,String countryname,String Firstname,String Lastname,String email,String text,String link,String name,String groupName) throws IOException, InterruptedException{
		LoginScreen login = new LoginScreen(getiosDriver());

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.ISSelectCountryCellDisplayed(),"Verify select country field is Displayed","select country field is Displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.ISSelectCountrysearchBarDisplayed(countryname),"Verify country search bar is displayed","country search bar is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.VerifySelectedCountry(countryname),"Verify Selected country is matched or not","Selected country is matched");
	}

	@Test(priority=8,dataProvider="details")
	public void EnterMobileNumber(String mobilenumber,String countryname,String Firstname,String Lastname,String email,String text,String link,String name,String groupName) throws IOException, InterruptedException{
		LoginScreen login = new LoginScreen(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.VerifyMobileNumberTitle(),"Verify mobilenumber Title is Displayed or not","mobilenumber field is Displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.IsMobileNumberFieldDisplayed(MobileNumber),"Verify mobilenumber is entered or not","mobilenumber is Entered");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.VerifyTheMobileNumber(MobileNumber),"Verify mobilenumber entered is matched or not","mobilenumber entered is matched");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.clickSubmit(),"Verify submit  is clicked ot not","submit  is clicked");
	}
	
	@Test(priority=9)
	public void EnterOTPScreen() throws IOException, InterruptedException{
		LoginScreen login = new LoginScreen(getiosDriver());

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.VerifyEnterOTPtitle(),"Verify Enter OTP field is Displayed or not","Enter OTP field is Displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.EnterOTP(),"OTP is entered or Not","OTP  is entered");
	}	
}