package com.assignment.demo;

import java.util.ArrayList;
import java.util.List;

public class Q20GoodOrBadString {

	//Good or Bad string
		public static String isGoodorBad(String str) {
			char arr[]=str.toCharArray();
			int length=arr.length;
			List<String> list= new ArrayList<>();
			list.add("a");
			list.add("e");
			list.add("i");
			list.add("o");
			list.add("u");
			
			for(int i=0;i<length;i++) {
				
				if(list.contains(arr[i])) {
					int Count=1;
	             for(int j=i;j<i+5;i++) {
	            	 if(list.contains(arr[j])) {
	            		 Count++;
	            	 }else {
	            		 break;
	            	 }
	             }	
	             if(Count>=5) {
	            	 return "BadString";
	             }
	             
	             
				}else {
					int Count=1;
		             for(int j=i;j<i+3;j++) {
		            	 if(!list.contains(arr[j])) {
		            		 Count++;
		            	 }else {
		            		 break;
		            	 }
		             }	
		             if(Count>=3) {
		            	 return "BadString";
		             }
		             
		             
					}
				
			}
			
			return "GoodString";
			
		}
}
