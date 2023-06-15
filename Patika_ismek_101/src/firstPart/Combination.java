package firstPart;
import java.util.Scanner;
public class Combination {
	/**
	 * Code a program that calculates combinations in Java.
	 * Combination Formula
	 * C(n,r) = n! / (r! * (n-r)!) 
	 */


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        int firstNumberC = 1;
	        int secondNumberC = 1;
	        int thirdNumberC = 1;
	        int combinationTotal;
	        int firstNumber;
	        int secondNumber;

	        System.out.print("Enter the first number: ");
	        firstNumber = input.nextInt();
	        System.out.print("Enter the second number: ");
	        secondNumber = input.nextInt();
	        
	        
	        for(int i = 1; i <= firstNumber; i++){
	            firstNumberC = firstNumberC * i;
	        }

	        for(int i = 1; i <= secondNumber; i++){
	            secondNumberC = secondNumberC*i;
	        }

	        for(int i = 1; i <= (firstNumber-secondNumber); i++){
	            thirdNumberC = thirdNumberC * i;
	        }

	        combinationTotal = (firstNumberC) /(secondNumberC*(thirdNumberC));
	        System.out.println("C(n,r): " +combinationTotal);


	    }
	

}
