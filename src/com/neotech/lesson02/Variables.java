package com.neotech.lesson02;

public class Variables {

	public static void main(String[] args) {
		
		//Data Type			Name/Identifier 			operator 			value
		int					someNumber					=					15;
		
		//Can I display a literal integer? -> Yes!
		System.out.println(15);	// This is a int literal 
		System.out.println("15"); //This is a string literal 
		
		//In programming, a literal is a fixed value that is directly written in the code.
		 
		//If I want to display/use someNumber, I use directly by its name
		System.out.println(someNumber); //This is a variable defined value
		System.out.println(someNumber);
		
		
		//This is will cause a compiler error -> var is not defined a variable 
		//System.out.println(var); //var does exist in my code
									//That means it's not define/declared and assigned a value
		
		// IMPORTANT !!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		int age;        // 'age' is a variable of type int
		String name;    // 'name' is a variable of type String
		
		age = 25;               // Assign the value 25 to 'age'
		name = "Alice";         // Assign the string "Alice" to 'name'
		
		int age1 = 25;           // Declare and initialize 'age' with 25
		String name1 = "Alice";  // Declare and initialize 'name' with "Alice"
		
		int age2 = 30;  // Declares an integer variable 'age' and initializes it with the value 30
		char grade = 'A';  // Declares a character variable 'grade' and initializes it with 'A'
		
		int age3;  // This declares a variable 'age' but does not initialize it with any value.
		int age4 = 25;  // Declares 'age' and initializes it with the value 25.
		
		/*
		 * We store data inside a container. This container we call a VARIABLE.
		 * 
		 * Characteristics of variable: Type (datatype) Name Value
		 * 
		 * Declaration of variable: int num; - declaring single variable int num1, num2;
		 * - declaring multiple variable of same type int num3 = 10; - declaring
		 * variable and assigning value
		 * 
		 * Using variable: System.out.println(num);
		 * 
		 * datatype identifier = value;
		 */

		
	}

}











