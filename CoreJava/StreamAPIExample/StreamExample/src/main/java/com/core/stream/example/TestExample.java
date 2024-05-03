package com.core.stream.example;

import java.util.Arrays;
import java.util.List;

public class TestExample {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,4,5,6,7,8,9);
		long sum = intList.stream().filter(num->num%2 == 0).mapToInt(Integer::intValue).sum();
		int max = intList.stream().mapToInt(Integer::intValue).max().getAsInt();
	}
}
