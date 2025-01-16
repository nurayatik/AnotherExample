package com.neotech.lesson05NestedIf;

public class ElseIfCondition {

	public static void main(String[] args) {
	
		double d1 = 50.5;
		double d2 = 60.8;
		
		if (d1 > d2 ) // Chain if else if Statement
		{
			System.out.println( d1 + " is greater than " + d2);
		}
		else if ( d2 > d1 )
		{
			System.out.println( d2 + " is greater than " + d1); // executed TRUE
		}	
		else
		{
			System.out.println( d1 + " is equal to " + d2);
		}
			
		// ONL one of them can executed !!!!
		// it can not be 2 or 3 of them !!!!!
		
		double d3 = 40.5;
		double d4 = 40.5;
		
		if (d3 > d4 ) // Chain if else if Statement
		{
			System.out.println( d3 + " is greater than " + d4);
		}
		else if ( d4 > d3 )
		{
			System.out.println( d4 + " is greater than " + d3);
		}	
		else
		{
			System.out.println( d3 + " is equal to " + d4);// executed TRUE
		}	
	}
}
