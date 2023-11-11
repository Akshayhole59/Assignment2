package com.assignment.demo;

public class Q07ConfusedPappu {
	//Confused Pappu
		public static int findDiff(int n) {
			int newNum = 0, i, temp = 0, reminder, number = n;
			while (n > 0) {
				i = n % 10;
				if (i == 6) {
					i = 9;
				}
				temp = temp * 10 + i;
				n = n / 10;
			}
			// reverse temp
			while (temp > 0) {
				reminder = temp % 10;
				newNum = newNum * 10 + reminder;
				temp = temp / 10;
			}
			System.out.println(newNum);
			// now find diff
			int diff = newNum - number;
			System.out.println(diff);
			return diff;
		}
}
