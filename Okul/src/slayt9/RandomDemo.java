package slayt9;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random random1 = new Random();
		System.out.print("From random1: ");
		for (int i = 0; i < 10; i++)      //100e kadar say�lar anlam�na gelir
		  System.out.print((random1.nextInt(110)+1) + " ");//ekleme
		
		Random random2 = new Random();
		System.out.print("\nFrom random2: ");
		for (int i = 0; i < 10; i++)
		  System.out.print((3*random2.nextInt(100)) + " ");//3�n kat�
		
		Random random3 = new Random(4);//ba�lang�� basama��
		System.out.print("\nFrom random3: ");
		for (int i = 0; i < 10; i++)
		  System.out.print(random3.nextInt(10000) + " ");

	}

}
