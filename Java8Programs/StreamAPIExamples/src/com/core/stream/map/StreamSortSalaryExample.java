package com.core.stream.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.core.stream.entity.Employee;

public class StreamSortSalaryExample {
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
//		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
//				.forEach(System.out::println);
		// Max Salary
		Optional<Employee> empMaxSalary = empList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//		System.out.println("Maximum Salary: " + empMaxSalary.get().salary);

		// Min Salary
		Optional<Employee> minSalary = empList.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
//		System.out.println("Minimum Salary: " + minSalary.get().getSalary());

		// Second Highest Salary
		Optional<Employee> secondHighestSalary = empList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
//		System.out.println("Second Highest Salary: " + secondHighestSalary.get().getSalary());

		// Third Highest Salary of Employee
		Optional<Employee> thirdHighestSalary = empList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();
//		System.out.println("Third Highest Salary: " + thirdHighestSalary.get().getSalary());

		// Sort reverse order of employee based on age and salary
		/*
		 * List<Employee> sortRevByAge =
		 * empList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed())
		 * .toList();
		 */
		List<Employee> sortRevByAgeAndSalary = empList.stream()
				.sorted(Comparator.comparingInt(Employee::getAge).reversed()).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
		/*
		 * sortRevByAgeAndSalary.forEach(emp -> System.out.println("Id: " + emp.getId()
		 * + " Name: " + emp.getName() + " Age: " + emp.getAge() + " Email Id: " +
		 * emp.getEmail() + " Salary: " + emp.getSalary()));
		 */
		
		List<Employee> sortRevByAgeAndName = empList.stream()
				.sorted(Comparator.comparingInt(Employee::getAge).reversed()).sorted(Comparator.comparing(Employee::getName).reversed()).toList();
		sortRevByAgeAndName.forEach(emp -> System.out.println("Id: " + emp.getId() + " Name: " + emp.getName() + " Age: "
				+ emp.getAge() + " Email Id: " + emp.getEmail() + " Salary: " + emp.getSalary()));
	}
}
