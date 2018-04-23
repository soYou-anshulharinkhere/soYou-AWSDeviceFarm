package com.emailReporter;
import java.io.File;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import com.emailReport.Util.SuiteTimeInfo;
import com.emailReport.Util.Writer;
import com.file.utils.InternalResourcePath;
public class HTMLReporter {	
	private String filePath;
	private String reportName;
	private Document emailTemplate;

	public void statrtGeneratingEmailReport(){

		start();  
		System.out.println("Started generating the Email Report...");

		try{
			updateTotalTestCount();
			updateTotalPassCount();
			updateTotalFailureCount();
			updateTotalSkipCount();
			updateSuiteName();
			updatePercentage();
			updateTotalDuration();
			updateStatusColor();
			updateEmailIDHref();
			updateEmailID();
			updateProductName();
			flush();
			System.out.println("<><><><><>--Sucessfully Generated Email Report--<><><><><><>");

		}catch(NullPointerException e){

			System.err.println("Warning : Unable to find the Email resuorce template "+e);
		}


	}

	private void start(){

		try{
			String sourceFile=InternalResourcePath.getEmailTemplatePath("default.html");
			
			if(EmailConfig.getEmailTemplateType().equalsIgnoreCase("default")){
				
				sourceFile= InternalResourcePath.getEmailTemplatePath("default.html");
				
			}else if(EmailConfig.getEmailTemplateType().equalsIgnoreCase("x")){
				
				sourceFile= InternalResourcePath.getEmailTemplatePath("default.html");
			}else if(EmailConfig.getEmailTemplateType().equalsIgnoreCase("y")){				
				sourceFile= InternalResourcePath.getEmailTemplatePath("default.html");
			}else if(EmailConfig.getEmailTemplateType().equalsIgnoreCase("z")){
				sourceFile= InternalResourcePath.getEmailTemplatePath("default.html");
			}
			
			if(sourceFile!=null){
				emailTemplate = Jsoup.parse(sourceFile);
			}else{

				System.err.println("Email Template not found at runtime, Please provide the correct path for template");
			}


		}catch(NullPointerException e){
			System.err.println("Email Template soruce is not found , Its seems provided path does note exist:::: "+e);

		}catch(IllegalArgumentException e){

			System.err.println("Email Template soruce is not found , Its seems provided path does note exist:::: "+e);


		}catch(Exception e){
			System.err.println("Email Template soruce is not found , Its seems provided path does note exist:::: "+e);
		}



	}
	private void updateTotalTestCount(){
		try{
			emailTemplate.getElementById("totaltest").text(TestResult.getTotalTestRun());
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null , Unable to find the element in HTML file.."+e);
		}

	}
	private void updateTotalPassCount(){
		try{

			emailTemplate.getElementById("testpassed").text(TestResult.getTotalTestPassed());
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null , Unable to find the element in HTML file.."+e);
		}catch(NullPointerException e){
			System.err.println("Element Id is null for Passcount , Unable to find the element in HTML file.."+e);
		}

	}

	private void updateTotalFailureCount(){
		try{
			emailTemplate.getElementById("testfailed").text(TestResult.getTotalTestFailed());
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null , Unable to find the element in HTML file.."+e);
		}catch(NullPointerException e){
			System.err.println("Element Id is null for Failure count , Unable to find the element in HTML file.."+e);
		}
	}

	private void updateTotalSkipCount(){
		try{
			emailTemplate.getElementById("testskip").text(TestResult.getTotalTestSkipped());
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null , Unable to find the element in HTML file.."+e);
		}catch(NullPointerException e){
			System.err.println("Element Id is null for Skip , Unable to find the element in HTML file.."+e);
		}

	}
	

	private void updateEmailIDHref(){
		try{
			emailTemplate.getElementById("emailId").attr("href","mailto:"+EmailConfig.getcontactEmailId());
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null , Unable to find the element in HTML file.."+e);
		}catch(NullPointerException e){
			System.err.println("Element Id is null  Email IDHref, Unable to find the element in HTML file.."+e);
		}
	}

	private void updateEmailID(){
		try{
			emailTemplate.getElementById("emailId").text(EmailConfig.getcontactEmailId());
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null , Unable to find the element in HTML file.."+e);
		}catch(NullPointerException e){
			System.err.println("Element Id is null for Email ID , Unable to find the element in HTML file.."+e);
		}

	}
	private void updateProductName(){
		try{
			emailTemplate.getElementById("productName").text(EmailConfig.getProductName());
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null , Unable to find the element in HTML file.."+e);
		}catch(NullPointerException e){
			System.err.println("Element Id is null for product name , Unable to find the element in HTML file.."+e);
		}
	}

	public void updateSuiteName(){
		try{
			emailTemplate.getElementById("suiteName").text("Daily Regression Suite: "+SuiteTimeInfo.getSuiteName());
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null for suiteName, Unable to find the element in HTML file.."+e);
		}catch(NullPointerException e){
			System.err.println("Element Id is null for suite name , Unable to find the element in HTML file.."+e);
		}
	}
	
	
	private void updateTotalDuration(){
		try{
			emailTemplate.getElementById("timetaken").text(SuiteTimeInfo.getTimeDiff());
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null Total Time, Unable to find the element in HTML file.."+e);
		}catch(NullPointerException e){
			System.err.println("Element Id is null for duration , Unable to find the element in HTML file.."+e);
		}

	}

	private void updatePercentage(){
		try{
			emailTemplate.getElementById("progress-text").text(TestResult.getPassPercentage().toString()+"%");
		}catch(IllegalArgumentException e){
			System.err.println("Element Id is null for Circle , Unable to find the element in HTML file.."+e);
		}catch(NullPointerException e){
			System.err.println("Element Id is null for total percentage , Unable to find the element in HTML file.."+e);
		}
	}
	private void updateStatusColor(){

		if(TestResult.getPassPercentage()>95){
			emailTemplate.getElementById("progress").attr("style","background: green;height: 50px;width: "+TestResult.getPassPercentage().toString()+"%"+";max-width: 100%;float: left;");
		}else if(TestResult.getPassPercentage()<95 & TestResult.getPassPercentage()>70){
			emailTemplate.getElementById("progress").attr("style","background: orange;height: 50px;width: "+TestResult.getPassPercentage().toString()+"%"+";max-width: 100%;float: left;");

		}else if(TestResult.getPassPercentage()<70){
			emailTemplate.getElementById("progress").attr("style","background: red;height: 50px;width: "+TestResult.getPassPercentage().toString()+"%"+";max-width: 100%;float: left;");
		}
	}
	public void flush(){

		try{
			Writer.getInstance()
			.write(
					new File(filePath+reportName), 
					Parser.unescapeEntities(emailTemplate.outerHtml().replace("    ", "").replace("\t",  ""), true));
		}catch(NullPointerException e){
			System.err.println("Unable to find the directory to generate the email html file::"+e);
		}
	}

	public HTMLReporter(String outPutDirectory ,String reportName) { 
		this.filePath = outPutDirectory;
		this.reportName="/"+reportName;

	}

}
