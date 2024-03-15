package com.learning.core.day10;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable{
	int rollno;
	String name;
	int age;
	String address;
	public Student() {
		super();
	}
	public Student(int rollno, String name, int age, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, age, name, rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name)
				&& rollno == other.rollno;
	}
	@Override
	public String toString() {
		return  rollno + " " + name + " " + age + "  "+ address ;
	}
	

}
