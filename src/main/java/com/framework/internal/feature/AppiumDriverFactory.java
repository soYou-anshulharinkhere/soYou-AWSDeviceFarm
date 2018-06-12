package com.framework.internal.feature;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import com.file.utils.ExternalResourcePath;
import com.file.utils.PropertiesFileReader;
import com.framework.Constant.TestNGXMLParametersValue;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class AppiumDriverFactory {
	
	//private static AndroidDriver androiddriver;
    private static IOSDriver driverios;
    private static AndroidDriver driverandroid;
    
	public static AndroidDriver getDriverandroid(String platform,String deviceURL,String androiddeviceName,String deviceVersion,String androidmobilePlatform,String apppackage,String iosdeviceName,String iOSplatformName,String platformVersion,String automationName,String udid,String useNewWDA,String bundleId,String noReset,String xcodeSigningId,String xcodeOrgId,String app,String bootstrapPath,String agentPath,String AppActivity,String MobileOS) throws IOException{

		

//		if(MobileOS.equalsIgnoreCase(TestNGXMLParametersValue.ANDROID)){
			System.out.println("Appium Is Taking Android Device");
			
			System.out.println(androiddeviceName);
			System.out.println(deviceVersion);
			System.out.println(androidmobilePlatform);
			System.out.println(app);
			System.out.println(apppackage);
			System.out.println(AppActivity);
			
			
			
			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability("deviceName", androiddeviceName);
			capabilities.setCapability("platformVersion", deviceVersion);
			capabilities.setCapability("platformName", androidmobilePlatform);
			capabilities.setCapability("app",app);
			capabilities.setCapability("appPackage",apppackage); 
			capabilities.setCapability("appActivity",AppActivity); 
			capabilities.setCapability("noReset", getResetValue());
			//driver= new AndroidDriver(new URL(deviceURL), capabilities);
			//return new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub", capabilities);
			driverandroid = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			
			return driverandroid;
		}



	//	else if(MobileOS.equalsIgnoreCase(TestNGXMLParametersValue.IOS)){
	public static IOSDriver getDriveriOS(String platform,String deviceURL,String androiddeviceName,String deviceVersion,String androidmobilePlatform,String apppackage,String iosdeviceName,String iOSplatformName,String platformVersion,String automationName,String udid,String useNewWDA,String bundleId,String noReset,String xcodeSigningId,String xcodeOrgId,String app,String bootstrapPath,String agentPath,String AppActivity,String MobileOS) throws IOException{			
		
		System.out.println("Appium Is Taking iOS Device");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", iosdeviceName);
			caps.setCapability("platformName", iOSplatformName);
			caps.setCapability("platformVersion", platformVersion);
			caps.setCapability("automationName", automationName);
			caps.setCapability("udid", udid);
			caps.setCapability("useNewWDA", useNewWDA);
			caps.setCapability("bundleId", bundleId);
			caps.setCapability("noReset", noReset);
			caps.setCapability("xcodeSigningId",xcodeSigningId);
			caps.setCapability("xcodeOrgId", xcodeOrgId);
			caps.setCapability("app", app);
			caps.setCapability("bootstrapPath", bootstrapPath);
			caps.setCapability("agentPath", agentPath);
			caps.setCapability("autoAcceptAlerts", true);
			
			
			driverios = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

			return driverios;
			
			
		}
	
	public static IOSDriver getDriveriOSCloud(String platform,String deviceURL,String androiddeviceName,String deviceVersion,String androidmobilePlatform,String apppackage,String iosdeviceName,String iOSplatformName,String platformVersion,String automationName,String udid,String useNewWDA,String bundleId,String noReset,String xcodeSigningId,String xcodeOrgId,String app,String bootstrapPath,String agentPath,String AppActivity,String MobileOS) throws IOException{			
	
		System.out.println("Appium Is Taking iOS Cloud Device");
	
		DesiredCapabilities dc=DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");
		
		dc.setCapability("platformVersion", "11.2");
		dc.setCapability("appiumVersion", "1.7.2");
		dc.setCapability("deviceName", "iPhone 6s Plus Simulator");
		dc.setCapability("browserName", "");
		dc.setCapability("app","sauce-storage:soYou.app");
		
//	dc.setCapability("platformName", "iOSplatformName");
//		
//		dc.setCapability("platformVersion", "platformVersion");
//		dc.setCapability("appiumVersion", "1.3.4");
//		dc.setCapability("deviceName", "iosdeviceName");
//		dc.setCapability("browserName", "");
//		dc.setCapability("app","sauce-storage:UICatalog.app.zip");

		IOSDriver driver =new IOSDriver(new URL("http://AnshulHarinkhere:58546bce-42dc-4883-a488-17587f4e9d83@ondemand.saucelabs.com:80/wd/hub"),dc);
       // driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//driver.quit();
		
		return driver;
	}
		
	

	public static AppiumDriver getDefualtDriver() throws IOException {


			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", getDeviceName());

			capabilities.setCapability("platformVersion", getVersion());
			capabilities.setCapability("platformName",getPlatformName());
			capabilities.setCapability("appPackage",getAppPackage()); 
			capabilities.setCapability("appActivity",getAppActivity()); 
			capabilities.setCapability("noReset", getResetValue());
			return new AndroidDriver(new URL(getDeviceRemoteURL()), capabilities);
	}
	
	private static String getDeviceName() throws IOException{
		try{
		return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),"device_name");
		}catch(Exception e){
			return null;
		}
	}
	private static String getPlatformName() throws IOException{
		try{
		return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),"platform_name");
		}catch(Exception e){
			return null;
		}
	}
	private static String getVersion() throws IOException{
		try{
		return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),"platform_version");
		}catch(Exception e){
			return null;
		}
	}
	private static String getAppPackage() throws IOException{
		try{
		return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),"app_package");
		}catch(Exception e){
			return null;
		}
	}
	private static String getAppActivity(){
		try{
			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),"app_activity");
			}catch(Exception e){
				return null;
			}
	}
	
	private static String getDeviceRemoteURL(){
		try{
			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),"device_remote_url");
			}catch(Exception e){
				return null;
			}
	}
	
	private static String getResetValue(){
		try{
			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),"reset_value");
			}catch(Exception e){
				return null;
			}
	}
}
