package com.core.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequenceOfNumbStream {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,1,2,2,3,4,5,5,6,7,7,8,8,8,9);
		Map<Integer, Long> freList = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freList);
	}
}
