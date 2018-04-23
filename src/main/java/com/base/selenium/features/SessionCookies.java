package com.base.selenium.features;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class SessionCookies {
	
	WebDriver driver;
	public SessionCookies(WebDriver driver){
		this.driver=driver;
	}
	
	
	public Cookie getCookieNamed(String name){
		
		return driver.manage().getCookieNamed(name);
	}
	
	public Set<Cookie> getAllCookies(){

      return driver.manage().getCookies();
		
		
		
	}

}
