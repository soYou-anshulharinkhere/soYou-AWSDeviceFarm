package com.file.utils;

import com.emailReport.Util.Resources;

public class InternalResourcePath {
	
	public static String getEmailTemplatePath(String templateType){
		
		try{
			return new Resources().getHtmlText(getMainResourceLoc()+templateType);
		}catch(NullPointerException e){
			System.out.println("Unable to find the emilable template at runtime "+e);
			return null;
		}
		
	}
	
	private static String getMainResourceLoc(){
		
		return "/com/emailReport/template/";
		
	}

	public static String getBigQueryAuthTokenFile(){
		
		return FileUtility.getTestResourceFilePath()+"/externalresource/bigquery_token.properties";
	}
}
