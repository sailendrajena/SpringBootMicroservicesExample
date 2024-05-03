package com.core.overrideConcept;

public class Student implements Cloneable{
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
