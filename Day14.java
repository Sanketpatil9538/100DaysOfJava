package java100DaysOfCoding;

import java.util.Scanner;

////#Day 14 - Coding Statement-Write a java program to reverse a given number


public class Day14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		int rev=0;          
		
		while(n!=0)             
		{
			int rem=n %10;    
			rev=rev*10+rem;    
			n=n/10;            
			
		}
		
		System.out.println("The reverse of the given number is :" + rev);
	}

}
