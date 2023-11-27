package com.assignment.demo;

import java.util.ArrayList;
import java.util.List;

public class Q06FibonacciSeriesUptonthterm {
	
	public static List<Integer> Series(int n){
		List<Integer> list= new ArrayList<>();
		int firstTerm = 0, secondTerm = 1;
		 for (int i = 1; i <= n; ++i) {
		     
			 list.add(firstTerm);
			 
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		
		
		return list;
		
	}

}
