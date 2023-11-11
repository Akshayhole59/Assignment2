package com.assignment.demo;

public class Q05FibonacciSeriesNth {

	// N th fibonaci number
		public static int fibonaciSeries(int n) {
			int sum = 0, carryNumber1 = 0, carrynumber2 = 1;
			if (n == 1) {
				System.out.println(carryNumber1);
			} else {
				for (int i = 2; i < n; i++) {
					sum = carryNumber1 + carrynumber2;

					carryNumber1 = carrynumber2;
					carrynumber2 = sum;

				}
				System.out.println(sum);

			}
			return sum;
		}
}
