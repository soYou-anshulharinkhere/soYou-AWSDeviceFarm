package com.base.selenium.features;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;



public class UserInterFace {
	
	WebDriver driver;
	public UserInterFace(WebDriver driver){
		this.driver=driver;
		
	}
	public int getElementWidth(By element){
		
		try{
			int width = driver.findElement(element).getSize().getWidth();
			return width;
		}catch(NoSuchElementException e){
			return 0;
		}
		
		
	}
	
   public int getElementHeight(By element){
		
		try{
			int width = driver.findElement(element).getSize().getWidth();
			return width;
		}catch(NoSuchElementException e){
			return 0;
		}
		
		
	}

   public int get_X_Location(By element){
		
		try{
			Point p = driver.findElement(element).getLocation();
			return p.x;
		}catch(NoSuchElementException e){
			return 0;
		}
		
		
	}
   
   public int get_Y_Location(By element){
		
		try{
			Point p = driver.findElement(element).getLocation();
			return p.y;
		}catch(NoSuchElementException e){
			return 0;
		}
		
		
	}
}
