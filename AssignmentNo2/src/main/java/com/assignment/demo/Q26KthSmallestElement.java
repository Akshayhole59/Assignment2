package com.assignment.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q26KthSmallestElement {

	//Kth smallest element
		public static int kthSmallest(int arr[],int end,int k) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			for(int i=0;i<k;i++) {
				pq.add(arr[i]);
			}
			System.out.println(pq);
			
			for(int i=k;i<arr.length;i++) {
				if(pq.peek()>arr[i]) {
	               	pq.poll();
	               	pq.add(arr[i]);
				}
			}
			
			return pq.peek();
			
		}
}
