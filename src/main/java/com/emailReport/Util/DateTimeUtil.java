package com.emailReport.Util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeUtil {
    public static String getFormattedDateTime(Date date, String pattern) {
        SimpleDateFormat sdfDate = new SimpleDateFormat(pattern);

        return sdfDate.format(date);
    }
    
    public static String getFormattedDateTime(String dateTime, String pattern) {
        SimpleDateFormat sdfDate = new SimpleDateFormat(pattern);
        DateFormat format = new SimpleDateFormat(pattern, Locale.ENGLISH);
        Date date;
        
        try {
            date = format.parse(dateTime);
            return sdfDate.format(date);
        } catch (ParseException e) {
            return dateTime;
        }
    }
    
    public static String getFormattedDateTime(long millis, String pattern) {
        SimpleDateFormat sdfDate = new SimpleDateFormat(pattern);
        Date date = new Date(millis);
        
        return sdfDate.format(date);
    }
    
    public static String getDiff(Date endDate, Date startDate) {
        return getDiff(endDate.getTime(), startDate.getTime());
    }
    
    public static String getDiff(long endDate, long startDate) {    
        long diff = endDate - startDate;
        
        long secs = diff / 1000;
        long millis = diff % 1000;
        long mins = secs / 60;
        secs = (secs % 60);
        long hours = mins / 60;
        mins = mins % 60;

        return hours + "h " + mins + "m " + secs + "s+" + millis + "ms";
    }
}
