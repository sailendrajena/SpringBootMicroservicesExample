package com.core.stream.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.core.stream.entity.Employee;

public class StreamMapFlatMap {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee(131, "Sailendra1", 31, "sailendra1.n1.jena1@gmail.com", 100000.00),
				new Employee(132, "Sailendra2", 32, "sailendra2.n2.jena2@gmail.com", 200000.00),
				new Employee(133, "Sailendra3", 33, "sailendra3.n3.jena3@gmail.com", 300000.00),
				new Employee(134, "Sailendra4", 34, "sailendra4.n4.jena4@gmail.com", 400000.00),
				new Employee(135, "Sailendra5", 35, "sailendra5.n5.jena5@gmail.com", 500000.00),
				new Employee(136, "Sailendra6", 36, "sailendra6.n6.jena6@gmail.com", 600000.00),
				new Employee(137, "Sailendra7", 37, "sailendra7.n7.jena7@gmail.com", 700000.00),
				new Employee(138, "Sailendra8", 38, "sailendra8.n8.jena8@gmail.com", 800000.00),
				new Employee(139, "Sailendra9", 39, "sailendra9.n9.jena9@gmail.com", 900000.00),
				new Employee(140, "Sailendra10", 40, "sailendra10.n10.jena10@gmail.com", 1000000.00));

		List<String> empNameList = empList.stream().map(emp -> emp.getName()).toList();
//		System.out.println(empNameList);

		// Employee Name list with reverse sorted order
		List<String> empNameRevList = empList.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.map(emp -> emp.getName()).toList();
//		System.out.println(empNameRevList);

		// Use both map() and flatMap()
		List<String> nameCharList = empList.stream().map(emp -> emp.getName().split(""))
				.flatMap(array -> Arrays.stream(array)).map(str->str.toUpperCase()).filter(str -> !str.equals(" ")).toList();
		System.out.println(nameCharList);
	}
}
