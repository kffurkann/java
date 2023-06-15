package firstPart;
import java.util.Scanner;
public class DiamondShow {

	/**
	 * Code diamonds with asterisks using loops in Java.
	 */
	 
//PYRAMID
  		/*public static void main(String[] args) {
	        Scanner klavye = new Scanner(System.in);
	        System.out.print("Bir Sayý Giriniz :");
	        int n = klavye.nextInt();

	        for (int i = 0; i <= n ; i++) {
	            for (int j = 0; j < (n - i); j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= (2 * i + 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println(" ");
	        }*/	
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Bir Sayý Giriniz :");
	        int n = input.nextInt();

	        for (int i = 0; i <= n; i++) {

	            for (int j = 0; j < (n-i); j++) {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= (i * 2 + 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (int i = 1; i <= n ; i++) {

	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }

	            for (int k = (n - i) * 2 + 1; k > 0; k--) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }


	    
	}

}
