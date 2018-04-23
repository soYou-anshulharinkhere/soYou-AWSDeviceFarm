package com.extentReportManager;
import java.io.File;
import com.file.utils.FileUtility;
import com.relevantcodes.extentreports.ExtentReports;
public class ExtentReportManager {
private static ExtentReports extent;
public static String suiteName="default";   
public synchronized static ExtentReports getReporter() {
	if (extent == null) {
		extent = new ExtentReports("TestReport_"+suiteName+".htm", true);
		extent.addSystemInfo("Host Name", "Anshul H").addSystemInfo("Environment", "QA");
		extent.loadConfig(new File(FileUtility.getTestResourceFilePath()+"/externalresource/extent-config.xml"));
	
	}
	return extent;
}
}
	