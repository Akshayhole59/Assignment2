package com.assignment.demo;

import java.util.HashMap;
import java.util.Map;

public class Q18FirstAndLastOccurence {

	//First and last occurrences of X
		public static Map<String,Integer> firstAndLast(int arr[], int sizeOfArray, int x){
			Map<String,Integer> map = new HashMap<>();
			int firstOccurence=-1,lastOccurence=-1;
			//first ocuurence
			for(int i=0;i<sizeOfArray;i++) {
				if(x==arr[i]) {
					firstOccurence=i;
					break;
				}
			}
			
			//last Occurence
			for(int i=sizeOfArray-1;i>=0;i--) {
				if(x==arr[i]) {
					lastOccurence=i;
					break;
				}
			}
			
			map.put("First Occurence", firstOccurence);
			map.put("Last Occurence", lastOccurence );
			return map;
			
		}
}
