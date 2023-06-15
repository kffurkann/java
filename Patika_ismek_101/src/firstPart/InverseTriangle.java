package firstPart;
import java.util.Scanner;
public class InverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}for(int k=(n-i)*2+1;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
