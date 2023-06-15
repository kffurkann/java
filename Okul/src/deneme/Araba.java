package deneme;

public class Araba {
	 
    private double varsayilanMotorHacmi = 1399;
 
    //constructor
    Araba() {
        System.out.println("Araba nesnesi oluþturuldu, varsayilan motor hacmi deðeri: " + varsayilanMotorHacmi);
    }
 
    //constructor
    Araba(double yeniMotorHacmi) {
        varsayilanMotorHacmi = yeniMotorHacmi;
        System.out.println("Araba nesnesi oluþturuldu, yeni varasayilan motor hacmi deðeri:  " + varsayilanMotorHacmi);
    }
 
    //metot
    void calistir() {
        System.out.println("Araba çalýþmaya baþladý!");
    }
 
    public double getVarsayilanMotorHacmi() {
        return varsayilanMotorHacmi;
    }
 
    public void setVarsayilanMotorHacmi(double varsayilanMotorHacmi) {
        this.varsayilanMotorHacmi = varsayilanMotorHacmi;
    }
}
