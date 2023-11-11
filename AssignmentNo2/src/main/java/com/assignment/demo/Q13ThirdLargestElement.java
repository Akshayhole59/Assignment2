package com.assignment.demo;

public class Q13ThirdLargestElement {

	//Third largest element
		public static int thirdLargest(int n,int arr[]) {
			if(arr.length<3)
			{
				return -1;
			}
			
			//now first find macx element in the given array
			int firstMax = arr[0];
			for(int i=0;i<n;i++) {
				if(arr[i]>firstMax) {
					firstMax=arr[i];
				}
			}
			
			//now find second Max element
			int secondMax = arr[0];
			for(int i=0;i<n;i++) {
				if(arr[i]>secondMax && arr[i]<firstMax)
				{
					secondMax=arr[i];
				}
			}
			
			// Now find Third Max element
			int thirdMax = arr[0];
			for(int i=0;i<n;i++) {
				if(arr[i]>thirdMax && arr[i]<secondMax)
				{
					thirdMax=arr[i];
				}
			}
			
			return thirdMax;
			
		}
}
