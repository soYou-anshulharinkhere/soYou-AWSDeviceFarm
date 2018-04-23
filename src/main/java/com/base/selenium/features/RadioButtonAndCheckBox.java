package com.base.selenium.features;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonAndCheckBox {
	
	WebDriver driver;
	public RadioButtonAndCheckBox(WebDriver driver){
		this.driver=driver;
		
	}
	
	
	public List<String> getAllOptions(By optionElement){
		
		List<String> Options=new ArrayList<String>();
		List<WebElement> optionElements=driver.findElements(optionElement);
		
		for(WebElement element:optionElements){
			
			Options.add(element.getText());
		}
		
		return Options;
		
		
	}
	
	
	
	public void selectOption(By optionElement){
		
		try{
			driver.findElement(optionElement).click();
		}catch(NoSuchElementException e){
			
		}
	}
    
   public void selectAllOption(By optionElement){
		
		try{
			List<WebElement> optionElements=driver.findElements(optionElement);
			
			for(WebElement element:optionElements){
				
				if(!element.isSelected()){
				   element.click();
				 }
			}
		}catch(NoSuchElementException e){
			
		}catch(ElementNotVisibleException e){
			
		}catch(Exception e){
			
		}
	}
    
   public void deSelectAllOption(By optionElement){
		
		try{
			List<WebElement> optionElements=driver.findElements(optionElement);
			
			for(WebElement element:optionElements){
				
				if(element.isSelected()){
				    element.click();
				}
			}
		}catch(NoSuchElementException e){
			
		}catch(ElementNotVisibleException e){
			
		}catch(Exception e){
			
		}
	}
	public void deSelectOption(By optionElement){
		
		try{
			
			if(driver.findElement(optionElement).isSelected()){
			driver.findElement(optionElement).click();
			 }
		}catch(NoSuchElementException e){
			
		}
	}
	public boolean  isOptionSelected(By optionElement){
		
		try{
			
			return driver.findElement(optionElement).isSelected();
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public int getAllSelectedOptionsCount(By optionElement){
     
		try{
		List<WebElement> radioElements=driver.findElements(optionElement);
		int radiobuttonCount=0;
		for(WebElement element:radioElements){
			
			if(element.isSelected()){
				radiobuttonCount=radiobuttonCount+1;
			}
		}
		return radiobuttonCount;
		}catch(NoSuchElementException e){
			return 0;
		}
	}
	
	public boolean isOptionEnabled(By optionElement){
		try{
			
			return driver.findElement(optionElement).isEnabled();
		}catch(NoSuchElementException e){
			return false;
		}
		
	}

}
