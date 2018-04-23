package com.file.utils;

import java.io.File;

public class FileUtility {


	public static boolean isFileExist(String filePath){	
		try{

			File file=new File(filePath);

			return file.exists();
		}catch(Exception e){
			System.out.println(e);
			return false;
		}
	}

	public static String getProjectDir(){

		return System.getProperty("user.dir")+"/";
	}

	public static String getMainResourceFilePath(){

		return getProjectDir()+"src/main/resource";
	}
	
	public static String getTestResourceFilePath(){

		return getProjectDir()+"src/test/resource";
	}
}
