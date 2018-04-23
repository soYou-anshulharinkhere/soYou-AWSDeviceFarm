package com.base.selenium.features;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.selenium.features.AdvanceUserInteractions;
import com.base.selenium.features.Alerts;
import com.base.selenium.features.DropDown;
import com.base.selenium.features.Frames;
import com.base.selenium.features.JQueryUITab;
import com.base.selenium.features.RadioButtonAndCheckBox;
import com.base.selenium.features.UserInterFace;
import com.base.selenium.features.WebTable;
import com.base.selenium.features.Window;


public class TestBase {

	static final int WAIT_TIME=3;
    WebDriver driver;
	public TestBase(WebDriver driver){
		this.driver=driver;
	}
	
	public boolean titleContains(String title){
		
		try{
			new WebDriverWait(driver,WAIT_TIME).until(ExpectedConditions.titleContains(title));
			return driver.getTitle().equals(title);
		}catch(Throwable e){
			return false;
		}
	}
	public void injectJavaScriptClick(By element){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(element));
	}
	
	public void clickOn(By onElement){
		
		try{
			new WebDriverWait(driver,WAIT_TIME).until(ExpectedConditions.elementToBeClickable(onElement));
			driver.findElement(onElement).click();
		}catch(ElementNotVisibleException e){
			
		}catch(NoSuchElementException e){
			
			
		}
	}
	public boolean isTextPresent(By element,String text){
		
		try{
			new WebDriverWait(driver,WAIT_TIME).until(ExpectedConditions.textToBePresentInElementLocated(element, text));
			return driver.findElement(element).getText().equals(text);
		}catch(NoSuchElementException e){
			return false;
		}catch(TimeoutException e){
			return false;
		}catch(Throwable e){
			return false;
		}
	}
	
	
	public boolean isTextDisappeared(By element,String text){
		try{
			new WebDriverWait(driver,WAIT_TIME).until(ExpectedConditions.invisibilityOfElementWithText(element, text));
			return driver.findElement(element).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}catch(TimeoutException e){
			return false;
		}catch(Throwable e){
			return false;
		}
	}
	public boolean isDisplayed(By element){
		
		try{
			
			new WebDriverWait(driver,WAIT_TIME).until(ExpectedConditions.visibilityOfElementLocated(element));
			return driver.findElement(element).isDisplayed();
					
		}catch(NoSuchElementException e){
			return false;
		}catch(TimeoutException e){
			return false;
		}catch(Throwable e){
			return false;
		}
	}
	
    
	public UserInterFace userInterface(){
		
		return new UserInterFace(driver);
	}
	public Alerts alert(){
		
		return new Alerts(driver);
	}
     
    public AdvanceUserInteractions advanceUserInteraction(){
    	return new AdvanceUserInteractions(driver);
    }
    
    public DropDown dropDown(){
    	
    	return new DropDown(driver);
    }
    
    public Frames frame(){
    	
    	return new Frames(driver);
    }
    
    public Window window(){
    	
    	return new Window(driver);
    }
    
    public RadioButtonAndCheckBox radioButton(){
    	
    	return new RadioButtonAndCheckBox(driver);
    }
    
    public RadioButtonAndCheckBox checkBox(){
    	
    	return new RadioButtonAndCheckBox(driver);
    }
    
    public JQueryUITab jqueryUITab(WebElement tabELement){
    	
    	return new JQueryUITab(tabELement);
    }
    
    public WebTable webTable(WebElement webtableElement){
    	
    	return new WebTable(webtableElement);
    }
    
   
}
