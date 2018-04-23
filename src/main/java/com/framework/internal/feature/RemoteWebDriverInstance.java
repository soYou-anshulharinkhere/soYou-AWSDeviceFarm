package com.framework.internal.feature;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import com.file.utils.ExternalResourcePath;
import com.file.utils.PropertiesFileReader;
import com.framework.Constant.RemoteMachineURL;
import com.framework.Constant.TestEnvironment;

public final class RemoteWebDriverInstance {

	public static WebDriver getRemoteDriver(String platform) throws MalformedURLException, IOException{
		WebDriver driver=null;
		if(TestEnvironment.Windows7_Chrome.getEnv().equalsIgnoreCase(platform)){

			driver=RemoteWebDriverFactory.initChrome(Platform.WINDOWS, PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),RemoteMachineURL.Windows_7_Chrome));
			driver.manage().window().maximize();
			driver.manage().window().setSize(new Dimension(1920, 1080));


		}else if(TestEnvironment.Windows7_IE11.getEnv().equalsIgnoreCase(platform)){

			driver=RemoteWebDriverFactory.initInternetExplorer(Platform.WINDOWS,  PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),RemoteMachineURL.Windows_7_IE11));
			driver.manage().window().maximize();

		}else if(TestEnvironment.Windows10_Chrome.getEnv().equalsIgnoreCase(platform)){

			driver=RemoteWebDriverFactory.initInternetExplorer(Platform.WIN10,  PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),RemoteMachineURL.Windows_10_Chrome));
			driver.manage().window().maximize();

		}else if(TestEnvironment.Windows10_Firefox.getEnv().equalsIgnoreCase(platform)){

			driver=RemoteWebDriverFactory.initInternetExplorer(Platform.WIN10,  PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),RemoteMachineURL.Windows_10_Firefox));
			driver.manage().window().maximize();

		}else if(TestEnvironment.Windows7_IE10.getEnv().equalsIgnoreCase(platform)){

			driver=RemoteWebDriverFactory.initInternetExplorer(Platform.WIN10,  PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),RemoteMachineURL.Windows_7_IE10));
			driver.manage().window().maximize();

		}else if(TestEnvironment.Windows7_Firefox.getEnv().equalsIgnoreCase(platform)){

			driver=RemoteWebDriverFactory.initFirefox(Platform.WINDOWS,  PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),RemoteMachineURL.Windows_7_Firefox));
			driver.manage().window().maximize();
		}else if(TestEnvironment.Mac_Safari.getEnv().equalsIgnoreCase(platform)){
			driver=RemoteWebDriverFactory.initSafari(Platform.MAC,  PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),RemoteMachineURL.Mac_Safari));
			driver.manage().window().maximize();

		}else if(TestEnvironment.Mac_Chrome.getEnv().equalsIgnoreCase(platform)){

			driver=RemoteWebDriverFactory.initChrome(Platform.MAC,  PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),RemoteMachineURL.Mac_Chrome));
			java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Double width=screenSize.getWidth();
			Double height = screenSize.getHeight();
			driver.manage().window().setSize(new Dimension(width.intValue(), height.intValue()));


		}else if(TestEnvironment.Mac_Firefox.getEnv().equalsIgnoreCase(platform)){

			driver=RemoteWebDriverFactory.initFirefox(Platform.MAC,  PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSeleniumConfigPropertyFilePath(),RemoteMachineURL.Mac_Firefox));
			driver.manage().window().maximize();


		}else{

			System.out.println("Platform proerty "+platform+" did not macth.Please provid the correct property value in testNG.xml file.");

		}

		return driver;
	}

}
