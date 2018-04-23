package com.base.selenium.features;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TakeScreenShot {
	
	public static String takeSceernShot(WebDriver driver) throws IOException{

		
     final  String   scrDir="screenShots";
		
     createFile(new File(System.getProperty("user.dir")+"//"+scrDir));
	 String screenshotAbsolutePath = System.getProperty("user.dir") ;
	
	 String imgPath=scrDir+File.separator + System.currentTimeMillis() + "_iaptest" + ".png";
	
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //The below method will save the screen shot in screen screenShots of the same directory"
      FileUtils.copyFile(scrFile, new File(screenshotAbsolutePath+"//"+imgPath));
       
    
       
      
       return imgPath;
	}

 private static boolean createFile(File screenshot) throws IOException
	{
	  boolean fileCreated = false;
	   if (screenshot.exists()) {
	      fileCreated = true;
	    } else {
	       File parentDirectory = new
	       File(screenshot.getParent());
	              if (parentDirectory.exists() || parentDirectory.mkdirs()) {
	                        fileCreated = screenshot.mkdir();
	                 }
	           }
	 return fileCreated;
	}
}
