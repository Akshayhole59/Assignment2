package com.assignment.demo;

public class Q17CheckForSubsequence {

	//Check for subsequence
		public static Boolean  isSubSequence(String stringOne, String stringTwo) {
			 int n = stringOne.length(), m = stringTwo.length();
		        int i = 0, j = 0;
		        while (i < n && j < m) {
		            if (stringOne.charAt(i) == stringTwo.charAt(j))
		                i++;
		            j++;
		        }
			
			return i == n;
			
		}
}
