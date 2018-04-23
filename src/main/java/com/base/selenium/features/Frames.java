package com.base.selenium.features;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {
	WebDriver driver;
	
	public Frames(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void switchToFrame(By element){
		
		try{
			
			driver.switchTo().frame(driver.findElement(element));
		}catch(NoSuchFrameException e){
			
		}
		
	}
	
    public void switchToFrame(WebElement element){
		
		try{
			
			driver.switchTo().frame((element));
		}catch(NoSuchFrameException e){
			
		}
		
	}

     public void switchToFrame(String name){
		
		try{
			
			driver.switchTo().frame(name);
		}catch(NoSuchFrameException e){
			
		}
		
	}
     
     public void switchToFrame(int frameNo){
 		
 		try{
 			
 			driver.switchTo().frame(frameNo);
 		}catch(NoSuchFrameException e){
 			
 		}
 		
 	}
     public void switchToParentFrame(){
  		
  		try{
  			
  			driver.switchTo().parentFrame();
  		}catch(NoSuchFrameException e){
  			
  		}
  		
  	} 
     
     public void switchToActiveElement(){
   		
   		try{
   			
   			driver.switchTo().activeElement();
   		}catch(NoSuchFrameException e){
   			
   		}
   		
   	} 
     public void switchToDefaultContent(){
    		
    		try{
    			
    			driver.switchTo().defaultContent();
    		}catch(NoSuchFrameException e){
    			
    		}
    		
    	} 
}
