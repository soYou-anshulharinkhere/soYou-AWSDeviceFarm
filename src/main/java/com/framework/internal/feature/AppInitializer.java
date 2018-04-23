package com.framework.internal.feature;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.customverifications.CustomVerification;
import com.extentReportManager.ExtentReportManager;
import com.extentReportManager.ExtentTestManager;
import com.file.utils.ExternalResourcePath;
import com.file.utils.FileUtility;
import com.file.utils.PropertiesFileReader;
import com.framework.Constant.TestNGXMLParameters;
import com.framework.Constant.TestNGXMLParametersValue;
import com.github.seratch.jslack.api.methods.SlackApiException;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.slack.api.SlackConfig;
import com.slack.api.SlackMessenger;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

@Listeners(com.testNglistener.EmailReporterNG.class)
public class AppInitializer extends CustomVerification {
	protected ExtentReports extent;
	protected ExtentTest test;

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private static ThreadLocal<AppiumDriver> appiumDriver = new ThreadLocal<AppiumDriver>();
	private static ThreadLocal<IOSDriver> iosdriver = new ThreadLocal<IOSDriver>();
	private static ThreadLocal<AndroidDriver> androiddriver = new ThreadLocal<AndroidDriver>();
	
	
	
	//@Parameters({TestNGXMLParameters.DEVICE_TYPE,TestNGXMLParameters.DEVICE_URL,TestNGXMLParameters.DEVICE_NAME,TestNGXMLParameters.DEVICE_VERSION,TestNGXMLParameters.MOBILE_PLATFORM,TestNGXMLParameters.TESTING_PLATFORM,TestNGXMLParameters.TEST_RUN,TestNGXMLParameters.MACHINE_HOST,TestNGXMLParameters.APP_HOSTING_ENVIRONMENT,TestNGXMLParameters.APP_PACKAGE})
	
	@Parameters({TestNGXMLParameters.DEVICE_TYPE,TestNGXMLParameters.DEVICE_URL,TestNGXMLParameters.DEVICE_NAME_ANDROID,TestNGXMLParameters.DEVICE_VERSION,TestNGXMLParameters.MOBILE_PLATFORM,TestNGXMLParameters.TESTING_PLATFORM,TestNGXMLParameters.TEST_RUN,TestNGXMLParameters.MACHINE_HOST,TestNGXMLParameters.APP_HOSTING_ENVIRONMENT,TestNGXMLParameters.APP_PACKAGE,TestNGXMLParameters.PLATFORM_NAME,TestNGXMLParameters.PLATFORM_VERSION,TestNGXMLParameters.DEVICE_NAME_iOS,TestNGXMLParameters.APP_NAME,TestNGXMLParameters.NO_RESET,TestNGXMLParameters.UDID,TestNGXMLParameters.AUTOMATION_NAME,TestNGXMLParameters.BUNDLEDID,TestNGXMLParameters.DEVELOPMENT_TEAM,TestNGXMLParameters.AGENT_PATH,TestNGXMLParameters.BOOTSTRAPPATH,TestNGXMLParameters.CODE_SIGN_IDENTITY,TestNGXMLParameters.AUTOACCEPTALERTS,TestNGXMLParameters.USENEWWDA,TestNGXMLParameters.XCODEORGID,TestNGXMLParameters.APP,TestNGXMLParameters.APP_ACTIVITY,TestNGXMLParameters.MOBILE_OS})
	
	
	@BeforeClass
	
	//public void beforeClass(@Optional("default") String deviceType,@Optional("default") String deviceURL,@Optional("default") String deviceName,@Optional("default") String deviceVersion,@Optional("default") String mobilePlatform,@Optional("default") String platform,@Optional("true") String run,@Optional("default")String machineHost,@Optional("testserver") String appUrl,@Optional("Default") String apppackage) throws Exception{	
	
	public void beforeClass(@Optional("default") String deviceType,@Optional("default") String deviceURL,@Optional("default") String androiddeviceName,@Optional("default") String deviceVersion,@Optional("default") String androidmobilePlatform,@Optional("default") String platform,@Optional("true") String run,@Optional("default")String machineHost,@Optional("testserver") String appUrl,@Optional("Default") String apppackage,@Optional("default") String iOSplatformName,@Optional("default") String platformVersion,@Optional("default") String iosdeviceName,@Optional("default") String AppName,@Optional("default") String noReset,@Optional("default") String udid,@Optional("true") String automationName,@Optional("default")String bundleId,@Optional("testserver") String DevelopmentTeam,@Optional("Default") String agentPath,@Optional("Default") String bootstrapPath,@Optional("Default") String xcodeSigningId,@Optional("Default") String AutoAcceptAlert,@Optional("true") String useNewWDA,@Optional("V862VGVUC2")String xcodeOrgId,@Optional("/Users/anshulharinkhere/Library/Developer/Xcode/DerivedData/SoYou-cecviltvtiuhpzcaqyvorxmjolsl/Build/Products/Debug-iphoneos/SoYou.app")String app,@Optional("Default") String AppActivity,@Optional("Default") String MobileOS) throws Exception{
		System.out.println();
	
		
		
		/** Loading the web driver CONFIG file*/
		WebDriverInitializer.loadWebDriverConfigFile(FileUtility.getTestResourceFilePath()+"/externalresource/selenium_webdriver_config.properties");

		/** Instantiate the driver if test is run from testNG xml file */
	
		System.out.println("1");
		if(platform.equals(TestNGXMLParametersValue.DEFAULT)){
			
			if(deviceType.equals(TestNGXMLParametersValue.DESKTOP)){
				
//				driver.set(WebDriverInitializer.getDriver(platform, run, machineHost));
//				/** Launching the application , appUrl is the properties key to get value*/ 
//				getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
//				launchApp(appUrl);

			}
			
			else
				
				if(deviceType.equals(TestNGXMLParametersValue.IOS)){
					System.out.println("iOS selection");
					iosdriver.set(AppiumDriverInitializer.getAppiumDriverios(platform,deviceURL, androiddeviceName, deviceVersion, androidmobilePlatform, apppackage,iosdeviceName, iOSplatformName, platformVersion, automationName, udid, useNewWDA, bundleId, noReset, xcodeSigningId, xcodeOrgId, app, bootstrapPath, agentPath,AppActivity,MobileOS));
			}
			
				else if(deviceType.equals(TestNGXMLParametersValue.ANDROID)){

					System.out.println("Android selection");
					androiddriver.set(AppiumDriverInitializer.getAppiumDriverandroid(platform,deviceURL, androiddeviceName, deviceVersion, androidmobilePlatform, apppackage,iosdeviceName, iOSplatformName, platformVersion, automationName, udid, useNewWDA, bundleId, noReset, xcodeSigningId, xcodeOrgId, app, bootstrapPath, agentPath,AppActivity,MobileOS));
				}
		}
		else{
			/**Instantiate the driver if the test is run from class file directly*/
			
			String defaultDeviceType=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),"device_type");
			
			if(defaultDeviceType.equals(TestNGXMLParametersValue.DESKTOP)){

//				driver.set(WebDriverInitializer.getDriver(platform, run, machineHost));
//				/** Launching the application , AppUrl is the properties key to get value*/ 
//				getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
//				launchApp(appUrl);

			}else if(defaultDeviceType.equals(TestNGXMLParametersValue.MOBILE)){

				System.out.println("Wrong Turn: Taking default value");
				appiumDriver.set(AppiumDriverInitializer.getDefaultAppiumDriver());
			}
		}


	
}
	/** Get ios Driver instance*/
	public IOSDriver getiosDriver(){
		
		return iosdriver.get();
	}
	
	/** Get android Driver instance*/
	public AndroidDriver getandroidDriver(){
		
		return androiddriver.get();
	}
	
	
	/** Get Driver instance*/
	public WebDriver getDriver(){
		
		return driver.get();
	}
	
	/** Get Appium Driver Instance*/
	public AppiumDriver getAppiumDriver(){
		
		return appiumDriver.get();
	}
	/** Launch application fetching the URL from properties file
	 * @throws InterruptedException */
	public static  void launchApp(String appUrl) throws IOException, InterruptedException{
		driver.get().get(PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),appUrl));
	    Thread.sleep(3000);
	}

	
	@AfterClass
	public  void afterClass(){

		try{
			if(driver!=null){
				getDriver().close();
			}
		}catch(Exception e){

		}

    }
    
   
    @Parameters(TestNGXMLParameters.TESTING_PLATFORM )
    @BeforeMethod
    public  void beforeMethod(Method method,@Optional("default") String b) {
    	/**
    	 * In Before method annotation , it checks for the platform value from testNG xml file , if it finds
    	 * then it passes the that value or else it passes the default mention in optional annotation
    	 * 
    	 * In below function it initialize the test using Extent Report and assigning the category based on values
    	 * */
    	ExtentTestManager.startTest(method.getName()).assignCategory(b);
    }
    @AfterMethod
    protected  void afterMethod(ITestResult result) {

    	/** This after Method annotation checks the result returned from testNg and logging the status into extent report
    	 * and flushing the result .*/


    	if (result.getStatus() == ITestResult.FAILURE) {
    		ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
    	} else if (result.getStatus() == ITestResult.SKIP) {
    		ExtentTestManager.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
    	} else {
    		ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
    	}


    	ExtentReportManager.getReporter().endTest(ExtentTestManager.getTest());        
    	ExtentReportManager.getReporter().flush();

    }

    @Parameters(TestNGXMLParameters.TEST_SUITE_NAME)
    @BeforeSuite
    public  void beforeSuite(@Optional("soYou") String suiteName) throws IOException, SlackApiException {
    	WebDriverInitializer.loadWebDriverConfigFile(FileUtility.getTestResourceFilePath()+"/externalresource/selenium_webdriver_config.properties");
    	
    	//Sending the message in slack channel
 //  	SlackMessenger.loadSlackConfigProperty(FileUtility.getTestResourceFilePath()+"/externalresource/slackConfig.properties").sendTextMessage(SlackConfig.getTestStartMessage());
     	
//    	/**Assigning the TestSuitename to generate report*/
    	ExtentReportManager.suiteName=suiteName;
    	/**Creating the instance of the extent report*/
    	extent = ExtentReportManager.getReporter();
    	
    	
    	
    }

    @AfterSuite
    protected  void afterSuite() throws IOException, SlackApiException {
     	WebDriverInitializer.loadWebDriverConfigFile(FileUtility.getTestResourceFilePath()+"/externalresource/selenium_webdriver_config.properties");
  //  	SlackMessenger.loadSlackConfigProperty(FileUtility.getTestResourceFilePath()+"/externalresource/slackConfig.properties").sendFile();
   //	SlackMessenger.loadSlackConfigProperty(FileUtility.getTestResourceFilePath()+"/externalresource/slackConfig.properties").sendTextMessage(SlackConfig.getTestEndMessage());

    	/** Closing the extent report after writing the report */
    	extent.close();
    	/** Quitting the driver*/

    	try{
    		if(driver!=null){
    			getDriver().quit();
    		}
    	}catch(NullPointerException e){

    	}
    	
    	

    }
}
