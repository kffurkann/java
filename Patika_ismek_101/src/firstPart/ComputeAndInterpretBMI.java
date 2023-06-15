package firstPart;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
  public static void main(String[] args) {
	  /**
	   * Body Mass Index Calculator
	   *With Java, take the height and weight values from the user and assign them to a variable.
	   *Calculate the "Body Mass Index" value of the user according to the formula below and code it on the screen.
	   *
	   *Formula
	   *Weight (kg) / Height (m) * Height (m)
	   * 
	   */
	  		Scanner input = new Scanner(System.in);
    

	  		System.out.print("Enter your weight : ");
	  		double weight = input.nextDouble();
    

	  		System.out.print("Enter your height : ");
	  		double height = input.nextDouble();
    

	  		double bmi = (weight / 
	  			(height * height))*10000;


	  		System.out.println("BMI is " + bmi);
	  		if (bmi < 18.5)
	  			System.out.println("Underweight");
	  		else if (bmi < 25)
	  			System.out.println("Normal");
	  		else if (bmi < 30)
	  			System.out.println("Overweight");
	  		else
	  			System.out.println("Obese");
  }
}
