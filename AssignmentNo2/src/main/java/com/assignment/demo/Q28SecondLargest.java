package com.assignment.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Q28SecondLargest {

	//Second Largest
		public static int print2largest(int arr[],int n) {
			Set<Integer> set= new HashSet<>();
			ArrayList<Integer> al = new ArrayList<>();
			for(int i : arr) {
				set.add(i);
			}
			System.out.println(set);
			al.addAll(set);
			Collections.sort(al, Collections.reverseOrder());
			
			if(al.size()<n) {
				return -1;
			}
			System.out.println(al);
			for(int i=0;i<al.size();i++)
			{
				if(i==n-1) {
			     return al.get(i);
				}
			}
			return -1;
		}
}
