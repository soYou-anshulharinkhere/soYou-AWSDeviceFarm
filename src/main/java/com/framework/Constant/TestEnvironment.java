package com.framework.Constant;

import org.openqa.selenium.Platform;

public enum TestEnvironment {
	Windows10_Chrome(Platform.WINDOWS,"chrome","windows10_chrome"),
	Windows10_Firefox(Platform.WINDOWS,"firefox","windows10_firefox"),
	Windows7_Chrome(Platform.WINDOWS,"chrome","windows7_chrome"),
	Windows7_IE11(Platform.WINDOWS,"ie","windows7_ie11"),
	Windows7_IE10(Platform.WINDOWS,"ie","windows7_ie10"),
	Windows7_Firefox(Platform.WINDOWS,"firefox","windows7_firefox"),
	Mac_Chrome(Platform.MAC,"chrome","mac_chrome"),
	Mac_Safari(Platform.MAC,"safari","mac_safari"),
	Mac_Firefox(Platform.MAC,"firefox","mac_firefox"),
	Android_Chrome(Platform.ANDROID,"android","android_chrome"),
	Ios_Safari(Platform.ANDROID,"android","ios_safari"),
	Linux_Chrome(Platform.LINUX,"chrome","linux_chrome"),
	Linux_Firefox(Platform.LINUX,"firefox","linux_firefox");
	
	Platform platform;
	String browsername;
	String envName;
	
	TestEnvironment(Platform platform,String browsername,String envName){
		this.platform=platform;
		this.browsername=browsername;
		this.envName=envName;
	}
	
	public Platform getPlatformName(){
		
		return platform;
	}
	
	public String getBrowserName(){
		
		return browsername;
	}
	
	public String getEnv(){
		return envName;
	}

}
