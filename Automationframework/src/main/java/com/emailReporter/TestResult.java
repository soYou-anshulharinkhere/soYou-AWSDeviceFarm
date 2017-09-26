package com.emailReporter;

import java.util.Date;

public class TestResult {
	
	public static Integer totalFailedTest=0;
	public static Integer totalPassedTest=0;
	public static Integer totalTestRun=0;
	public static Integer totalSkipedTest=0;
	public static Date startTime;
	public static Date endTime;
	
	
	public static String getTotalTestRun(){
		return totalTestRun.toString();
		
		
	}
	public static String getTotalTestPassed(){
		return totalPassedTest.toString();
		
	}
	public static String getTotalTestFailed(){
		return totalFailedTest.toString();
		
	}
	public static String getTotalTestSkipped(){
		return totalSkipedTest.toString();
		
		
	}
	
	public static Date getStartDate(){
		return startTime;}
	
	public static Date getEndDate(){
		return endTime;}
	
	public static Integer getPassPercentage(){
	
		Float passpercentage=(float)((totalPassedTest*100)/totalTestRun);
		return Math.round(passpercentage);
		
		
	}

}
