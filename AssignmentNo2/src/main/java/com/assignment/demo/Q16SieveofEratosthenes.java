package com.assignment.demo;

import java.util.ArrayList;
import java.util.List;

public class Q16SieveofEratosthenes {
	
	public static List<Integer> sieveOfEratosthenes(int n){
		List<Integer> list = new ArrayList<>();
		 
		 
		        for(int i = 2; i <= n; i++){
		           
		            boolean isPrime = true;
		            for(int j = i-1; j >=2; j--){
		                
		              
		                if(i % j == 0){
		                    isPrime = false;
		                    break;
		                }
		            }
		            
		            if(isPrime)
		               list.add(i);       
		        }

		
		return list;
		
	}
}
