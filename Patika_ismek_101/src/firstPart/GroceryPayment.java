package firstPart;

import java.util.Scanner;
	
public class GroceryPayment {

	    public static void main(String[] args) {
	        /**
	         *Grocery Cashier Program:
	         *Code the program that prints the total amount of the products bought by the users from the grocery store, 
	         *according to the kilogram values, using Java.
	         *
	         *Fruits and Kilogram prices
	         *  Pear : 2,14 TL
	         *  Apple : 3,67 TL
	         *  Tomato : 1,11 TL
	         *  Banana : 0,95 TL
	         *  Eggplant : 5,00 TL
	         */

	        double pear=2.14;
	        double apple=3.67;
	        double tomato=1.11;
	        double banana=0.95;
	        double eggplant=5.00;

	        double pear_k;
	        double apple_k;
	        double tomato_k;
	        double banana_k;
	        double eggplant_k;

	        double totalPrice;

	        Scanner input=new Scanner(System.in);


	        System.out.print("Enter the weight of the pear: ");
	        pear_k=input.nextDouble();

	        System.out.print("Enter the weight of the apple: ");
	        apple_k=input.nextDouble();

	        System.out.print("Enter the weight of the tomato: ");
	        tomato_k=input.nextDouble();

	        System.out.print("Enter the weight of the banana: ");
	        banana_k=input.nextDouble();

	        System.out.print("Enter the weight of the eggplant: ");
	        eggplant_k=input.nextDouble();


	        totalPrice=pear*pear_k + apple*apple_k + tomato*tomato_k + banana*banana_k + eggplant*eggplant_k;


	        System.out.println("---------------------------------------------------------");
	        System.out.println("Price of sold pear    : "+ pear*pear_k);
	        System.out.println("---------------------------------------------------------");
	        System.out.println("Price of sold apple   : "+ apple*apple_k);
	        System.out.println("---------------------------------------------------------");
	        System.out.println("Price of sold tomato  : "+ tomato*tomato_k);
	        System.out.println("---------------------------------------------------------");
	        System.out.println("Price of sold banana  : "+ banana*banana_k);
	        System.out.println("---------------------------------------------------------");
	        System.out.println("Price of sold eggplant: "+ eggplant*eggplant_k);
	        System.out.println("---------------------------------------------------------");
	        System.out.println("Total                 : "+ totalPrice);

	    }

}
