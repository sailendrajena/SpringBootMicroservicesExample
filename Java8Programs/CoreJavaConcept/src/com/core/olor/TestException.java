package com.core.olor;

public class TestException {
	public static void main(String[] args) {
		System.out.println(display());
	}
	public static String display() {
		try {
			throw new RuntimeException("Exception");
		}catch(Exception ex) {
			return "Catch Block Called";
		}finally {
			return "finally Block Called";
		}
		
	}
}
