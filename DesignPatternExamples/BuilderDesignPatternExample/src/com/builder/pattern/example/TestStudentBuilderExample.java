package com.builder.pattern.example;

public class TestStudentBuilderExample {
	public static void main(String[] args) {
		Student std = new Student.StudentBuilder().setFirstName("Sailendra").setMiddleName("Narayan")
				.setLastName("Jena").build();
		System.out.println("Id: " + std.getId());
		System.out.println("First Name: " + std.getFirstName());
		System.out.println("Middle Name: " + std.getMiddleName());
		System.out.println("Last Name: " + std.getLastName());
		System.out.println("Age: " + std.getAge());
		System.out.println("Email Id: " + std.getEmail());
		System.out.println("Mobile Number: " + std.getMobNo());
	}
}
