package com.core.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceCombineString {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Sailendra", "Narayan", "Jena");
		
		Optional<String> combineStr = str.stream().reduce((str1, str2)->str1+" "+str2);
		if(combineStr.isPresent()) {
			System.out.println(combineStr.get());
		}else {
			System.out.println("No Word Found");
		}
	}
}
