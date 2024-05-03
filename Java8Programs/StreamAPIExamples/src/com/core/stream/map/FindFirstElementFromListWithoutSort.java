package com.core.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElementFromListWithoutSort {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C");
		Optional<String> firstElement = list.stream().findFirst();
		System.out.println(firstElement.get());
	}
}
