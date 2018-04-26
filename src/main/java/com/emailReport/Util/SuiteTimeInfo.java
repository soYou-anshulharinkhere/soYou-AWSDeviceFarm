package com.emailReport.Util;

public class SuiteTimeInfo {
    public void setSuiteStartTimestamp(long startedAt) {
    	SuiteTimeInfo.startedAt = startedAt;
    }
    
    public long getSuiteStartTimestamp() {
        return startedAt;
    }
    
    public void setSuiteEndTimestamp(long endedAt) {
    	SuiteTimeInfo.endedAt = endedAt;
    }
    
    public long getSuiteEndTimestamp() {
        return endedAt;
    }
    
    public static String getTimeDiff() {
    	return DateTimeUtil.getDiff(endedAt, startedAt);
    }
    public static String getSuiteName(){
    	return suiteName;
    }
    public void setSuiteName(String suiteName ){
    	
    	SuiteTimeInfo.suiteName=suiteName;
    }
    
    private static long startedAt;
    private static long endedAt;
    private static String suiteName;
    
    public SuiteTimeInfo() {
    	
    	
    	
    } 
}