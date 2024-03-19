package java100DaysOfCoding;

import java.util.Scanner;

//#Day 4 - Coding Statement- 
//Write a program to identify the given number is positive or negative

public class Day4 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Number : ");
		int n= sc.nextInt();
		
		
		if(n>0)
		{
			System.out.println(n+" is a Positive number ");
		}
		else if(n<0)
		{
			System.out.println(n+ " is a Negative Number");
		}
		
		else
		{
			System.out.println(n +" is zero");
		}

	}

}
