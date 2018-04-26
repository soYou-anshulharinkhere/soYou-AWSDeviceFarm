package com.emailReport.Util;

import java.util.Scanner;

public class Stream {
	public static String toStrings(java.io.InputStream is) {
		Scanner scanner = null;
		
	    try {
	    	scanner = new Scanner(is).useDelimiter("\\A");
	    	return scanner.hasNext() ? scanner.next() : "";
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
		return null;
	}
}
