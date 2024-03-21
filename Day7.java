package java100DaysOfCoding;

//#Day 7 - Coding Statement- 
//write a  java program to find the quadrants  in which coordinates lies




import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter X  and Y Cordinates : ");
     int x=sc.nextInt();
     int y=sc.nextInt();
     
      
     if(x>0 && y>0)
     {
    	 System.out.println("The point lies in First Quadrant");
     }
     else if(x<0 && y>0)
     {
    	 System.out.println("The point lies in second Quadrant"); 
     }
     else if(x<0 && y<0)
     {
    	 System.out.println("The point lies in Third Quadrant");
     }
     else if(x>0 && y<0)
     {
    	 System.out.println("The point lies in fourth Quadrant");
     }
     else if(x==0 && y==0)
     {
    	 System.out.println("The point lies in the origin");
     }
     else if(x==0 && y!=0)
     {
    	 System.out.println("The point lies on the y-axix");
     }
     else 
     {
    	 System.out.println("The point lies on the x-axix");
     }
	}

}
