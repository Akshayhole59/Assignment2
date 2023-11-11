package com.assignment.demo;

import java.util.Arrays;

public class Q25MissingNumberInArray {
	//Missing number in  array
		public static int MissingNumber(int arr[],int size) {
			Arrays.sort(arr);
			for(int i=1;i<=size;i++) {
				if(arr[i-1]!=i) {
					return i;
				}
			}
			return 0;
			
		}
}
