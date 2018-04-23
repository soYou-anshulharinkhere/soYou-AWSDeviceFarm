package com.framework.internal.feature;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

public final class RemoteWebDriverFactory {

	protected static RemoteWebDriver initChrome(Platform osPlatform,String nodeURL) throws MalformedURLException{
	
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(osPlatform);
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--no-experiments");
		options.addArguments("--disable-translate");
		options.addArguments("--disable-plugins");
		options.addArguments("--disable-extensions");
		options.addArguments("--no-default-browser-check");
		options.addArguments("--clear-token-service");
		options.addArguments("--disable-default-apps");
		options.addArguments("--enable-logging");
		options.addArguments("test-type");

		//Setting up all the capabilities in remote browser
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		return new RemoteWebDriver(new URL(nodeURL),cap);

	}

	protected static RemoteWebDriver initFirefox(Platform osPlatform,String nodeURL) throws MalformedURLException{
		DesiredCapabilities cap=  DesiredCapabilities.firefox();
		FirefoxProfile myprofile = new FirefoxProfile();
		myprofile.setPreference("full-screen-api.approval-required", false);
		//Removing browser cache 
		myprofile.setPreference("browser.cache.disk.enable", false);
		myprofile.setPreference("browser.cache.memory.enable", false);
		myprofile.setPreference("browser.cache.offline.enable", false);
		myprofile.setPreference("network.http.use-cache", false);
		cap.setBrowserName("firefox");
		cap.setPlatform(osPlatform);
		cap.setCapability(FirefoxDriver.PROFILE, myprofile);
		return new RemoteWebDriver(new URL(nodeURL),cap);
	}

	protected static  RemoteWebDriver initInternetExplorer(Platform osPlatform ,String nodeURL) throws MalformedURLException{
		DesiredCapabilities capabilities= DesiredCapabilities.internetExplorer();
		capabilities.setBrowserName("ie");
		capabilities.setPlatform(osPlatform);
		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		capabilities.setCapability("disable-popup-blocking", true);
		return new RemoteWebDriver(new URL(nodeURL),capabilities);
	}

	protected static RemoteWebDriver initSafari(Platform osPlatform,String nodeURL) throws MalformedURLException{
		DesiredCapabilities cap= DesiredCapabilities.safari();
		cap.setBrowserName("safari");
		cap.setPlatform(osPlatform);
		SafariOptions options = new SafariOptions(); 
		options.setUseCleanSession(true);
		cap.setCapability(SafariOptions.CAPABILITY, options);
		return new RemoteWebDriver(new URL(nodeURL),cap);
	}
}
