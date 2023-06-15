package firstPart;
import java.util.Scanner;
public class FindYourHoroscope {

    public static void main(String[] args) {
        
        
         Scanner input = new Scanner(System.in);
         
        System.out.print("Enter your month(As a number)");
        int month = input.nextInt();
        
        System.out.print("Enter the day you were born");
        int day = input.nextInt();
        
        if (month == 1) {
            if (day < 21 && day > 0) {
                System.out.println("Capricorn");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Aquarius");
            }
        } else if (month == 2) {
            if (day <= 19 && day > 0) {
                System.out.println("Aquarius");
            } else if (day > 19 && day <= 31) {
                System.out.println("Pisces");
            }
        } else if (month == 3) {
            if (day <= 20 && day > 0) {
                System.out.println("Pisces");
            } else if (day > 20 && day <= 31) {
                System.out.println("Aries");
            }
        } else if (month == 4) {
            if (day <= 20 && day > 0) {
                System.out.println("Aries");
            } else if (day > 20 && day <= 31) {
                System.out.println("Taurus");
            }
        } else if (month == 5) {
            if (day <= 21 && day > 0) {
                System.out.println("Taurus");
            } else if (day > 21 && day <= 31) {
                System.out.println("Gemini");
            }
        } else if (month == 6) {
            if (day <= 22 && day > 0) {
                System.out.println("Gemini");
            } else if (day > 22 && day <= 31) {
                System.out.println("Cancer");
            }
        } else if (month == 7) {
            if (day <= 22 && day > 0) {
                System.out.println("Cancer");
            } else if (day > 22 && day <= 31) {
                System.out.println("Leo");
            }
        } else if (month == 8) {
            if (day <= 22 && day > 0) {
                System.out.println("Leo");
            } else if (day > 23 && day <= 31) {
                System.out.println("Virgo");
            }
        } else if (month == 9) {
            if (day <= 22 && day > 0) {
                System.out.println("Virgo");
            } else if (day > 22 && day <= 31) {
                System.out.println("Libra");
            }
        } else if (month == 10) {
            if (day <= 22 && day > 0) {
                System.out.println("Libra");
            } else if (day > 22 && day <= 31) {
                System.out.println("Scorpio");
            }
        } else if (month == 11) {
            if (day <= 21 && day > 0) {
                System.out.println("Scorpio");
            } else if (day > 21 && day <= 31) {
                System.out.println("Sagittarius");
            }
        } else if (month == 12) {
            if (day <= 22 && day > 0) {
                System.out.println("Sagittarius");
            } else if (day > 22 && day <= 31) {
                System.out.println("Capricorn");
            }
        }
        else {
            System.out.println("Incorrect entry");
        }   
        
    }
    
}


