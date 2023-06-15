package slayt10;

public class PatternDemo {

	public static void main(String[] args) {
		String str = new String("28/12/2013");
		String array2[]= str.split("/", 0);
		for (String temp: array2){
		      System.out.println(temp);
		}
		String[] tokens = "Java#HTML#Perl#abcd".split("#", 2);
		for (int i = 0; i < tokens.length; i++) 
		  System.out.print(tokens[i] + " ");
	//  (-) tamsayý , 0 ayýrýr. 1 olduðu gibi yazdýrýr.
	//  bölünecek kadar tam sayý ises o kadar baþtan ayýrýr. bölünmeyecekse bir sayý ise yine ayýrýr.
		
		String[] tokens1 = "Java,C?C#,C++".split("[.,:;?]");
	    
		for (int i = 0; i < tokens1.length; i++)
		  System.out.println(tokens1[i]);

		System.out.println("----------------------------------");
		String s = "a+b$#c".replaceAll("[$+#]", "NNN");
		System.out.println(s);
		System.out.println("-----------------------------");
		System.out.println("Java".matches("Java"));
		System.out.println("Java".equals("Java"));
		System.out.println("Javaisfun".matches("Java.*"));
		System.out.println("Jav is cool".matches("Java.*"));
		
		 String str1 = new String("Java String Methods");

	       System.out.print("Regex: (.*)String(.*) matches string? " );
	       System.out.println(str1.matches("(.*)String(.*)"));

	       System.out.print("Regex: (.*)Strings(.*) matches string? " );
	       System.out.println(str1.matches("(.*)Strings(.*)"));
	       
	       System.out.print("Regex: Java(.*) matches string? " );
	       System.out.println(str1.matches("Java(.*)"));

	       System.out.print("Regex: (.*)Methods matches string? " );
	       System.out.println(str1.matches("(.*)Methods"));
	       System.out.print("Regex: Methods(.*) matches string? " );
	       System.out.println(str1.matches("Methods(.*)"));
	}

}
