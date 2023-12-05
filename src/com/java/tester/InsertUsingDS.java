package com.java.tester;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.java.model.Employee;

public class InsertUsingDS {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Set<Integer> setI=new HashSet<>();
		setI.add(10);
		setI.add(40);
		setI.add(30);
		setI.add(10);
		System.out.println(setI);
		
		Set<Employee> set=new HashSet<>();
//		set.add(new Employee(scanner.nextInt(), scanner.next(), scanner.nextFloat()));
//		set.add(new Employee(scanner.nextInt(), scanner.next(), scanner.nextFloat()));
//		set.add(new Employee(scanner.nextInt(), scanner.next(), scanner.nextFloat()));
		set.add(new Employee(1,"Test", 23000));
		set.add(new Employee(1,"Test", 23000));
		set.add(new Employee(1,"Test", 23000));
		
//		
	System.out.println(set);
//		

	}

}
