package com.core.stream.map;

import java.util.Arrays;
import java.util.List;

public class CountWordsListStream {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sailendra", "Narayan", "Jena");
	}
	
	public static Integer counting(String name) {
		char[] chr = name.toCharArray();
		int count=0;
		for(int i=0; i<chr.length; i++) {
			count++;
		}
		return count;
	}
}
