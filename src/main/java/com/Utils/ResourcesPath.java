package com.Utils;

public class ResourcesPath {

	
	public static String getTestResourceFilePath(){
		
		return System.getProperty("user.dir")+"/src/test/resources";
	}
	
	public static String getMainResourceFilePath(){
		
		return System.getProperty("user.dir")+"/src/main/resources";
	}
}
