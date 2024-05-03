package com.core.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSecondElementFromListWithoutSort {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sailendra", "Narayan", "Jena");
		Optional<String> secondElement = list.stream().skip(1).findFirst();
		System.out.println(secondElement.get());
	}
}
