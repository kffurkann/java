package firstPart;

import java.util.Scanner;

public class KDV_AmountCalculator {


	    public static void main(String[] args) {
	        /**
			Program that Calculates TAX Amount Code the program that calculates the TAX amount 
			and the price with TAX of the money value received from the user with Java and prints it on the screen. 
			(Note: Take the TAX amount as 18%)
			Price without TAX = 10;
			Price with TAX = 11.8;
			TAX amount = 1.8;

			Homework: If the entered amount is between 0 and 1000 TL, the VAT rate is 18%, if the amount is greater than 1000 TL, 
			the TAX rate is 8%, and code the program that calculates the TAX amount.
	        Note: If and Else will not be used...      
	        */

	        double amount;
	        double tax_rate;
	        double tax_amount;
	        double taxed_amount;
	        boolean status;

	        Scanner input=new Scanner(System.in);
	        System.out.print("Enter the fee: ");
	        amount= input.nextDouble();

	        status=(0<amount) && (amount<1000);
	        tax_rate=status ? 0.18: 0.08;


	        System.out.println();
	        System.out.println("The amount entered will be calculated at "+tax_rate +" TAX rate.");
	         
	        tax_amount=amount*tax_rate;
	        taxed_amount=tax_amount+amount;

	        System.out.println();
	        System.out.println("Fee is : "+amount);
	        System.out.println("-----------------------------------");
	        
	        System.out.println("Tax rate is : "+tax_rate);
	        System.out.println("-----------------------------------");
	        
	        System.out.println("Tax amount is : "+tax_amount);
	        System.out.println("-----------------------------------");
	        
	        System.out.println("Taxed amount is "+taxed_amount);

	    }

}
