package TestSc;

import java.io.IOException;

import org.testng.annotations.Test;

import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppInitializer;

import pageobjects.Settingsmenupage;

public class SettingsPage extends AppInitializer {
	@Test(priority=48)
	public void CheckAboutText() throws IOException, InterruptedException {
		Settingsmenupage Settings=new Settingsmenupage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.IsMenuButtonClicking(), "Check Whether Hamburger menu button is clikcing or not", "Hamburger menu button is clicked");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.isAbouttextDisplayed(), "Verify whether About button is displaying or not", "About button is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.clickOnAboutbutton(), "Verify whether About button is verified or not", "About button is verified");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.isBackbuttonClicked(), "Verify whether back button is clicked or not", "back button is clicked");
	}

//	@Test(priority=49)
	public void checkTermsandConditions() throws IOException, InterruptedException  {
		Settingsmenupage Settings=new Settingsmenupage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.IsMenuButtonClicking(), "Check Whether Hamburger menu button is clikcing or not", "Hamburger menu button is clicked");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.isTermsbuttonDisplayed(), "Verify whether Terms button is verified or not", "Terms button is verified");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.isBackbuttonClicked(), "Verify whether back button is clicked or not", "back button is clicked");
	}
	
//	@Test(priority=50)
	public void checkPrivacyPolicy() throws IOException, InterruptedException  {
		Settingsmenupage Settings=new Settingsmenupage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.IsMenuButtonClicking(), "Check Whether Hamburger menu button is clikcing or not", "Hamburger menu button is clicked");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.isPrivacyPolicyButtonDisplayed(), "Verify whether privacy policy is displayed or not", "privacy policy is displayed");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.isBackbuttonClicked(), "Verify whether back button is clicked or not", "back button is clicked");
	}
	
	@Test(priority=51)
	public void checkBlockedUsers() throws IOException, InterruptedException  {
		Settingsmenupage Settings=new Settingsmenupage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.IsMenuButtonClicking(), "Check Whether menu button is clicked  or not", "menu button is clicked ");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.isBlockedUsersbuttonDisplayed(), "Verify whether blocked users button is displaying or not", "blocked users text is displaying");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.IsNoBlockedUserTextDisplayed(), "Verify whether No blocked users button is displaying or not", "No blocked users text is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.isBackbuttonClicked(), "Verify whether back button is clicked or not", "back button is clicked");
	}
	
	@Test(priority=52)
	public void checkprofilePage() throws IOException, InterruptedException  {
		Settingsmenupage Settings=new Settingsmenupage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.IsMenuButtonClicking(), "Check Whether Hamburger menu button is clikcing or not", "Hamburger menu button is clicked");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.setProfilepicture(), "Verify whether user is able to set the profile picture or not", "user is able to set the profile picture");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.updateCoverpicture(), "Verify whether user is able to update the cover picture or not", "user is able to update the cover picture");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.updateProfilepicture(), "Verify whether user is able to update the profile picture", "user is able to update the profile picture");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.isBackbuttonClicked(), "Verify whether back button is clicked or not", "back button is clicked");
	}
	
	@Test(priority=53)
	public void verifyLogoutAction() throws IOException, InterruptedException  {
		Settingsmenupage Settings=new Settingsmenupage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.IsMenuButtonClicking(), "Check Whether Notification Permissions PopUp is displaying or not", "Notification Permissions PopUp is displaying");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.clickOnLogoutButton(), "Verify whether user is logged out of soYou Succesfully or not", "user is logged out of soYou Succesfully");
	}
}
