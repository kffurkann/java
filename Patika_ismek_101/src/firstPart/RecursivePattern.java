package firstPart;
import java.util.Scanner;
public class RecursivePattern {
	/**In Java language, code a "Recursive" method without looping which 
	 * obeys the following rule based on the n value received from the user.
	 
	   Rule : Subtract 5 from the entered number up to where the entered number is 0 or negative. 
	   Print the last value to the screen during each subtraction. After the number is negative or 0, add 5 again. 
	   Again, encode the last value of the number to the screen in each addition operation.
	 */


	        static int minusFive(int x){
	            if(x<=0){
	                System.out.print(x+ " ");
	                return x;
	            }else{
	                System.out.print(x+ " ");
	            }
	            return minusFive(x-5);
	        }
	        static int plusFive(int y, int z){
	            if(y<z){
	                System.out.print(y+ " ");
	            }else if(y == z){
	                System.out.print(y);
	                return y;
	            }
	            return plusFive(y + 5, z);
	        }



	        public static void main(String[] args) {
	            Scanner input = new Scanner(System.in);
	            System.out.print("Sayý giriniz:");
	            int number = input.nextInt();
	            int result = minusFive(number);
	            plusFive(result +5, number);
	        }
}





