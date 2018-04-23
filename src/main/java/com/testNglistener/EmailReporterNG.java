package com.testNglistener;
import org.testng.IReporter;
import java.io.IOException;
import java.util.List;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;
import com.emailReporter.EmailConfig;
import com.emailReporter.EmailReporter;
import com.file.utils.FileUtility;

public  class EmailReporterNG implements IReporter {

	
	private EmailReporter emailreport;

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
    	
    	try{
   	
    		emailreport=new EmailReporter(outputDirectory,FileUtility.getTestResourceFilePath()+"/externalresource/emailConfig.properties");
    		emailreport.generateEmailReport(suites);
    		if(EmailConfig.isEmailNotificationToBeSent()){
    			emailreport.sendEmailNotification().ComposeGmail(EmailConfig.getAuthenticationEmailID(),EmailConfig.getRecepientsEmailID());
    		}
    	} catch (IOException e1) {

    		e1.printStackTrace();
    	}

    	
    }
 
    
    
   
}