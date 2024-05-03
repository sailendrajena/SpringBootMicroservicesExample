package com.core.stream.map;

import java.util.List;
import java.util.stream.Stream;

public class StreamDistinctExample {
	public static void main(String[] args) {
		Integer[] intArr = new Integer[] {1,2,3,4,5,6,7,8,9,3,4,5,7};
		Stream<Integer> intStream = Stream.of(intArr);
		List<Integer> intDistinctList = intStream.distinct().toList();
		System.out.println("Distinct Elements: "+intDistinctList);
	}
}
