package firstPart;
import java.util.Scanner;
public class PerfectNumber {
	/**
	 * It finds whether a number entered from the keyboard is a perfect number, and if the number is a perfect number, "it is a perfect number.
	 * " if not, "it's not a perfect number." Code the program that writes expressions to the screen in Java.
	 * 
	 */


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        while(true){
	        System.out.print("Enter a number : ");
	        int number = input.nextInt();
	        int remain =0;
	        for(int i=1;i <number;i++){
	            if(number % i == 0){
	                remain += i;
	            } 
	            } if (remain == number){
	                System.out.println(number + " is a perfect number.");
	            } else{
	                System.out.println(number + " is not a perfect number.");
	            }
	       }	        
	 }
}
