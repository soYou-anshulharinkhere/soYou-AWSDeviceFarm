package com.framework.internal.feature;
import java.awt.Toolkit;
import java.io.IOException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import com.file.utils.ExternalResourcePath;
import com.file.utils.FileUtility;
import com.file.utils.PropertiesFileReader;
import com.framework.Constant.TestEnvironment;

public final class LocalDriverInstance {

	public  static WebDriver getDriver(String platform){
		WebDriver driver=null;
		/** Windows environment*/
		if(System.getProperty("os.name").startsWith("win")){

			if(TestEnvironment.Windows7_Firefox.getEnv().equalsIgnoreCase(platform)){
				SeleniumDriverProperty.setFirefoxDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/firefox/win64/geckodriver.exe");		    	
				driver=new FirefoxDriver();

			}else if(TestEnvironment.Windows7_Chrome.getEnv().equalsIgnoreCase(platform)){
				SeleniumDriverProperty.setChromeDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/chrome/windows/chromedriver.exe");		    	
				driver=new ChromeDriver();
				java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				Double width=screenSize.getWidth();
				Double height = screenSize.getHeight();
				driver.manage().window().setSize(new Dimension(width.intValue(), height.intValue()));
			}else if(TestEnvironment.Windows7_IE11.getEnv().equalsIgnoreCase(platform)){
				SeleniumDriverProperty.setInternetExplorerDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/IE_Win_32/IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
		}
		/** Mac OSX environment*/
		else if(System.getProperty("os.name").startsWith("Mac")){

			if(TestEnvironment.Mac_Safari.getEnv().equalsIgnoreCase(platform)){			
				driver=new SafariDriver();
			}else if(TestEnvironment.Mac_Chrome.getEnv().equalsIgnoreCase(platform)){
				SeleniumDriverProperty.setChromeDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/chrome/mac/chromedriver");
				driver=new ChromeDriver();
				System.out.println("Chrome driver laucnhed");
				java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				Double width=screenSize.getWidth();
				Double height = screenSize.getHeight();
				driver.manage().window().setSize(new Dimension(width.intValue(), height.intValue()));

			}else if(TestEnvironment.Mac_Firefox.getEnv().equalsIgnoreCase(platform)){
				System.out.println("Fire fox launched");
				SeleniumDriverProperty.setFirefoxDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/firefox/mac/geckodriver");
				driver=new FirefoxDriver();
			}
		}else{

			System.out.println("Warning : Platform property "+platform+" did not macth.Please provid the correct property value in testNG.xml file.");
		}
		
		return driver;
	}


	public static  WebDriver getDefaultDriver() throws IOException{
		WebDriver driver=null;
		String browserName=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),"browserName");

		if(browserName!=null){

			/**Chrome browser*/
			if(browserName.equalsIgnoreCase("chrome")){

				if(System.getProperty("os.name").startsWith("Mac")){
					SeleniumDriverProperty.setChromeDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/chrome/mac/chromedriver");
					driver=new ChromeDriver();
				}else{
					SeleniumDriverProperty.setChromeDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/chrome/windows/chromedriver.exe");
					driver=new ChromeDriver();

				}
			}
			/** Fire fox browser*/
			else if(browserName.equalsIgnoreCase("firefox")){

				if(System.getProperty("os.name").startsWith("Mac")){
					SeleniumDriverProperty.setFirefoxDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/firefox/mac/geckodriver");		    	
					driver=new FirefoxDriver();
				}else{
					SeleniumDriverProperty.setFirefoxDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/firefox/win64/geckodriver.exe");		    	
					driver=new FirefoxDriver();
				}
			}
			/**Internet Explorer browser*/
			else if(browserName.equals("internetexplorer")){

				if(System.getProperty("os.name").startsWith("Mac")){
					System.out.println("Warning : Internet explorer can not be instantiated in MAC.");
				}else{
					SeleniumDriverProperty.setInternetExplorerDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/IE_Win_32/IEDriverServer.exe");		    	    			 
					driver=new InternetExplorerDriver();
				}
			}}

		/** Default browser launcher when properties values is not matched or found. By Default Chrome browser will be launched*/
		else {

			System.out.println("Warning : Default browser is launched . Unable to find the browser key as 'browserName' in proeprties file");
			if(System.getProperty("os.name").startsWith("Mac")){
				SeleniumDriverProperty.setChromeDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/chrome/mac/chromedriver");				
				driver=new ChromeDriver();
			}else{
				SeleniumDriverProperty.setChromeDriverPropery(FileUtility.getMainResourceFilePath()+"/browserdriver/chrome/windows/chromedriver.exe");
				driver=new ChromeDriver();

			}}

		return driver;     
	}

}
