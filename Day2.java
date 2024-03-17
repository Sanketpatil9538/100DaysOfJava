package java100DaysOfCoding;

import java.util.Scanner;

//#Day 2 - Coding Statement- 
//Write a program to  a take an input from the user and identify the character is a vowel or consonant


public class Day2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any Chracter: ");
		char ch= sc.next().charAt(0);
		
		if(ch=='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ||
		   ch=='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U'	)
			
		   {
			System.out.println("The Enetered character "+ ch +" is a vowel");
			
		   }
		else if((ch >= 'a' && ch<='z') ||(ch>='A' && ch<= 'z'))
		{
			System.out.println("The Enetered character "+ ch + " is a consonant");
		}
		
		else
		{
			System.out.println("Invalid Input ! please enter an alphabet");
		}
	}

}
