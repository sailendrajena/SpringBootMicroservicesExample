package com.immutableClass.examples;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableListExamples {
	public static void main(String[] args) {
		List<Integer> intList = List.of(1,2,3,4,5,6);//This List is immuatable List
		List<Integer> list = intList.stream().filter(num->num>3).toList();
		System.out.println(list);
		
//		Set<Integer> numSet = Set.of();
		Map<String, String> map = Map.of("Sailendra","Jena");
		System.out.println(map);
	}
}
