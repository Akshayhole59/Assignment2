package com.assignment.demo;

import java.util.Arrays;

public class Q13ThirdLargestElement {

	/*
	 * public static void main(String[] args) {
	 * System.out.println(Q13ThirdLargestElement.thirdLargest(3, new Integer[]
	 * {2,4,6,8,65,89,54,546})); }
	 */
	
	//Third largest element
		public static int thirdLargest(int n,Integer arr[]) {
			
			return Arrays.asList(arr).stream().sorted((a,b)->a<b?1:a>b?-1:0).skip(3-1).findFirst().get();
			
//			if(arr.length<3)
//			{
//				return -1;
//			}
//			
//			//now first find macx element in the given array
//			int firstMax = arr[0];
//			for(int i=0;i<n;i++) {
//				if(arr[i]>firstMax) {
//					firstMax=arr[i];
//				}
//			}
//			
//			//now find second Max element
//			int secondMax = arr[0];
//			for(int i=0;i<n;i++) {
//				if(arr[i]>secondMax && arr[i]<firstMax)
//				{
//					secondMax=arr[i];
//				}
//			}
//			
//			// Now find Third Max element
//			int thirdMax = arr[0];
//			for(int i=0;i<n;i++) {
//				if(arr[i]>thirdMax && arr[i]<secondMax)
//				{
//					thirdMax=arr[i];
//				}
//			}
//			
//			return thirdMax;
			
		}
}
