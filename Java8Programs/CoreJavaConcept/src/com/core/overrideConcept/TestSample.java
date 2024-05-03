package com.core.overrideConcept;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestSample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C");
		
		Optional<String> secondElement = list.stream().skip(1).findFirst();
		
		System.out.println(secondElement.get());
	}
}
