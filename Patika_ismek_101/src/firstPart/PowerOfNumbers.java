package firstPart;
import java.util.Scanner;
public class PowerOfNumbers {
	/**
	 * We are coding the program that prints the powers of 4 and 5 up to the number entered with Java loops.
	 * 
	 */
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int number;

	        
	        System.out.print("Enter the number : ");
	        number = input.nextInt();

	        System.out.println("Powers of 4 : ");
	        for(int i = 1; i<number; i *= 4){
	            System.out.println(i);
	        }

	        System.out.println("----------------------");

	        System.out.println("Powers of 5 : ");
	        for(int i = 1; i<number; i *= 5){
	            System.out.println(i);
	        }
	    }
}
