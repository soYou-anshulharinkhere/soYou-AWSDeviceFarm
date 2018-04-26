package com.emailReporter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import com.emailReport.Util.SuiteTimeInfo;
import com.file.utils.ExternalResourcePath;
public class EmailReporter {
	
	public String outPutFileDirecotory;
	public String emailReportName;
	
	public EmailReporter(String outPutFileDirecotory,String emailConfigFileName) throws IOException{
		
		ExternalResourcePath.setEmailConfigPropertyFilePath(emailConfigFileName);
		EmailConfig.readAllEmailConfigProperties();
		this.outPutFileDirecotory=outPutFileDirecotory;
		emailReportName=EmailConfig.getEmailableReportName();
		
		
	}
	public void generateEmailReport(List<ISuite> suites){
		
		if(suites!=null){
		  setSourceData(getSourceData(suites));
		  HTMLReporter reporter=new HTMLReporter(outPutFileDirecotory, emailReportName);
		  reporter.statrtGeneratingEmailReport();
		}else{
			System.err.println("Unable find Isuite Results from TestNG...");
		}
		 
		  
	}
	
	private List<ISuite> getSourceData(List<ISuite> suites){
		return suites;
		
	}
	
	private void setSourceData(List<ISuite> suites){
		
		try{
			
			SuiteTimeInfo suiteinfo=new SuiteTimeInfo();
		
			for (ISuite suite : suites) {
				
				// Setting the suite Name
				suiteinfo.setSuiteName(suite.getName());
			
	            Map<String, ISuiteResult> result = suite.getResults();
	 
	            for (ISuiteResult r : result.values()) {
	            	
	                ITestContext context = r.getTestContext();
	                
	                //Setting the suite Time information
	                
	                setSuiteInfo(context);
		            //Setting the status of the test results
	                setResultStatus(context);
	                
	           
	            }
	            TestResult.totalTestRun= TestResult.totalFailedTest+TestResult.totalPassedTest+TestResult.totalSkipedTest;
			   
	        }}catch(NullPointerException e){
	        	
	        	System.err.println("Unable find Isuite Results from TestNG..."+e);
	        }
		 
	}
	
	private void setResultStatus(ITestContext context){
		
		    try{
		    	TestResult.totalFailedTest=TestResult.totalFailedTest+context.getFailedTests().size();
		    	TestResult.totalPassedTest=	TestResult.totalPassedTest+context.getPassedTests().size();
		    	TestResult.totalSkipedTest= TestResult.totalSkipedTest+context.getSkippedTests().size();
		    	}
            catch(NullPointerException e){
            	System.err.println("Unable find Isuite Results from TestNG..."+e);
            }
	    }
	
	
	
	private void setSuiteInfo(ITestContext context){
		
		SuiteTimeInfo suiteinfo=new SuiteTimeInfo();
		     try{
		    	 Date start = context.getStartDate();
		         Date end = context.getEndDate();
		         suiteinfo.setSuiteStartTimestamp(start.getTime());
		         suiteinfo.setSuiteEndTimestamp(end.getTime());
		    	 
		     }catch(NullPointerException e){
		    	 System.err.println("Unable find Isuite Results from TestNG..."+e);
		    	 
		     }catch(Exception e){
		    	 
		    	 
		     }
	}
	 
	public SendEmailNotification sendEmailNotification(){
		return new SendEmailNotification(outPutFileDirecotory, emailReportName);
		
	}
	
	
	
	
	}

