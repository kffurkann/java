package firstPart;
import java.util.Scanner;
public class Atm {

/**
 * Make ATM transactions in the same project using "Switch-Case".
 * 
 */


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        String userName, password;
	        // userName : patika password : dev123
	        int right = 3, choice;
	        int balance = 3000;
	        while (right > 0){
	            System.out.print("Enter the username : ");
	            userName = input.nextLine();
	            System.out.print("Enter the password : ");
	            password = input.nextLine();
	            if (userName.equals ("patika") && password.equals ("dev123")){
	                System.out.println("Merhaba, Welcome to Kodluyoruz Bank.");
	                do {
	                System.out.println("1-Deposit Money\n" + "2-Withdraw Money\n" + "3-Balance Inquiry\n" + "4-Exit");
	                System.out.println("Select the option you want to do : ");
	                choice = input.nextInt();
	                switch (choice){
	                    case 1:
	                        System.out.print("ENTER THE AMOUNT YOU WÝSH TO DEPOSÝT : ");
	                        int ymiktar = input.nextInt();
	                        balance += ymiktar;
	                        break;
	                    case 2:
	                        System.out.print("ENTER THE AMOUNT YOU WANT TO WITHDRAW: ");
	                        int cmiktar = input.nextInt();
	                        if (cmiktar > balance){
	                            System.out.println("INSUFFICIENT FUNDS !!!!! ");
	                        }else {
	                            balance -= cmiktar;
	                        }break;
	                    case 3:
	                        System.out.println("YOUR BALANCE : " + balance);
	                        break;
	                    case 4:
	                        System.out.println("THANK YOU");
	                        break;
	                    default:
	                        System.out.println("WRONG CHOICE");
	                }
	                }while (choice != 4);
	                break;

	            }else{
	                right--;
	                if (right == 0){
	                    System.out.println("ACCOUNT BLOCKED");
	                }else{
	                    System.out.println("The user name or password is incorrect");
	                    System.out.println("REMAINING RIGHT : " + right);
	            }
	        }
	    }
	}
}




