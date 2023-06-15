package firstPart;
import java.util.Scanner;
public class Palindrom {
	/**
	 * Code a program in Java that finds whether a number is a "Palindrome Number".
	 * 
	 * 
	 */

	    static boolean isPalindrom(int number){
	        int lastNumber,reverseNumber=0,tempNumber;
	        tempNumber = number;
	        while(tempNumber != 0){
	            lastNumber = tempNumber%10;
	            reverseNumber = (reverseNumber*10)+lastNumber;
	            tempNumber/=10;

	        }
	        if(reverseNumber==number)
	            return true;
	        else
	            return false;
	    }
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number : ");
	        int number = input.nextInt();
	        if (isPalindrom(number)){
	            System.out.println(number+" is a palindrom number");
	        }
	        else {
	            System.out.println(number+" is not a palindrom number");
	        }

	    
	}

}
