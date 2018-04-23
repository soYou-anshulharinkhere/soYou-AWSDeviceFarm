package com.emailReport.Util;
public class Resources {

	public  String getHtmlText(String resourcePath) {

		try{
			return Stream.toStrings(getClass().getResourceAsStream(resourcePath));
		}catch(NullPointerException e){

			System.out.println("Unable to find the email template at runtime xyz");
			return null;
		}

	}
	
	
}
