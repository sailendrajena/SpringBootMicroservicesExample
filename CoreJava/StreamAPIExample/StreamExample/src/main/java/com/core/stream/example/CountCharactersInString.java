package com.core.stream.example;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharactersInString {
	public static void main(String[] args) {
		String name = "Sailendra Narayan Jena";
		List<Character> charList = name.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());
		Map<Character, Long> count = charList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//Count which character contains more than one
		
		Map<Character, Long> countListMoreThanOne = charList.stream().filter(num->Collections.frequency(charList, num)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);
		System.out.println(countListMoreThanOne);
	}
}
