package com.core.stream.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElement {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,2,3,4,5,6,10);
		Set<Integer> dupSet = new HashSet<>();
		List<Integer> dupList = intList.stream().filter(s->!dupSet.add(s)).toList();
		System.out.println(dupList);
	}
}
