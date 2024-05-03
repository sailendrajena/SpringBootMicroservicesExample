package com.core.stream.entity;

import java.util.Arrays;
import java.util.List;

public class StudentList {
	public static List<Student> getListOfStudent(){
		List<Student> studentList = Arrays.asList(	new Student(131, "Sailendra1", "Jena1", 31, "Male", "IT1", 2021, "Bangalore", 121),
													new Student(132, "Sailendra2", "Jena2", 32, "Female", "IT2", 2022, "Delhi", 122),
													new Student(133, "Sailendra3", "Jena3", 33, "Male", "IT3", 2023, "Odisha", 123),
													new Student(134, "Sailendra4", "Jena4", 34, "Female", "IT3", 2024, "Bangalore", 124),
													new Student(135, "Sailendra5", "Jena5", 35, "Male", "IT5", 2025, "Delhi", 125),
													new Student(136, "Sailendra6", "Jena6", 36, "Female", "IT5", 2026, "Odisha", 126),
													new Student(137, "Sailendra7", "Jena7", 37, "Male", "IT7", 2027, "Bangalore", 127),
													new Student(138, "Sailendra8", "Jena8", 38, "Female", "IT8", 2028, "Delhi", 128));
		return studentList;
	}
}
