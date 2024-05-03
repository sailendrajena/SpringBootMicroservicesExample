package com.core.stream.map;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.core.stream.entity.Student;
import com.core.stream.entity.StudentList;

public class TestStudentList {
	public static void main(String[] args) {
		List<Student> list = StudentList.getListOfStudent();

		// Max Age from Student
		OptionalInt maxAge = list.stream().mapToInt(Student::getAge).max();
//		System.out.println("Max Age: " + maxAge.getAsInt());

		// Group Student based on Department
//		Map<String, List<Student>> mapDeptGrp = list.stream().collect(Collectors.groupingBy(Student::getDeptName));

		// Total No of Student count
		long count = list.stream().count();
//		System.out.println("Count of Students: " + count);

		// Find all Department Names
		List<String> deptName = list.stream().map(dept -> dept.getDeptName()).toList();
//		System.out.println(deptName);

		// Find Distinct Department names
		List<String> deptDistName = list.stream().map(dept -> dept.getDeptName()).distinct().toList();
//		System.out.println(deptDistName);

		// Count each students in each department
		Map<String, Long> countStudentDeptwise = list.stream()
				.collect(Collectors.groupingBy(Student::getDeptName, Collectors.counting()));
//		System.out.println(countStudentDeptwise);

		// Find the student whose age is less than 34
		List<Student> stdLtThirtyFour = list.stream().filter(std -> std.getAge() < 34).toList();
//		stdLtThirtyFour.forEach(std -> System.out.println(std.getFirstName() + " " + std.getLastName()));

		// List the student whose rank is between 122 to 128
		List<Student> rankList = list.stream().filter(std -> std.getRank() > 122 && std.getRank() < 128).toList();
		/*
		 * rankList.forEach(std -> System.out.println( "Student Name: " +
		 * std.getFirstName() + " " + std.getLastName() + " with Rank: " +
		 * std.getRank()));
		 */

		// Find average male and female students
		Map<String, Double> avgMaleFemale = list.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
//		System.out.println(avgMaleFemale);

		// Find Department whose having maximum number of Students
		Entry<String, Long> deptMaxStd = list.stream()
				.collect(Collectors.groupingBy(Student::getDeptName, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
//		System.out.println(deptMaxStd);

		// Find the student who stay in Delhi sorted by their names
		List<Student> delhiBasedStudent = list.stream().filter(std -> std.getCity().equals("Delhi"))
				.sorted(Comparator.comparing(Student::getFirstName)).toList();
//		System.out.println(delhiBasedStudent);

		// Find the students who stay in Bangalore sorted by their rank
		List<Student> bangaloreBasedStudent = list.stream().filter(std -> std.getCity().equals("Bangalore"))
				.sorted(Comparator.comparing(Student::getRank)).toList();
//		System.out.println(bangaloreBasedStudent);

		// Find the average rank in all department
		Map<String, Double> avgRank = list.stream()
				.collect(Collectors.groupingBy(Student::getDeptName, Collectors.averagingInt(Student::getRank)));
//		System.out.println(avgRank);

		// Find the highest Rank in all Department
		Map<String, Optional<Student>> highestRankDepartment = list.stream().collect(
				Collectors.groupingBy(Student::getDeptName, Collectors.maxBy(Comparator.comparing(Student::getRank))));
//		System.out.println(highestRankDepartment);

		// Find the list of students sorted by their rank
		List<Student> stdSortedByRank = list.stream().sorted(Comparator.comparing(Student::getRank)).toList();
		/*
		 * stdSortedByRank.forEach(std -> System.out.println( "Student Name: " +
		 * std.getFirstName() + " " + std.getLastName() + " with Rank: " +
		 * std.getRank()));
		 */

		// Find the second highest Rank of student
		Optional<Student> secondHighestRank = list.stream().sorted(Comparator.comparing(Student::getRank).reversed())
				.skip(1).findFirst();
		System.out.println(secondHighestRank.get());

	}
}
