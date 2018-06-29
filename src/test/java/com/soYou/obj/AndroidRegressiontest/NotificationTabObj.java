package com.soYou.obj.AndroidRegressiontest;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class NotificationTabObj {

	public NotificationTabObj(AndroidDriver driver)
	{
		this.driver=driver;
	}

	public AndroidDriver driver;
	/*Page Elements*/
	
	By NotificationTitleBarText=By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.TextView");
	
	
	
	
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
	
	}
	

}