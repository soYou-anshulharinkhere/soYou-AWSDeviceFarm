package com.Utils;

import java.io.File;

public class FileUtility {
	


	public static String getAbsoluteFilePathforExternalResources(){

		return ResourcesPath.getTestResourceFilePath()+"/externalresource/";
	}
	
	public static String getDirectory(String directoryName){

		return System.getProperty("user.dir")+"/"+directoryName+"/";
	}

	public static String getAbsoluteFilePathforEmailTemplate(){

		return ResourcesPath.getMainResourceFilePath()+"/com/emailReport/template/";
	}
	
	public static String getAbsolutePathforBrowserDriver(){
		
		return ResourcesPath.getMainResourceFilePath()+"/browserdriver/";
	}

	public static boolean isFileExist(String filePath){	
		try{
			
			File file=new File(filePath);
			
			return file.exists();
		}catch(Exception e){
			System.out.println(e);
			return false;
		}
	}
}
