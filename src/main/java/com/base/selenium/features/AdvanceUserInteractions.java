package com.base.selenium.features;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AdvanceUserInteractions {
	
	WebDriver driver;
	public AdvanceUserInteractions(WebDriver  driver){
		this.driver=driver;
	}

	
	public void mouseHoverOn(By element){
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(element)).build().perform();
	}
	

	public void mouseHoverAndClickOn(By element,By ele){
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(element)).click(driver.findElement(ele));
	}
	
	public List<String> mouseHoverAndGetAllLinksName(By hoverElement,By onElement){
		
		try{
		List<String> allNames=new ArrayList<String>();
	     Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(hoverElement)).build().perform();
		
		List<WebElement> e=driver.findElement(hoverElement).findElements(onElement);
		
		for(WebElement names:e){
			
			allNames.add(names.getText());
		}
		
		return allNames;
		}catch(NoSuchElementException e){
			return null;
		}
		
	}
	
	public void contextClick(By onElement){
		
		Actions action=new Actions(driver);
		
		action.contextClick(driver.findElement(onElement));
	}
	
	
	
}
