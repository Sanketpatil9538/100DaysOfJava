package java100DaysOfCoding;

import java.util.Scanner;

//#Day 3 - Coding Statement- 
//Write a program to identify if the character is an alphabet or not

public class Day3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		
   //Method 1 - Using if - else condition
		
		if((ch>='A') && (ch <='Z') || (ch>='a') && (ch <='z'))
		{
			System.out.println("The Entered character "+ch + " is an Alphabet");
		}
		else
		{
			System.out.println("The Entered character "+ch + " is not  an Alphabet");
		}

		
	//Method 2 -Using Built in function
		
	    if(Character.isAlphabetic(ch))
	    {
	    	System.out.println(ch + " is an alphabet");
	    }
	    else
	    {
	    	System.out.println(ch + " is not an alphabet");
	    }
		
		
		
	}

}
