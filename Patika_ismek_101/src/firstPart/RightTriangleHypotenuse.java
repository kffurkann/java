package firstPart;

import java.util.Scanner;

public class RightTriangleHypotenuse {
	
	    public static void main(String[] args) {
	        /**
	         * Program to Find Hypotenuse in Right Triangle With Java, code the program that calculates the hypotenuse and takes the length of the right sides from the user.
	         *
	         * Homework:
	         * Code the program that calculates the area of the triangle you get the three side lengths from the user.
	         * Formula
	         * Perimeter of triangle= 2u
	         * u= (a+b+c) / 2
	         * Area * Area =u * (u− a)* (u − b) * (u −c)
	         */

	        int side1;
	        int side2;
	        double hypotenuse;

	        Scanner input=new Scanner(System.in);

	        System.out.print("Enter the first side length : ");
	        side1=input.nextInt();

	        System.out.print("Enter the second side length : ");
	        side2=input.nextInt();

	        hypotenuse=Math.sqrt( (side1*side1) + (side2*side2));
	        System.out.println("Hypotenuse : "+hypotenuse);	
	        
	        System.out.println("--------------------------------------------------");
	        int side11;
	        int side22;
	        int side33;
	        double heron;
	        double perimeter;
	        double area;
	        
	        System.out.print("Enter first side length : ");
	        side11=input.nextInt();

	        System.out.print("Enter second side length : ");
	        side22=input.nextInt();
	        

	        System.out.print("Enter thirth side length : ");
	        side33=input.nextInt();


	        heron=(side11 + side22 + side33)/2 ;

	        perimeter=2*heron ;

	        area=Math.sqrt((heron*(heron-side11)*(heron-side22)*(heron-side33)));

	        System.out.println("------------------------------------");
	        System.out.println("Perimeter of triangle : "+perimeter);
	        System.out.println("------------------------------------");
	        System.out.println("Area of triangle : "+area);

	    }	
}
