package com.core.stream.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee{
	int id;
	String name;
	int age;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int age) {
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

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(	new Employee(131, "Sailendra1", 31),
												new Employee(132, "Sailendra2", 32),
												new Employee(133, "Sailendra3", 33),
												new Employee(134, "Sailendra4", 34),
												new Employee(135, "Sailendra5", 35),
												new Employee(136, "Sailendra6", 36),
												new Employee(137, "Sailendra7", 37),
												new Employee(138, "Sailendra8", 38));
		
		List<String> nameList = empList.stream().sorted(Comparator.comparing(Employee::getName)).map(emp->emp.getName()).toList();
		System.out.println(nameList);
		List<String> nameRevList = empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).map(emp->emp.getName()).toList();
		System.out.println(nameRevList);
		
		int secondHighestAge = empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).skip(1).findFirst().get().getAge();
		
		System.out.println(secondHighestAge);
	}
}
