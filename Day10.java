package java100DaysOfCoding;

import java.util.Scanner;

////#Day 10 - Coding Statement- 
//Write a Java program to  find number of digits in an integer 


public class Day10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int num= sc.nextInt();
		int count=0;
		
		while(num !=0)
		{
			num=num / 10;
			count++;
			
		}
		
		
		System.out.println("Number of digits in the entered numbered are :"+ count);
	}

}
