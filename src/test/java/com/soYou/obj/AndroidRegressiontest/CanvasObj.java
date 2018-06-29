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
	By RemoveImageOption=By.id("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
	By ConfirmDelete=By.id("android:id/button2");
	By EditProfileFirstNameTextField=By.id("com.joyn.soyou:id/tiFirstName");
	By EditProfileLastNameTextField=By.id("com.joyn.soyou:id/tiLastName");
	By ProfileEditBackClick=By.id("Navigate up");
	By TitleBarEditprofiletext=By.id("Navigate up");
	By FacebookConnectButton=By.id("com.joyn.soyou:id/rlFbLogin");
	By EmptyViewCard=By.id("com.joyn.soyou:id/ivEmptyView");
	By EmptyViewText=By.id("com.joyn.soyou:id/tvEmptyCanvas");
	By PointerToCompose=By.id("com.joyn.soyou:id/ivDirections");
	By ProfileImagePlaceholderImage=By.id("com.joyn.soyou:id/civProfilePic");
	
	
	/*Objets*/
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
			return driver.findElement(RemoveImageOption).isDisplayed();
			
		}catch(NoSuchElementException e){
			return false;
		}
	}


	public boolean ConfirmDelete(String phNo){
		try{
			driver.findElement(ConfirmDelete).sendKeys(phNo);
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
	public boolean TitleBarEditprofiletext(){
		try{
			 driver.findElement(TitleBarEditprofiletext).click();
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
			 driver.findElement(EmptyViewText).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean EmptyViewCard(){
		try{
			 driver.findElement(FacebookConnectButton).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean PointerToCompose(){
		try{
			 driver.findElement(PointerToCompose).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ProfileImagePlaceholderImage(){
		try{
			 driver.findElement(ProfileImagePlaceholderImage).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	

}