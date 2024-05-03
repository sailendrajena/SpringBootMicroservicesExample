package com.stream.mapExample;

import java.util.Arrays;
import java.util.List;

public class MapToFilterLengthStringLists {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple", "Mango", "Pineapple", "Kiwi");
		
		System.out.println("Fruit Lists: "+strList);
		
		//Find list of string lenth using map
		List<Integer> lengthListMap = strList.stream().map(str->str.length()).toList();
		System.out.println("Fruits Length Lists: "+lengthListMap);
		
	}
}
