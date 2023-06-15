package firstPart;
import java.util.Scanner;
public class MIN_MAX {
	/**
	 * Code a Java program that finds the largest and smallest numbers from 
	 * N counting numbers entered from the keyboard and writes these numbers to the screen.
	 * 
	 */



	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("How many numbers will you enter : ");
	        
	        int step = input.nextInt();
	        int min = 0; 
	        int max = 0 ;

	        for (int i=1 ; i<=step;i++){
	            System.out.print(i + ". Number: ");
	            int number = input.nextInt();
	            if(i==1){
	                max=number;
	                min=number;
	            }else {
	                if(number>=max){
	                    max=number;
	                }
	                else if(number<=min){
	                    min=number;

	                }
	            }

	        }
	        System.out.println("En Büyük Sayý: "+max+"\n"+
	                           "En Küçük Sayý: "+min+"\n");
	    }
	

}
