package com.assignment.demo;




import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssignmentNo2ApplicationTests {

	/*
	 * @Test void contextLoads() { }
	 */
	@Test
	public void doQ01PrimeNoTest() {
		
		int expectedResult = 0;
		int actualResult = Q01PrimeNo.isPrime(7);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	@Test
	public void doQ02PallindromeTest() {
		
		String expectedResult = "yes";
		String actualResult = Q02Pallindrome.isPalindrome(555);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ03FactorialTest() {
		
		int expectedResult = 120;
		int actualResult = Q03Factorial.factorial(5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ04PallindromStringTest() {
	
		String expectedResult = "Yes";
		String actualResult = Q04PallindromString.isPalindromme("aba");
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ05FibonacciSeriesNthTest() {
	
		int expectedResult = 5;
		int actualResult = Q05FibonacciSeriesNth.fibonaciSeries(5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ06FibonacciSeriesUptonthtermTest() {
	
		List<Integer> expectedResult = new ArrayList<>();
		expectedResult.add(0);
		expectedResult.add(1);
		expectedResult.add(1);
		expectedResult.add(2);
		expectedResult.add(3);
		
		List<Integer> actualResult = Q06FibonacciSeriesUptonthterm.Series(5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ07ConfusedPappuTest() {
	
		int expectedResult = 3;
		int actualResult = Q07ConfusedPappu.findDiff(56);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	
	@Test
	public void doQ09CountSubsetTest() {
		int[] arr =  {4, 2, 1, 9, 2, 6, 5, 3};
		int expectedResult = 7;
		int actualResult = Q09CountSubset.countOfSubset(8,arr);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ11ImediateSmallerElementTest() {
		int[] arr =  {4, 2, 1, 5, 3};
		List<Integer> expectedResult = new ArrayList<>();
		expectedResult.add(2);
		expectedResult.add(1);
		expectedResult.add(-1);
		expectedResult.add(3);
		expectedResult.add(-1);
		List<Integer> actualResult = Q11ImediateSmallerElement.immediateSmaller	(5,arr);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	
	@Test
	public void doQ14SmallestAndSecondSmallestTest() {
		int[] arr =  {5, 2, 4, 3, 5, 6};
		Map<String, Integer> expectedResult = new HashMap<>();
		expectedResult.put("FirstMinElement", 2);
		expectedResult.put("secondMinElement", 3);
		Map<String, Integer> actualResult = Q14SmallestAndSecondSmallest.minAnd2ndMin(arr,5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ15AnagramStringTest() {
	    String a = "bcadeh";
	    String b = "hea";
	    int expectedResult = 3;
		int actualResult = Q15AnagramString.remAnagram(a,b);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	@Test
	public void doQ17AnagramStringTest() {
	    String a = "AXY";
	    String b = "YADXCP";
	    Boolean expectedResult = Boolean.FALSE;
		Boolean actualResult = Q17CheckForSubsequence.isSubSequence(a, b);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ18FirstAndLastOccurenceTest() {
	    int arr[] = { 1, 3, 3, 4 } ;
	   
	    Map<String,Integer> expectedResult = new HashMap<>();
	    expectedResult.put("First Occurence", 3);
	    expectedResult.put("Last Occurence", 3);
		Map<String,Integer> actualResult = Q18FirstAndLastOccurence.firstAndLast(arr,4, 4);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	@Test
	public void doQ19MergeTwoStringTest() {
		String a = "abc";
	    String b = "def";
	   
	    String expectedResult = "adbecf";
	    
		String actualResult = Q19MergeTwoString.mergeString(a,b);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ20GoodOrBadStringTest() {
		String a = "aeioup";
	
	    String expectedResult = "BadString";
	    
		String actualResult = Q20GoodOrBadString.isGoodorBad(a);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	@Test
	public void doQ21UniqNumberOfOccurenceTest() {
	    int arr[] = { 1, 1, 2, 5, 5} ;
	    Boolean expectedResult = Boolean.FALSE;
		Boolean actualResult = Q21UniqNumberOfOccurence.isFrequencyUnique(arr,5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	@Test
	public void doQ22StockBuyAndSellTest() {
	    int arr[] = { 1, 1, 2, 5, 5} ;
	    List<Integer> list = new ArrayList<>();
	    list.add(0);
	    list.add(4);
	    List<List<Integer>>  expectedResult = new ArrayList<>();
	    expectedResult.add(list);
		List<List<Integer>> actualResult = Q22StockBuyAndSell.stockBuySell(arr,5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ23StockBuySell2Test() {
	    int arr[] = {100,180,260,310,40,535,695};
	    int expectedResult = 865;
		int actualResult = Q23StockBuySell2.stockBuyAndSell(arr);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ24AddMinCharacterTest() {
	    String s1 = "ABCD";
	    int expectedResult = 3;
		int actualResult = Q24AddMinCharacter.addMinChar(s1);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ25MissingNumberInArrayTest() {
		int arr[] = {6,1,2,8,3,4,7,10,5};
	    int expectedResult = 9;
		int actualResult = Q25MissingNumberInArray.MissingNumber(arr,10);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	@Test
	public void doQ26KthSmallestElementTest() {
		int arr[] = {7, 10, 4, 20, 15,};
	    int expectedResult = 15;
		int actualResult = Q26KthSmallestElement.kthSmallest(arr,5,4);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ27EquillibriumPointTest() {
		int arr[] = {1,3,5,2,2};
	    int expectedResult = 2;
		int actualResult = Q27EquillibriumPoint.equilibriumPoint(arr);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ28SecondLargestTest() {
		Integer arr[] = {12, 35, 1, 10, 34, 1};
	    int expectedResult = 34;
		int actualResult = Q28SecondLargest.print2largest(arr,2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	@Test
	public void doQ29CountPairsOfGivenSumTest() {
		int arr[] = {1, 5, 7, 1};
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<List<Integer>> expectedResult = new ArrayList<>();
		list.add(1);
		list.add(5);
		list1.add(5);
		list1.add(1);
		expectedResult.add(list);
		expectedResult.add(list1);
	    
		List<List<Integer>> actualResult = Q29CountPairsOfGivenSum.getPairsCount(arr,4,6);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	@Test
	public void doQ30MaximumProdSubarrayTest() {
		int arr[] = {6, -3, -10, 0, 2};
	    int expectedResult = 180;
		int actualResult = Q30MaximumProdSubarray.maxProduct(arr,5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void doQ13ThirdLargestElementTest() {
		Integer[] arr = { 4, 2, 1, 5, 3 };
		int expectedResult = 3;
		int actualResult = Q13ThirdLargestElement.thirdLargest(5, arr);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
	
	@Test
	public void doQ12zigZagTest() {
		int[] arr = { 4, 3, 7, 8, 6, 2, 1 };
		int[] expectedResult = {1, 3, 2, 6, 4, 8, 7};
		
		int[] actualResult = Q12zigZag.zigZag(arr);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	 
	
	
	@Test
	public void doQ16AnagramStringTest() {
		List<Integer> expectedResult = new ArrayList<>();
		expectedResult.add(2);
		expectedResult.add(3);
		expectedResult.add(5);
		expectedResult.add(7);
		List<Integer> actualResult = Q16SieveofEratosthenes.sieveOfEratosthenes(10);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	

	@Test
	public void doQ10MaxAreaRectangleTest() {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int expectedResult = 30;
		int actualResult = Q10MaxAreaRectangle.calculate_Area(8, arr);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	 
	
	
	@Test
	public void doQ08UniqSubsetTest() {
		int[] arr = { 2, 1, 2 };
		List<Integer> l1 = new ArrayList<>();
		List<List<Integer>> expectedResult = new ArrayList<>();
		expectedResult.add(l1);
		expectedResult.add(l1 = new ArrayList<>(Arrays.asList(2)));
		expectedResult.add(l1 = new ArrayList<>(Arrays.asList(1)));
		expectedResult.add(l1 = new ArrayList<>(Arrays.asList(2, 1)));
		expectedResult.add(l1 = new ArrayList<>(Arrays.asList(2)));
		expectedResult.add(l1 = new ArrayList<>(Arrays.asList(2, 2)));
		expectedResult.add(l1 = new ArrayList<>(Arrays.asList(1, 2)));
		expectedResult.add(l1 = new ArrayList<>(Arrays.asList(2, 1, 2)));

		List<List<Integer>> actualResult = Q08UniqSubset.AllSubsets(arr, 3);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	

}
