package com.assignment.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q21UniqNumberOfOccurence {
	//Unique Number of Occurrences
		public static boolean isFrequencyUnique(int arr[],int n) {
			List<Integer> ansList = new LinkedList<>();
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			int i=0;
			while(i<n) {
				int count=1;
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						count++;
						System.out.println(count);
					}else {
						break;
					}
				}
				ansList.add(count);
				i=i+count;
			}
			Collections.sort(ansList);
			System.out.println(ansList);
			
			for(int k=0;k<ansList.size()-1;k++) {
				int firstElement=ansList.get(k);
				int secondElement=ansList.get(k+1);
				if(firstElement==secondElement) {
					return false;
				}
				
			}
			
			return true;
			
		}
}
