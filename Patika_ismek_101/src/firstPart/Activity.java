package firstPart;
import java.util.Scanner;
public class Activity {

        /**
		*Conditions :
		*
		*Suggest to "Ski" if the temperature is less than 5.
		*Suggest the "Cinema" event if the temperature is between 5 and 15.
		*Suggest the "Picnic" event if the temperature is between 15 and 25.
		*Suggest the "Swimming" event if the temperature is greater than 25.
		*Homework
		*Find different solutions in how else the if conditions could be created on the same example.
		*/

   
	public static void main(String[] args) {
               
        int derece ;
        
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter the air temperature : ");
        
        derece = input.nextInt();

        boolean status=derece>25;
        boolean status2=derece<=25 && derece>15;
        boolean status3=derece<=15 && derece>=5;
        boolean status4=derece<5;
        String a= status ? "You can go swimming ":" ";
        String b= status2 ? "You can have a picnic " : " " ;
        String c= status3 ? "You can go to the movies " : " ";
        String d= status4 ? "You can ski " : " ";
        System.out.println(a+b+c+d);
    }
    
}


