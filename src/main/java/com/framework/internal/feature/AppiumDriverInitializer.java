package com.framework.internal.feature;
import java.io.IOException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class AppiumDriverInitializer {


	public static IOSDriver getAppiumDriverios(String platform,String deviceURL,String androiddeviceName,String deviceVersion,String androidmobilePlatform,String apppackage,String iosdeviceName,String iOSplatformName,String platformVersion,String automationName,String udid,String useNewWDA,String bundleId,String noReset,String xcodeSigningId,String xcodeOrgId,String app,String bootstrapPath,String agentPath,String AppActivity,String MobileOS) throws IOException{


		return AppiumDriverFactory.getDriveriOS(platform,deviceURL, androiddeviceName, deviceVersion, androidmobilePlatform, apppackage,iosdeviceName,iOSplatformName, platformVersion, automationName, udid, useNewWDA, bundleId, noReset, xcodeSigningId, xcodeOrgId, app, bootstrapPath, agentPath,AppActivity,MobileOS);

	}
	
	public static AndroidDriver getAppiumDriverandroid(String platform,String deviceURL,String androiddeviceName,String deviceVersion,String androidmobilePlatform,String apppackage,String iosdeviceName,String iOSplatformName,String platformVersion,String automationName,String udid,String useNewWDA,String bundleId,String noReset,String xcodeSigningId,String xcodeOrgId,String app,String bootstrapPath,String agentPath,String AppActivity,String MobileOS) throws IOException{


		return AppiumDriverFactory.getDriverandroid(platform,deviceURL, androiddeviceName, deviceVersion, androidmobilePlatform, apppackage,iosdeviceName,iOSplatformName, platformVersion, automationName, udid, useNewWDA, bundleId, noReset, xcodeSigningId, xcodeOrgId, app, bootstrapPath, agentPath,AppActivity,MobileOS);

	}
	
	

	public static AppiumDriver getDefaultAppiumDriver() throws Exception{
		return AppiumDriverFactory.getDefualtDriver();

	}
}
