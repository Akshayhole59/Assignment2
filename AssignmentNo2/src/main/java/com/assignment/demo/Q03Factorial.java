package com.assignment.demo;

public class Q03Factorial {

	//get factorial of number
		public static int factorial(int n) {
			int sum=1;
			for(int i=1;i<=n;i++) {
				sum=sum*i;
			}
			System.out.println(sum);
			return sum;
			
		}
}
