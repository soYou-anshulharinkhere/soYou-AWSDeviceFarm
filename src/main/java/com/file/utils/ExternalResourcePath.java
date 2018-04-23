package com.file.utils;

public class ExternalResourcePath {

	private static String SELENIUM_CONFIG_PROPERTY_FILE_PATH;
	private static String EMAIL_CONFIG_PROPERTY_FILE_PATH;
	private static String SLACK_CONFIG_PROPERTY_FILE_PATH;
	private static String BIGQUERY_CONFIG_PROPERTY_FILE_PATH;
	private static String LOGIN_CREDENTIAL_FILE_PATH;
	
	public static void setSeleniumConfigPropertyFilePath(String filePath){

		SELENIUM_CONFIG_PROPERTY_FILE_PATH=filePath;
	}

	public static void setEmailConfigPropertyFilePath(String filePath){
		EMAIL_CONFIG_PROPERTY_FILE_PATH=filePath;
	}
	public static void setSlackConfigPropertyFilePath(String filePath){
		SLACK_CONFIG_PROPERTY_FILE_PATH=filePath;
	}
	public static void setGooglSecretKeyConfigPropertyFilePath(String filePath){
		BIGQUERY_CONFIG_PROPERTY_FILE_PATH=filePath;
	}
	public static void setLoginCredentialConfigPropertyFilePath(String filePath){
		LOGIN_CREDENTIAL_FILE_PATH=filePath;
	}
	

	public static String getLoginCredentialConfigPropertyFilePath(){
		return LOGIN_CREDENTIAL_FILE_PATH;
	}
	public static String getSeleniumConfigPropertyFilePath(){
		return SELENIUM_CONFIG_PROPERTY_FILE_PATH;
	}

	public static String getEmailConfigPropertyFilePath(){
		return EMAIL_CONFIG_PROPERTY_FILE_PATH;

	}
	public static String getSlackConfigPropertyFilePath(){
		return SLACK_CONFIG_PROPERTY_FILE_PATH;

	}
	
	public static String getGoogleSecretFilePath(){
		
		return BIGQUERY_CONFIG_PROPERTY_FILE_PATH;
	}

}
