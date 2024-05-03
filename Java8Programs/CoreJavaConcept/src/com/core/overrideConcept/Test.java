package com.core.overrideConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	String deptName;
	public Employee(int id, String name, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.deptName = deptName;
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}

public class Test {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(	new Employee(131, "Sam1", "IT"),
												new Employee(132, "Sam2", "Dev"),
												new Employee(133, "Sam3", "Test"),
												new Employee(134, "Sam4", "IT"),
												new Employee(135, "Sam5", "IT"));
		Set<String> deptNameList = empList.stream().map(emp->emp.getDeptName()).collect(Collectors.toSet());
		List<String> deptName1List = empList.stream().map(emp->emp.getDeptName()).distinct().toList();
		
		
		List<Employee> empITList = empList.stream().filter(emp->emp.getDeptName().equalsIgnoreCase("IT")).toList();
//		deptList.forEach(emp->System.out.println(emp.getDeptName()));
//		empITList.forEach(emp->System.out.println(emp.getName()+" --- "+emp.getDeptName()));
		
		deptNameList.forEach(System.out::println);
	}
}