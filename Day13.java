package java100DaysOfCoding;

////#Day 13 - Coding Statement- 
//Write a Java program to  find sum of digits of a number 
import java.util.Scanner;

public class Day13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		int sum=0;
		
		while(n!=0)
		{
			sum=sum + n % 10;
			n=n /10;
				
		}
		
		System.out.println("Sum of the digits is "+ sum);

	}

}
