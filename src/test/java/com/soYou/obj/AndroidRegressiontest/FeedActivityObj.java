package com.soYou.obj.AndroidRegressiontest;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class FeedActivityObj {
	public AndroidDriver driver;

	public FeedActivityObj(AndroidDriver driver)
	{
		this.driver=driver;
	}





	//	/*Objets*/
	public boolean RecentTabClick(){
		try{
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.RelativeLayout/android.widget.ImageView").click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean SeacrhIconRecentTab(){
		try{
			driver.findElementByAccessibilityId("Search").click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean SeacrhTextfield(){
		try{
			 driver.findElementById("com.joyn.soyou:id/search_src_text").sendKeys("AUTO PROFILE");
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean SearchedResultSelect(){
		try{
			MobileElement el1 = (MobileElement) driver.findElementById("com.joyn.soyou:id/rlContent");
			el1.click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean SendSomethingSelect(){
		try{
			MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout");
			el2.click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean ComposeMessage(){
		try{
			MobileElement el3 = (MobileElement) driver.findElementById("com.joyn.soyou:id/etGiftDescription");
			el3.sendKeys("This is Automation genrated message. From Appium Android Device.");
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean ComposeImageAttachOptionThroughCamera(){
		try{
			MobileElement el4 = (MobileElement) driver.findElementById("com.joyn.soyou:id/btnCamera");
			el4.click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean MediaPermission(){
		try{
			MobileElement el5 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
			el5.click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}	
	public boolean LocationAddcheck(){
		try{

			driver.findElementById("com.joyn.soyou:id/btnLocation").click();		
			driver.findElementById("com.google.android.gms:id/select_marker_location").click();
			driver.findElementById("com.google.android.gms:id/confirm_button").click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}	
	public boolean SendGift(){
		try{
			driver.findElementById("com.joyn.soyou:id/btnSendGift").click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean UnapprovedGiftPopUp(){
		try{
			driver.findElementById("com.joyn.soyou:id/btnTop").click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean FeedActitvityTab(){
		try{
			driver.findElementById("com.joyn.soyou:id/ivTabFive").click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean PullToRefreshOnFeed(){
		try{	
			TouchAction ts = new TouchAction(driver).press(546, 290).moveTo(19, 1042).release().perform();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean CanvasTab(){
		try{	
			driver.findElementById("com.joyn.soyou:id/ivTabOne").click();
			return true;

		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean SettingIconCanvasSrc(){
		try{	
			driver.findElementByAccessibilityId("Settings").click();
			return true;

		}catch(NoSuchElementException e){
			return false;
		}	
	}
	public boolean Logout(){
		try{	
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[8]/android.widget.TextView").click();
			driver.findElementById("android:id/button2").click();
			return true;

		}catch(NoSuchElementException e){
			return false;
		}	
	}

	public boolean EnterRegMobileNumber(){
		try{	
			driver.findElementById("com.joyn.soyou:id/etMobileNumber").sendKeys("94251387121");
			return true;

		}catch(NoSuchElementException e){
			return false;
		}	
		
	}
		public boolean NotificationTab(){
			try{	
				driver.findElementById("com.joyn.soyou:id/ivBellIcon").click();
				return true;

			}catch(NoSuchElementException e){
				return false;
			}
	}
		public boolean NotificationTabFirstRowSelection(){
			try{	
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]").click();
				return true;

			}catch(NoSuchElementException e){
				return false;
			}
	}
		public boolean CommentDetailView(){
			try{	
				driver.findElementById("com.joyn.soyou:id/etComments").sendKeys("Unapproved Comment in detail view.");
				return true;

			}catch(NoSuchElementException e){
				return false;
			}
	}
		public boolean CommentDetailViewSend(){
			try{	
				driver.findElementById("com.joyn.soyou:id/tvSendComment").click();
				
				return true;

			}catch(NoSuchElementException e){
				return false;
			}
	}
		public boolean BlockForFirstPost(){
			try{	
				driver.findElementById("com.joyn.soyou:id/btnBlock").click();
				
				return true;

			}catch(NoSuchElementException e){
				return false;
			}
	}
		public boolean BlockedUserInSettings(){
			try{	
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]").click();
				return true;

			}catch(NoSuchElementException e){
				return false;
			}
	}
		
		public boolean BlockedUserOnFirstPosition(){
			try{	
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
	}
		public boolean UnblockUserButtonOnBlockedUserList(){
			try{	
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout").click();
				
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
			
	}
	
		public boolean Back(){
			try{	
				driver.findElementByAccessibilityId("Navigate up").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
			
			
	}
		
		public boolean AcceptInDetailView(){
			try{
				driver.findElementById("com.joyn.soyou:id/btnAccept").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean ReplyInFirstComment(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[2]").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean ReplyInSecondComment(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean CancelReply(){
			try{
				driver.findElementById("com.joyn.soyou:id/tvXButton").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean ShareOnSoyouButtoOnDetailView(){
			try{
				driver.findElementById("com.joyn.soyou:id/ivReshare").click();
				driver.findElementById("com.joyn.soyou:id/fragment_history_bottom_sheet_edit").click();
				driver.findElementById("com.joyn.soyou:id/llChipView").click();
				
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean DoneButton(){
			try{
				driver.findElementByAccessibilityId("Done").click();
				
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean ReshareCompose(){
			try{
				 driver.findElementById("com.joyn.soyou:id/etReshare").sendKeys("Reshare Automation Text Check");
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean ComposeFirstPost(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean ThreeDotButtonInDetailViewSrc(){
			try{
				driver.findElementByAccessibilityId("More options").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean SpamOption(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean DeleteOption(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean DeleteOrSpamYes(){
			try{
				driver.findElementById("android:id/button2").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean ProfileEditButton(){
			try{
				driver.findElementByAccessibilityId("Edit").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean AddANewPhoto(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean RemovePhoto(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean RemovePhotoYesOption(){
			try{
				driver.findElementById("android:id/button2").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean SetRecommendationEditOption(){
			try{
				driver.findElementById("com.joyn.soyou:id/ivEditAboutMe").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean SetRecommendationSearchField(){
			try{
				driver.findElementById("com.joyn.soyou:id/search_src_text").sendKeys("RandomWord");
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		
		public boolean SetRecommendationAddNewWord(){
			try{
				driver.findElementById("com.joyn.soyou:id/btnAdd").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean SetRecommendationAddNewWordRemove(){
			try{
				driver.findElementById("com.joyn.soyou:id/ivClose").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean SetRecommendationSave(){
			try{
				driver.findElementById("com.joyn.soyou:id/ivClose").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean AskFriendsForRecommendation(){
			try{
				driver.findElementById("com.joyn.soyou:id/btnAsk").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean AskFriendsForRecommendationSelectionFirstFriends(){
			try{
				driver.findElementById("com.joyn.soyou:id/llChipView").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean AskFriendsForRecommendationAskButton(){
			try{
				 driver.findElementById("com.joyn.soyou:id/ask").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean RecentTabFirstUser(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean SelectFiveRecommendedWord(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView").click();
				 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView").click();
				 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView").click();
				 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.TextView").click();
				 return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean CreateChannelPlusButtonOnRecentTab(){
			try{
				driver.findElementByAccessibilityId("More options").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean CreateChannelPopUpOption(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean CreateChannelNaming(){
			try{
				driver.findElementById("com.joyn.soyou:id/tiName").sendKeys("AutomationCreateChannel");
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean ChannelProfilePicEditIcon(){
			try{
				driver.findElementById("com.joyn.soyou:id/civEditIcon").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		
		public boolean CreateChannelNextButton(){
			try{
				driver.findElementById("com.joyn.soyou:id/civEditIcon").click();
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		public boolean SelectUserFrmList(){
			try{
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]").click();
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]").click();
				
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
}