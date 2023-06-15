package firstPart;
import java.util.Scanner;
public class RecursivePrime {
	/**
	 * Using the "Recursive" method in Java, code the program that finds whether 
	 * the number received from the user is a "Prime" number.
	 */
	


	    static boolean prime(int number,int index){
	        if(number<=2){
	            return (number==2)?true:false;
	        }
	        if(number % index==0){
	            return false;
	        }
	        if(index*index>number){
	            return true;
	        }
	        return prime(number,index+1);
	    }

	    public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        while(true){
	            System.out.print("Enter a number : ");
	            int number=input.nextInt();
	            if(prime(number,2)){
	                System.out.println(number+" is a prime number");
	            }else{
	                System.out.println(number+" is not a prime number");
	            }
	     }
	}
}


