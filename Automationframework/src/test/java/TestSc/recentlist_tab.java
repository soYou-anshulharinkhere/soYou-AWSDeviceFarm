package TestSc;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppInitializer;

import pageobjects.recentlist_screen;
import utility.ExcelReader;

public class recentlist_tab extends AppInitializer {
	
	@DataProvider(name="search")
	 public Object[][] userdetails() throws Exception{
	  Object[][] values=ExcelReader.getTableArray(".//Data//user_details.xlsx", "search");
	  return values;
	 }

		@Test(priority = 34)
		public void verifyrecentitemlist() throws IOException, InterruptedException {
			recentlist_screen recent = new recentlist_screen(getiosDriver());

			verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.isTabBarDisplayed(),"Check Whether Tab Bar is displayed or not", "Tab Bar is displayed");
			
			verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.clickonRecentTab(),"Check Whether recent list tab is clicked or not", "recent list tab is clicked");
			
			verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.ClickOnRecentItemInList(),"Check Whether recent item list is clicked or not", "recent item list is clicked");

			verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsbackButtonDisplayed(),"Check Whether back button is displayed  and clicked or not","back button is displayed  and clicked");
			
		}

	@Test(priority = 35,dataProvider="search")
	public void createChannel(String name,String hashtag,String channelname) throws IOException, InterruptedException {
		recentlist_screen recent = new recentlist_screen(getiosDriver());

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.clickonRecentTab(),"Check Whether recent list tab is clicked or not", "recent list tab is clicked");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsplusbuttonDisplayed(),
				"Check Whether plus button is displayed or not", "plus button is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.clickonCreateChannelButton(),
				"Check Whether create channel button is clicked or not", "create channel button is clicked");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.EnterChannelName(channelname),
				"Check Whether channel name is entered or not", "channel name is entered");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.setchannelCoverPicture(),"Check Whether channel cover picture is set or not", "channel cover picture is set");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.setchannelPicture(),	"Check Whether channel picture is set or not", "channel picture is set");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.clickOnNextButton(),
				"Check Whether next button is clicked or not", "next button is clicked");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.SelectContatcstoAddIntoChannel(),
				"Check Whether contacts are added to channel or not", "contacts are added to channel");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsDoneButtonDisplayed(),
				"Check Whether done button is displayed  and clicked or not", "done button is displayed  and clicked");

	}

	@Test(priority = 36)
	public void verifyadminbadgeisDisplayed() throws IOException, InterruptedException {
		recentlist_screen recent = new recentlist_screen(getiosDriver());
		
	//	verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.clickonRecentTab(),"Check Whether trending text is displayed or not", "trending text is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsadminBadgeDisplayed(),
				"Check Whether admin badge is displayed or not", "admin badge is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsNoPublicItemTextDisplayed(),
				"Check Whether no public item text is displayed or not", "no public item text is displayed ");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.navigateToPrivateCanvas(),
				"Check Whether no private item text is displayed or not", "no private item text is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsNoprivateItemTextDisplayed(),
				"Check Whether no private item text is displayed or not", "no private item text is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsbackButtonDisplayed(),
				"Check Whether back button is displayed  and clicked or not", "back button is displayed  and clicked");

	}

	@Test(priority = 37)
	public void navigatetochannelinfopage() throws IOException, InterruptedException {
		recentlist_screen recent = new recentlist_screen(getiosDriver());

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsadminBadgeDisplayed(),
				"Check Whether admin badge is displayed or not", "admin badge is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsmoreButtonDisplayed(),
				"Check Whether more button is displayed or not", "more button is displayed ");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.navigatetoChannelInfopage(),
				"Check Whether navigate to channelinfo is done or not", "navigate to channelinfo is done");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsAddFriendsButtonDisplayed(),
				"Check Whether add friends is displayed or not", "Add friends is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.AddContatcsIntoChannel(),
				"Check Whether contacts are added to channel or not", "contacts are added to channel");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsadmintextDisplayed(),
				"Check Whether admin item text is displayed or not", "admin text is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsleavechannelButtonDisplayed(),
				"Check Whether leave channel text is displayed or not", "leave channel text is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.isBackButtonDisplayed(),
				"Check Whether back button is displayed  and clicked or not", "back button is displayed  and clicked");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), recent.IsbackButtonDisplayed(),
				"Check Whether back button is displayed  and clicked or not", "back button is displayed  and clicked");


	}

}
