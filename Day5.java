package java100DaysOfCoding;

import java.util.Scanner;

//#Day 4 - Coding Statement- 
//Write a program to identify the given number is Even or Odd




public class Day5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter any number :");
	    int n=sc.nextInt();
	    
	    
	    if(n%2==0)
	    {
	    	System.out.println("The entered number "+ n + " is even");
	    }
	    else
	    {
	    	System.out.println("The entered number "+ n + " is odd");
	    }
		
	}

}
