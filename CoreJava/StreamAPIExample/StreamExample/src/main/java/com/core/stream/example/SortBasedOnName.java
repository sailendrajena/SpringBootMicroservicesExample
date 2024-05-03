package com.core.stream.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee1 {
	int id;
	String name;
	int age;

	public Employee1() {

	}

	public Employee1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class SortBasedOnName {
	public static void main(String[] args) {
		List<Employee1> empList = Arrays.asList(new Employee1(1, "Sailendra1", 31),
												new Employee1(4, "Sailendra4", 34),
												new Employee1(5, "Sailendra5", 35),
												new Employee1(6, "Sailendra6", 36),
												new Employee1(7, "Sailendra7", 37),
												new Employee1(8, "Sailendra8", 38),
												new Employee1(9, "Sailendra9", 39),
												new Employee1(10, "Sailendra10", 40),
												new Employee1(2, "Sailendra2", 32),
												new Employee1(3, "Sailendra3", 33),
												new Employee1(11, "Sailendra11", 41),
												new Employee1(12, "Sailendra12", 42));
		List<Employee1> sortBasedName = empList.stream().sorted(Comparator.comparing(Employee1::getName)).toList();
		sortBasedName.forEach(emp->System.out.println("Employee Id: "+emp.getId()+" Name: "+emp.getName()+" Age: "+emp.getAge()));
	}
}
