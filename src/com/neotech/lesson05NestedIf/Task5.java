package com.neotech.lesson05NestedIf;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Create a Java program to check if it is Friday or not. If it is Friday, print
		 * "It's Friday. I am going to watch a movie." and check the date, if date is 13
		 * print "I will watch a scary movie.". If date is not 13 print "I will watch a
		 * comedy.". If it is not Friday, print "It is NOT Friday. I am going to study JAVA."
		 */
		
		boolean isFriday = true;
		int date = 10;
		
		if (isFriday)
		{
		    System.out.println("It's Friday. I am going to watch a movie.");

            if (date == 13)
            {
            System.out.println("I will watch a scary movie.");
           
            }
            else 
            {
            System.out.println("I will watch a comedy.");	
            }
		}
         else
            {
            	System.out.println("It is NOT Friday. I am going to study JAVA.");
            }
            
            
            
            
            
            
	}

}
