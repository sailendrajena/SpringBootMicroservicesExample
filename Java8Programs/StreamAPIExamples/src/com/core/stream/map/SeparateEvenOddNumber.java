package com.core.stream.map;

import java.util.Arrays;
import java.util.List;

public class SeparateEvenOddNumber {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "bca", "dcbe");
		List<String> sortedList = strList.stream().map(num->sorted(num)).sorted().map(s->s.substring(0, 1)).toList();
		System.out.println(sortedList);
	}
	
	public static String sorted(String value) {
		char[] chr = value.toCharArray();
		Arrays.sort(chr);
		
		String result = "";
		for(int i=0; i<chr.length; i++) {
			result=result+chr[i];
		}
		
		return result;
	}
}
