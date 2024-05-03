package com.core.stream.example;

class MyCopy{
	int i= 10;
}

public class DeepAndShallowCopyExample {
	public static void main(String[] args) {
		//For Shallow Copy
		MyCopy cp = new MyCopy();
		MyCopy cp1 = cp;
		
		
		cp1.i = 9;
		System.out.println(cp.i);
		System.out.println(cp1.i);
		
		//For Deep Copy
		MyCopy cp3 = new MyCopy();
		cp3.i = 20;
		System.out.println(cp.i);
		System.out.println(cp1.i);
		System.out.println(cp3.i);
	}
}
