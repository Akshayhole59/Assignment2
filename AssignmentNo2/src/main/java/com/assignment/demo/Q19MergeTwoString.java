package com.assignment.demo;

public class Q19MergeTwoString {

	//Merge two strings
		public static String mergeString(String s1, String s2) {
			StringBuilder s3=new StringBuilder();
			for(int i=0;i<s1.length() || i<s2.length();i++) {
				if(i<s1.length()) {
					s3.append(s1.charAt(i));
				}
				
				if(i<s2.length()) {
					s3.append(s2.charAt(i));
				}
			}
			return s3.toString();
			
		}
}
