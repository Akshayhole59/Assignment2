package com.assignment.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Q10MaxAreaRectangle {

	//Maximum Area Rectangle
		public static OptionalInt  calculate_Area(int n, int arr[][]) {
			int j=0;
			
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<n;i++) {
				int result = arr[i][j]*arr[i][j+1];
				list.add(result);
			}
			
			OptionalInt newResult =  list.stream().mapToInt(v -> v).max();
				     
				return newResult;
			
		}
}
