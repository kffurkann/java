package firstPart;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		/**
		 * Homework
			If the password is wrong, ask the user whether he can reset his password, 
			if the user wants to reset it, check that the new password must not be the same as the password he entered incorrectly and forgot,
			and if the passwords are the same, the screen "Could not create password, please enter another password." if there is no problem,
			code the program that says "Password reset".
			Code UserLogin using switch-case and if-else statements.
		 */
		String userName, password;
		int choice;

		Scanner input=new Scanner(System.in);
		System.out.print("User Name : ");
		userName=input.nextLine();
		System.out.print("Password : ");
		password=input.nextLine();

		if(userName.equals("patika") && password.equals("ismek123"))
			System.out.println("Login successful");	
		
			else if(userName.equals("patika") || password.equals("ismek123")) 
				
				if(!(userName.equals("patika"))) 
					System.out.println("username is incorrect");
				else {
					System.out.println("Password is incorrect");
					System.out.println("If you want your password to be reset, press 1, otherwise press 2 : ");
					choice=input.nextInt();						 
					switch(choice){
					case 1:
						 System.out.print("Enter a new password : ");
						 Scanner input1=new Scanner(System.in);//local scanner input
						 String newPassword;
		                 newPassword= input1.nextLine();
		                    if ((newPassword.equals("ismek123"))){
		                    	System.out.print("password reset" );
		                    }
		                    else {
		                    	System.out.print("Could not reset password, please enter another password");

		                    }
		                break;
					case 2:
						break;
					default:
						System.out.println("invalid key");
						break;}	
		   
				}else
				System.out.println("The user name or password is incorrect");
						
		    
		
		

	}

}
