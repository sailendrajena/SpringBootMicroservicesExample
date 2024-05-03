package com.core.stream.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamComparatorReverseOrder {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> revIntList = intList.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(revIntList);
	}
}
