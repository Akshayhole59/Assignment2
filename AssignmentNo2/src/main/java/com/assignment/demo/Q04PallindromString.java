package com.assignment.demo;

public class Q04PallindromString {

	//check string is PALINDROME Or not
		public static String isPalindromme(String S) {
			char a[]=S.toCharArray();
			int i=0;
			int length = a.length-1;
			while(length>1) {
				if(a[i++] != a[length--]) {
					System.out.println("Not a palindrome");
	             return "No";				
				}
			}
			System.out.println("It is a palindrome");
			return "Yes";
			
		}
}
