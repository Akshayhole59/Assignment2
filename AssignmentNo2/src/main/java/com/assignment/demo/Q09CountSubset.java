package com.assignment.demo;

import java.util.HashSet;

public class Q09CountSubset {

	//Count subsets having distinct even numbers
		public static int countOfSubset(int n, int arr[]) {
			HashSet<Integer> newHashset = new HashSet<>();
			int even_count=0;
			
			for (int i = 0; i < n; i++)
		        if (arr[i] % 2 == 0)
		        	newHashset.add(arr[i]);
			System.out.println(newHashset);
			even_count=newHashset.size();
			
			return (int) (Math.pow(2, even_count) - 1);
			
		}
}
