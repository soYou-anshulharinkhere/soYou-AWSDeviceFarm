package com.emailReporter;
import java.io.IOException;

import com.file.utils.ExternalResourcePath;
import com.file.utils.PropertiesFileReader;
public class EmailConfig {

	private static String productname;
	private static String contactEmailId;
	private static String subject;
	private static String emailablereportname;
	private static String recepients[];
	private static String authenticationEmail;
	private static String sendEmail;
	private static String authenticationPassword;
	private static String emailtemplatetype;
	private static String smtp_port_number;
	private static String smtp_host_name;
	private static String send_attachment;
	private static String attachment_file_name;
	public static void readAllEmailConfigProperties() throws IOException  {

		productname=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "productname");
		contactEmailId=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "contactemailid");
		subject=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "subject");
		emailablereportname=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "emailablereportname");
		recepients = PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "recepients").split(",");
		authenticationEmail=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "from");
		sendEmail=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "sendemail");
		authenticationPassword=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "password");
		emailtemplatetype=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "emailtemplatetype");
		smtp_port_number=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "smtp_port_number");
		smtp_host_name=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "smtp_host_name");
		send_attachment=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "send_attachment");
		attachment_file_name=PropertiesFileReader.getPropertyValue(ExternalResourcePath.getEmailConfigPropertyFilePath(), "attachment_file_name");

		
	}
	
public static boolean isAttachmentToSend(){
	
	boolean cond=false;
	try{

		if(send_attachment.trim().startsWith("true")){
			cond= true;
		}else{
			cond= false;
		}}catch(Exception e){
			cond =false;
		}

	return cond;
	
	}
public static String getAttchmentFileName(){

	if(attachment_file_name.startsWith("/")){

		return System.getProperty("user.dir")+attachment_file_name;
	}
	else{
		return System.getProperty("user.dir")+"/"+attachment_file_name;
	}
}
	public static String get_SMTP_Port_Number(){

		return smtp_port_number;
	}
	public static String get_SMTP_Host_Name(){

		return smtp_host_name;
	}
	public static String getProductName(){
		
		return productname;
	}
	
	public static String getcontactEmailId(){
		
		return contactEmailId;
	}

	public static String getSubject(){
		
		return subject;
	}
	
	public static String getEmailableReportName(){
		
		return emailablereportname;
	}
	
	public static String[] getRecepientsEmailID(){
		
		return recepients;
	}
	
	public static String getAuthenticationEmailID(){
		
		return 	authenticationEmail;
	}
	
	public static boolean isEmailNotificationToBeSent(){
		
		return sendEmail.equalsIgnoreCase("true");
	}
	
	public static String getAuthenticationPassword(){
		
		return authenticationPassword;
	}
	
	public static String getEmailTemplateType(){
		
		return emailtemplatetype;
	}
}
