package com.java.testDS;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		
		Student[] student=new Student[3];
		student[0]=new Student(12, "User", 23);
		student[1]=new Student(13, "User", 24);
		student[2]=new Student(14, "User", 23);
		Arrays.sort(student);
		System.out.println(Arrays.toString(student));
	}

}
