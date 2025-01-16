package com.neotech.lesson03;

public class Task1 {
//	Create a Java program and name it Task1
//	a) In your program create the variables to store student's information and 
//		then print the value of those variables:
//		- name
//		- lastName
//		- grade
//		- city
//		- state
//		
//	b) Print the following:
//		My name is ______ and my lastname is _____.
//		I live in the city of _____, state of ____.
//		My grade is: ____
public static void main(String[] args) {
	String name = "Nuray";
	String lastName = "Atik";
	char grade = 'A';
	String city = "Cleveland";
	String state = "Ohio";
	
	System.out.println(name); 
	System.out.println(lastName);
	System.out.println(grade);
	System.out.println(city);
	System.out.println(state);

//	Print the following ;
//	My name is ______ and my lastname is _____.
//	I live in the city of _____, state of ____.
//	My grade is: ____
	
	System.out.println("My name is " + name + " and my lastname is " + lastName );
	System.out.println("I live in the city of " + city + ",state of " + state );
	System.out.println("My grade is " + grade );
	
	System.out.println("-----------------------------------");
	
	//using \n --> it is the same as pressing ENTER (create a new line)
	System.out.println("My name is " + name + " and my last name is " + lastName + ".\n" 
	+ "I live in the city of " + city + ", state of " + state + ".\n" + "My grade is: " + grade);

	
	
	
}
}
