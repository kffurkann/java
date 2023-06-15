package slayt12;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("System Start");

		int a = 2;
		int b = 0;
		int[] arr = { 1, 2, 3, 4 };
		Scanner input = new Scanner(System.in);

		try {
			int result = a / b; // try de hata yakalarsa altýný okumaz catch e atar
			arr [5] = 5;
			int c = input.nextInt();

		} catch (ArithmeticException ex) {
			System.out.println("0'a Bölünme Hatasý");
			System.out.println(ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Boyut Hatasý");
			System.out.println(ex.toString());
		} catch (Exception ex) { // InputMismatchException
			System.out.println("Deðiþken Türü Hatasý");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Prints everything");
		}

		int d = 0;
		if (d == 0)
			throw new ArithmeticException("bölen sýfýra eþit olamaz");// özel excp. olmalý

	}

}
