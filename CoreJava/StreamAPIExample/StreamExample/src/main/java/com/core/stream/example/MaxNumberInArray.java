package com.core.stream.example;

import java.util.Arrays;

public class MaxNumberInArray {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,6,7,8,9};
		long max = Arrays.stream(intArr).max().getAsInt();
		System.out.println(max-2);
	}
}