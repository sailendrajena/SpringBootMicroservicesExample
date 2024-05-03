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

public class TestStudent {
	public static void main(String[] args) {
		List<Student> studentList = StudentList.getListOfStudent();
		// Find the name of student whose Name last number is equals to 3
		List<Student> nameStudent = studentList.stream().filter(name -> name.getFirstName().startsWith("S"))
				.collect(Collectors.toList());
//		System.out.println(nameStudent);

		// Group by Department
		Map<String, List<Student>> mapStudentData = studentList.stream()
				.collect(Collectors.groupingBy(Student::getDeptName));
//		System.out.println(mapStudentData);

		// total count of student
		long countStudent = studentList.stream().count();
//		System.out.println(countStudent);

		// Find Max age of Student
		OptionalInt maxAge = studentList.stream().mapToInt(Student::getAge).max();
//		System.out.println(maxAge.getAsInt());

		// Find min age of student
		OptionalInt minAge = studentList.stream().mapToInt(Student::getAge).min();
//		System.out.println(minAge.getAsInt());

		// Find all department names
		List<String> deptNames = studentList.stream().map(Student::getDeptName).toList();
//		System.out.println(deptNames);

		// Find All Students First Name
		List<String> stdFirstName = studentList.stream().map(Student::getFirstName).toList();
//		System.out.println("All Student First Name: " + stdFirstName);

		// Find All Students First Name and Last Name
		Map<String, String> stdFirstLastName = studentList.stream()
				.collect(Collectors.toMap(Student::getFirstName, Student::getLastName));
//		System.out.println("All Student First Name and Last Name: "+stdFirstLastName);

		// Find All Students name with combination of firstName and lastName
		List<String> stdFirstLastNameComb = studentList.stream()
				.map(name -> name.getFirstName() + " " + name.getLastName()).toList();
//		System.out.println(stdFirstLastNameComb);

		// Count Student of Each Department
		Map<String, Long> countDeptStudent = studentList.stream()
				.collect(Collectors.groupingBy(Student::getDeptName, Collectors.counting()));
//		System.out.println(countDeptStudent);

		// List of Student whose age is less than 35
		List<Student> stdAgeLt = studentList.stream().filter(name -> name.getAge() < 35).toList();
//		stdAgeLt.forEach(name->System.out.println(name.getFirstName()+" "+name.getLastName()));

		// List of Student whose age grater than 35
		List<Student> stdAgeGt = studentList.stream().filter(name -> name.getAge() > 35).toList();
//		stdAgeGt.forEach(name->System.out.println(name.getFirstName()+" "+name.getLastName()));

		// List of Student whose rank is between 123 to 126
		List<Student> stdRankBt = studentList.stream().filter(name -> name.getRank() > 123 && name.getRank() < 126)
				.toList();
//		stdRankBt.forEach(name -> System.out.println(name.getFirstName() + " " + name.getLastName()));

		// Find student average based on Gender
		Map<String, Double> mapStdGender = studentList.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));
//		System.out.println(mapStdGender);

		// Find Department whose having maximum number of students
		Entry<String, Long> mapStdEntry = studentList.stream()
				.collect(Collectors.groupingBy(Student::getDeptName, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
		System.out.println(mapStdEntry);
	}
}
