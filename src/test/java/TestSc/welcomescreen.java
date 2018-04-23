package TestSc;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppInitializer;
import com.soYou.obj.iOSregressiontest.LoginObj;

import pageobjects.LoginScreen;
import utility.ExcelReader;

@SuppressWarnings("unused")
public class welcomescreen extends AppInitializer{
	
	String randomNumbers = RandomStringUtils.randomNumeric(4);
	String phNo = 48121+randomNumbers;	

//	@DataProvider(name="FirstSrc")
//	public Object[][] userdetails() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("/Users/anshulharinkhere/Documents/Automationframework/Data/TestData.xlsx","FirstSrc");
//		return values;
//	}
	//String FirstSrcHeader,String FirstSrcSubHeader
	
	@Test(priority=1)
	public void Welcomepage() throws InterruptedException, IOException{
		LoginObj a=new LoginObj(getiosDriver());
		
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isWelcomeFirstScreenLogoDisplay(), "Check Whether WelcomeFirstScreenLogo is displaying or not", "WelcomeFirstScreenLogo is displaying");
		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isFirstSrcHeaderDisplay(), "Check Whether FirstSrcHeaderDisplay is  displaying or not", "FirstSrcHeaderDisplay is  displaying");
		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isFirstSrcSubHeaderDisplay(), "Check Whether FirstSrcSubHeader is  displaying or not", "FirstSrcSubHeader is  displaying");
	
	a.clickOnSecondSrcClk();	
	}
	
	@Test(priority=2)
	public void Welcomepage2() throws InterruptedException, IOException{
		LoginObj a=new LoginObj(getiosDriver());
		
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.is_WelcomeSecondScreenLogoDisplay(), "Check Whether WelcomeSecondScreenLogo is displaying or not", "WelcomeSecondScreenLogo is displaying");
		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isSecondSrcHeaderDisplay(), "Check Whether SecondSrcHeaderDisplay is  displaying or not", "SecondSrcHeaderDisplay is  displaying");
		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isSecondSrcSubHeaderDisplay(), "Check Whether SecondSrcSubHeaderDisplay is  displaying or not", "SecondSrcSubHeaderDisplay is  displaying");
	
	a.clickOnThirdSrcClk();
	}
	@Test(priority=3)
	public void Welcomepage3() throws InterruptedException, IOException{
		LoginObj a=new LoginObj(getiosDriver());
		
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.is_WelcomeThirdScreenLogoDisplay(), "Check Whether WelcomeThirdScreenLogo is displaying or not", "WelcomeThirdScreenLogo is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isThirdSrcHeaderDisplay(), "Check Whether ThirdSrcHeaderDisplay is  displaying or not", "ThirdSrcHeaderDisplay is  displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isThirdSrcSubHeaderDisplay(), "Check Whether ThirdSrcSubHeader is  displaying or not", "ThirdSrcSubHeader is  displaying");
	
	a.clickOnThirdSrcClk();
	
}
	@Test(priority=4)
	public void Welcomepage4() throws InterruptedException, IOException{
		LoginObj a=new LoginObj(getiosDriver());
		
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.is_WelcomeFourthScreenLogoDisplay(), "Check Whether WelcomeFourthScreenLogo is displaying or not", "WelcomeFourthScreenLogo is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isFourthSrcHeaderDisplay(), "Check Whether FourthSrcHeader is  displaying or not", "FourthSrcHeader is  displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isFourthSrcSubHeaderDisplay(), "Check Whether FourthSrcSubHeader is  displaying or not", "FourthSrcSubHeader is  displaying");
	
	a.clickOnFourthSrcClk();
	
}
	@Test(priority=5)
	public void Welcomepage5() throws InterruptedException, IOException{
		LoginObj a=new LoginObj(getiosDriver());
		
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.is_WelcomeFifthScreenLogoDisplay(), "Check Whether WelcomeFifthScreenLogo is displaying or not", "WelcomeFifthScreenLogo is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.isFifthSrcSubHeaderDisplay(), "Check Whether fifthSrcSubHeader is  displaying or not", "fifthSrcSubHeader is  displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), a.clickOnGoClk(), "Check Whether fifthscreen GO butoon is clicking or not", "GO butoon is clicking");
			
	}
	
	@Test(priority=6)
	public void NotificationPoup() throws IOException {
		LoginScreen login=new LoginScreen(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), login.IsNotoficationPermissionPopupDisplayed(), "Check Whether Notification Permissions PopUp is displaying or not", "Notification Permissions PopUp is displaying");
		
	//	verifyTrue(ExtentTestManager.getTest(), getiosDriver(), login.IsNotoficationPermissionPopupDisplayed(), "Verify whether Notification popup permission is allowed", "Notification Permissions PopUp is Allowed");
	}
}