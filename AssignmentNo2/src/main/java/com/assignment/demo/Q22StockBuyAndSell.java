package com.assignment.demo;

import java.util.ArrayList;
import java.util.List;

public class Q22StockBuyAndSell {

	//Stock buy and sell
		public static List<List<Integer>> stockBuySell(int arr[],int n){
			List<List<Integer>> masterList=new ArrayList<>();
			List<Integer> listnew=new ArrayList<>();
			
			int sellingDate=0,buyingDate=0;
			
			for(int i=1;i<n;i++) {
				List<Integer> list=new ArrayList<>();
				if(arr[i]>=arr[i-1]) {
					sellingDate++;	
				}else {
					list.add(buyingDate);
					list.add(sellingDate);
					masterList.add(list);
					buyingDate=sellingDate=i;
					
				}
			}
			listnew.add(buyingDate);
			listnew.add(sellingDate);
			masterList.add(listnew);
			return masterList;
			
		}
}
