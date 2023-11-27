package com.assignment.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Q10MaxAreaRectangle {

	
		public static int  calculate_Area(int n, int arr[][]) {
			int max_Area = Integer.MIN_VALUE; 
			 
	        for (int i = 0; i<arr.length; i++){
	        	 int temp_area = 1;
	            for (int j = 0; j<arr[i].length; j++){
	            	 temp_area = temp_area * arr[i][j];  
	            } 
	            
	            
	            if (temp_area > max_Area) { 
	                max_Area = temp_area; 
	            }
	       }
	        return max_Area; 
			
		}
}
