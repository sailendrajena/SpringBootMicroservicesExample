package com.core.stream.example;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		intList.stream().filter(n->n%2==0).forEach(System.out::println);
	}
}
