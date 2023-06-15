package firstPart;
import java.util.Scanner;
public class LeapYear {
	
	/**
	 * Code a program that finds whether the year the user entered is a leap year in Java.
	 * 
	 */

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a year : ");
	        int year = input.nextInt();

	        if(year % 4 == 0 && year % 400 == 0)
	            System.out.print(year +" is a leap year");
	        else
	            System.out.print(year +" is not a leap year");
	    }
	
}
