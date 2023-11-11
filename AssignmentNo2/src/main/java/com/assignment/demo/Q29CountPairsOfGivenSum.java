package com.assignment.demo;

import java.util.LinkedList;
import java.util.List;

public class Q29CountPairsOfGivenSum {

	//Count pairs with given sum
		public static List<List<Integer>>getPairsCount(int arr[],int n,int k){
			List<List<Integer>> masterList= new LinkedList<>();
			//List<Integer> list= new LinkedList<>();
			
			for(int i=0;i<n;i++) {
				for(int j=i;j<n;j++) {
					List<Integer> list= new LinkedList<>();
					if(k==arr[i]+arr[j]) {
						list.add(arr[i]);
						list.add(arr[j]);
						masterList.add(list);
					}
				}
			}
			
			return masterList;
			
		}
}
