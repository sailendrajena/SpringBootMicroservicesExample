package com.core.stream.map;

import java.util.stream.IntStream;

public class StreamReduceRange {
	public static void main(String[] args) {
		
		int product = IntStream.range(2, 8).reduce((num1, num2)->num1*num2).orElse(-1);
//		System.out.println("Range of product: "+product);
		
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		
	}
}
