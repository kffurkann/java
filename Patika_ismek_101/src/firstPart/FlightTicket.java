package firstPart;
import java.util.Scanner;
public class FlightTicket {
	
	/**
	 * Make a program that calculates air ticket prices according to distance and conditions with Java. 
	 * Get Distance (KM), age and trip type (One Way, Round-Round) information from the user. 
	 * Take the fare per distance as 0.10 TL / km. 
	 * First, calculate the total price of the flight and then apply the following discounts to the customer according to the conditions;

		--The values received from the user must be valid (distance and age values should be positive numbers, trip type 1 or 2). 
		  Otherwise, "You Have Entered Wrong Data!" A warning should be given.
		--If the person is younger than 12 years old, 50% discount is applied on the ticket price.
		--If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
		--If the person is over 65 years old, a 30% discount is applied on the ticket price.
		--If the person chooses the "Journey Type" round trip, 20% discount is applied on the ticket price.
	 * 
	 */
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int distance, age, passengerType; 
	        double ticket, ageDiscount = 0, totalDiscount = 0, typeDiscount = 0, sum = 0;

	        System.out.print("Enter the distance in km : ");
	        distance = input.nextInt();

	        System.out.print("Enter your age : ");
	        age = input.nextInt();

	        System.out.print("Enter the type of trip \n-> One Way = 1 \n-> Round Trip = 2 \n: ");
	        passengerType = input.nextInt();

	        if (distance <= 0 || age < 0 || passengerType < 1 || passengerType > 2) {
	            System.out.println("Incorrect entry");
	        }

	        ticket =distance * 0.1;

	        if ( age < 12)
	            ageDiscount = ticket * 0.5;
	        else if (age >= 12 && age <=24)
	            ageDiscount = ticket * 0.1;
	        else if(age > 65)
	            ageDiscount =ticket * 0.3;

	        totalDiscount = ticket - ageDiscount;

	        switch (passengerType)
	        {
	            case 1:
	                typeDiscount = 0 ;
	                break;
	            case 2:
	                typeDiscount = totalDiscount * 0.2;
	                break;
	        }
	        
	        sum = (totalDiscount - typeDiscount) * 2 ;


	        System.out.println("Total pay : " + sum);
	    }
	
}
