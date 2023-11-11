package com.assignment.demo;

public class Q15AnagramString {
	//Anagram of String
		public static int remAnagram(String string1, String string2) {
			char[] array1=string1.toCharArray();
			char[] array2=string2.toCharArray();
			 int count=array1.length;
			 
			 for(int i=0;i<array2.length;i++) {
				 
				 for(int j=0;j<array1.length;j++) {
					
					 if(array2[i]==array1[j]) {
						 count--;
					 }
				 }
			 }
			
			return count;
			
		}
}
