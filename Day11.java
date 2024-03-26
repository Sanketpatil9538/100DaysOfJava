package java100DaysOfCoding;

import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		int n, a=0 , b=0,c=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of n : ");
         n=sc.nextInt();
         
         System.out.print("The fibonacci series till "+ n +" is : ");
         for(int i=1; i<=n ; i++)
         {
        	 a=b;
        	 b=c;
        	 c=a+b;
        	 System.out.print(a + " ");
        	 
         }
		
		
		
		
		
		
	}

}
