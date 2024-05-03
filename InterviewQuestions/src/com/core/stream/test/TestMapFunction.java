package com.core.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestMapFunction {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//Find the even number from the List
		List<Integer> evenList = intList.stream().filter(num->num%2 == 0).toList();
		System.out.println("evenList: "+evenList);
		
		//Find Odd Number from the List
		List<Integer>oddList = intList.stream().filter(num->num%2 != 0).toList();
		System.out.println("Odd List: "+oddList);
		
	}
}
