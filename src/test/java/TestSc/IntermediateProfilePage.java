package TestSc;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.internal.feature.AppInitializer;
import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppiumDriverInitializer;

import pageobjects.IntermediateScreen;
import pageobjects.composescreen;

public class IntermediateProfilePage extends AppInitializer {
	/* constants*/
	String Firstname = "SoYou";
	String Lastname = "App";
	String email = "soyouapp@apple.com";
	
	@Test(priority=10)
	public void setProfilePicture() throws InterruptedException, IOException {
		IntermediateScreen profile = new IntermediateScreen(getiosDriver());
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), profile.setProfilePicture(), "check whether profile pic is set or not", "profile pic is set");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), compose.ClickAnImageFromCamera(), "check whether image is set or not", "image is set");
		
	}

	@Test(priority=11)
	public void Enterusername() throws InterruptedException, IOException {
		IntermediateScreen profile = new IntermediateScreen(getiosDriver());
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), profile.IsEnterFirstNameFieldDisplayed(Firstname), "check whether firstname is entered or not", "firstname is entered");
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), profile.IsenterLastNameFieldDisplayed(Lastname), "check whether lastname is entered or not", "lastname is entered");
	}
	
	@Test(priority=12)
	public void IsLetMeInButtonClickable() throws InterruptedException, IOException {
		IntermediateScreen profile = new IntermediateScreen(getiosDriver());
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), profile.VerifyclickOnLetMeIn(), "verify let me in button is clicked or not", "let me in button is clicked");
	}
}
