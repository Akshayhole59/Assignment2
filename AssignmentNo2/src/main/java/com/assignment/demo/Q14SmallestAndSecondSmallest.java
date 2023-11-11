package com.assignment.demo;

import java.util.HashMap;
import java.util.Map;

public class Q14SmallestAndSecondSmallest {

	//Find the smallest and second smallest element in an array
		public static Map<String,Integer> minAnd2ndMin(int a[], int numberOfElements){
			Map<String, Integer> map1=new HashMap<>();
			 int firstMin=a[0];
			 for(int i=0;i<numberOfElements;i++) {
				 if(a[i]<firstMin) {
					 firstMin=a[i];
				 }
			 }
			 map1.put("FirstMinElement", firstMin);
			 
			 
			 int secondMin=a[0];
			 for(int i=0;i<numberOfElements;i++) {
				 if(a[i]<secondMin && a[i]>firstMin) {
					 secondMin=a[i];
				 }
			 }
			 
			 map1.put("secondMinElement", secondMin);
			
			
			return map1;
			
		}
}
