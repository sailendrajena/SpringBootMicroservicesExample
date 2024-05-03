package com.core.overrideConcept;

public class TestStudentClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student std = new Student(1, "Sailendra1");
		Student stdClone = (Student)std.clone();
		
		System.out.println("Plane object Data: "+std.id+" "+std.name);
		System.out.println("Clone Object Data: "+stdClone.id+" "+stdClone.name);
		
		System.out.println(std.equals(stdClone));
	}
}
