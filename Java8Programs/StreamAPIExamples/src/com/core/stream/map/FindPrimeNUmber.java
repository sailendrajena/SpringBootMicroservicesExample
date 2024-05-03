package com.core.stream.map;

import java.util.Arrays;
import java.util.List;

public class FindPrimeNUmber {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		List<Integer> primeList = intList.stream().filter(num->num%2 != 0 && num%3 != 0 && num != 1).toList();
		System.out.println(primeList);
	}
}
