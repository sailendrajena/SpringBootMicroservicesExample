package com.core.stream.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementsInList {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,2,3,4,5,6,7,8);
		Set<Integer> dupList = new HashSet<Integer>();
		List<Integer> intDupList = intList.stream().filter(num->!dupList.add(num)).toList();
		System.out.println(intDupList);
		
		//Count of Distinct elements
		long count = intList.stream().distinct().count();
		System.out.println(count);
	}
}
