package com.assignment.demo;

import java.util.Arrays;

public class Q12zigZag {
	
	public static int[] zigZag(int[] arr) {
		 // sort the array using the sort function
        Arrays.sort(arr);
        // traverse the array from 1 to N -1
        for (int i = 1; i <= arr.length - 2; i += 2) {
            // swap the current element with the next
            // element
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
		
		
		return arr;
		
	}

}
