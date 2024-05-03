package com.builder.pattern.example;

public class Student {
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String email;
	private long mobNo;

	public Student(StudentBuilder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.middleName = builder.middleName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.email = builder.email;
		this.mobNo = builder.mobNo;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public long getMobNo() {
		return mobNo;
	}

	public static class StudentBuilder {
		private int id;
		private String firstName;
		private String middleName;
		private String lastName;
		private int age;
		private String email;
		private long mobNo;

		public StudentBuilder setId(int id) {
			this.id = id;
			return this;
		}

		public StudentBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public StudentBuilder setMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public StudentBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public StudentBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public StudentBuilder setMobNo(long mobNo) {
			this.mobNo = mobNo;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}

	}

}
