package com.soYou.obj.AndroidRegressiontest;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class RecentUserAndChannelObj {

	public RecentUserAndChannelObj(AndroidDriver driver)
	{
		this.driver=driver;
	}

	public AndroidDriver driver;
	/*Page Elements*/
	
	By FourthTab=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.RelativeLayout/android.widget.ImageView");
	By SearchIconOnRecentTab=By.id("Search");
	By MoreOptions=By.id("More options");
	By EmptyViewCard=By.id("com.joyn.soyou:id/ivEmptyView");
	By EmptyViewText=By.id("com.joyn.soyou:id/tvEmptyRecent");
	By InviteFriends=By.id("com.joyn.soyou:id/btnAction");
	
	By SearchTextField=By.id("com.joyn.soyou:id/search_src_text");
	By SearchBackButton=By.id("Collapse");
	By AddFriends=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
	By AddFriendsSelectFriendTitle=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView");
	By ImportFacebookButton=By.id("com.joyn.soyou:id/btnImportFB");
	By AddFriendsSelectFriendSerchTxtField=By.id("android:id/search_src_text");
	By NosearchResult=By.id("com.joyn.soyou:id/tvEmptyView");
	By SearchcancelButton=By.id("Clear query");
	
	
	
	
	By CreateChannel=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
	By CreateChannelText=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView");
	By CreateChannelNextButton=By.id("com.joyn.soyou:id/next");
	By ChannelNameTextField=By.id("com.joyn.soyou:id/tilName");
	By ChanneldDefaulltProfileImagePlaceholder= By.id("com.joyn.soyou:id/civProfilePic");
	By DiscardChannelYes=By.id("android:id/button2");
	By DiscardChannelNo=By.id("android:id/button1");
	
	
	
	
	By CreateChannelSelectFriend=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView");
	By CreateChannelSelectFriendSearchTextField=By.id("android:id/search_src_text");
	By CreateChannelSelectFriendSearchIcon=By.id("id	android:id/search_mag_icon");
	By CreateChannelSelectFriendDone=By.id("Done");
	

	
	

	
	/*Objets*/
	
	public boolean FourthTab(){
		try{
			 driver.findElement(FourthTab).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean SearchIconOnRecentTab(){
		try{
			 driver.findElement(SearchIconOnRecentTab).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean MoreOptions(){
		try{
			 driver.findElement(MoreOptions).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean EmptyViewCard(){
		try{
			return driver.findElement(EmptyViewCard).isDisplayed();
			
		}catch(NoSuchElementException e){
			return false;
		}
	}


	public boolean EmptyViewText(){
		try{
			driver.findElement(EmptyViewText).getText().equals("You seem be the first in soYou among your friends. Go ahead and invite them.");
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	

	
	public boolean SearchTextField(String searchtext){
		try{
			  driver.findElement(SearchTextField).sendKeys(searchtext);
			  
			  return true;
			 
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean SearchBackButton(){
		try{
			 driver.findElement(SearchBackButton).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean NosearchResult(){
		try{
			 driver.findElement(NosearchResult).getText().equals("No search results");
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	
	public boolean SearchcancelButton(){
		try{
			 driver.findElement(SearchcancelButton).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean AddFriends(){
		try{
			 driver.findElement(AddFriends).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean AddFriendsSelectFriendTitle(){
		try{
			 driver.findElement(AddFriendsSelectFriendTitle).isDisplayed();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ImportFacebookButton(){
		try{
			 driver.findElement(ImportFacebookButton).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean AddFriendsSelectFriendSerchTxtField(){
		try{
			 driver.findElement(AddFriendsSelectFriendSerchTxtField).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}

	
	public boolean CreateChannel(){
		try{
			 driver.findElement(CreateChannel).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean CreateChannelText(){
		try{
			 driver.findElement(CreateChannelText).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean CreateChannelNextButton(){
		try{
			 driver.findElement(CreateChannelNextButton).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ChannelNameTextField(){
		try{
			 driver.findElement(ChannelNameTextField).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ChanneldDefaulltProfileImagePlaceholder(){
		try{
			 driver.findElement(ChanneldDefaulltProfileImagePlaceholder).isDisplayed();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean DiscardChannelYes(){
		try{
			 driver.findElement(DiscardChannelYes).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean DiscardChannelNo(){
		try{
			 driver.findElement(DiscardChannelNo).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	
	
	public boolean CreateChannelSelectFriend(){
		try{
			 driver.findElement(CreateChannelSelectFriend).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean CreateChannelSelectFriendSearchTextField(){
		try{
			 driver.findElement(CreateChannelSelectFriendSearchTextField).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean CreateChannelSelectFriendSearchIcon(){
		try{
			 driver.findElement(CreateChannelSelectFriendSearchIcon).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean CreateChannelSelectFriendDone(){
		try{
			 driver.findElement(CreateChannelSelectFriendDone).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}

}