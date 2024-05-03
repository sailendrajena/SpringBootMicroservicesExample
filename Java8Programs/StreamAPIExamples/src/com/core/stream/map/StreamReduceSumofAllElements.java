package com.core.stream.map;

import java.util.Arrays;
import java.util.List;

public class StreamReduceSumofAllElements {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(-2, 1,2,3,4,5,6,7,8,9);
		int sum = intList.stream().reduce(0, (num1, num2)->num1+num2);
		System.out.println("Sum of all numbers: "+sum);
	}
}
