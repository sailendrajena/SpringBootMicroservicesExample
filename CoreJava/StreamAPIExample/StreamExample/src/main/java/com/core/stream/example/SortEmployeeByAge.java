package com.core.stream.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
	int id;
	String name;
	int age;

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Employee() {

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

public class SortEmployeeByAge {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(	new Employee(5, "Sailendra5", 35),
												new Employee(6, "Sailendra6", 36),
												new Employee(7, "Sailendra7", 37),
												new Employee(3, "Sailendra3", 33),
												new Employee(4, "Sailendra4", 34),
												new Employee(9, "Sailendra9", 39),
												new Employee(10, "Sailendra10", 40),
												new Employee(11, "Sailendra11", 41),
												new Employee(1, "Sailendra1", 31),
												new Employee(2, "Sailendra2", 32),
												new Employee(8, "Sailendra8", 38));
		List<Employee> sortBasedAge = empList.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
		sortBasedAge.forEach(emp->System.out.println("Employee Id: "+emp.getId()+" Name: "+emp.getName()+" Age: "+emp.getAge()));
	}
}
