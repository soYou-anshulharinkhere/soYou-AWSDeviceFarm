
package TestSc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppInitializer;

import pageobjects.CanvasScreen;
import pageobjects.DetailedviewPage;
import pageobjects.LoginScreen;
import pageobjects.Settingsmenupage;
import utility.ExcelReader;

public class CanvasPage extends AppInitializer {
	
	@DataProvider(name="values")
	 public Object[][] userdetails() throws Exception{
	  Object[][] values=ExcelReader.getTableArray(".//Data//user_details.xlsx", "values");
	  return values;
	 }

	
	
	@Test(priority=14)
	public void logoutoftheApp() throws IOException, InterruptedException {
		Settingsmenupage Settings=new Settingsmenupage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.IsMenuButtonClicking(), "Check Whether menu button is clicked or not", "menu button is clicked");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), Settings.clickOnLogoutButton(), "Verify whether logout is success or not", "logout is success");
	}
	
	
	@Test(priority=15,dataProvider="values")
	public void SelectCountryFromList(String mobilenumber,String countryname,String Firstname,String Lastname,String email,String text,String link,String name,String groupName,String commentText) throws IOException, InterruptedException{
		LoginScreen login = new LoginScreen(getiosDriver());

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.ISSelectCountryCellDisplayed(),"Verify select country field is Displayed","select country field is Displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.ISSelectCountrysearchBarDisplayed(countryname),"Verify country search bar is displayed","country search bar is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.VerifySelectedCountry(countryname),"Verify Selected country is matched or not","Selected country is matched");
	}

	@Test(priority=16,dataProvider="values")
	public void EnterMobileNumber(String mobilenumber,String countryname,String Firstname,String Lastname,String email,String text,String link,String name,String groupName,String commentText) throws IOException, InterruptedException{
		LoginScreen login = new LoginScreen(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.VerifyMobileNumberTitle(),"Verify mobilenumber Title is Displayed or not","mobilenumber field is Displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.IsMobileNumberFieldDisplayed(mobilenumber),"Verify mobilenumber is entered or not","mobilenumber is Entered");
		
		//verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.VerifyTheMobileNumber(mobilenumber),"Verify mobilenumber entered is matched or not","mobilenumber entered is matched");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.ClickSubmitButton(),"Verify submit  is clicked ot not","submit  is clicked");
	}
	
	@Test(priority=17)
	public void EnterOTPScreen() throws IOException, InterruptedException{
		LoginScreen login = new LoginScreen(getiosDriver());

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.VerifyEnterOTPtitle(),"Verify Enter OTP field is Displayed or not","Enter OTP field is Displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(),login.EnterOTP(),"OTP is entered or Not","OTP  is entered");
	}	
	
	@Test(priority=18)
	public void NavigatetoPostDetailView() throws IOException, InterruptedException {
		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
		
		getiosDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.navigatetoDetailViewofPost(), "Check Whether navigation to detail view is done or not", "navigation to detail view is done");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isBackButtonDisplayed(), "Verify whether Back Button Displayed", "Back Button Displayed");
	}
	


	String description = "Test Automation.";
	@Test(priority=19,dataProvider="values")
	public void ReshareAPost(String mobilenumber,String countryname,String Firstname,String Lastname,String email,String text,String link,String name,String groupName,String commentText) throws IOException, InterruptedException {
		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.navigatetoDetailViewofPost(),"Check Whether navigation to detail view is done or not", "navigation to detail view is done");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.IsShareButtonAbleToClick(), "Check Whether share button is clickable or not", "share button is clickable");
	
	//	verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isSelectTextDisplayed(), "Check Whether select text is displayed or not", "select text is displayed");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.SelectContactfromList(), "Check Whether contacts from list selected or not", "contacts from list selected");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.ComposeTextWhileResharing(description), "Check Whether text is added  or not", "text is added");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isDoneDisplayed(), "Check Whether done is clicked or not", "done is clicked");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isBackButtonDisplayed(), "Verify whether Back Button Displayed", "Back Button Displayed");
	}

	
//	@Test(priority=20)
//	public void MakePostAsPrivateAndPublic() throws IOException, InterruptedException {
//		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
//		CanvasScreen canvas=new CanvasScreen(getiosDriver());
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.markasPrivate(), "Check Whether post is marked as private or not", "post is marked as private");
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), canvas.navigateToPrivateCanvas(), "Check Whether swipe to private canvas is displaying or not", "swipe to private canvas is displaying");
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.markasPublic(), "Check Whether post is marked as public or not", "post is marked as public");
//	
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), canvas.IsSwipePreviousDisplayed(), "Check Whether swipe Previous button is displaying or not", "swipe Previous button is displaying");
//	}

//
//	@Test(priority=21)
//	public void Navigatetosendercanvas() throws IOException, InterruptedException {
//		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.navigatetoOthersCanvas(), "Check Whether navigation to others canvas is done or not", "navigation to others canvas is done");
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.clickoncanvasTab(), "Check Whether navigation to own canvas is done or not", "navigation to own canvas is done");
//	}

	
//	@Test(priority=22)
//	public void SwipeBetweenCanvas() throws IOException, InterruptedException {
//		CanvasScreen viewpage=new CanvasScreen(getiosDriver());
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.navigateToPrivateCanvas(), "Check Whether swipe to private canvas is displaying or not", "swipe to private canvas is displaying");
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.IsSwipePreviousDisplayed(), "Check Whether swipe Previous button is displaying or not", "swipe Previous button is displaying");
//	}
	
	String commentText1= "Test automation commentText";
	@Test(priority=23,dataProvider="values")
	public void AddCommentForAPost(String mobilenumber,String countryname,String Firstname,String Lastname,String email,String text,String link,String name,String groupName,String commentText) throws IOException, InterruptedException{
		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.navigatetoDetailViewofPost(), "Check Whether navigation to detail view is done or not", "navigation to detail view is done");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.commentOnPost(), "Check Whether swipe to private canvas is displaying or not", "swipe to private canvas is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isAddCommentFieldDisplayed(commentText1), "Check Whether Add comment cell is displaying or not", "Add comment cell is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isSendButtondAbletoClick(), "Check Whether send button is clicked or not", "send button is clicked");
	}
	
String rplycommentText1= "Test automation reply commentText";
	@Test(priority=24,dataProvider="values")
	public void AddReplyCommentForAPost(String mobilenumber,String countryname,String Firstname,String Lastname,String email,String text,String link,String name,String groupName,String commentText) throws IOException, InterruptedException{
		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.replyForComment(rplycommentText1), "Check Whether reply comment is added or not", "reply comment is added");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isSendButtondAbletoClick(),  "Check Whether send button is clicked or not", "send button is clicked");
	}

	
	@Test(priority=25,dataProvider="values")
	public void VerifyallCommentsofAPost(String mobilenumber,String countryname,String Firstname,String Lastname,String email,String text,String link,String name,String groupName,String commentText) throws IOException, InterruptedException{
		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.commentOnPost(), "Check Whether swipe to private canvas is displaying or not", "swipe to private canvas is displaying");
				verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.verifyCommentsOfPost(commentText), "Check Whether view previous comments is displaying or not", "view previous comments is displaying");
	}
	
	
	@Test(priority=26)
	public void MarkPostAsSpam() throws IOException, InterruptedException{
		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.navigatetoDetailView(),  "Check Whether navigation to detail view is done or not", "navigation to detail view is done");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.ClickMoreButton(), "Check Whether more Button is clicked or not", "more Button is clicked");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.clickOnSpamButton(),  "Check Whether Spam Button is clicked or not", "Spam Button is clicked");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isSpamTextDisplayed(), "Check Whether Spam Text is Displayed or not", "Spam text is Displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isYesButtonClicked(), "Check Whether Yes Button is clicked or not", "Yes Button is clicked");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isOkButtonDisplayed(), "Check Whether OK Text is Displayed or not", "Ok text is Displayed");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isBackButtonDisplayed(), "Verify whether Back Button Displayed", "Back Button Displayed");
	
	}

	@Test(priority=27)
	public void DeleteAnPostFromcanvas() throws IOException, InterruptedException{
		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.navigatetoDetailView(),  "Check Whether navigation to detail view is done or not", "navigation to detail view is done");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.ClickMoreButton(), "Check Whether more Button is clicked or not", "more Button is clicked");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isDeleteBUttonDisplayed(), "Check Whether Delete Button is displaying or not", "Delete Button is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isDeleteTextDisplayed(), "Check Whether Delete text is displaying or not", "Delete text is displaying");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isYesButtonClicked(), "Check Whether Yes Button is clicked or not", "Yes Button is clicked");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isBackButtonDisplayed(), "Verify whether Back Button Displayed", "Back Button Displayed");
	
	}

	
	@Test(priority=28)
	public void BlockuserFromcanvas() throws IOException, InterruptedException{
		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.navigatetoOthersCanvasfromownCanvas(),  "Check Whether navigation to detail view is done or not", "navigation to detail view is done");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.BlockAnUser(), "Check user block is success or not", "user block is success");
	}

	@Test(priority=29)
	public void UnBlockuserFromcanvas() throws IOException, InterruptedException{
		DetailedviewPage viewpage=new DetailedviewPage(getiosDriver());
		Settingsmenupage menu = new  Settingsmenupage(getiosDriver());
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), menu.IsMenuButtonClicking(),  "Check Whether navigation to detail view is done or not", "navigation to detail view is done");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.UnBlockAnUser(), "Check Blocked user is clicked or not", "Blocked user is clicked");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isUnBlockTextDisplayed(), "Check Whether Unblock text is displaying or not", "Unblock text is displaying ");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isUnBlockButtonDisplayed(), "Check Whether Unblock Button is clicked  or not", "Unblock Button is clicked ");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isBackButtonDisplayed(), "Verify whether Back Button Displayed", "Back Button Displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), viewpage.isBackButtonDisplayed(), "Verify whether Back Button Displayed", "Back Button Displayed");
	}
	
}