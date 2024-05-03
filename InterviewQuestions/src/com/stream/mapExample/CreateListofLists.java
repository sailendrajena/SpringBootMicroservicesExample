package com.stream.mapExample;

import java.util.ArrayList;
import java.util.List;

public class CreateListofLists {
	public static void main(String[] args) {
		List<List<Integer>> intList = new ArrayList<List<Integer>>();
		List<Integer> testList = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			for(int j=i+1; j<=10; j++) {
					testList.add(i);
					testList.add(j);
					intList.add(testList);
			}
		}
		
		System.out.println(intList);
	}
}
