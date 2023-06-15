package firstPart;

import java.util.Scanner;

public class Circle_Area_Perimeter {

	
	    public static void main(String[] args) {
	        /**
	         * Program to Calculate Area and Perimeter of a Circle
	         * Code the program that calculates the area and perimeter of the circle whose radius you get from the user with java.
	         * Area Formula: π * r * r;
	         * Environment Formula: 2 * π * r;
	         *
	         * Homework:
	         * Code the program that finds the area of a slice of circle with radius r and measure 𝛼 of the central angle.
	         * Take the number 𝜋 = 3.14.
	         * Formula : (𝜋 * (r*r) * 𝛼) / 360
	        */

	        double radius;
	        double pi=3.14;
	        double area;
	        double perimeter;
	        double slice_angle;
	        double slice_area;
	        

	        Scanner input=new Scanner(System.in);

	        System.out.println("Enter the Angle of the Circle : ");
	        radius=input.nextDouble();

	        perimeter=2*pi*radius;
	        area=pi*radius*radius;
	        
	        System.out.println("----------------------------------------------");
	        System.out.println("Perimeter of the circle   : "+ perimeter);
	        System.out.println("----------------------------------------------");
	        System.out.println("Area of the circle      : "+ area);	        
	        
	        System.out.print("Enter the Angle of the Circle Slice : ");
	        slice_angle=input.nextDouble();


	        slice_area=(pi*slice_angle*(radius*radius))/360;


	        System.out.println("-----------------------------------------------");
	        System.out.println("Area of the Circle Slice : "+slice_area);


	    }
	
}
