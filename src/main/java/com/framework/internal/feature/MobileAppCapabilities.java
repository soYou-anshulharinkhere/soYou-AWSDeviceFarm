package com.framework.internal.feature;

import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileAppCapabilities {
	
	
	

	protected static DesiredCapabilities getAndroidCapabilities(){

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Micromax A20");
		capabilities.setCapability("platformVersion", "4.0.0");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.gyanmatrix.loany");

		capabilities.setCapability("appActivity", "SplashScreen_"); 		
		capabilities.setCapability("noReset", true);

		return capabilities;
	}

	protected static DesiredCapabilities getIosCapabilities(){

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Micromax A20");
		capabilities.setCapability("platformVersion", "4.0.0");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.gyanmatrix.loany");

		capabilities.setCapability("appActivity", "SplashScreen_"); 		
		capabilities.setCapability("noReset", true);

		return capabilities;
	}

}
