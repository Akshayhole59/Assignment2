package com.assignment.demo;

import java.util.ArrayList;
import java.util.List;

public class Q08UniqSubset {
	
	public static List<List<Integer>> AllSubsets(int arr[],int n){
		

		List<List<Integer>> powerSet = new ArrayList<>();
		powerSet.add(new ArrayList<>());
		
		for (int number : arr) {
			int n1 = powerSet.size();
			for (int i = 0; i < n1; i++) {
				List<Integer> temp = new ArrayList<Integer>(powerSet.get(i));
				temp.add(number);
				powerSet.add(temp);
			}
		}
		return powerSet;
		
		
	}

}
