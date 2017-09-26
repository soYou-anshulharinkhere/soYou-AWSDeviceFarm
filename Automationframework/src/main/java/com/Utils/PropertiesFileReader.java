package com.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReader {
	
	public static void main(String...strings) throws IOException{
		//PropertiesFileReader s=new PropertiesFileReader();
		System.out.println(getPropertyValue("","user"));
	}

	public  static String getPropertyValue(String fileName,String key) throws IOException{
		
		
		Properties prop = new Properties();
		InputStream input = null;
        String keyVlaue="";
		try {

			input = new FileInputStream(fileName);

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			keyVlaue=prop.getProperty(key);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return keyVlaue;

		
	}

}
