package com.assignment.demo;

public class Q27EquillibriumPoint {
	//Equilibrium Point
		public static int  equilibriumPoint(int arr[]) {
			int j= arr.length;
			int leftSum=0,rightSum=0;
			if(j==1) {
				return 1;
			}
			for(int i=0;i<=j/2;i++){
				leftSum=leftSum+arr[i];
				rightSum=rightSum+arr[j-1];
				
				if(leftSum==rightSum) {
					return i+1;
				}
				
				j--;
			}
			return -1;
		}
}
