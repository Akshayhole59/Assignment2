package com.assignment.demo;

public class Q24AddMinCharacter {

	//Add Minimum Characters
		public static int addMinChar(String str) {
			int i=0,j=str.length()-1;
	        int trim=j,res=0;
	        
	        while(i<j) {
	        	if(str.charAt(i)==str.charAt(j)) {
	        		i++;
	        		j--;
	        	}else {
	        		res++;
	        		i=0;
	        		j=--trim;
	        	}
	        }
	        
			return res;
			
		}
}
