package com.core.lambdaExample;

import com.core.myFunctionalInterfaces.MyInterface;

public class TestMyInterface {
	public static void main(String[] args) {
		MyInterface add = (x, y)-> x+y;
		int result = add.apply(2, 3);
		System.out.println(result);
	}
}
