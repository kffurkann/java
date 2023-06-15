package firstPart;

import java.util.Scanner;

public class GradeAverage {

	 public static void main(String[] args) {
	        /**
			Program to Calculate Grade Point Average Code the program that takes 
			the exam scores of Mathematics, Physics, Chemistry, Turkish, History, Music courses
			from the user and calculates the averages and prints it on the screen with Java.

			Homework:
			In the same program, by using conditional expressions, if the average of the user is greater than 60, 
			the screen should write "Passed the Class", if it is less, "Failed in the Class".
			Note: If and Else will not be used...      
	        */
	            int math, physics, chemistry, turkish, history, music;


	            Scanner input = new Scanner(System.in);

	            System.out.print("Enter the grade of the math exam : ");
	            math = input.nextInt();

	            System.out.print("Enter the grade of the physics exam : ");
	            physics = input.nextInt();

	            System.out.print("Enter the grade of the chemistry exam : ");
	            chemistry = input.nextInt();

	            System.out.print("Enter the grade of the turkish exam : ");
	            turkish = input.nextInt();

	            System.out.print("Enter the grade of the history exam : ");
	            history = input.nextInt();

	            System.out.print("Enter the grade of the music exam : ");
	            music = input.nextInt();

	            int total = math + physics + chemistry + turkish + history + music;
	            double average = total / 6;
	           
	            System.out.println("Average is : "+average);
	       
	            boolean status = average >= 60;
	            String porf = status ? "Passed the class" : "Failed the class";
	            System.out.println(porf);

	    }

}
