package com.assignment.demo;

public class Q01PrimeNo {

	//Check number is prime or not
		public static int isPrime(int i) {
			int m = i / 2;
			int flag = 0;
			if (i == 0 && i == 1) {
				return flag = 1;
			} else {

				for (int j = 2; j <= m; j++) {
					if (i % j == 0) {
						flag = 1;
					}
				}
			}
			return flag;
		}
}
