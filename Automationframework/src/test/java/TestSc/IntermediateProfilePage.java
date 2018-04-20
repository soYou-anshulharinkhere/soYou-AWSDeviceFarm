/* soYou Gyanmatrix Technologies pvt ltd.
 * created by kiran
 */
package TestSc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.framework.internal.feature.AppInitializer;
import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppiumDriverInitializer;

import pageobjects.CanvasScreen;
import pageobjects.IntermediateScreen;
import pageobjects.composescreen;

public class IntermediateProfilePage extends AppInitializer {
	
	private static final String UserFirstName = "UserFirstName";
	private static final String UserLastName = "UserLastName";
	
	String randomName = RandomStringUtils.randomAlphabetic(4);
	
	
	String Firstname = UserFirstName+randomName;
	String Lastname = UserLastName+randomName;
	
	/* constants*/

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
	
//	@Test(priority=13)
//	public void CanvasPopUpMessage() throws IOException, InterruptedException {
//		CanvasScreen canvas=new CanvasScreen(getiosDriver());
//		getiosDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), canvas.IscanvasPopUpDisplayed(), "Check Whether canvas PopUp is displaying or not", "canvas PopUp is displaying");
//		
//	 	verifyTrue(ExtentTestManager.getTest(), getiosDriver(), canvas.IsnoGiftsTextDisplayed(), "Verify whether no gits found text is displayed or not", "no gits found text is displayed");
//	}
}
