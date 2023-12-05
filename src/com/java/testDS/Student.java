package com.java.testDS;

public class Student implements Comparable<Student> 
{
	
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(age==o.age)
		{
			return (id-o.id);
		}
		return age-o.age;
	}
	
	

}
