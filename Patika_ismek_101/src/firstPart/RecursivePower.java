package firstPart;
import java.util.Scanner;
public class RecursivePower {
	/**
	 * In Java language, code the program that uses the "Recursive" method for exponentiation, 
	 * whose base and exponent values are taken from the user.
	 */
	

	    static int recursivePower(int x,int y){
	        if(y==0){
	            return 1;
	        }
	        return x*recursivePower(x,y-1);
	    }

	    public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        while(true){
	            System.out.print("Number : ");
	            int number=input.nextInt();
	            System.out.print("Power : ");
	            int power= input.nextInt();
	            System.out.println("Result : "+recursivePower(number,power));
	        }
	    }
	

}
