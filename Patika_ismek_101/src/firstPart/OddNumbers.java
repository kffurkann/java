package firstPart;
import java.util.Scanner;
public class OddNumbers {
	/**
	 * With Java loops, we are coding the program that accepts input from
	 * the user until a single number is entered and collects even and multiples of 4 from
	 *  the entered values and prints it on the screen.
	 * 
	 */

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int number;
	        int total =0;


	        do{
	            System.out.print("Enter a Number: ");
	            number = input.nextInt();
	            if((number % 2 == 0) && (number % 4 == 0)){
	                total += number;
	            }

	        }while (number % 2 == 0);
	        System.out.println("Total : " +total);
	    }
	
}
