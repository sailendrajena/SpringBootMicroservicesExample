package com.core.stream.entity;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String deptName;
	private int joinYear;
	private String city;
	private int rank;

	public Student() {

	}

	public Student(int id, String firstName, String lastName, int age, String gender, String deptName, int joinYear,
			String city, int rank) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.deptName = deptName;
		this.joinYear = joinYear;
		this.city = city;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getJoinYear() {
		return joinYear;
	}

	public void setJoinYear(int joinYear) {
		this.joinYear = joinYear;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", deptName=" + deptName + ", joinYear=" + joinYear + ", city=" + city
				+ ", rank=" + rank + "]";
	}
}
