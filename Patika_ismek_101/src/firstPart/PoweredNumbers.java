package firstPart;
import java.util.Scanner;
public class PoweredNumbers {


	    public static void main(String[] args) {
	        int number, power, total=1;
	        Scanner input=new Scanner(System.in);

	        System.out.print("Enter a number : ");
	        number=input.nextInt();
	        System.out.print("Enter the power of the number : ");
	        power=input.nextInt();

	        for (int i=1;i<=power;i++){
	            total *=number;
	        }

	        System.out.println("Total : "+total);
	    }
	
}
