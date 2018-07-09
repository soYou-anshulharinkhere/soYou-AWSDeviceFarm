package com.soYou.obj.AndroidRegressiontest;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class ComposeOObj {

	public ComposeOObj(AndroidDriver driver)
	{
		this.driver=driver;
	}

	public AndroidDriver driver;
	/*Page Elements*/
	
	By PlusButton=By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.TextView");
    By EnternameTextField=By.id("com.joyn.soyou:id/chips_recycler");
    By ComposebackButton=By.id("Navigate up");
	By SelectTitle=By.id("Navigate up");
	By Noresults=By.id("");
	
	By 
	
	
	
	/*Objets*/
	public boolean PlusButton(){
		try{
			 driver.findElement(PlusButton).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean EnternameTextField(){
		try{
			 driver.findElement(EnternameTextField).click();
			 return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean ComposebackButton(){
		try{
			return driver.findElement(ComposebackButton).isDisplayed();
			
		}catch(NoSuchElementException e){
			return false;
		}
	}  

	public boolean SelectTitle(){
		try{
			driver.findElement(SelectTitle).click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	}
	

