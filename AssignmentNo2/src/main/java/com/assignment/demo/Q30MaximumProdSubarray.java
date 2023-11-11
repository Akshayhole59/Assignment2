package com.assignment.demo;

public class Q30MaximumProdSubarray {

	//Maximum Product Subarray
		public static int maxProduct(int arr[],int n) {
			
			int minProd=1;
			int maxProd=1;
			int ans=1;
			int choice1,choice2;
			for(int i=0;i<n;i++){
				choice1=minProd*arr[i];
				choice2=maxProd*arr[i];
				minProd=Math.min(arr[i], Math.min(choice1, choice2));
				maxProd=Math.max(arr[i], Math.max(choice1, choice2));
				ans=Math.max(ans, maxProd);
						}
			return ans;
			
		}
}
