package com.Utils;

import java.util.List;

public class StringCounter {

	 public static int getCount(List<String> sectionName,String nameToMatch){

			int count=0;

			try{

				for(String section:sectionName){
					if(section.equals(nameToMatch)){
						count=count+1;
					}
				}}catch(Exception e){
					return 0;

				}
			return count;	
		}
}
