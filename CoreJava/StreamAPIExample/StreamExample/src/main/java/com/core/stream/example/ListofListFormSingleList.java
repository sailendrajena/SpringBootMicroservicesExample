package com.core.stream.example;

import java.util.Arrays;
import java.util.List;

public class ListofListFormSingleList {
	public static void main(String[] args) {
		List<Integer> primeNumList = Arrays.asList(1,3,5,13);
		List<Integer> oddNumList = Arrays.asList(1,3,5,7,9);
		List<Integer> evenNumList = Arrays.asList(2,4,6,8);
		
		List<List<Integer>> combList = Arrays.asList(primeNumList, oddNumList, evenNumList);
		System.out.println("List before process for flatMap: "+combList);
		List<Integer> finalList = combList.stream().flatMap(str->str.stream()).toList();
		System.out.println(finalList);
	}
}
