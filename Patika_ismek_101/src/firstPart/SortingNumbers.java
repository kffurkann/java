package firstPart;
import java.util.Scanner;
public class SortingNumbers {
	/**
	 * 
	 * Code the program that sorts the 3 entered numbers "from least to greatest".
	 */


	    public static void main(String[] args) {
	        int x, y, z;
	        Scanner input = new Scanner(System.in);

	        System.out.print("1.Sayý(x) :");
	        x = input.nextInt();
	        System.out.print("2.Sayý(y) :");
	        y = input.nextInt();
	        System.out.print("3.Sayý(z) :");
	        z = input.nextInt();

	        if (x < y && y < z && x < z) 
	            System.out.println(x+"<"+y+"<"+z);
	        	        
	        if (y < x && x < z && y < z) 
	            System.out.println(y+"<"+x+"<"+z);
	         
	        if (x < z && x < y && z < y) 
	            System.out.println(x+"<"+z+"<"+y);
	        
	        if (z < x && z < y && x < y) 
	            System.out.println(z+"<"+x+"<"+y);
	         
	        if (y < z && z < x && y < x) 
	            System.out.println(y+"<"+z+"<"+x);
	        
	        if (z < y && y < x && z < x) 
	            System.out.println(z+"<"+y+"<"+x);
	        	       	        
	    }
	    
}



