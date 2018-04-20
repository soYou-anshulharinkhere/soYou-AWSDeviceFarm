package TestSc;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppInitializer;

import pageobjects.Search_tab;
import utility.ExcelReader;

public class searchTabPage extends AppInitializer {
	
	@DataProvider(name="search")
	 public Object[][] userdetails() throws Exception{
	  Object[][] values=ExcelReader.getTableArray(".//Data//user_details.xlsx", "search");
	  return values;
	 }
	
	@Test(priority=42)
	public void verifyTrendingTextisDisplayed() throws IOException, InterruptedException {
		Search_tab search=new Search_tab(getiosDriver());

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isTabBarDisplayed(),"Check Whether tab bar is displayed or not", "tab bar text is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isSearchbarDispalyed(),"Check Whether search bar is displayed or not", "search bar is displayed");

		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.Trendingtext(), "Check Whether trending text is displayed or not", "trending text is displayed");
	
	}
	
	@Test(priority=43,dataProvider="search")
	public void searchforuserinsearchtab(String name,String hashtag,String channelname) throws IOException, InterruptedException {
		Search_tab search=new Search_tab(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isSearchbarDispalyed(), "Check Whether search bar is displayed or not", "search bar is displayed");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.searchUser(name), "Check Whether trending user search is done or not", "user search is done");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isbackbuttondisplayed(), "Check Whether back button is displayed or not", "back button is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isCleartextDispalyed(), "Check Whether clear text is done or not", "clear text is done");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.iscancelbuttonclicked(), "Check Whether cancel text is done or not", "cancel text is done or not");
	}
	
	@Test(priority=44,dataProvider="search")
	public void verifyrecentsearch(String name,String hashtag,String channelname) throws IOException, InterruptedException {
		Search_tab search=new Search_tab(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.recentSearch(name), "Check Whether recent search  is displayed or not", "recent search  is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isbackbuttondisplayed(), "Check Whether back button is displayed or not", "back button is displayed");
		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isCleartextDispalyed(), "Check Whether clear text is done or not", "clear text is done");
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.iscancelbuttonclicked(), "Check Whether cancel text is done or not", "cancel text is done or not");
	}
	
	@Test(priority=45,dataProvider="search")
	public void searchfHashtaginsearchtab(String name,String hashtag,String channelname) throws IOException, InterruptedException {
		Search_tab search=new Search_tab(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isSearchbarDispalyed(), "Check Whether search bar is displayed or not", "search bar is displayed");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.searchHastag(hashtag), "Check Whether search hashtag text is done or not", "search hashtag text is done");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.navigateTohashtagDetailView(), "Check Whether navigation to hashtag detail view is done or not", "navigation to hashtag detail view is done ");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isbackarrowbuttondisplayed(), "Check Whether back button is displayed or not", "back button is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isbackarrowbuttondisplayed(), "Check Whether back button is displayed or not", "back button is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isCleartextDispalyed(), "Check Whether clear text is done or not", "clear text is done");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.iscancelbuttonclicked(), "Check Whether cancel text is done or not", "cancel text is done or not");
	}
	
	@Test(priority=46,dataProvider="search")
	public void verifyrecentsearchhashtag(String name,String hashtag,String channelname) throws IOException, InterruptedException {
		Search_tab search=new Search_tab(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.recentSearch(hashtag), "Check Whether recent search is displayed or not", "recent search is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.navigateTohashtagDetailView(), "Check Whether navigation to hashtag detail view is done or not", "navigation to hashtag detail view is done ");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isbackarrowbuttondisplayed(),"Check Whether back button is displayed or not", "back button is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isbackarrowbuttondisplayed(), "Check Whether back button is displayed or not", "back button is displayed");
		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isCleartextDispalyed(), "Check Whether clear text is done or not", "clear text is done");
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.iscancelbuttonclicked(), "Check Whether cancel text is done or not", "cancel text is done or not");
	}
	
	
	@Test(priority=47)
	public void viewTrendingHashtag() throws IOException, InterruptedException {
		Search_tab search=new Search_tab(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.TrendingTagNavigation(), "Check Whether navigation from trending list is done or not", "navigation from trending list is done ");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.navigateTohashtagDetailView(), "Check Whether navigation to hashtag detail view is done or not", "navigation to hashtag detail view is done ");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isbackarrowbuttondisplayed(), "Check Whether back button is displayed or not", "back button is displayed");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.isbackarrowbuttondisplayed(), "Check Whether back button is displayed or not", "back button is displayed");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), search.navigateToCanvas(), "Check Whether navigation to canvas is done  or not", "navigation to canvas is done");
	}
	
}
