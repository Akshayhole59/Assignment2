package com.assignment.demo;

import java.util.ArrayList;
import java.util.List;

public class Q23StockBuySell2 {

	//Stock buy and sell II
		public static int stockBuyAndSell(int arr[]) {
			
			int profit=0;
			int size= arr.length;
			int sellingDate=0,buyingDate=0;
			
			for(int i=1;i<size;i++) {
				List<Integer> list=new ArrayList<>();
				if(arr[i]>=arr[i-1]) {
					sellingDate++;	
				}else {
					profit+=arr[sellingDate]-arr[buyingDate];
					buyingDate=sellingDate=i;
					
				}
			}
			profit+=arr[sellingDate]-arr[buyingDate];
			
			return profit;
		}
}
