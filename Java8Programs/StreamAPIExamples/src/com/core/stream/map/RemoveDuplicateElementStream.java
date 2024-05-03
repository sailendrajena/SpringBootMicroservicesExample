package com.core.stream.map;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElementStream {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,1,2,3,4,3,4,5);
		List<Integer> remDupList = intList.stream().distinct().toList();
		System.out.println(remDupList);
	}
}
