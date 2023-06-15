package firstPart;
	import java.util.Scanner;
public class FibonacciSeries {




	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int number,number1 = 0, number2 =1, number3=0, counter=0;
	        System.out.print("Enter a number : ");
	        number = input.nextInt();

	        while(counter<=number){
	            System.out.print(number1+" ");
	            number3=number1+number2;
	            number1 = number2;
	            number2 = number3;
	            counter++;
	        }
	    
	}


}
