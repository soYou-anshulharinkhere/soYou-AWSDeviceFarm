package com.framework.internal.feature;

public class SeleniumDriverProperty {


	public static SeleniumDriverProperty setChromeDriverPropery(String driverPath){

		setPath("webdriver.chrome.driver",driverPath);
		return new SeleniumDriverProperty();
	}

	public static SeleniumDriverProperty setFirefoxDriverPropery(String driverPath){
		setPath("webdriver.gecko.driver",driverPath);
		return new SeleniumDriverProperty();
	}

	public static SeleniumDriverProperty setInternetExplorerDriverPropery(String driverPath){
		setPath("webdriver.ie.driver",driverPath);
		return new SeleniumDriverProperty();
	}


	private static void setPath(String properties,String driverPath){
		
		System.setProperty(properties, driverPath);
	}
}
