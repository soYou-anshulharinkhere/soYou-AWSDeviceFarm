package com.soYou.test.iOSregressiontest;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppInitializer;
import com.soYou.obj.iOSregressiontest.Profile;

//import com.nmob.ios.obj.login.Login;
//import com.nmob.ios.obj.profile.Profile;

//import common.AppLauncher;

public class TestProfile extends AppInitializer{
	
	@Test(priority=1)
	
	public void updateUserDetails() throws InterruptedException, IOException{
		Profile a=new Profile(getiosDriver());
		a.isfirstclick();
//		b.CreateNewUser();Thread.sleep(4000);
//		a.selectProfileMenu();Thread.sleep(4000);
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isFirstNameFieldDisplay(), "Check whether first name field is displaying or not", "First Name Field found");
//		a.updateFirstName("firstnameUpdate");
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isLastNameFieldDisplay(), "Check whether last name field is displaying or not", "Last Name field  found");
//		a.updateLastName("lastnameUpdated");
//		//a.clickOnSaveButton();Thread.sleep(35000);
//		
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isUserNameFieldDisplay(), "Check whether username field is displaying or not", "Username field found");
//		
//		a.updateUsername("testneonmob");
//		a.clickOnSaveButton();a.waitForCancelButton();
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isCancelButtonDisplay(), "Check whether already existed username error is displaying  or not", "Already existed username error is displaying");
//		a.updateLastName("lastnameUpdated");//for first time user only 	
//		a.updateUsername("username004");
//		
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isEmailIDFieldDisplay(), "Check whether email Id field is displaying or not", "Email Id field found");
//		a.updateEmailID("testneonmob@gmail.com");	
//		a.clickOnSaveButton();a.waitForCancelButton();
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isCancelButtonDisplay(), "Check whether already existed email id error is displaying  or not", "Already existed Email Id error is displaying");
//		
//		a.updateEmailID("emailId004@gmail.com");	
//		
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isSaveButtonDisplay(), "Check whether save button is displaying", "Save button found");
//		a.clickOnSaveButton();Thread.sleep(35000);
//		
//		// for exited user
////		verifyTrue(ExtentTestManager.getTest(), driver, a.isChangePasswordFieldDisplay(), "Check whether Change Password id displaying or not", "Change Password is found");
////		a.clickOnChangePassword(); Thread.sleep(8000);
////		verifyTrue(ExtentTestManager.getTest(), driver, a.isCurrentPasswordFieldDisplay(), "Check whether current password field is displaying", "Current password field found");
////		a.enterCurrentPassword("1234");
////		verifyTrue(ExtentTestManager.getTest(), driver, a.isNewPasswordFieldDisplay(), "Check whether new password field is displaying or not", "New Password field found");
////		a.enterNewPassword("1234");
////		verifyTrue(ExtentTestManager.getTest(), driver, a.isNewPasswordAgainFieldDisplay(), "Check whether new password again field is displaying or not", "New Password Again found");
////		a.enterNewPasswordAgain("4321");
//	
//		//for new user add password
////		verifyTrue(ExtentTestManager.getTest(), driver, a.isAddNewPasswordDisplay(), "Check whether add new password is displaying or not", "Add New Password found");
////		a.enterAddNewPassword("1234");
////		verifyTrue(ExtentTestManager.getTest(), driver, a.isAddNewPasswordAgainDisplay(), "Check Add new password again is displaying or not", "Add New Passwprd again found");
////		a.enterAddNewPasswordAgain("1234");
////		a.clickOnSaveButton();Thread.sleep(10000);
//		
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isEditYourBioFieldDisplay(), "Check whether Bio is displaying or not", "Bio found");
//		a.clickOnBio();Thread.sleep(3000);
//		a.enterTheBio("HAHA");
//		a.clickOnSaveButton();Thread.sleep(5000);
//		
//		
//		
//	}
//	
//	@Test(priority=2)
//	public void AddOnlyNewPassword_ForNewUser() throws InterruptedException, IOException{
//		Profile a=new Profile(driver);
//		Login b=new Login(driver);
//		
//		b.CreateNewUser();Thread.sleep(4000);
//		a.selectProfileMenu();Thread.sleep(4000);
//		
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isChangePasswordFieldDisplay(), "Check whether Change Password id displaying or not", "Change Password is found");
//		a.clickOnChangePassword(); Thread.sleep(8000);
//		
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isAddNewPasswordDisplay(), "Check whether add new password is displaying or not", "Add New Password found");
//		a.enterAddNewPassword("123");
//		a.clickOnSaveButton();Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isSaveButtonDisplay(), "Check whether  new password with less than 4 length is added or not", " New Password Not Added and Error is displaying");
//
//	}
//	@Test(priority=3)
//	public void AddOnlyNewPasswordAgain_ForNewUser() throws InterruptedException, IOException{
//		Profile a=new Profile(driver);
//		Login b=new Login(driver);
//		
//		//b.CreateNewUser();Thread.sleep(4000);
//		//a.selectProfileMenu();Thread.sleep(4000);
//		
////		verifyTrue(ExtentTestManager.getTest(), driver, a.isChangePasswordFieldDisplay(), "Check whether Change Password id displaying or not", "Change Password is found");
////		a.clickOnChangePassword(); Thread.sleep(8000);
//		
//        a.clearAddNewPassword();//clear the new password field
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isAddNewPasswordAgainDisplay(), "Check Add new password again is displaying or not", "Add New Passwprd again found");
//		a.enterAddNewPasswordAgain("123");
//		a.clickOnSaveButton();Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isSaveButtonDisplay(), "Check whether  new password with less than 4 length is added or not", " New Password Not Added and Error is displaying");
//
//	}
//	@Test(priority=4)
//	public void AddInvalidPasswordLength_ForNewUser() throws InterruptedException, IOException{
//		Profile a=new Profile(driver);
//		Login b=new Login(driver);
//		
//		//b.CreateNewUser();Thread.sleep(4000);
//		//a.selectProfileMenu();Thread.sleep(4000);
//		
////		verifyTrue(ExtentTestManager.getTest(), driver, a.isChangePasswordFieldDisplay(), "Check whether Change Password id displaying or not", "Change Password is found");
////		a.clickOnChangePassword(); Thread.sleep(8000);
//		
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isAddNewPasswordDisplay(), "Check whether add new password is displaying or not", "Add New Password found");
//		a.enterAddNewPassword("123");
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isAddNewPasswordAgainDisplay(), "Check Add new password again is displaying or not", "Add New Passwprd again found");
//		a.enterAddNewPasswordAgain("123");
//		a.clickOnSaveButton();Thread.sleep(5000);
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isSaveButtonDisplay(), "Check whether  new password with less than 4 length is added or not", " New Password Not Added and Error is displaying");
//
//	}
//	@Test(priority=5)
//	public void AddValidPassword_ForNewUser() throws InterruptedException, IOException{
//		Profile a=new Profile(driver);
//		Login b=new Login(driver);
//		
//		//b.CreateNewUser();Thread.sleep(4000);
//		//a.selectProfileMenu();Thread.sleep(4000);
//		
////		verifyTrue(ExtentTestManager.getTest(), driver, a.isChangePasswordFieldDisplay(), "Check whether Change Password id displaying or not", "Change Password is found");
////		a.clickOnChangePassword(); Thread.sleep(8000);
//		
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isAddNewPasswordDisplay(), "Check whether add new password is displaying or not", "Add New Password found");
//		a.enterAddNewPassword("1234");
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isAddNewPasswordAgainDisplay(), "Check Add new password again is displaying or not", "Add New Passwprd again found");
//		a.enterAddNewPasswordAgain("1234");
//		a.clickOnSaveButton();Thread.sleep(30000);//a.waitChangePasswordButton();
//		verifyTrue(ExtentTestManager.getTest(), driver, a.isChangePasswordFieldDisplay(), "Check whether  new valid password  is added or not", " New Password Not Added and Error is displaying");
//    // unisntall the app for next test and all
//		    Thread.sleep(5000);
//			//driver.removeApp("com.neonmob.NeonMob");
//			driver.resetApp();
//			driver.quit();
		
	}
	
	


}
