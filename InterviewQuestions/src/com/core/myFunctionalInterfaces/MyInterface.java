package com.core.myFunctionalInterfaces;

@FunctionalInterface
public interface MyInterface {
	int apply(int x, int y);
	default void test() {
		System.out.println("I am inside default test method..");
	}
	
	static int sum(int a, int b) {
		return a+b;
	}
}
