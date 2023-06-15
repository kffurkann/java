package firstPart;
import java.util.Scanner;
public class DivisibleNumbers {

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int number;
	        double average = 0;
	        int counter = 0;
	        System.out.print("Enter a Number: ");
	        number = input.nextInt();

	        for(int i = 0; i<=number;i++){
	            if(i % 3 == 0 && i % 4 == 0){
	                average += i;
	                counter++;
	            }
	        }
	        System.out.println("Average of numbers dividing by 3 and 4 : " +(average/counter));
	    }
	
}
