package com.core.stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReadEachCharacterofStringArrayListUsingFlatMap {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
		list.stream().flatMap(str->Stream.of(str.charAt(0))).forEach(System.out::println);
	}
}
