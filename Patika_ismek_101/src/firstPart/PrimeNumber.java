package firstPart;

public class PrimeNumber {
	/**
	 * Code a program that prints prime numbers from 1 to 100 in Java.
	 * 
	 */

	    public static void main(String[] args) {
	    	boolean prime;

	        for(int i = 1; i <= 100; i++){
	            prime = true;
	            							//1-girmez ve continue / 2-girmez ve 2 / 3-girer ve böleni olmadýðý için döngüden çýkar prime olur
	            for (int a = 2; a < i; a++){
	                if(i%a == 0){			//illaki bir böleni çýkýyor ve falsedan çýkýyor. Döngü devam i deðiþene dek 
	                    prime = false;		//i deðiþene dek döngü devam eder.
	                }	//System.out.println(a+"--"+i); Bölünmediði zaman prime olur
	            }


	            if(i == 1){ continue; }
	            
	            if(prime){

	                System.out.print(i + " ");
	            }
	        }
	    }
}
