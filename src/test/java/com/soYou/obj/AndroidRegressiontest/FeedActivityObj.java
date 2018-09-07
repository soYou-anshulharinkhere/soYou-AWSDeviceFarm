//package com.soYou.obj.AndroidRegressiontest;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
//
//public class FeedActivityObj {
//
//	public FeedActivityObj(AndroidDriver driver)
//	{
//		this.driver=driver;
//	}
//
//	public AndroidDriver driver;
//	/*Page Elements*/
//	
//	By SearchIconOnRecentTab=By.id("Search");
//	By MoreOptions=By.id("More options");
//	By EmptyViewCard=By.id("com.joyn.soyou:id/ivEmptyView");
//	By EmptyViewText=By.id("com.joyn.soyou:id/tvEmptyRecent");
//	By InviteFriends=By.id("com.joyn.soyou:id/btnAction");
//	
//	By SearchTextField=By.id("com.joyn.soyou:id/search_src_text");
//	By SearchBackButton=By.id("Collapse");
//	By AddFriends=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
//	By AddFriendsSelectFriendTitle=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView");
//	By ImportFacebookButton=By.id("com.joyn.soyou:id/btnImportFB");
//	By AddFriendsSelectFriendSerchTxtField=By.id("android:id/search_src_text");
//	
//	
//	
//	By CreateChannel=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
//	By CreateChannelText=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView");
//	By CreateChannelNextButton=By.id("com.joyn.soyou:id/next");
//	By ChannelNameTextField=By.id("com.joyn.soyou:id/tilName");
//	By ChanneldDefaulltProfileImagePlaceholder= By.id("com.joyn.soyou:id/civProfilePic");
//	By DiscardChannelYes=By.id("android:id/button2");
//	By DiscardChannelNo=By.id("android:id/button1");
//	
//	
//	
//	
//	By CreateChannelSelectFriend=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView");
//	By CreateChannelSelectFriendSearchTextField=By.id("android:id/search_src_text");
//	By CreateChannelSelectFriendSearchIcon=By.id("id	android:id/search_mag_icon");
//	By CreateChannelSelectFriendDone=By.id("Done");
//	
//	
//	
//	
//	/*Objets*/
//	public boolean CanvasProfEdit(){
//		try{
//			 driver.findElement(CanvasProfEdit).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean CameraEditIcon(){
//		try{
//			 driver.findElement(CameraEditIcon).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	
//	public boolean RemoveImageOption(){
//		try{
//			return driver.findElement(RemoveImageOption).isDisplayed();
//			
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//
//
//	public boolean ConfirmDelete(String phNo){
//		try{
//			driver.findElement(ConfirmDelete).sendKeys(phNo);
//			return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean EditProfileFirstNameTextField(){
//		try{
//			 driver.findElement(EditProfileFirstNameTextField).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean EditProfileLastNameTextField(){
//		try{
//			 driver.findElement(EditProfileLastNameTextField).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean ProfileEditBackClick(){
//		try{
//			 driver.findElement(ProfileEditBackClick).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean TitleBarEditprofiletext(){
//		try{
//			 driver.findElement(TitleBarEditprofiletext).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean FacebookConnectButton(){
//		try{
//			 driver.findElement(FacebookConnectButton).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean EmptyViewText(){
//		try{
//			 driver.findElement(EmptyViewText).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean EmptyViewCard(){
//		try{
//			 driver.findElement(FacebookConnectButton).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean PointerToCompose(){
//		try{
//			 driver.findElement(PointerToCompose).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	public boolean ProfileImagePlaceholderImage(){
//		try{
//			 driver.findElement(ProfileImagePlaceholderImage).click();
//			 return true;
//		}catch(NoSuchElementException e){
//			return false;
//		}
//	}
//	
//
//}