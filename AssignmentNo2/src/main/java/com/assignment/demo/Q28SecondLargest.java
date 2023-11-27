package com.assignment.demo;

import java.util.Arrays;

public class Q28SecondLargest {

	//Second Largest
		public static int print2largest(Integer arr[],int n) {
			
			
			return Arrays.asList(arr).stream().sorted((a,b)->a<b?1:a>b?-1:0).skip(n-1).findFirst().get();
			

		}
}
