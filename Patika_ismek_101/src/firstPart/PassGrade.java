package firstPart;
import java.util.Scanner;
public class PassGrade {



	    public static void main(String[] args) {
	        int math, physics, turkish, chemistry, music;
	        double total = 0;

	        Scanner input = new Scanner(System.in);

	        System.out.print("Math exam score :");
	        math = input.nextInt();
	        if(math >=0 && math<=100) {
	        	total += math;
	        } else {
	            System.out.println("invalid score");
	        } 
	        
	        
	        System.out.print("Physics exam score :");
	        physics = input.nextInt();
	        if(physics >=0 && physics<=100) {
	        	total += physics;
	        } else {
	            System.out.println("invalid score");
	        } 

	        System.out.print("Turkish exam score :");
	        turkish = input.nextInt();
	        if(turkish >=0 && turkish<=100) {
	        	total += turkish;
	        } else {
	            System.out.println("invalid score");

	        } 

	        System.out.print("Chemistry exam score :");
	        chemistry = input.nextInt();
	        if(chemistry >=0 && chemistry<=100) {
	        	total += chemistry;
	        } else {
	            System.out.println("invalid score");

	        } 

	        System.out.print("Music exam score :");
	        music = input.nextInt();
	        if(music >=0 && music<=100) {
	        	total += music;
	        } else {
	            System.out.println("invalid score");
	        } 

	        double average = total / 5;
	        if (average < 55) {
	            System.out.println("Fail the grade");
	            System.out.println("Average is :" + average);
	        } else {
	            System.out.println("Pass the grade");
	            System.out.println("Average is :" + average);
	        }

	    }
}



