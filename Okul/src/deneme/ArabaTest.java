package deneme;

public class ArabaTest {
	 
    public static void main(String[] args) {
 
        Araba arabaNesnesi = new Araba();
        arabaNesnesi.calistir();
 
        Araba baskaArabaNesnesi = new Araba(2997);
        baskaArabaNesnesi.calistir();
        
        //public
        //System.out.println(baskaArabaNesnesi.varsayilanMotorHacmi);
        
        //baskaArabaNesnesi.varsayilanMotorHacmi = 5997;
 
        //System.out.println(baskaArabaNesnesi.varsayilanMotorHacmi);
        
 
        System.out.println(baskaArabaNesnesi.getVarsayilanMotorHacmi());
 
        baskaArabaNesnesi.setVarsayilanMotorHacmi(7997);
 
        System.out.println(baskaArabaNesnesi.getVarsayilanMotorHacmi());
 
    }
 
}
