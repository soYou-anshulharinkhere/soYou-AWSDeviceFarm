package com.base.selenium.features;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	
	WebDriver driver;
	
	public Alerts(WebDriver driver){
		this.driver=driver;
	}
	
	public boolean isAlertPresent(String alertTitleName){
		
		try{
			
		waitforAlert();
		return driver.switchTo().alert().getText().equals(alertTitleName);
		}catch(NoAlertPresentException e){
			return false;
		}
	}
	
	public void switchToDefaultContent(){
		
		driver.switchTo().defaultContent();
	}
	public void acceptAlert(){
		try{
			 waitforAlert();
			 driver.switchTo().alert().accept();
			}catch(NoAlertPresentException e){
				
			}
	}
	public void dismissAlert(){
		try{
			waitforAlert();
			 driver.switchTo().alert().dismiss();
			}catch(NoAlertPresentException e){
				
			}
	}
	
	public void enterTextInAlert(String text){
		try{
			waitforAlert();
			 driver.switchTo().alert().sendKeys(text);
			}catch(NoAlertPresentException e){
				
			}
	}

	private boolean waitforAlert(){
		
		
		try{
			ExpectedConditions.alertIsPresent();
		//new WebDriverWait(driver,3).until(ExpectedConditions.alertIsPresent());
		
		return true;
		}catch(TimeoutException e){
			return false;
		}
	}
}
