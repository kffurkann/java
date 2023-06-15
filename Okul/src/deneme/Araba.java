package deneme;

public class Araba {
	 
    private double varsayilanMotorHacmi = 1399;
 
    //constructor
    Araba() {
        System.out.println("Araba nesnesi olu�turuldu, varsayilan motor hacmi de�eri: " + varsayilanMotorHacmi);
    }
 
    //constructor
    Araba(double yeniMotorHacmi) {
        varsayilanMotorHacmi = yeniMotorHacmi;
        System.out.println("Araba nesnesi olu�turuldu, yeni varasayilan motor hacmi de�eri:  " + varsayilanMotorHacmi);
    }
 
    //metot
    void calistir() {
        System.out.println("Araba �al��maya ba�lad�!");
    }
 
    public double getVarsayilanMotorHacmi() {
        return varsayilanMotorHacmi;
    }
 
    public void setVarsayilanMotorHacmi(double varsayilanMotorHacmi) {
        this.varsayilanMotorHacmi = varsayilanMotorHacmi;
    }
}
