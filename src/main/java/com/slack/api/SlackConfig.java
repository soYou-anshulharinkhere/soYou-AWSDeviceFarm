package com.slack.api;

import com.file.utils.ExternalResourcePath;
import com.file.utils.FileUtility;
import com.file.utils.PropertiesFileReader;

public final class SlackConfig{

	private static String TOKEN="token";
	private static String CHANNEL="channel";
	private static String MESSAGE="message";
	private static String FILEPATH="file_name";
	private static String POST_TEXT_MESSAGE="post_text_message";
	private static String SEND_FILE="send_file";
	private static String FILE_TITLE="file_title";
	private static String INITIAL_COMMNET="initial_comment";
	private static String TEST_START_MESSAGE="test_start_message";
	private static String TEST_END_MESSAGE="test_end_message";
	private static String FILETYPE="file_type";
	
	public static String getToken(){

		try{
			
			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), TOKEN);
		}catch(Exception e){
			return "";
		}
	}
	public static String fileType(){

		try{
			
			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), FILETYPE);
		}catch(Exception e){
			return "";
		}
	}
	public static String getTestEndMessage(){

		try{
			
			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), TEST_END_MESSAGE);
		}catch(Exception e){
			return "";
		}
	}
	public static String getTestStartMessage(){

		try{
			
			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), TEST_START_MESSAGE);
		}catch(Exception e){
			return "";
		}
	}
	public static String getInitialCommnet(){

		try{
			
			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), INITIAL_COMMNET);
		}catch(Exception e){
			return "";
		}
	}

	public static String getChannel(){
		try{

			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), CHANNEL);
		}catch(Exception e){
			return "";
		}
	}

	public static String getMessage(){
		try{

			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), MESSAGE);
		}catch(Exception e){
			return "";
		}
	}
	public static boolean isFileToBeSent(){
		try{

			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), SEND_FILE).equals("true");
		}catch(Exception e){
			return false;
		}
	}
	
	public static boolean isTextMessageToBeSent(){
		try{

			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), POST_TEXT_MESSAGE).equals("true");
		}catch(Exception e){
			return false;
		}
	}
	
	public static String getFileName(){

		try{

			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), FILEPATH);

		}catch(Exception e){
			return "";
		}
	}
	
	public static String getTitle(){

		try{

			return PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), FILE_TITLE);

		}catch(Exception e){
			return "";
		}
	}
	
	public static String getFilePath(){
		String fielPath;
		try{

			String file=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getSlackConfigPropertyFilePath(), FILEPATH);
			
			if(file.startsWith("/")){
				fielPath=FileUtility.getProjectDir()+file.replace("/", "");
			}else{
				fielPath=FileUtility.getProjectDir()+file;

			}

		}catch(Exception e){
			return "";
		}
		return fielPath;
	}
}
