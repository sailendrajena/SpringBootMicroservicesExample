package com.core.olor;

import java.util.HashMap;

class Employee{
	private Integer id;
	private String name;
	
	public Employee() {
		
	}

	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class OLORConcept {
	public static void main(String[] args) {
		Employee emp1 = new Employee(131, "Sailendra");
		Employee emp2 = new Employee(131, "Sailendra");
		
		HashMap<Employee, Integer> map = new HashMap<Employee, Integer>();
		map.put(emp1, 10);
		map.put(emp2, 10);
		
		System.out.println(map.get(emp1));
		System.out.println(map.get(emp2));
	}
}
