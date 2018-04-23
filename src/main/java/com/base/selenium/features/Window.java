package com.base.selenium.features;

import java.util.Set;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

public class Window {
	
	WebDriver driver;
	
	String parentWindow;
	public Window(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	public void switchToWindow(String windowName){
		
		parentWindow=driver.getWindowHandle();
		
		Set<String> window=driver.getWindowHandles();
		
		for(String win:window){
			
			if(win.equals(windowName)){
				driver.switchTo().window(win);
				break;
			}
		}
		
	}
	
   public void closeCurrentWindAndswitchToParentWindow(){
		
		closeChildWindow();
		
		driver.switchTo().window(parentWindow);
		
	}
	public void switchToParentWindow(){
		
		try{
		driver.switchTo().window(parentWindow);
		}catch(NoSuchWindowException e){
			
		}
	}
	
	
	public boolean closeChildWindow(){
		
		try{
			driver.close();
			return true;
		}catch(NoSuchWindowException e){
			return true;
		}
	}
}
