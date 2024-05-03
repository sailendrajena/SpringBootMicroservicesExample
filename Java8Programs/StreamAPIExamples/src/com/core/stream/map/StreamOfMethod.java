package com.core.stream.map;

import java.util.List;
import java.util.stream.Stream;

public class StreamOfMethod {
	public static void main(String[] args) {
		Integer[] intArr = new Integer[] {1,2,3,4,5,6,7,8,9};
		Stream<Integer> intStream = Stream.of(intArr);
		List<Integer> intList = intStream.toList();
		System.out.println(intList);
	}
}
