package firstPart;
import java.util.Scanner;
public class GCD_LCM {
	/**
	 * With Java, code the GCD and LCM values of two numbers using a "While Loop".
	 *
	 */



	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int num1, num2;
	        System.out.print("Lütfen 1. sayýyý giriniz: ");
	        num1 = input.nextInt();
	        System.out.print("Lütfen 2. sayýyý giriniz: ");
	        num2 = input.nextInt();
	        int gcd=1, least = num1, lcm=1;
	        int i =1;
	        if(num1>num2){
	            least=num2;
	        }
	        while (i<=least){
	            if(num1%i==0 && num2%i==0){
	                gcd=i;
	            }
	            i++;
	        }
	        while (i<= num1*num2){
	            if(i%num1==0 && i%num2==0){
	                lcm=i;
	                break;
	            }
	            i++;
	        }


	        System.out.println("GCD : " + gcd + " LCM : " + lcm);


	    } 

}
