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
	            							//1-girmez ve continue / 2-girmez ve 2 / 3-girer ve b�leni olmad��� i�in d�ng�den ��kar prime olur
	            for (int a = 2; a < i; a++){
	                if(i%a == 0){			//illaki bir b�leni ��k�yor ve falsedan ��k�yor. D�ng� devam i de�i�ene dek 
	                    prime = false;		//i de�i�ene dek d�ng� devam eder.
	                }	//System.out.println(a+"--"+i); B�l�nmedi�i zaman prime olur
	            }


	            if(i == 1){ continue; }
	            
	            if(prime){

	                System.out.print(i + " ");
	            }
	        }
	    }
}
