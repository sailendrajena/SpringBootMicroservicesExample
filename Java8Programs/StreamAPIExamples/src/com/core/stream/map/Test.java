package com.core.stream.map;

public class Test {
	
		String s="Hello";

	public static void modify(String str) {
		str += "Java";
	}

	public static void main(String str[]) {
		Test t=new Test();
		t.s +="world";
		modify(t.s);
		System.out.println(t.s);
		}
	}
