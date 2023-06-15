package firstPart;
import java.util.Scanner;
public class HarmonicSeries {
	/**
	 * Code a program that finds the harmonic series of the number entered in Java.
	 * 
	 */


	    public static void main(String[] args) {
	        int number;
	        double result=0;
	        Scanner input=new Scanner(System.in);
	        System.out.print("Enter a number : ");
	        number= input.nextInt();
	        for (int i=1;i<=number;i++){
	            result=result+(1.0/i);
	        }
	        System.out.println("Result of the harmonic result : "+result);
	    } 
	

}
