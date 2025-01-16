package com.neotech.lesson04IfElse;

public class TemperatureCheck {

	public static void main(String[] args) {
		/*
		2. Create a Java program and name it TemperatureCheck.
		Create a variable to store temperature.
		Your program should check 
		If the temperature is below 32
		    then it should print "Water will freeze with temperature __",
		    otherwise should print "Water will NOT freeze with temperature __".
		 */
		
		double temp = 30; // widening int to double
		
		if ( temp < 32) {
		System.out.println("Water will freeze with temperature " + temp );
		}
		else {
			System.out.println("Water will NOT freeze with temperature 32. ");
		}
		
		System.out.println("====================================================");
		
		double temp1 = 30;// widening int to double
		
		if ( temp1 > 32) {
		System.out.println("Water will freeze with temperature " + temp1 );
		}
		else {
			System.out.println("Water will NOT freeze with temperature 32. ");
		}
	}

}
