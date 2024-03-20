package java100DaysOfCoding;

import java.util.Scanner;

//#Day 4 - Coding Statement- 
//Write a program to find ASCII values of a character



public class Day6 {

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter any character : ");
      
      char ch=sc.next().charAt(0);
      
      int ascii_value=ch;
      
      System.out.println("The ASCII Value of "+ ch + " is " + ascii_value);

	}

}
