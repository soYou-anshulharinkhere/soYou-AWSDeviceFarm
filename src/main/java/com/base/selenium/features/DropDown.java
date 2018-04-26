package com.base.selenium.features;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	WebDriver driver;
	public DropDown(WebDriver driver){
		this.driver=driver;
	}
	
	
	public boolean isSupportedMultipleOption(By element){
		Select dropdown=new Select(driver.findElement(element));
		
		return dropdown.isMultiple();
	}
 public List<String> getAllOptions(By element){
    	 
    	 try{
    	     List<String> allOptions=new ArrayList<String>();
    	     Select dropDown=new Select(driver.findElement(element));
    	 
    	     for(WebElement option:dropDown.getOptions()){
    		
    	     	allOptions.add(option.getText());
    		
    	      }
    	
    	   return allOptions;
    	 }catch(NoSuchElementException er){
    		 return null;
    	 }
     } 
     
    public List<String> getAllSelectedOptions(By element){
    	 
    	 try{
    	     List<String> allOptions=new ArrayList<String>();
    	     Select dropDown=new Select(driver.findElement(element));
    	 
    	     for(WebElement option:dropDown.getAllSelectedOptions()){
    		
    	     	allOptions.add(option.getText());
    		
    	      }
    	
    	   return allOptions;
    	 }catch(NoSuchElementException er){
    		 return null;
    	 }
     } 
	
    public void selectByIndex(By element,int indexNo){
    	
    	try{
    	Select select=new Select(driver.findElement(element));
    	select.selectByIndex(indexNo);
    	}catch(NoSuchElementException e){
    		
    	}
    	
    }
    
    public void selectByValue(By element,String name){
    	
    	try{
    		Select select=new Select(driver.findElement(element));
    		
    		select.selectByValue(name);
    	}catch(NoSuchElementException e){
    		
    	}
    	
    }
    
    public void selectByVisibleText(By element,String text){
    	try{
    		Select select=new Select(driver.findElement(element));
    		
    		select.selectByVisibleText(text);
    	}catch(NoSuchElementException e){
    		
    	}
    }
    
  public void deSelectByIndex(By element,int indexNo){
    	
    	try{
    	Select select=new Select(driver.findElement(element));
    	select.deselectByIndex(indexNo);
    	}catch(NoSuchElementException e){
    		
    	}
    	
    }
  public void deSelectByValue(By element,String name){
  	
  	try{
  		Select select=new Select(driver.findElement(element));
  		
  		select.deselectByValue(name);
  	}catch(NoSuchElementException e){
  		
  	}
  	
  }
  
  public void deselectByVisibleText(By element,String text){
  	try{
  		Select select=new Select(driver.findElement(element));
  		
  		select.deselectByVisibleText(text);
  	}catch(NoSuchElementException e){
  		
  	}
  }
  
  public void deselectAll(By element){
  	try{
  		Select select=new Select(driver.findElement(element));
  		
  		select.deselectAll();
  	}catch(NoSuchElementException e){
  		
  	}
  }
  
  public String getFirstSelectedOption(By element){
  	try{
  		Select select=new Select(driver.findElement(element));
  		
  		
  		return select.getFirstSelectedOption().getText();
  	}catch(NoSuchElementException e){
  		return "Selected Value not found";
  	}
  }

}
