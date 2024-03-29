package java100DaysOfCoding;

////#Day 15 - Coding Statement-
//           - Write a java program to identify if the number is strong number or not
import java.util.Scanner;


public class Day15 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n=sc.nextInt();
	
	int temp,rem, fact,i,sum=0;
	temp=n;
	
	while(n!=0)
	{
		rem=n%10;
		fact=1;
		
		for(i=1; i<=rem; i++)
		{
			fact=fact*i;	
		}
		sum=sum+fact;
		n=n / 10;
			
	}
	
	if(sum==temp)
	{
		System.out.println(temp +" is a STRONG Number");
	}
	else
	{
		System.out.println(temp +" is not a STRONG number");
	}

	}

}
