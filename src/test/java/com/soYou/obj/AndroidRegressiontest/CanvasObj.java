package com.soYou.obj.AndroidRegressiontest;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CanvasObj {

	public CanvasObj(AndroidDriver driver)
	{
		this.driver=driver;
	}

	public AndroidDriver driver;
	/*Page Elements*/
	
	By CanvasProfEdit=By.id("Edit");
	By CameraEditIcon=By.id("com.joyn.soyou:id/civEditIcon");
	By RemoveImageOption=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
	By ConfirmDelete=By.id("android:id/button2");
	By EditProfileFirstNameTextField=By.id("com.joyn.soyou:id/tiFirstName");
	By EditProfileLastNameTextField=By.id("com.joyn.soyou:id/tiLastName");
	By ProfileEditBackClick=By.id("Navigate up");
	By SaveChanges=By.id("Done");
	By TitleBarEditprofiletext=By.id("Navigate up");
	By FacebookConnectButton=By.id("com.joyn.soyou:id/rlFbLogin");
	By EmptyViewCard=By.id("com.joyn.soyou:id/ivEmptyView");
	By EmptyViewText=By.id("com.joyn.soyou:id/tvEmptyCanvas");
	By PointerToCompose=By.id("com.joyn.soyou:id/ivDirections");
	By ProfileImagePlaceholderImage=By.id("com.joyn.soyou:id/civProfilePic");
	By SecondTab=By.id("com.joyn.soyou:id/ivTabOne");
	
	By NavigationDrawer=By.id("Settings");
	By OptionsTitleBar=By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView");
	By ProfileOption=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView");
	By AddFriends=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView");
	
	
	By BlockedUsers=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView");
	By PrivacyPolicy=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.TextView");
	By Terms=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.TextView");
	By Feedback=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.TextView");
	By About=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[7]/android.widget.TextView");
	By LogOut=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[8]/android.widget.TextView");

	
		
	
	
	/*Objets*/
	public boolean SecondTab(){
		try{
			 driver.findElement(SecondTab).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean CanvasProfEdit(){
		try{
			 driver.findElement(CanvasProfEdit).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean CameraEditIcon(){
		try{
			 driver.findElement(CameraEditIcon).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean RemoveImageOption(){
		try{
			 driver.findElement(RemoveImageOption).click();
			 return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}


	public boolean ConfirmDelete(){
		try{
			driver.findElement(ConfirmDelete).click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean EditProfileFirstNameTextField(){
		try{
			 driver.findElement(EditProfileFirstNameTextField).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean EditProfileLastNameTextField(){
		try{
			 driver.findElement(EditProfileLastNameTextField).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ProfileEditBackClick(){
		try{
			 driver.findElement(ProfileEditBackClick).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean SaveChanges(){
		try{
			 driver.findElement(SaveChanges).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean TitleBarEditprofiletext(){
		try{
			 driver.findElement(TitleBarEditprofiletext).isDisplayed();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean FacebookConnectButton(){
		try{
			 driver.findElement(FacebookConnectButton).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean EmptyViewText(){
		try{
			 driver.findElement(EmptyViewText).isDisplayed();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean EmptyViewCard(){
		try{
			 driver.findElement(EmptyViewCard).isDisplayed();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean PointerToCompose(){
		try{
			 driver.findElement(PointerToCompose).isDisplayed();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ProfileImagePlaceholderImage(){
		try{
			 driver.findElement(ProfileImagePlaceholderImage).isDisplayed();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}

			
			public boolean NavigationDrawer(){
		try{
			 driver.findElement(NavigationDrawer).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean OptionsTitleBar(){
		try{
			 driver.findElement(OptionsTitleBar).isDisplayed();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ProfileOption(){
		try{
			 driver.findElement(ProfileOption).click();
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
		
	public boolean BlockedUsers(){
		try{
			 driver.findElement(BlockedUsers).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean PrivacyPolicy(){
		try{
			 driver.findElement(PrivacyPolicy).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean Terms(){
		try{
			 driver.findElement(Terms).isDisplayed();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean Feedback(){
		try{
			 driver.findElement(Feedback).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean About(){
		try{
			 driver.findElement(About).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean LogOut(){
		try{
			 driver.findElement(LogOut).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	

}