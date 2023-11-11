package com.assignment.demo;

public class Q02Pallindrome {
	
	//check whether the number is palindrome or not
		public static String isPalindrome(int n) {
			int checkNumber = n;
			int r,sum=0;
			while(n>0) {
	        r=n%10;
	        sum=(sum*10)+r;
	        n=n/10;
			}
			
			if(sum==checkNumber) {
				System.out.println("Yes");
				return "yes";
			}
			else {
			return "no";
			}
		}
}
