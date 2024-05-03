package com.core.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinDenonimation {
	public static void main(String[] args) {
		List<Integer> coins = Arrays.asList(1,2,5,10);
		int num = 3;
		denomination(num, coins);
	}
	
	public static List<Integer> denomination(int num, List<Integer> coins){
		List<Integer> result = new ArrayList<Integer>();
		int temp = 0;
		if(num == 1 || num == 2 || num == 5 || num == 10) {
			result.add(num);
			return result;
		}else if(num>2 || num<5) {
			temp = num%2;
			if(temp == 0) {
				result.add(2);
				return result;
			}
		}
		
		return result;
	}
}
