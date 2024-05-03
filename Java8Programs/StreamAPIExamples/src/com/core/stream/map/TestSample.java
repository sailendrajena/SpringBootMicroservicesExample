package com.core.stream.map;


public class TestSample {
	public static void main(String[] args) {
		String email ="example@example.com";
		System.out.println(patternMatches(email));
	}
	
	public static boolean patternMatches(String email) {
        String ePattern = "^[(a-zA-Z-0-9-\\\\_\\\\+\\\\.)]+@[(a-z-A-z)]+\\\\.[(a-zA-z)]{2,3}$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
}
