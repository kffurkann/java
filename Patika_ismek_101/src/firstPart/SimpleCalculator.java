package firstPart;

import java.util.Scanner;

public class SimpleCalculator {

	    public static void main(String[] args) {
	        /**
	         *Homework:
	         * Code simple calculator using switch-case.
	         */

	        int number1,number2, choice;

	        Scanner input=new Scanner(System.in);

	        System.out.print("Enter the value of the first number : ");
	        number1=input.nextInt();

	        System.out.print("Enter the value of the second number : ");
	        number2=input.nextInt();
	        System.out.println("-----------------------------");
	        System.out.println("Operations ");
	        System.out.println("1-Addition: '1'\n2-Subtraction: '2'\n3-Multiplication: '3'\n4-Division: '4'");
	        
	        choice=input.nextInt();
	        System.out.println("-----------------------");
	        switch (choice){
	            case 1:
	                System.out.print("The result : "+(number1+number2));
	                break;
	            case 2:
	                System.out.print("The result :  "+(number1-number2));
	                break;
	            case 3:
	                System.out.print("The result :  "+(number1*number2));
	                break;
	            case 4:
	                if(number2!=0){
	                    System.out.print("The result :  "+(number1/number2));
	                }else {
	                    System.out.print("It is impossible for a number to be divided by zero.");
	                }
	                break;
	            default:
	                System.out.print("Incorrect entry");
	       }
	  }
}
