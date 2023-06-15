package firstPart;
import java.util.Scanner;
public class SumOfDigits {
	/**
	 * Code a program that calculates the sum of the digits of a number.
	 * 
	 */


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number :");
	        int number = input.nextInt();
	        int sum=0;
	        int digit;

	        while (number !=0){
	            digit=number%10;
	            number /=10;
	            sum +=digit;

	        }
	        System.out.println("Sum of digit that you entered :"+sum);



	    }
	
}
