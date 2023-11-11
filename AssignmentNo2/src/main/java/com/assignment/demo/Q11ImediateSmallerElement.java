package com.assignment.demo;

import java.util.ArrayList;
import java.util.List;

public class Q11ImediateSmallerElement {

	//Immediate Smaller Element
		public static List<Integer> immediateSmaller(int numberOfElements, int arr[]) {
	        List<Integer> newList = new ArrayList<>();
			for(int i=0;i<numberOfElements;i++) {
				int j=i+1;
				
				if(j==numberOfElements)
				{
					newList.add(-1);
				}
				else
				{
				if(arr[i]>arr[j]) {
					newList.add(arr[j]);
				}else if(arr[i]<arr[j]){
					newList.add(-1);
				}
				}
				
			}
			return newList;
			
		}
}
